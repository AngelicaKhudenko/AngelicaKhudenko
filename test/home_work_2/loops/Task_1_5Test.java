package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Task_1_5Test {
    @Test
    public void findMaxDigit1() {
        Task_1_5 task=new Task_1_5();
        byte result=task.findMaxDigit(12345698);
        Assertions.assertEquals(9,result);
    }

    @Test
    public void findMaxDigit2() {
        Task_1_5 task=new Task_1_5();
        byte result=task.findMaxDigit(0);
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void findMaxDigit3() {
        Task_1_5 task=new Task_1_5();
        byte result=task.findMaxDigit(-20);
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void findProbability1() {
        Task_1_5 task=new Task_1_5();
        Random rnd=new Random(); // Создание массива рандомных чисел
        int [] numberRandom=new int[1000];
        int even=0;
        for (int i=0; i<1000; i++) {
            numberRandom[i]=rnd.nextInt(100);
            if (numberRandom[i] % 2 == 0) {
                even++;
            }
        }
        double myResult=even/1000.0*100;
        double result=task.findProbability(numberRandom, even);
        Assertions.assertEquals(myResult,result);
    }

    @Test
    public void infoOnEvenAndOdd1() {
        Task_1_5 task=new Task_1_5();
        String result=task.infoOnEvenAndOdd(123456789);
        Assertions.assertEquals("Количество четных цифр в числе: 4(8, 6, 4, 2). Количество нечетных цифр: 5(9, 7, 5, 3, 1)",result);
    }

    @Test
    public void infoOnEvenAndOdd2() {
        Task_1_5 task=new Task_1_5();
        String result=task.infoOnEvenAndOdd(-123456789);
        Assertions.assertEquals("Количество четных цифр в числе: 4(8, 6, 4, 2). Количество нечетных цифр: 5(9, 7, 5, 3, 1)",result);
    }

    @Test
    public void makeRowFibonachi1() {
        Task_1_5 task=new Task_1_5();
        String result=task.makeRowFibonachi(10);
        Assertions.assertEquals("1 2 3 5 8 13 21 34 55 89",result);
    }

    @Test
    public void makeRowFibonachi2() {
        Task_1_5 task=new Task_1_5();
        String result=task.makeRowFibonachi(0);
        Assertions.assertEquals("",result);
    }

    @Test
    public void makeRowFibonachi3() {
        Task_1_5 task=new Task_1_5();
        String result=task.makeRowFibonachi(-1);
        Assertions.assertEquals("",result);
    }

    @Test
    public void naturalNumberStep1() {
        Task_1_5 task=new Task_1_5();
        String result=task.naturalNumberStep(10,20,2);
        Assertions.assertEquals("10 12 14 16 18 20",result);
    }

    @Test
    public void naturalNumberStep2() {
        Task_1_5 task=new Task_1_5();
        String result=task.naturalNumberStep(20,20,2);
        Assertions.assertEquals("Введенные значения не позволяют выполнить задачу",result);
    }

    @Test
    public void naturalNumberStep3() {
        Task_1_5 task=new Task_1_5();
        String result=task.naturalNumberStep(18,20,2);
        Assertions.assertEquals("18 20",result);
    }

    @Test
    public void makeNumberReverse1() {
        Task_1_5 task=new Task_1_5();
        String result=task.makeNumberReverse(123456789);
        Assertions.assertEquals("987654321",result);
    }

    @Test
    public void makeNumberReverse2() {
        Task_1_5 task=new Task_1_5();
        String result=task.makeNumberReverse(-123456789);
        Assertions.assertEquals("-987654321",result);
    }

    @Test
    public void makeNumberReverse3() {
        Task_1_5 task=new Task_1_5();
        String result=task.makeNumberReverse(0);
        Assertions.assertEquals("0",result);
    }

    @Test
    public void makeNumberReverse4() {
        Task_1_5 task=new Task_1_5();
        String result=task.makeNumberReverse(111111111);
        Assertions.assertEquals("111111111",result);
    }

    @Test
    public void checkNumber1(){
        Task_1_5 task=new Task_1_5();
        boolean result=task.checkNumber("0");
        Assertions.assertFalse(result);
    }

    @Test
    public void checkNumber2(){
        Task_1_5 task=new Task_1_5();
        boolean result=task.checkNumber("5.2");
        Assertions.assertFalse(result);
    }
    @Test
    public void checkNumber3(){
        Task_1_5 task=new Task_1_5();
        boolean result=task.checkNumber("-10");
        Assertions.assertFalse(result);
    }
    @Test
    public void checkNumber4(){
        Task_1_5 task=new Task_1_5();
        boolean result=task.checkNumber("hello");
        Assertions.assertFalse(result);
    }
    @Test
    public void checkNumber5(){
        Task_1_5 task=new Task_1_5();
        boolean result=task.checkNumber("123");
        Assertions.assertTrue(result);
    }
}
