package StrategyPackage;

import CalcPackege.Calc;
import CustomExeptionPackege.FactorialException;
import ValidPackage.Valid;

public class FactorialStrategy implements StrategyCalc {
    @Override
    public double execute(double number) throws Exception {
        if (Valid.factorialValid(number)) {
            return Calc.factorial(number);
        }
        throw new FactorialException("факториал должен быть целым положительным числом");
    }
}
