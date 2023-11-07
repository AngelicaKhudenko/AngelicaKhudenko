package home_work_2.loops;

import java.util.Scanner;

public class Task_1_3_Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Введите число для возведения его в степень");
        String num=reader.nextLine();

        System.out.println("Введите целое положительное число, обозначающее степень, в которую будем возводить первое число");
        String degree=reader.nextLine();

        Task_1_3 degreeMethods=new Task_1_3();
        String result=degreeMethods.findDegreeString(num, degree);

        System.out.println(result);
    }
}
