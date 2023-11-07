package home_work_2.loops;

import home_work_2.loops.Task_1_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_3Test {
    @Test
    public void findDegreeString1(){
        Task_1_3 degreeMethods=new Task_1_3();
        String result=degreeMethods.findDegreeString("18", "5");
        Assertions.assertEquals("18.0^5=1889568.0", result);
    }

    @Test
    public void findDegreeString2(){
        Task_1_3 degreeMethods=new Task_1_3();
        String result=degreeMethods.findDegreeString("7.5", "2");
        Assertions.assertEquals("7.5^2=56.25", result);
    }

    @Test
    public void findDegreeString3(){
        Task_1_3 degreeMethods=new Task_1_3();
        String result=degreeMethods.findDegreeString("-10", "2");
        Assertions.assertEquals("-10.0^2=100.0", result);
    }

    @Test
    public void findDegreeString4(){
        Task_1_3 degreeMethods=new Task_1_3();
        String result=degreeMethods.findDegreeString("-10", "-2");
        Assertions.assertEquals("Переданные аргументы не соответствуют условиям работы метода", result);
    }

    @Test
    public void checkTheNumber1(){
        Task_1_3 degreeMethods=new Task_1_3();
        String result=degreeMethods.checkTheNumber("-10", true);
        Assertions.assertEquals("Введено отрицательное число", result);
    }

    @Test
    public void checkTheNumber2(){
        Task_1_3 degreeMethods=new Task_1_3();
        String result=degreeMethods.checkTheNumber("10.5", true);
        Assertions.assertEquals("Введено не целое число", result);
    }

    @Test
    public void checkTheNumber3(){
        Task_1_3 degreeMethods=new Task_1_3();
        String result=degreeMethods.checkTheNumber("0", true);
        Assertions.assertEquals("Введен ноль", result);
    }

    @Test
    public void checkTheNumber4(){
        Task_1_3 degreeMethods=new Task_1_3();
        String result=degreeMethods.checkTheNumber("Good morning", true);
        Assertions.assertEquals("Введено не число", result);
    }

    @Test
    public void checkTheNumber5(){
        Task_1_3 degreeMethods=new Task_1_3();
        String result=degreeMethods.checkTheNumber("-10", false);
        Assertions.assertEquals("Число соответствует условиям", result);
    }

    @Test
    public void checkTheNumber6(){
        Task_1_3 degreeMethods=new Task_1_3();
        String result=degreeMethods.checkTheNumber("-10.2", false);
        Assertions.assertEquals("Число соответствует условиям", result);
    }

    @Test
    public void checkTheNumber7(){
        Task_1_3 degreeMethods=new Task_1_3();
        String result=degreeMethods.checkTheNumber("good", false);
        Assertions.assertEquals("Введено не число", result);
    }
}
