package CalcPackege;

import CustomExeptionPackege.PowerException;
import CustomExeptionPackege.FactorialException;
import ValidPackage.Valid;

public class Calc {
    public static double factorial(double number) throws FactorialException {
        if (!Valid.factorialValid(number)) {
            throw new FactorialException("факториал должен быть целым положительным числом");
        }
        if (number == 1) {
            return number;
        } else {
            return number * factorial(number - 1);
        }

    }

    public static double addition(double numberA, double numberB) {
        return numberA + numberB;
    }

    public static double subtraction(double numberA, double numberB) {
        return numberA - numberB;
    }

    public static double multiplication(double numberA, double numberB) {
        return numberA * numberB;
    }

    public static double division(double numberA, double numberB) throws ArithmeticException {
        if (numberB == 0) {
            throw new ArithmeticException("нельзя делить на 0. введите новое выражение.");
        }
        return numberA / numberB;
    }

    public static double power(double number, int degree) throws PowerException {
        if (!Valid.degreeValid(degree)) {
            throw new PowerException("степень должна быть целым числом");
        }
        if (degree > 0) {
            if (degree == 1) {
                return number;
            } else {
                double res = 1;
                for (int i = 0; i < degree; i++) {
                    res *= number;
                }
                return res;
            }
        } else if (degree < 0) {
            double num = power(number, Math.abs(degree));
            return 1 / num;
        } else {
            return 1;
        }
    }
}
