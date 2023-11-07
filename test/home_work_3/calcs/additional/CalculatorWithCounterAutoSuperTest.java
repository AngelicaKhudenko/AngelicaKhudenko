package home_work_3.calcs.additional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorWithCounterAutoSuperTest {
    CalculatorWithCounterAutoSuper calculator=new CalculatorWithCounterAutoSuper();
    @Test
    public void makeDivision() {
        double result=calculator.makeDivision(28.0,5.0);
        Assertions.assertEquals(5.6,result);
    }

    @Test
    public void makeMultiplication() {
        double result=calculator.makeMultiplication(15,7);
        Assertions.assertEquals(105,result);
    }

    @Test
    public void makeMinus() {
        double result=calculator.makeMinus(105,7);
        Assertions.assertEquals(98,result);
    }

    @Test
    public void makePlus() {
        double result=calculator.makePlus(4.1,5.6);
        Assertions.assertEquals(9.7,result);
    }

    @Test
    public void makeDegree() {
        double result=calculator.makeDegree(5.6,2);
        Assertions.assertEquals(31.359999999999996,result);
    }

    @Test
    public void makeModule() {
        double result=calculator.makeModule(-25632);
        Assertions.assertEquals(25632,result);
    }

    @Test
    public void makeSquareRadical() {
        double result=calculator.makeSquareRadical(625);
        Assertions.assertEquals(25,result);
    }

    @Test
    public void getCountOperation() {
        calculator.makeSquareRadical(625);
        calculator.makeModule(-25632);
        long result=calculator.getCountOperation();
        Assertions.assertEquals(2,result);
    }
}
