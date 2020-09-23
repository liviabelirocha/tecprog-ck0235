package trabalho04.decorator;

public class Cos extends ExpressionDecorator {
    private double x_;

    public Cos(Expression expression, double x) {
        super(expression);
        x_ = x;
    }

    public double calculate() {
        return super.calculate() + Math.cos(x_);
    }
}