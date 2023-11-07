package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IArraysOperationTest {
    @Test
    public void printAllElements1(){
        IArraysOperation taskDoWhile=new DoWhileOperation();
        int [] container=new int[]{1,2,3,4,5};
        String result=taskDoWhile.printAllElements(container);
        Assertions.assertEquals("1 2 3 4 5", result);
    }

    @Test
    public void printAllElements2(){
        IArraysOperation taskWhile=new WhileOperation();
        int [] container=new int[]{2,8,6,5,3,2,0};
        String result=taskWhile.printAllElements(container);
        Assertions.assertEquals("2 8 6 5 3 2 0", result);
    }

    @Test
    public void printAllElements3(){
        IArraysOperation taskForEach=new ForEachOperation();
        int [] container=new int[]{0,0,0,0,0};
        String result=taskForEach.printAllElements(container);
        Assertions.assertEquals("0 0 0 0 0", result);
    }

    @Test
    public void printAllElements4(){
        IArraysOperation taskFor=new ForOperation();
        int [] container=new int[]{2,8,10,15};
        String result=taskFor.printAllElements(container);
        Assertions.assertEquals("2 8 10 15", result);
    }

    @Test
    public void printSecondElement1(){
        IArraysOperation taskDoWhile=new DoWhileOperation();
        int [] container=new int[]{1,2,3,4,5};
        String result=taskDoWhile.printSecondElement(container);
        Assertions.assertEquals("2 4", result);
    }

    @Test
    public void printSecondElement11(){
        IArraysOperation taskDoWhile=new DoWhileOperation();
        int [] container=new int[]{1};
        String result=taskDoWhile.printSecondElement(container);
        Assertions.assertEquals("Длина массива не позволяет вывести каждый второй элемент", result);
    }

    @Test
    public void printSecondElement2(){
        IArraysOperation taskWhile=new WhileOperation();
        int [] container=new int[]{2,8,6,5,3,2,0};
        String result=taskWhile.printSecondElement(container);
        Assertions.assertEquals("8 5 2", result);
    }

    @Test
    public void printSecondElement22(){
        IArraysOperation taskWhile=new DoWhileOperation();
        int [] container=new int[]{0};
        String result=taskWhile.printSecondElement(container);
        Assertions.assertEquals("Длина массива не позволяет вывести каждый второй элемент", result);
    }

    @Test
    public void printSecondElement3(){
        IArraysOperation taskForEach=new DoWhileOperation();
        int [] container=new int[]{0,0,0,0,0};
        String result=taskForEach.printSecondElement(container);
        Assertions.assertEquals("0 0", result);
    }

    @Test
    public void printSecondElement33(){
        IArraysOperation taskForEach=new DoWhileOperation();
        int [] container=new int[]{1};
        String result=taskForEach.printSecondElement(container);
        Assertions.assertEquals("Длина массива не позволяет вывести каждый второй элемент", result);
    }

    @Test
    public void printSecondElement4(){
        IArraysOperation taskDoWhile=new DoWhileOperation();
        int [] container=new int[]{2,8,10,15};
        String result=taskDoWhile.printSecondElement(container);
        Assertions.assertEquals("8 15", result);
    }

    @Test
    public void printSecondElement44(){
        IArraysOperation taskDoWhile=new DoWhileOperation();
        int [] container=new int[]{1};
        String result=taskDoWhile.printSecondElement(container);
        Assertions.assertEquals("Длина массива не позволяет вывести каждый второй элемент", result);
    }

    @Test
    public void printReverseElements1(){
        IArraysOperation taskDoWhile=new DoWhileOperation();
        int [] container=new int[]{1,2,3,4,5};
        String result=taskDoWhile.printReverseElements(container);
        Assertions.assertEquals("5 4 3 2 1", result);
    }

    @Test
    public void printReverseElements2(){
        IArraysOperation taskWhile=new DoWhileOperation();
        int [] container=new int[]{2,8,6,5,3,2,0};
        String result=taskWhile.printReverseElements(container);
        Assertions.assertEquals("0 2 3 5 6 8 2", result);
    }

    @Test
    public void printReverseElements3(){
        IArraysOperation taskForEach=new DoWhileOperation();
        int [] container=new int[]{0,0,0,0,0};
        String result=taskForEach.printReverseElements(container);
        Assertions.assertEquals("0 0 0 0 0", result);
    }

    @Test
    public void printReverseElements4(){
        IArraysOperation taskFor=new DoWhileOperation();
        int [] container=new int[]{2,8,10,15};
        String result=taskFor.printReverseElements(container);
        Assertions.assertEquals("15 10 8 2", result);
    }
}
