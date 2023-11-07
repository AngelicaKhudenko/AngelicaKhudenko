package home_work_1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = reader.nextLine();

        ICommunicationPrinter task1 = new Task6_1();
        String welcomResult1=task1.welcom(name);
        System.out.println(welcomResult1);
        System.out.println("______________________________");

        ICommunicationPrinter task2 = new Task6_1();
        String welcomResult2=task2.welcom(name);
        System.out.println(welcomResult2);
        System.out.println("______________________________");

        ICommunicationPrinter task3 = new Task6_1();
        String welcomResult3=task3.welcom(name);
        System.out.println(welcomResult3);
    }
}
