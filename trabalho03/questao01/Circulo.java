package trabalho03.questao01;

public class Circulo extends Figura {
    private double raio_;

    Circulo(double x, double y, double raio) {
        super(x, y);
        setLado(raio);
    }

    Circulo(double a, double raio) {
        this(a, a, raio);
    }

    public void setLado(double raio) {
        raio_ = raio;
    }

    public double getLado() {
        return raio_;
    }

    public double calcularArea() {
        return 3.14 * raio_ * raio_;
    }
}