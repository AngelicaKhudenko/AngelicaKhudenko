package home_work_2.loops;

import home_work_2.loops.Task_1_1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_1_2Test {
    @Test
    public void findFactorialString1(){
        Task_1_1_2 taskWithRecursion=new Task_1_1_2();
        String result=taskWithRecursion.findFactorialString((byte)5);
        Assertions.assertEquals("1*2*3*4*5=120",result);
    }

    @Test
    public void findFactorialString2(){
        Task_1_1_2 taskWithRecursion=new Task_1_1_2();
        String result=taskWithRecursion.findFactorialString((byte)0);
        Assertions.assertEquals("0!=1",result);
    }

    @Test
    public void findFactorialString3(){
        Task_1_1_2 taskWithRecursion=new Task_1_1_2();
        String result=taskWithRecursion.findFactorialString((byte)-5);
        Assertions.assertEquals("неверный ввод данных",result);
    }

    @Test
    public void findFactorialString4(){
        Task_1_1_2 taskWithRecursion=new Task_1_1_2();
        String result=taskWithRecursion.findFactorialString((byte)25);
        Assertions.assertEquals("неверный ввод данных",result);
    }

    @Test
    public void findFactorial1(){
        Task_1_1_2 taskWithRecursion=new Task_1_1_2();
        long result=taskWithRecursion.findFactorial((byte)5);
        Assertions.assertEquals(120,result);
    }

    @Test
    public void findFactorial2(){
        Task_1_1_2 taskWithRecursion=new Task_1_1_2();
        long result=taskWithRecursion.findFactorial((byte)0);
        Assertions.assertEquals(1,result);
    }

    @Test
    public void findFactorial3(){
        Task_1_1_2 taskWithRecursion=new Task_1_1_2();
        long result=taskWithRecursion.findFactorial((byte)-10);
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void findFactorial4(){
        Task_1_1_2 taskWithRecursion=new Task_1_1_2();
        long result=taskWithRecursion.findFactorial((byte)30);
        Assertions.assertEquals(-1,result);
    }
}
