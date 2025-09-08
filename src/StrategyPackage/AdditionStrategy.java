package StrategyPackage;

import CalcPackege.Calc;

public class AdditionStrategy implements DoubleOperationStrategy {
    @Override
    public double execute(double numberA, double numberB) throws Exception {
        return Calc.addition(numberA, numberB);
    }
}
