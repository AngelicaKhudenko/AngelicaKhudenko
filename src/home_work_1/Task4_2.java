package home_work_1;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Введите первое число:");
        double first=reader.nextDouble();
        System.out.println("Введите второе число:");
        double second=reader.nextDouble();
        System.out.println("Введите третье число:");
        double third=reader.nextDouble();

        if (first==second||first==third||second==third) {
            System.out.println("Среднее число отсутствует"); // Проверка на ввод одинаковых чисел
        }

        if (first<third&&first>second||first<second&&first>third) {
            System.out.println("Среднее число: "+first);
        } else if (second<third&&second>first||second<first&&second>third) {
            System.out.println("Среднее число: "+second);
        } else if (third<second&&third>first||third<first&&third>second) {
            System.out.println("Среднее число: "+third);
        }
    }
}
