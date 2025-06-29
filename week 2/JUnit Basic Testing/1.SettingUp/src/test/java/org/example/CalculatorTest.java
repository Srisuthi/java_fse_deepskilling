package org.example;


import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calc = new Calculator();


    @Test
    public void Addtest(){
        int result = calc.add(1,2);
        Assert.assertEquals(3,result);
    }

    @Test
    public void subtract() {
        int result = calc.subtract(6,4);
        Assert.assertEquals(2,result);

    }
}
