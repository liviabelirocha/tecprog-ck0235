package trabalho04.observer;

public class Multiplication extends Operation {

    public Multiplication(double x, double y) {
        super(x, y);
    }

    public double calculate() {
        return x_ * y_;
    }
}