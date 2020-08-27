package trabalho03.questao03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a frase: ");
        String sentence = scanner.nextLine();

        String[] sentenceArray = sentence.split(" ");

        CountWords cWords = new CountWords(sentenceArray);

        System.out.println("\nITEM A");
        cWords.numberAndOccurrences();
        System.out.println("\nITEM B");
        cWords.wordFrequency();
        System.out.println("\nITEM C");
        cWords.wordFrequency2();
        System.out.println("\nITEM D");
        cWords.wordFrequency3();
        System.out.println("\nITEM E");
        cWords.wordFrequency4();

        scanner.close();
    }
}