package com.epam.tech_mentoring.calc;

import com.epam.tech_mentoring.calc.calc.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcSubTest {
    private double arg1;
    private double arg2;
    private double expRes;

    @DataProvider(name = "sub_data_provider")
    public static Object[][] subDataProvider() {
        return new Object[][] {
                {1, 2, -1},
                {-3, -4, 1},
                {0, 0, 0}
        };
    }

    @Factory(dataProvider = "sub_data_provider")
    public CalcSubTest(double arg1, double arg2, double expRes) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.expRes = expRes;
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertThat(calc.sub(arg1, arg2)).as("Wrong sub result").isEqualTo(expRes);
    }
}
