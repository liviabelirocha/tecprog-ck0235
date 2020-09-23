package trabalho04.observer;

public interface ExpressionSubject {
    public void add(Observer observer);

    public void remove(Observer observer);

    public void update(Operation operation);
}