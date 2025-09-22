package TestPackege;

import CalcPackege.Calc;
import CustomExeptionPackege.PowerException;
import CustomExeptionPackege.FactorialException;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

class CalcTest extends Test{
    @org.junit.jupiter.api.Test
    void factorial() throws FactorialException {
        List<Double> testResults = new ArrayList<>();
        testResults.add(Calc.factorial(intNumber1));
        testResults.add(Calc.factorial(intNumber2));

        List<Double> correctResults = new ArrayList<>();
        correctResults.add(120.0);
        correctResults.add(24.0);

        Assertions.assertEquals(testResults, correctResults);
    }

    @org.junit.jupiter.api.Test
    void addition() {
        List<Double> testResult = new ArrayList<>();
        List<Double> correctResult = new ArrayList<>();

        testResult.add(Calc.addition(intNumber1,intNumber2));
        testResult.add(Calc.addition(intNumber1,doubleNumber1));
        testResult.add(Calc.addition(doubleNumber1, doubleNumber2));

        correctResult.add(5.0+4.0);
        correctResult.add(5.0+4.2);
        correctResult.add(4.2+7.9);

        Assertions.assertEquals(testResult, correctResult);
    }

    @org.junit.jupiter.api.Test
    void subtraction() {
        List<Double> testResult = new ArrayList<>();
        List<Double> correctResult = new ArrayList<>();

        testResult.add(Calc.subtraction(intNumber1,intNumber2));
        testResult.add(Calc.subtraction(intNumber1,doubleNumber1));
        testResult.add(Calc.subtraction(doubleNumber1, doubleNumber2));

        correctResult.add(5.0-4.0);
        correctResult.add(5.0-4.2);
        correctResult.add(4.2-7.9);

        Assertions.assertEquals(testResult, correctResult);
    }

    @org.junit.jupiter.api.Test
    void multiplication() {
        List<Double> testResult = new ArrayList<>();
        List<Double> correctResult = new ArrayList<>();

        testResult.add(Calc.multiplication(intNumber1,intNumber2));
        testResult.add(Calc.multiplication(intNumber1,doubleNumber1));
        testResult.add(Calc.multiplication(doubleNumber1, doubleNumber2));

        correctResult.add(5.0*4.0);
        correctResult.add(5.0*4.2);
        correctResult.add(4.2*7.9);

        Assertions.assertEquals(testResult, correctResult);
    }

    @org.junit.jupiter.api.Test
    void division() {
        List<Double> testResult = new ArrayList<>();
        List<Double> correctResult = new ArrayList<>();

        testResult.add(Calc.division(intNumber1,intNumber2));
        testResult.add(Calc.division(intNumber1,doubleNumber1));
        testResult.add(Calc.division(doubleNumber1, doubleNumber2));

        correctResult.add(5.0/4.0);
        correctResult.add(5.0/4.2);
        correctResult.add(4.2/7.9);

        Assertions.assertEquals(testResult, correctResult);
    }

    @org.junit.jupiter.api.Test
    void power() throws PowerException {
        List<Double> testResult = new ArrayList<>();
        List<Double> correctResult = new ArrayList<>();

        testResult.add(Calc.power(doubleNumber1, degree));
        testResult.add(Calc.power(intNumber2, degree));

        correctResult.add(311.16960000000006);
        correctResult.add(256.0);

        Assertions.assertEquals(testResult, correctResult);
    }
}