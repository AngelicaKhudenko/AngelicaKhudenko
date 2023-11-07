package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6_1Test {
    @Test
    public void welcom1() {
        Task6_1 test1=new Task6_1();
        String result=test1.welcom("Анжелика");
        Assertions.assertEquals("Добрый день, а вы кто?",result);
    }

    @Test
    public void welcom2() {
        Task6_1 test1=new Task6_1();
        String result=test1.welcom("Анастасия");
        Assertions.assertEquals("Я тебя так долго ждал",result);
    }

    @Test
    public void welcom3() {
        Task6_1 test1=new Task6_1();
        String result=test1.welcom("Вася");
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал",result);
    }
}


