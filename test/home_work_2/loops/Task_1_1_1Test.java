package home_work_2.loops;

import home_work_2.loops.Task_1_1_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_1_1Test {
    @Test
    public void findFactorial1(){
        Task_1_1_1 taskWithoutRecursion=new Task_1_1_1();
        String result=taskWithoutRecursion.findFactorial((byte)5);
        Assertions.assertEquals("1*2*3*4*5=120",result);
    }

    @Test
    public void findFactorial2(){
        Task_1_1_1 taskWithoutRecursion=new Task_1_1_1();
        String result=taskWithoutRecursion.findFactorial((byte)0);
        Assertions.assertEquals("0!=1",result);
    }

    @Test
    public void findFactorial3(){
        Task_1_1_1 taskWithoutRecursion=new Task_1_1_1();
        String result=taskWithoutRecursion.findFactorial((byte)-5);
        Assertions.assertEquals("неверный ввод данных",result);
    }

    @Test
    public void findFactorial4(){
        Task_1_1_1 taskWithoutRecursion=new Task_1_1_1();
        String result=taskWithoutRecursion.findFactorial((byte)25);
        Assertions.assertEquals("неверный ввод данных",result);
    }
}
