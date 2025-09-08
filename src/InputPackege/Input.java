package InputPackege;

import CustomExeptionPackege.PowerException;
import CustomExeptionPackege.OperationsException;
import ValidPackage.Valid;

import java.util.Scanner;

public class Input {
    static Scanner in = new Scanner(System.in);

    public static String InputOperation() {
        while (true) {
            try {
                System.out.print("Введите действие, которое поддерживает этот калькулятор: ");
                String operation = in.nextLine();
                if (operation.equals("q")) {
                    System.exit(0);
                }
                if (!Valid.operationValid(operation)) {
                    throw new OperationsException("Неверный ввод операции");
                }
                return operation;
            } catch (OperationsException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int InputDegree() {
        while (true) {
            try {
                System.out.print("введите в какую степень(целое число) возвести число: ");
                String input = in.nextLine();
                if (input.equals("q")) {
                    System.exit(0);
                }
                int degree = Integer.parseInt(input);
                if (Valid.degreeValid(degree)) {
                    return degree;
                } else {
                    throw new PowerException("ошибка ввода степени");
                }
            } catch (Exception e) {
                System.out.println("ошибка ввода. повторите попытку");
            }
        }
    }

    public static double InputNumber() {
        while (true) {
            try {
                System.out.print("введите число: ");
                String number = in.nextLine();
                if (number.equals("q")) {
                    System.exit(0);
                }
                return Double.parseDouble(number);
            } catch (NumberFormatException e) {
                System.out.println("возможно вы ввели не число. повторите ввод");
            }
        }
    }
}
