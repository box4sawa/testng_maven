package com.epam.tech_mentoring.calc;

import com.epam.tech_mentoring.calc.calc.Calculator;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcMultiplyTest {
    @Test
    @Parameters({"arg1", "arg2", "expRes"})
    public void testSum(double arg1, double arg2, double expRes) {
        Calculator calc = new Calculator();
        assertThat(calc.multiply(arg1, arg2)).as("Wrong multiply").isEqualTo(expRes);
    }
}