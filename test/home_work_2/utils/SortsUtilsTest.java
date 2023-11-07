package home_work_2.utils;

import home_work_1.Task4_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortsUtilsTest {
    @Test
    public void sort1() {
        int [] arr=new int[]{1,2,3,4,5,6};
        SortsUtils.sort(arr);
        int [] myArr=new int[]{1,2,3,4,5,6};
        Assertions.assertArrayEquals(arr,myArr);
    }

    @Test
    public void sort2(){
        int [] arr=new int[]{1,1,1,1};
        SortsUtils.sort(arr);
        int [] myArr=new int[]{1,1,1,1};
        Assertions.assertArrayEquals(arr,myArr);
    }

    @Test
    public void sort3(){
        int [] arr=new int[]{9,1,5,99,9,9};
        SortsUtils.sort(arr);
        int [] myArr=new int[]{1,5,9,9,9,99};
        Assertions.assertArrayEquals(arr,myArr);
    }

    @Test
    public void sort4(){
        int [] arr=new int[]{};
        SortsUtils.sort(arr);
        int [] myArr=new int[]{};
        Assertions.assertArrayEquals(arr,myArr);
    }

    @Test
    public void sort5(){
        int [] arr=new int[]{6,5,4,3,2,1};
        SortsUtils.sort(arr);
        int [] myArr=new int[]{1,2,3,4,5,6};
        Assertions.assertArrayEquals(arr,myArr);
    }

    @Test
    public void sort6(){
        int [] arr=new int[]{20,-11,17,0,0,9,14};
        SortsUtils.sort(arr);
        int [] myArr=new int[]{-11,0,0,9,14,17,20};
        Assertions.assertArrayEquals(arr,myArr);
    }

    @Test
    public void shake1() {
        int [] arr=new int[]{1,2,3,4,5,6};
        SortsUtils.shake(arr);
        int [] myArr=new int[]{1,2,3,4,5,6};
        Assertions.assertArrayEquals(arr,myArr);
    }

    @Test
    public void shake2(){
        int [] arr=new int[]{1,1,1,1};
        SortsUtils.shake(arr);
        int [] myArr=new int[]{1,1,1,1};
        Assertions.assertArrayEquals(arr,myArr);
    }

    @Test
    public void shake3(){
        int [] arr=new int[]{9,1,5,99,9,9};
        SortsUtils.shake(arr);
        int [] myArr=new int[]{1,5,9,9,9,99};
        Assertions.assertArrayEquals(arr,myArr);
    }

    @Test
    public void shake4(){
        int [] arr=new int[]{};
        SortsUtils.shake(arr);
        int [] myArr=new int[]{};
        Assertions.assertArrayEquals(arr,myArr);
    }

    @Test
    public void shake5(){
        int [] arr=new int[]{6,5,4,3,2,1};
        SortsUtils.shake(arr);
        int [] myArr=new int[]{1,2,3,4,5,6};
        Assertions.assertArrayEquals(arr,myArr);
    }

    @Test
    public void shake6(){
        int [] arr=new int[]{-30,0,0,10,100,132,9};
        SortsUtils.shake(arr);
        int [] myArr=new int[]{-30,0,0,9,10,100,132};
        Assertions.assertArrayEquals(arr,myArr);
    }
}
