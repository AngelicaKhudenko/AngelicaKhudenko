package home_work_3.calcs.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorWithMathExtendsTest {
    CalculatorWithMathExtends calculator=new CalculatorWithMathExtends();

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
}
