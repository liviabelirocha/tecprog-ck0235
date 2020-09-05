import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Grafo {
    private BufferedReader grafo_;
    private Conjunto conjunto_;

    Grafo(String grafo) {
        try {
            File f = new File(grafo);
            FileReader fr = new FileReader(f);
            grafo_ = new BufferedReader(fr);

            conjunto_ = new Conjunto();

            String line;
            while ((line = grafo_.readLine()) != null)
                conjunto_.addLine(line);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void remove(char[] toRemove) {
        for (int i = 0; i < toRemove.length; i++)
            conjunto_.removeElem(toRemove[i]);
    }

    public void generateOutput() {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("grafoOutput.txt")));

            for (int i = 0; i < conjunto_.getSize(); i++) {
                for (int j = 0; j < conjunto_.getArray(i).size(); j++) {
                    out.write(conjunto_.getElement(i, j));
                    out.write(' ');
                }
                out.write('\n');
            }
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}