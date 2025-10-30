package laba11;
import java.io.File;

public class FileInfoPrinter {
    public static void printFileInfo(String filename) {
        File file = new File(filename);
        if (file.exists()) {
            System.out.println("Имя файла: " + file.getName());
            System.out.println("Размер: " + file.length() + " байт");
            System.out.println("Путь: " + file.getAbsolutePath());
        } else {
            System.out.println("Файл не найден.");
        }
    }
}