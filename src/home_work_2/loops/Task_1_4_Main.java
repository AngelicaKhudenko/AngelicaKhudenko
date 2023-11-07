package home_work_2.loops;

import java.util.Scanner;

public class Task_1_4_Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Введите целое число");
        String numInString=reader.nextLine();

        Task_1_4 task=new Task_1_4();
        System.out.println(task.findOverflow(numInString)); // Вызов метода
    }
}
