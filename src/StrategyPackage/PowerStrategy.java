package StrategyPackage;

import CalcPackege.Calc;
import InputPackege.Input;

public class PowerStrategy implements StrategyCalc {
    @Override
    public double execute(double numberA) throws Exception {
        int degree = Input.InputDegree();
        return Calc.power(numberA, degree);
    }
}
