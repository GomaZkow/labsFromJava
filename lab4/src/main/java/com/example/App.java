package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Артур");

        Tester tester = new Tester("Иван", "Иванов", 3, "B2", 1500.0);
        tester.printInfo();
        tester.printInfo("Java");
        tester.printInfo("Java", "Spring");

        Tester.staticMethodExample();
    }
}
