package trabalho03.questao01;

public class Main {
    public static void main(String[] args) {
        /* ITEM E */
        Quadrado[] quadrados = new Quadrado[2];
        Circulo[] circulos = new Circulo[2];

        quadrados[0] = new Quadrado(3, 5, 6, "sem cor");
        quadrados[1] = new Quadrado(4, 7, 8, "sem cor");

        circulos[0] = new Circulo(5, 6, 3);
        circulos[1] = new Circulo(7, 9, 5);

        System.out.println("ITEM E\n");
        quadrados[0].desenhar();
        System.out.println(quadrados[0].calcularArea());

        quadrados[1].desenhar();
        System.out.println(quadrados[1].calcularArea());

        circulos[0].desenhar();
        System.out.println(circulos[0].calcularArea());
        circulos[1].desenhar();
        System.out.println(circulos[1].calcularArea());

        /* ITEM G */
        System.out.println("\nITEM G\n");
        Figura[] figuras = new Figura[10];
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                figuras[i] = new Quadrado(5, i + 3, "Vermelho"); // todos os pares serão quadrados
            else
                figuras[i] = new Circulo(5, i + 4); // ímpares serão círculos

            if (figuras[i] instanceof Quadrado) {
                System.out.println("É COLORIDO!");
                System.out.println(figuras[i].calcularArea());
            }
        }
    }
}