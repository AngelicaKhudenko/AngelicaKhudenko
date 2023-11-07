package home_work_2.loops;


public class Task_1_1 { // Использование классов Task_1_1_1 и Task_1_1_2
    public static void main(String[] args) {
        if (args.length!=1) {
            System.out.println("Передано неправильное количество аргументов к исполняемой программе");
            return;
        }

        System.out.println("Все верно, передан один аргумент");
        byte num=Byte.parseByte(args[0]);

        Task_1_1_1 taskWithoutRecursion=new Task_1_1_1();
        System.out.println(taskWithoutRecursion.findFactorial(num));
        System.out.println("______________________________");

        Task_1_1_2 taskWithRecursion=new Task_1_1_2();
        System.out.println(taskWithRecursion.findFactorialString(num));
    }
}
