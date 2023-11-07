package home_work_4.comparators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringLengthComparatorTest {
    StringLengthComparator comparator=new StringLengthComparator();

    @Test
    public void compare1() {
        String first="Информация о товаре";
        String second="Информация о покупателе";

        int result=comparator.compare(first,second);
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void compare2() {
        String first="Цена";
        String second="Дата";

        int result=comparator.compare(first,second);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void compare3() {
        String first="Рекомендации пользователей приложения";
        String second="Отзывы";

        int result=comparator.compare(first,second);
        Assertions.assertEquals(1,result);
    }

    @Test
    public void compare4() {
        String first="";
        String second="";

        int result=comparator.compare(first,second);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void compare5() {
        String first=null;
        String second="Январь";

        int result=comparator.compare(first,second);
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void compare6() {
        String first=null;
        String second=null;

        int result=comparator.compare(first,second);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void compare7() {
        String first="Январь";
        String second=null;

        int result=comparator.compare(first,second);
        Assertions.assertEquals(1,result);
    }
}
