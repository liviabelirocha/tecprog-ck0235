package trabalho04.observer;

public class PositiveObserver implements Observer {
    @Override
    public void update(Operation o) {
        if (o.calculate() > 0)
            System.out.println("O valor da operação " + o + " deu maior que zero");
    }
}