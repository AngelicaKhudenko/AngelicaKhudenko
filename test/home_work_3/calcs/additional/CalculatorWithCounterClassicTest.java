package home_work_3.calcs.additional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorWithCounterClassicTest {
    CalculatorWithCounterClassic calculator=new CalculatorWithCounterClassic();

    @Test
    public void incrementCountOperation(){
        long counterAtTheStart=calculator.getCountOperation();
        calculator.incrementCountOperation();
        long counterAtTheEnd=calculator.getCountOperation();
        long myInfoOnCounter=counterAtTheStart+1;
        Assertions.assertEquals(myInfoOnCounter,counterAtTheEnd);
    }

    @Test
    public void getCountOperation() {
        calculator.makeSquareRadical(625);
        calculator.incrementCountOperation();
        calculator.makeModule(-25632);
        calculator.incrementCountOperation();
        long result=calculator.getCountOperation();
        Assertions.assertEquals(2,result);
    }
}
