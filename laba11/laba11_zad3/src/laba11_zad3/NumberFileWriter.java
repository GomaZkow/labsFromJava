package laba11_zad3;
import java.io.FileWriter;
import java.io.IOException;

public class NumberFileWriter {
 public static void writeNumbers(String filename, double[] numbers) throws IOException {
     try (FileWriter writer = new FileWriter(filename)) {
         for (double num : numbers) {
             writer.write(num + "\n");
         }
     }
 }
}
