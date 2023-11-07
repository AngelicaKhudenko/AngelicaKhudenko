package home_work_4;

import home_work_4.comparators.IntegerComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataContainerTest {
    Integer []data=new Integer[2];
    DataContainer <Integer> container=new DataContainer<>(data);

    @Test
    public void add1(){
        int result=container.add(5);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void get1(){
        container.add(5);
        container.add(4);
        container.add(3);
        int result=container.get(0);
        Assertions.assertEquals(5,result);
    }

    @Test
    public void getItems1(){
        Integer []result=container.getItems();
        Integer [] myResult=new Integer[2];
        Assertions.assertArrayEquals(myResult,result);
    }

    @Test
    public void getItems2(){
        container.add(5);
        container.add(4);
        container.add(3);
        Integer []result=container.getItems();
        Integer [] myResult=new Integer[]{5,4,3};
        Assertions.assertArrayEquals(myResult,result);
    }

    @Test
    public void delete1(){
        container.add(5);
        container.add(4);
        container.add(3);
        boolean result=container.delete(0);
        Assertions.assertTrue(result);
    }

    @Test
    public void delete2(){
        container.add(5);
        container.add(4);
        container.add(3);
        boolean result=container.delete(5);
        Assertions.assertFalse(result);
    }

    @Test
    public void deleteItem1(){
        container.add(3);
        container.add(2);
        container.add(1);
        boolean result=container.delete(Integer.valueOf(3));
        Assertions.assertTrue(result);
    }

    @Test
    public void deleteItem2(){
        container.add(5);
        container.add(4);
        container.add(3);
        boolean result=container.delete(Integer.valueOf(0));
        Assertions.assertFalse(result);
    }

    @Test
    public void sort1(){
        container.add(5);
        container.add(4);
        container.add(3);
        container.add(3);
        container.add(4);
        container.add(5);

        container.sort(new IntegerComparator());
        Integer [] myResult=new Integer[]{3,3,4,4,5,5};
        Assertions.assertArrayEquals(myResult,container.getItems());
    }

    @Test
    public void sort2(){
        container.add(0);
        container.add(0);
        container.add(0);
        container.add(0);
        container.add(0);
        container.add(0);

        container.sort(new IntegerComparator());
        Integer [] myResult=new Integer[]{0,0,0,0,0,0};
        Assertions.assertArrayEquals(myResult,container.getItems());
    }

    @Test
    public void sort3(){
        container.add(-1);
        container.add(-1);
        container.add(2);
        container.add(2);
        container.add(-3);
        container.add(-3);

        container.sort(new IntegerComparator());
        Integer [] myResult=new Integer[]{-3,-3,-1,-1,2,2};
        Assertions.assertArrayEquals(myResult,container.getItems());
    }

    @Test
    public void toStringModified(){
        container.add(5);
        container.add(4);
        container.add(3);
        container.add(3);
        container.add(4);
        container.add(5);

        String result=container.toString();
        Assertions.assertEquals("[5, 4, 3, 3, 4, 5]",result);
    }
}
