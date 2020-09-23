package trabalho04.observer;

import java.util.ArrayList;
import java.util.List;

public class Expression implements ExpressionSubject {
    private List<Operation> operations_;
    private List<Observer> observers_;

    Expression() {
        operations_ = new ArrayList<>();
        observers_ = new ArrayList<>();
    }

    public void add(Observer observer) {
        observers_.add(observer);
    }

    public void remove(Observer observer) {
        observers_.remove(observer);
    }

    public void update(Operation operation) {
        operations_.add(operation);
        for (Observer observer : observers_) {
            observer.update(operation);
        }
    }
}