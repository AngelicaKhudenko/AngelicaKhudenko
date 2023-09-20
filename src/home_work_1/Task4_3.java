package home_work_1;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Введите первое целое число, отличное от нуля:");
        int first=reader.nextInt();
        System.out.println("Введите второе целое число, отличное от нуля:");
        int second=reader.nextInt();

        if (first==0||second==0) { // Проверка на воод чисел, равных нулю
            System.out.println("Ошибка введенных данных. Остановка программы");
            System.exit(0);
        }

        if (first>second) {
            if (first%second==0) {
                System.out.println("Первое число кратно второму. Результат: "+first/second);
            } else {
                System.out.println("Первое число больше второго. Оно не делится на второе без остатка. Частное: "+first/second+". Остаток: "+first%second);
            }
        } else if (second%first==0) {
            System.out.println("Второе число кратно первому. Результат: "+second/first);
        } else {
            System.out.println("Второе число больше первого. Оно не делится на первое без остатка. Частное: "+second/first+". Остаток: "+second%first);
        }
    }
}
