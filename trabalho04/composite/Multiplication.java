package trabalho04.composite;

public class Multiplication implements Operation {
    double x_, y_;

    Multiplication(double x, double y) {
        x_ = x;
        y_ = y;
    }

    @Override
    public void calculate() {
        System.out.println(x_ * y_);
    }

}