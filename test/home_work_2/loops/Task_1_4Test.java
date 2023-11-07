package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_4Test {
    @Test
    public void findOverflow1() {
        Task_1_4 task=new Task_1_4();
        String result=task.findOverflow("3");
        Assertions.assertEquals("Значение умножения до переполнения: 4052555153018976267. Значение умножения после переполнения: -6289078614652622815",result);
    }

    @Test
    public void findOverflow2() {
        Task_1_4 task=new Task_1_4();
        String result=task.findOverflow("188");
        Assertions.assertEquals("Значение умножения до переполнения: 1560496482665168896. Значение умножения после переполнения: -1774566438301073408",result);
    }

    @Test
    public void findOverflow3() {
        Task_1_4 task=new Task_1_4();
        String result=task.findOverflow("188");
        Assertions.assertEquals("Значение умножения до переполнения: 1560496482665168896. Значение умножения после переполнения: -1774566438301073408",result);
    }

    @Test
    public void findOverflow4() {
        Task_1_4 task=new Task_1_4();
        String result=task.findOverflow("1.25");
        Assertions.assertEquals("Введено не целое число",result);
    }

    @Test
    public void findOverflow5() {
        Task_1_4 task=new Task_1_4();
        String result=task.findOverflow("hello");
        Assertions.assertEquals("Введено не число",result);
    }

    @Test
    public void findOverflow6() {
        Task_1_4 task=new Task_1_4();
        String result=task.findOverflow("12345678912345678123");
        Assertions.assertEquals("Введено число больше диапазона int",result);
    }
}
