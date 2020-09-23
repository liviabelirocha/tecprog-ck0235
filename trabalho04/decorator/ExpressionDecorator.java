package trabalho04.decorator;

public class ExpressionDecorator implements Expression {
    private Expression expression_;

    ExpressionDecorator(Expression expression) {
        expression_ = expression;
    }

    public double calculate() {
        return expression_.calculate();
    }
}