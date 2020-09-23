package trabalho04.observer;

abstract public class Operation {
    protected double x_, y_;

    public Operation(double x, double y) {
        x_ = x;
        y_ = y;
    }

    abstract double calculate();
}