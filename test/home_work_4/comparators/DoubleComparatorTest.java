package home_work_4.comparators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoubleComparatorTest {
    DoubleComparator comparator=new DoubleComparator();

    @Test
    public void compare1() {
        Double first=10.11;
        Double second=20.11;

        int result=comparator.compare(first,second);
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void compare2() {
        Double first=10.11;
        Double second=10.11;

        int result=comparator.compare(first,second);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void compare3() {
        Double first=100.20;
        Double second=20.11;

        int result=comparator.compare(first,second);
        Assertions.assertEquals(1,result);
    }
}
