package home_work_4.comparators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObjectComparatorTest {
    ObjectComparator comparator=new ObjectComparator();

    @Test
    public void compare1() {
        Object first;
        first="утро";
        Object second;
        second="вечер";

        int result=comparator.compare(first,second);
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void compare2() {
        Object first;
        first="утро";
        Object second;
        second=first;

        int result=comparator.compare(first,second);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void compare3() {
        Object first;
        first="утро";
        Object second;
        second="вечер";

        int result=comparator.compare(second,first);
        Assertions.assertEquals(1,result);
    }

    @Test
    public void compare4() {
        Object first=null;
        Object second;
        second="вечер";

        int result=comparator.compare(first,second);
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void compare5() {
        Object first=null;
        Object second=null;

        int result=comparator.compare(first,second);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void compare6() {
        Object first;
        first="утро";
        Object second=null;

        int result=comparator.compare(first,second);
        Assertions.assertEquals(1,result);
    }
}
