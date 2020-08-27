package trabalho03.questao01;

public abstract class Figura {
    private double x_, y_;

    Figura(double x, double y) {
        setXY(x, y);
    }

    Figura(double a) {
        this(a, a);
    }

    public void setX(double x) {
        x_ = x;
    }

    public void setY(double y) {
        y_ = y;
    }

    public void setXY(double x, double y) {
        setX(x);
        setY(y);
    }

    public void setXY(double a) {
        setXY(a, a);
    }

    public double[] getCoordinates() {
        double[] coordinates = { x_, y_ };
        return coordinates;
    }

    public void desenhar() {
        System.out.println(this.getClass().getSimpleName());
    };

    public void mover(double dx, double dy) {
        setXY(x_ + dx, y_ + dy);
    }

    public void mover(double a) {
        mover(a, a);
    }

    abstract double calcularArea();

    public void printCoordinates() {
        System.out.println("( " + x_ + ", " + y_ + " )");
    }
}