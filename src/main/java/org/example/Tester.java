package org.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYear;
    private int englishLevel;
    private double salary;
    public Tester(){
        name = "Алина";
        surname = "Нетукова";
        expirienceInYear = 3;
        englishLevel = 4;
        salary = 1000;
    }
    public Tester(String name, String surname){
        this(name, surname, 4, 5, 1500.0);
    }
    public Tester(String name, String surname, int expirienceInYear, int englishLevel, double salary){
        this.name = name;
        this.surname = surname;
        this.expirienceInYear = expirienceInYear;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public void printNS(String name, String surname){
        System.out.println("Имя: " + name + "\nФамилия: " + surname);
    }
    public void printAllInfo(){
        System.out.println("Имя: " + name + "\nФамилия: " + surname + "\nОпыт: " + expirienceInYear + "\nУровень английского: " + englishLevel + "\nЗарплата: " + salary);
    }
    public void printSS(String surname, double salary){
        System.out.println("Фамилия: " + surname + "\nЗарплата: " + salary);
    }
    public static String getComment(){
        return "Хороший человек";
    }
    public static String getCommenN(){
        return "Вредный человек";
    }
}
