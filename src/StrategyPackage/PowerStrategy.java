package StrategyPackage;

import CalcPackege.Calc;

public class PowerStrategy implements PowerOperationStrategy {
    @Override
    public double execute(double numberA, int degree) throws Exception {
        return Calc.power(numberA, degree);
    }
}
