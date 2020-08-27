package trabalho03.questao02;

public class Main {
    public static void main(String[] args) {
        Sistema s = new Sistema();
        s.criarContaXPTOBasic(1);
        s.criarContaXPTOPlus(2);
        s.criarContaXPTOExteme(3);

        for (int i = 1; i <= 3; i++)
            s.creditar(i, 1000);

        for (int i = 1; i <= 3; i++)
            s.debitar(i, 10);

        s.consultarSaldo(1);
        s.consultarSaldo(2);
        s.consultarSaldo(3);
    }
}