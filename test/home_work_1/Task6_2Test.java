package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6_2Test {
    @Test
    public void welcom1() {
        Task6_2 test2=new Task6_2();
        String result=test2.welcom("Анжелика");
        Assertions.assertEquals("Добрый день, а вы кто?",result);
    }

    @Test
    public void welcom2() {
        Task6_2 test2=new Task6_2();
        String result=test2.welcom("Анастасия");
        Assertions.assertEquals("Я тебя так долго ждал",result);
    }

    @Test
    public void welcom3() {
        Task6_2 test2 = new Task6_2();
        String result = test2.welcom("Вася");
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал", result);
    }
}
