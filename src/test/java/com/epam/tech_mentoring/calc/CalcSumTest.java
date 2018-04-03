package com.epam.tech_mentoring.calc;

import com.epam.tech_mentoring.calc.calc.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class CalcSumTest {

    @DataProvider(name = "sum_data_provider")
    public Object[][] sumDataProvider() {
        return new Object[][] {
                {1, 2, 3},
                {-3, -4, -7},
                {0, 0, 0},
                {0.1, 0.4, 0.5},
        };
    }

    @Test(dataProvider = "sum_data_provider")
    public void testSum(double arg1, double arg2, double expRes) {
        Calculator calc = new Calculator();
        assertThat(calc.sum(arg1, arg2)).as("Wrong summ").isEqualTo(expRes);
    }
}
