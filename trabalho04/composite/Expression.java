package trabalho04.composite;

import java.util.ArrayList;
import java.util.List;

public class Expression implements Operation {
    private List<Operation> operations_;

    public Expression() {
        operations_ = new ArrayList<>();
    }

    public void calculate() {
        for (Operation operation : operations_)
            operation.calculate();
    }

    public void add(Operation operation) {
        operations_.add(operation);
    }

    public void remove(Operation operation) {
        operations_.remove(operation);
    }
}