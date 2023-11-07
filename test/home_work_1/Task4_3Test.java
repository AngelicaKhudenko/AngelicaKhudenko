package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_3Test {
    @Test
    public void checkDivisionBigger1() {
        int checkBigger=Task4_3.checkDivisionBigger(6,2);
        Assertions.assertEquals(6,checkBigger);
    }

    @Test
    public void checkDivisionBigger2() {
        int checkBigger=Task4_3.checkDivisionBigger(2,2);
        Assertions.assertEquals(2,checkBigger);
    }

    @Test
    public void checkDivisionBigger3() {
        int checkBigger=Task4_3.checkDivisionBigger(1,2);
        Assertions.assertEquals(2,checkBigger);
    }

    @Test
    public void checkDivisionBigger4() {
        int checkBigger=Task4_3.checkDivisionBigger(0,2);
        Assertions.assertEquals(0,checkBigger);
    }
}
