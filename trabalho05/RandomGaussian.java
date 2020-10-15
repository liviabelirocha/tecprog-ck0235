package trabalho05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Random;

public final class RandomGaussian {
    public static void main(String[] args) {
        File file = new File("./trabalho05/output.txt");

        try {
            FileOutputStream fo = new FileOutputStream(file);
            FileInputStream fi = new FileInputStream(file);

            RandomGaussian gaussian = new RandomGaussian();
            double MEAN = 100.0f;
            double VARIANCE = 5.0f;
            for (int idx = 1; idx <= 10; ++idx) {
                String line = "Generated : " + gaussian.getGaussian(MEAN, VARIANCE);
                fo.write(line.getBytes());
                fo.write('\n');
            }
            fo.close();

            gaussian.readFile(fi);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private Random fRandom = new Random();

    private double getGaussian(double aMean, double aVariance) {
        return aMean + fRandom.nextGaussian() * aVariance;
    }

    private void readFile(FileInputStream fi) {
        try {
            int i = 0;
            while (i != -1) {
                i = fi.read();
                char c = (char) i;
                System.out.print(c);
            }
            fi.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}