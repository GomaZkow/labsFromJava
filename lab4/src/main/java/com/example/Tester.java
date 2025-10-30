package com.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;


    public Tester() {
        this("Имя", "Фамилия");
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "A1", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    
    public void printInfo() {
        System.out.println(name + " " + surname + ", опыт: " + experienceInYears + " лет, английский: " + englishLevel + ", зарплата: $" + salary);
    }

    public void printInfo(String skill) {
        System.out.println(name + " знает " + skill);
    }

    public void printInfo(String skill1, String skill2) {
        System.out.println(name + " знает " + skill1 + " и " + skill2);
    }

   
    public static void staticMethodExample() {
        System.out.println("Это статический метод класса Tester");
    }
}
