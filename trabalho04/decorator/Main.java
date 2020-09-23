package trabalho04.decorator;

public class Main {
    public static void main(String[] args) {
        Expression seno1 = new Sin(new ConcreteExpression(), 1.0);
        System.out.println("Seno de 1 = " + seno1.calculate());

        Expression cos1 = new Cos(new Sin(new ConcreteExpression(), 2.0), 1.0);
        System.out.println("Cosseno de 1 = " + cos1.calculate());
    }
}