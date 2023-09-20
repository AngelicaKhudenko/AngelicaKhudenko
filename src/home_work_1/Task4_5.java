package home_work_1;

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Введите целое число:");
        short n=reader.nextShort();
        char result=' ';

        if (n<0){ // Проверка на ввод отрицательного числа
            System.out.println("Введенное число не соответствует условиям задачи. Остановка программы");
            System.exit(0);
        }

        if (n>=65&&n<=90||n>=97&&n<=122){
            result=(char)n;
            System.out.println("Введенный код соответствует букве "+result);
        } else {
            result=(char)n;
            System.out.println("Введенный код соответствует символу "+result);
        }
    }
}
