package home_work_1;

import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Введите год:");
        short year=reader.nextShort();
        if (year<=0) {
            System.out.println("Введенное число не соответствует условиям задачи. Остановка программы");
            System.exit(0);
        }
        if (year%4==0&&year%100!=0||year%400==0){
            System.out.println("Год "+year+" является високосным");
        } else {
            System.out.println("Год "+year+" не является високосным");
        }
    }
}
