package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_2Test {
    @Test
    public void findMiddle1() {
        double checkMiddle=Task4_2.findMiddle(5.0,5.0,5.0);
        Assertions.assertEquals(0,checkMiddle);
    }

    @Test
    public void findMiddle2() {
        double checkMiddle=Task4_2.findMiddle(10.2,20.2,30.3);
        Assertions.assertEquals(20.2,checkMiddle);
    }

    @Test
    public void findMiddle3() {
        double checkMiddle=Task4_2.findMiddle(5.0,5.0,2.0);
        Assertions.assertEquals(0,checkMiddle);
    }

    @Test
    public void findMiddle4() {
        double checkMiddle=Task4_2.findMiddle(2.0,5.0,5.0);
        Assertions.assertEquals(0,checkMiddle);
    }

    @Test
    public void findMiddle5() {
        double checkMiddle=Task4_2.findMiddle(5.0,2.0,5.0);
        Assertions.assertEquals(0,checkMiddle);
    }
}
