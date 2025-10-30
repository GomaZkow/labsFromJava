package laba11_zad3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberStatsCalculator {
    public static void calculateStats(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            double sum = 0;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                try {
                    sum += Double.parseDouble(line);
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Невозможно обработать строку: " + line);
                }
            }

            if (count > 0) {
                double average = sum / count;
                System.out.printf("Сумма: %.2f\nСреднее: %.2f\n", sum, average);
            } else {
                System.out.println("Нет допустимых чисел для расчёта.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}