package home_work_1;

import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean checkInfo = true;
        short year;
        do {
            System.out.println("Введите год:");
            year = reader.nextShort();
            if (year <= 0) {
                System.out.println("Введенное число не соответствует условиям задачи");
                checkInfo = false;
            }
        } while (!checkInfo);

        String checkYearResult=checkYear(year);
        if (checkYearResult.equals("да")){
            System.out.println("Год "+year+" является високосным");
        } else {
            System.out.println("Год "+year+" не является високосным");
        }
    }

    /**
     * Метод, который проверяет, является ли переданный год високосным
     * @param year - год
     * @return "да" - если год является високосным
     *         "нет" - если год не является високосным
     *         "неверный ввод" - если год не соответствует условиям для ввода
     */
    public static String checkYear(int year) {
        if (year%4==0&&year%100!=0||year%400==0) {
            return "да";
        } else  if (year<=0){
            return "неверный ввод";
        } else {
            return "нет";
        }
    }
}
