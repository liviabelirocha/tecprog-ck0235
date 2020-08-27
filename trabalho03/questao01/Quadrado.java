package trabalho03.questao01;

public class Quadrado extends Figura implements FiguraColorida {
    private double lado_;
    private String cor_;

    Quadrado(double x, double y, double lado, String cor) {
        super(x, y);
        setLado(lado);
        setCor(cor);
    }

    Quadrado(double a, double lado, String cor) {
        this(a, a, lado, cor);
    }

    public void setLado(double lado) {
        lado_ = lado;
    }

    public double getLado() {
        return lado_;
    }

    public double calcularArea() {
        return lado_ * lado_;
    }

    public void setCor(String cor) {
        cor_ = cor;
    }

    public String getCor() {
        return cor_;
    }
}