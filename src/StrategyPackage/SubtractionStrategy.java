package StrategyPackage;

import CalcPackege.Calc;

public class SubtractionStrategy implements DoubleOperationStrategy {
    @Override
    public double execute(double numberA, double numberB) throws Exception {
        return Calc.subtraction(numberA, numberB);
    }
}
