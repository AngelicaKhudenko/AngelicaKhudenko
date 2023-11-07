package home_work_4.comparators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringAlphabeticComparatorTest {
    StringAlphabeticComparator comparator=new StringAlphabeticComparator();

    @Test
    public void compare1() {
        String first="Снежная зима";
        String second="Золотая осень";

        int result=comparator.compare(first,second);
        Assertions.assertEquals(1,result);
    }

    @Test
    public void compare2() {
        String first="День";
        String second="день";

        int result=comparator.compare(first,second);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void compare3() {
        String first="Октябрь";
        String second="Январь";

        int result=comparator.compare(first,second);
        Assertions.assertEquals(-1,result);
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
