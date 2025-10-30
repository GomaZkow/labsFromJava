package laba11;

public class Main {
    public static void main(String[] args) {
        String filename = "person.txt";
        String content = "Имя: Артур\nГород: Минск\nПрофессия: пайто-джава-веб-шарпо-разработчик";

        try {
            PersonInfo.writeToFile(filename, content);
            FileInfoPrinter.printFileInfo(filename);
            PersonInfoReader.readFromFile(filename);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}