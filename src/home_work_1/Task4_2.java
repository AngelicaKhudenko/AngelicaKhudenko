package home_work_1;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double first = reader.nextDouble();
        System.out.println("Введите второе число:");
        double second = reader.nextDouble();
        System.out.println("Введите третье число:");
        double third = reader.nextDouble();

        double checkMiddle=findMiddle(first, second, third);
        if (checkMiddle==0&&first!=second&&first!=third&&second!=third) {
            System.out.println("Среднее число отсутствует"); // Проверка на ввод одинаковых чисел
        } else {
            System.out.println("Среднее число: "+checkMiddle);
        }
    }

    /**
     * Метод, который определяет среднее число из трех
     * @param first- первое число
     * @param second - второе число
     * @param third - третье число
     * @return 0 - введены некорректные данные, в иных случаях выводит среднее число
     */
    public static double findMiddle(double first, double second, double third) {
        if (first==second||first==third||second==third) {
            return 0;
        }
        if (first<third&&first>second||first<second&&first>third) {
            return first;
        }

        if (second<third&&second>first||second<first&&second>third) {
            return second;
        }
        return third;
    }
}
