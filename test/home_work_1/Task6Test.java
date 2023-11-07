package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6Test {
    @Test
    public void welcom1() {
        ICommunicationPrinter test1=new Task6_1();
        String result=test1.welcom("Анжелика");
        Assertions.assertEquals("Добрый день, а вы кто?",result);
    }

    @Test
    public void welcom2() {
        ICommunicationPrinter test1=new Task6_1();
        String result=test1.welcom("Анастасия");
        Assertions.assertEquals("Я тебя так долго ждал",result);
    }

    @Test
    public void welcom3() {
        ICommunicationPrinter test1=new Task6_1();
        String result=test1.welcom("Вася");
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал",result);
    }

    @Test
    public void welcom11() {
        ICommunicationPrinter test2=new Task6_2();
        String result=test2.welcom("Анжелика");
        Assertions.assertEquals("Добрый день, а вы кто?",result);
    }

    @Test
    public void welcom22() {
        ICommunicationPrinter test2=new Task6_2();
        String result=test2.welcom("Анастасия");
        Assertions.assertEquals("Я тебя так долго ждал",result);
    }

    @Test
    public void welcom33() {
        ICommunicationPrinter test2 = new Task6_2();
        String result = test2.welcom("Вася");
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал", result);
    }

    @Test
    public void welcom111() {
        ICommunicationPrinter test3=new Task6_3();
        String result=test3.welcom("Анжелика");
        Assertions.assertEquals("Добрый день, а вы кто?",result);
    }

    @Test
    public void welcom222() {
        ICommunicationPrinter test3=new Task6_3();
        String result=test3.welcom("Анастасия");
        Assertions.assertEquals("Я тебя так долго ждал",result);
    }

    @Test
    public void welcom333() {
        ICommunicationPrinter test3=new Task6_3();
        String result = test3.welcom("Вася");
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал", result);
    }
}
