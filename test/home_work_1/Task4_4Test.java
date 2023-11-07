package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_4Test {
    @Test
    public void converter1() {
        double result=Task4_4.converter("байт",1000000);
        Assertions.assertEquals(976.5625,result);
    }

    @Test
    public void converter2() {
        double result=Task4_4.converter("байты",1000000);
        Assertions.assertEquals(976.5625,result);
    }

    @Test
    public void converter3() {
        double result=Task4_4.converter("киллобайты",2);
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void converter4() {
        double result=Task4_4.converter("килобайт",2);
        Assertions.assertEquals(2048,result);
    }

    @Test
    public void converter5() {
        double result=Task4_4.converter("килобайты",2);
        Assertions.assertEquals(2048,result);
    }

    @Test
    public void converter6() {
        double result=Task4_4.converter("килобайты",0);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void converter7() {
        double result=Task4_4.converter("байты",0);
        Assertions.assertEquals(0,result);
    }
}
