package home_work_1;

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean checkInfo = true;
        short n;
        do {
            System.out.println("Введите целое число:");
            n = reader.nextShort();
            if (n < 0) { // Проверка на ввод отрицательного числа
                System.out.println("Введенное число не соответствует условиям задачи");
                checkInfo = false;
            }
        } while (!checkInfo);

        String result=checkCode(n);
        if (result.equals("буква")) {
            System.out.println("Введенный код соответствует букве "+(char)n);
        } else {
            System.out.println("Введенный код соответствует символу "+(char)n);
        }
    }

    /**
     * Метод, который проверяет, что обозначает передаваемый код: букву или цифру
     * @param n - код для проверки
     * @return "буква" - если код сооветствует букве
     *         "символ" - если код соответствует символу
     *         "неверный ввод" - если код не соответствует условиям для ввода
     */
    public static String checkCode(int n) {
        if (n >= 65 && n <= 90 || n >= 97 && n <= 122) {
            return "буква";
        } else if (n < 0 || n > 255) {
            return "неверный ввод";
        } else {
            return "символ";
        }
    }
}

