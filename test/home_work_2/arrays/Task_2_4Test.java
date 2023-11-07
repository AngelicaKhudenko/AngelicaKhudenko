package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Task_2_4Test {
    @Test
    public void findSumPositive1() {
        Task_2_4 task=new Task_2_4();
        int[]container=new int[]{-1,25,33,2,8,15};
        int result=task.findSumPositive(container);
        Assertions.assertEquals(10,result);
    }

    @Test
    public void findSumPositive2() {
        Task_2_4 task=new Task_2_4();
        int[]container=new int[]{-1,0,33,0,15};
        int result=task.findSumPositive(container);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void findMaximumEven1() {
        Task_2_4 task=new Task_2_4();
        int[]container=new int[]{-1,0,33,0,15};
        int result=task.findMaximumEven(container);
        Assertions.assertEquals(33,result);
    }

    @Test
    public void findMaximumEven2() {
        Task_2_4 task=new Task_2_4();
        int[]container=new int[]{0,0,0,0,0};
        int result=task.findMaximumEven(container);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void findIndexLessMiddle1() {
        Task_2_4 task=new Task_2_4();
        int[]container=new int[]{1,2,3,4,5};
        int []result=task.findIndexLessMiddle(container);
        int []myContainer=new int []{1,2};
        Assertions.assertArrayEquals(myContainer,result);
    }

    @Test
    public void findTwoMinimum1() {
        Task_2_4 task=new Task_2_4();
        int[]container=new int[]{1,2,3,4,5};
        int []result=task.findTwoMinimum(container);
        int []myContainer=new int []{1,2};
        Assertions.assertArrayEquals(myContainer,result);
    }

    @Test
    public void findTwoMinimum2() {
        Task_2_4 task=new Task_2_4();
        int[]container=new int[]{-10,15,70,5};
        int []result=task.findTwoMinimum(container);
        int []myContainer=new int []{-10,5};
        Assertions.assertArrayEquals(myContainer,result);
    }

    @Test
    public void createChangedMass1() {
        Task_2_4 task=new Task_2_4();
        int[]container=new int[]{2,4,6,8,10,20,30,40,50};
        int []result=task.createChangedMass(container, 5,30);
        int []myContainer=new int []{2,4,40,50,0,0,0,0,0};
        Assertions.assertArrayEquals(myContainer,result);
    }

    @Test
    public void findSumDigits1() {
        Task_2_4 task=new Task_2_4();
        int[]container=new int[]{2,4,6,8,10,20,30,40,50};
        int result=task.findSumDigits(container);
        Assertions.assertEquals(35,result);
    }

    @Test
    public void findSumDigits2() {
        Task_2_4 task=new Task_2_4();
        int[]container=new int[]{-2,-4,6,8,-10,-20,-30,-40,50};
        int result=task.findSumDigits(container);
        Assertions.assertEquals(35,result);
    }

    @Test
    public void checkNumber1() {
        Task_2_4 task=new Task_2_4();
        boolean result=task.checkNumber("2.5");
        Assertions.assertFalse(result);
    }

    @Test
    public void checkNumber2() {
        Task_2_4 task=new Task_2_4();
        boolean result=task.checkNumber("container");
        Assertions.assertFalse(result);
    }

    @Test
    public void checkNumber3() {
        Task_2_4 task=new Task_2_4();
        boolean result=task.checkNumber("1245678912345678782132131");
        Assertions.assertFalse(result);
    }

    @Test
    public void checkNumber4() {
        Task_2_4 task=new Task_2_4();
        boolean result=task.checkNumber("125");
        Assertions.assertTrue(result);
    }
}
