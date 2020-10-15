package trabalho05;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;

public class Sort {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();

        try {
            // Ler o arquivo e adicionar os números a um array
            FileReader fileR = new FileReader("./trabalho05/output.txt");
            BufferedReader readFile = new BufferedReader(fileR);

            Stream<String> lines = readFile.lines();
            Iterator<String> iR = lines.iterator();

            while (iR.hasNext())
                numbers.add(Double.parseDouble(iR.next().toString().substring(11)));

            fileR.close();
            readFile.close();

            // Ordenar os números
            Collections.sort(numbers);

            // Escrever no mesmo arquivo
            File fileW = new File("./trabalho05/output.txt");

            FileOutputStream fo = new FileOutputStream(fileW);

            Iterator<Double> iW = numbers.iterator();
            while (iW.hasNext()) {
                String line = "Generated : " + iW.next();
                fo.write(line.getBytes());
                fo.write('\n');
            }

            fo.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}