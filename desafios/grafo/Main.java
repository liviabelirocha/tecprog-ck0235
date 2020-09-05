import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Elementos a serem removidos: ");

        String toRemove = scanner.nextLine();
        scanner.close();

        char[] toRemoveArray = toRemove.toCharArray();

        Grafo grafo = new Grafo(args[0]);
        grafo.remove(toRemoveArray);

        grafo.generateOutput();

    }
}