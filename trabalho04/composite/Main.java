package trabalho04.composite;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operation multiplication = new Multiplication(5, 6);
        Operation division = new Division(15, 2);
        Operation division2 = new Division(15, 0);

        Expression expression = new Expression();

        expression.add(multiplication);
        expression.add(division);
        expression.add(division2);

        expression.calculate();
    }
}