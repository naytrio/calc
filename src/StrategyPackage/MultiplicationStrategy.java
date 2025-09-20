package StrategyPackage;

import CalcPackege.Calc;
import InputPackege.Input;

public class MultiplicationStrategy implements StrategyCalc {
    @Override
    public double execute(double numberA) throws Exception {
        double numberB = Input.InputNumber();
        return Calc.multiplication(numberA, numberB);
    }
}
