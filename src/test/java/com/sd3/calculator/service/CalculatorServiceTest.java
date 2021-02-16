package com.sd3.calculator.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    private CalculatorService calculatorService = new CalculatorService();

    @Test
    public void addReturnsSumOfTwoNumbers(){
        assertEquals(5, calculatorService.sum(2, 3));
    }
}
