package laba9_zad2;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Алексей", "101", 1, Arrays.asList(4, 5, 3)));
        students.add(new Student("Марина", "102", 2, Arrays.asList(2, 2, 3)));
        students.add(new Student("Игорь", "103", 3, Arrays.asList(5, 4, 5)));
        students.add(new Student("Ольга", "104", 1, Arrays.asList(3, 3, 3)));

        System.out.println("До обработки:");
        students.forEach(System.out::println);

        StudentUtils.processStudents(students);

        System.out.println("\nПосле обработки:");
        students.forEach(System.out::println);

        System.out.println();
        StudentUtils.printStudents(students, 2);
        StudentUtils.printStudents(students, 4);
    }
}
