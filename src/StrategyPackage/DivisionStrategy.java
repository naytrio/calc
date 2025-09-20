package StrategyPackage;

import CalcPackege.Calc;
import InputPackege.Input;

public class DivisionStrategy implements StrategyCalc {
    @Override
    public double execute(double numberA) throws Exception {
        double numberB = Input.InputNumber();
        if (numberB == 0) {
            throw new ArithmeticException("деление на 0 невозможно");
        }
        return Calc.division(numberA, numberB);
    }
}
