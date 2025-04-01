package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello ALINA!");

        String opinion = Tester.getComment();
        String opinionN = Tester.getCommenN();
        Tester one = new Tester("Андрей ", "Мигунов ", 3, 2, 1200.0);
        Tester two = new Tester("Лика ", "Акатова ");
        Tester three = new Tester();
        System.out.println(" ");
        one.printAllInfo();
        System.out.println("Мнение на счет сотрудника: " + opinionN);
        System.out.println(" ");
        two.printSS("Акатова ", 90.0);
        System.out.println("Мнение на счет сотрудника: " + opinion);
        System.out.println(" ");
        three.printNS("Алина ", "Нетукова ");
        System.out.println("Мнение на счет сотрудника: " + opinion);
    }
}
