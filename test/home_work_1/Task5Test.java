package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Task5Test {

    @Test
    public void sleepIn1(){
        boolean result=Task5.sleepIn(true, true);
        Assertions.assertTrue(result);
    }

    @Test
    public void sleepIn2(){
        boolean result=Task5.sleepIn(true, false);
        Assertions.assertFalse(result);
    }

    @Test
    public void sleepIn3(){
        boolean result=Task5.sleepIn(false, true);
        Assertions.assertTrue(result);
    }

    @Test
    public void sleepIn4(){
        boolean result=Task5.sleepIn(false, false);
        Assertions.assertTrue(result);
    }
}
