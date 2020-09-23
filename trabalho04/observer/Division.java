package trabalho04.observer;

public class Division extends Operation {

    public Division(double x, double y) {
        super(x, y);
    }

    public double calculate() {
        double result = 0.0;

        try {
            if (y_ == 0)
                throw new ArithmeticException("Divisão por 0.");
            else
                result = x_ / y_;

        } catch (ArithmeticException err) {
            err.printStackTrace();
        }

        return result;
    }
}