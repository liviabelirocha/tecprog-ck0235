package trabalho04.observer;

public class Main {
    public static void main(String[] args) {
        Expression observe = new Expression();
        NegOrZeroObserver negOrZeroObserver = new NegOrZeroObserver();
        PositiveObserver positiveObserver = new PositiveObserver();

        observe.add(negOrZeroObserver);
        observe.add(positiveObserver);

        observe.update(new Division(15, 2));
        // observe.update(new Division(2, 0));
        observe.update(new Multiplication(5, -3));
    }
}