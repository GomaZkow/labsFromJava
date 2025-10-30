package laba11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PersonInfoReader {
    public static void readFromFile(String filename) throws IOException {
        String content = Files.readString(Paths.get(filename));
        System.out.println("Содержимое файла:");
        System.out.println(content);
    }
}