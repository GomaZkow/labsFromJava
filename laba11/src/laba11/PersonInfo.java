package laba11;

import java.io.FileWriter;
import java.io.IOException;

public class PersonInfo {
    public static void writeToFile(String filename, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        }
    }
}	