package StrategyPackage;

import CalcPackege.Calc;

public class DivisionStrategy implements DoubleOperationStrategy {
    @Override
    public double execute(double numberA, double numberB) throws Exception {
        if (numberB == 0) {
            throw new ArithmeticException("деление на 0 невозможно");
        }
        return Calc.division(numberA, numberB);
    }
}
