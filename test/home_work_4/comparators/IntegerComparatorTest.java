package home_work_4.comparators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerComparatorTest {
    IntegerComparator comparator=new IntegerComparator();

    @Test
    public void compare1() {
        Integer first=5;
        Integer second=25;

        int result=comparator.compare(first,second);
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void compare2() {
        Integer first=5;
        Integer second=5;

        int result=comparator.compare(first,second);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void compare3() {
        Integer first=-30;
        Integer second=-150;

        int result=comparator.compare(first,second);
        Assertions.assertEquals(1,result);
    }
}
