package laba11_zad3;

public class Main {
 public static void main(String[] args) {
     String filename = "numbers.txt";
     double[] numbers = {12.5, 7.8, 9.0, 15.2, 3.3, 8.8, 10.1};

     try {
         NumberFileWriter.writeNumbers(filename, numbers);
         NumberStatsCalculator.calculateStats(filename);
     } catch (Exception e) {
         System.out.println("Ошибка: " + e.getMessage());
     }
 }
}
