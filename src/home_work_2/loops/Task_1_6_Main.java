package home_work_2.loops;

public class Task_1_6_Main {
    public static void main(String[] args) {
        Task_1_6 task=new Task_1_6();
        System.out.println("ТАБЛИЦА УМНОЖЕНИЯ");
        String result;
        result=task.makeStringsOfMultiplication(2,5,1,10);
        System.out.println(result);
        result=task.makeStringsOfMultiplication(6,10,1,10);
        System.out.println(result);
    }
}
