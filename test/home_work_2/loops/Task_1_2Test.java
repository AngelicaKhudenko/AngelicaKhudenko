package home_work_2.loops;

import home_work_2.loops.Task_1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_2Test {
    @Test
    public void findMultiplicationOfDigits1() {
        Task_1_2 multiplicationMethods=new Task_1_2();
        String result=multiplicationMethods.findMultiplicationOfDigits("181232375");
        Assertions.assertEquals("1*8*1*2*3*2*3*7*5=10080",result);
    }

    @Test
    public void findMultiplicationOfDigits2() {
        Task_1_2 multiplicationMethods=new Task_1_2();
        String result=multiplicationMethods.findMultiplicationOfDigits("99.2");
        Assertions.assertEquals("Введено не целое число",result);
    }

    @Test
    public void findMultiplicationOfDigits3() {
        Task_1_2 multiplicationMethods=new Task_1_2();
        String result=multiplicationMethods.findMultiplicationOfDigits("Привет");
        Assertions.assertEquals("Введено не число",result);
    }

    @Test
    public void findMultiplicationOfDigits4() {
        Task_1_2 multiplicationMethods=new Task_1_2();
        String result=multiplicationMethods.findMultiplicationOfDigits("0");
        Assertions.assertEquals("Введен ноль",result);
    }

    @Test
    public void findMultiplicationOfDigits5() {
        Task_1_2 multiplicationMethods=new Task_1_2();
        String result=multiplicationMethods.findMultiplicationOfDigits("-20");
        Assertions.assertEquals("Введено отрицательное число",result);
    }

    @Test
    public void findMultiplicationOfDigits6() {
        Task_1_2 multiplicationMethods=new Task_1_2();
        String result=multiplicationMethods.findMultiplicationOfDigits("12345678912345678922");
        Assertions.assertEquals("Введено число больше диапазона long",result);
    }
}
