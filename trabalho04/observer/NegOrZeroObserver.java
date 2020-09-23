package trabalho04.observer;

public class NegOrZeroObserver implements Observer {
    @Override
    public void update(Operation o) {
        if (o.calculate() <= 0)
            System.out.println("O valor da operação " + o + " deu menor ou igual que zero");
    }
}