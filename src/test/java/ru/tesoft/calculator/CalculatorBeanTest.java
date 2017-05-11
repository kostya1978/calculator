package ru.tesoft.calculator;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Konstantin on 08.02.2016.
 */

public class CalculatorBeanTest {

    @Test
    public void testAddition(){
        CalculatorBean calculator = new CalculatorBean();
        String result = calculator.add("2", "3");
        assertEquals("5", result);
    }

    @Test
    public void testSubtraction(){
        CalculatorBean calculator = new CalculatorBean();
        String result = calculator.subtract("10", "5");
        assertEquals("5", result);
    }

    @Test
    public void testMultiplication(){
        CalculatorBean calculator = new CalculatorBean();
        String result = calculator.multiply("10", "10");
        assertEquals("100", result);
    }

    @Test
    public void testDivision(){
        CalculatorBean calculator = new CalculatorBean();
        String result = calculator.divide("10", "2");
        assertEquals("5", result);
    }

}
