package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task7Test {
    @Test
    public void createPhoneNumber1() { // Корректные данные
        char []num=new char[]{'0','0','0','0','0','0','0','0','0','0'};
        String result=Task7.createPhoneNumber(num);
        Assertions.assertEquals("(000) 000-0000",result);
    }

    @Test
    public void createPhoneNumber2() { // 9 цифр
        char []num=new char[]{'0','0','0','0','0','0','0','0','0'};
        String result=Task7.createPhoneNumber(num);
        Assertions.assertEquals("неверный ввод",result);
    }

    @Test
    public void createPhoneNumber3() { // 11 цифр
        char []num=new char[]{'0','0','0','0','0','0','0','0','0','0','0'};
        String result=Task7.createPhoneNumber(num);
        Assertions.assertEquals("неверный ввод",result);
    }

    @Test
    public void createPhoneNumber4() { // Посторонние символы
        char []num=new char[]{'0','0','0','0','0','0','0','0','0', 'l'};
        String result=Task7.createPhoneNumber(num);
        Assertions.assertEquals("неверный ввод",result);
    }

    @Test
    public void createPhoneNumber5() { // Пустой массив
        char []num=new char[]{};
        String result=Task7.createPhoneNumber(num);
        Assertions.assertEquals("неверный ввод",result);
    }
}
