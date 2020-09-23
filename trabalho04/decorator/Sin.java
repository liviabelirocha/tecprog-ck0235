package trabalho04.decorator;

public class Sin extends ExpressionDecorator {
    private double x_;

    public Sin(Expression expression, double x) {
        super(expression);
        x_ = x;
    }

    public double calculate() {
        return super.calculate() + Math.sin(x_);
    }
}