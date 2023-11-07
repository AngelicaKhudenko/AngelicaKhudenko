package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Task4_5Test {
    @Test
    public void checkCode1() {
        String result=Task4_5.checkCode(0);
        Assertions.assertEquals("символ",result);
    }

    @Test
    public void checkCode2() {
        String result=Task4_5.checkCode(97);
        Assertions.assertEquals("буква",result);
    }

    @Test
    public void checkCode3() {
        String result=Task4_5.checkCode(-1);
        Assertions.assertEquals("неверный ввод",result);
    }
}
