package StrategyPackage;

import CalcPackege.Calc;
import InputPackege.Input;

public class SubtractionStrategy implements StrategyCalc {
    @Override
    public double execute(double numberA) throws Exception {
        double numberB = Input.InputNumber();
        return Calc.subtraction(numberA, numberB);
    }
}
