package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_1Test {
    @Test
    public void checkIfOdd1() {
        byte checkResult= Task4_1.checkIfOdd(1,3);
        Assertions.assertEquals(12,checkResult);
    }
    @Test
    public void checkIfOdd2() {
        byte checkResult= Task4_1.checkIfOdd(2,2);
        Assertions.assertEquals(0,checkResult);
    }

    @Test
    public void checkIfOdd3() {
        byte checkResult= Task4_1.checkIfOdd(1,2);
        Assertions.assertEquals(1,checkResult);
    }

    @Test
    public void checkIfOdd4() {
        byte checkResult= Task4_1.checkIfOdd(2,1);
        Assertions.assertEquals(2,checkResult);
    }
}
