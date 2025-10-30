package laba11_zad2;
public class Main {
    public static void main(String[] args) {
        String filename = "temperatures.txt";

        try {
            TemperatureWriter.writeTemperatures(filename);
            TemperatureAnalyzer.analyzeTemperatures(filename);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}