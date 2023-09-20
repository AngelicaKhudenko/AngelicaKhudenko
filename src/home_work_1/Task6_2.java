package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task6_2 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name=reader.nextLine();
        String vasiliy="Вася";
        String nastya="Анастасия";

        if (Objects.equals(name,vasiliy)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else if (Objects.equals(name,nastya)){
            System.out.println("Я тебя так долго ждал");
        } else System.out.println("Добрый день, а вы кто?");
    }
}
