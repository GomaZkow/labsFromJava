package laba11_zad2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TemperatureWriter {
    public static void writeTemperatures(String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename);
             Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите 15 температур:");
            for (int i = 0; i < 5; i++) {
                double temp = scanner.nextDouble();
                writer.write(temp + "\n");
            }
        }
    }
}