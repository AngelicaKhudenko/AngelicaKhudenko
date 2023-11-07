package home_work_2.loops;

public class Task_1_2_Main { // Использование класса Task_1_2
    public static void main(String[] args) {
        if (args.length!=1) {
            System.out.println("Передано неправильное количество аргументов к исполняемой программе");
            return;
        }

        System.out.println("Передан один аргумент");

        Task_1_2 multiplicationMethods=new Task_1_2();
        System.out.println(multiplicationMethods.findMultiplicationOfDigits(args[0]));
    }
}
