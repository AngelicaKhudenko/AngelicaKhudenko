package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Task4_6Test {
    @Test
    public void checkYear1() {
        String checkYearResult=Task4_6.checkYear(2024);
        Assertions.assertEquals("да",checkYearResult);
    }

    @Test
    public void checkYear2() {
        String checkYearResult=Task4_6.checkYear(2023);
        Assertions.assertEquals("нет",checkYearResult);
    }

    @Test
    public void checkCode3() {
        String result=Task4_5.checkCode(-1);
        Assertions.assertEquals("неверный ввод",result);
    }
}
