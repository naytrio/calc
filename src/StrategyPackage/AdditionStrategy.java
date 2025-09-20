package StrategyPackage;

import CalcPackege.Calc;
import InputPackege.Input;

public class AdditionStrategy implements StrategyCalc {
    @Override
    public double execute(double numberA) throws Exception {
        double numberB = Input.InputNumber();
        return Calc.addition(numberA, numberB);
    }
}
