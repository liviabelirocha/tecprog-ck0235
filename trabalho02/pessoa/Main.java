package trabalho02.pessoa;

class Main {
    public static void main(String args[]) {
        Pessoa p1 = new Pessoa("Ana", 22);
        Pessoa p2 = new Pessoa("João", 20);
        p1.getAll();
        p2.getAll();
        p1 = p2;
        p1.getAll();
        p2.getAll();
    }
}