package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6_3Test {
    @Test
    public void welcom1(){
        Task6_3 test3=new Task6_3();
        String result=test3.welcom("Анжелика");
        Assertions.assertEquals("Добрый день, а вы кто?",result);
    }

    @Test
    public void welcom2(){
        Task6_3 test3=new Task6_3();
        String result=test3.welcom("Анастасия");
        Assertions.assertEquals("Я тебя так долго ждал",result);
    }

    @Test
    public void welcom3() {
        Task6_3 test3=new Task6_3();
        String result = test3.welcom("Вася");
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал", result);
    }
}
