package trabalho04.composite;

public class Division implements Operation {
    double x_, y_;

    Division(double x, double y) {
        x_ = x;
        y_ = y;
    }

    public void calculate() {
        try {
            if (y_ == 0)
                throw new ArithmeticException("Divisão por 0.");
            else
                System.out.println(x_ / y_);

        } catch (ArithmeticException err) {
            err.printStackTrace();
        }

    }
}