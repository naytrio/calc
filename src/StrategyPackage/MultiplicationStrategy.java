package StrategyPackage;

import CalcPackege.Calc;

public class MultiplicationStrategy implements DoubleOperationStrategy {
    @Override
    public double execute(double numberA, double numberB) throws Exception {
        return Calc.multiplication(numberA, numberB);
    }
}
