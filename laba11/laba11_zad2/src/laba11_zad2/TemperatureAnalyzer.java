package laba11_zad2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TemperatureAnalyzer {
    public static void analyzeTemperatures(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            double sum = 0;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                sum += Double.parseDouble(line);
                count++;
            }

            double average = sum / count;
            System.out.printf("Средняя температура: %.2f\n", average);
        }
    }
}
