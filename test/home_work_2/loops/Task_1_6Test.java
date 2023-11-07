package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_6Test {
    @Test
    public void makeStringsOfMultiplication1() {
        Task_1_6 task=new Task_1_6();
        String result=task.makeStringsOfMultiplication(2,3,1,3);
        Assertions.assertEquals("2*1=2    3*1=3    \n2*2=4    3*2=6    \n2*3=6    3*3=9    \n",result);
    }

    @Test
    public void makeStringsOfMultiplication2() {
        Task_1_6 task=new Task_1_6();
        String result=task.makeStringsOfMultiplication(0,0,0,0);
        Assertions.assertEquals("0*0=0    \n",result);
    }
}
