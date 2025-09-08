package MainPackege;

import CommandPackege.*;
import CustomExeptionPackege.OperationsException;
import InputPackege.Input;

public class Main {
    public static void main(String[] args)throws Exception {
        PrintControls();
        while (true){
            try{
                double number = Input.InputNumber();
                String operation = Input.InputOperation();
                number = commandControl(number, operation);
                if (IntTryParse(number)){
                    long result  = Math.round(number);
                    Print(result);
                }
                else {
                    Print(number);
                }
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            catch (ClassCastException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static double commandControl(double numberA, String operation)throws Exception{
        double numberB;
        DoubleOperationComand comandDouble;
        IntOperationComand comandInt;
        UnaryOperationComand comandUnary;
        switch (operation){
            case "+":
                numberB = Input.InputNumber();
                comandDouble = new AdditionCommand(numberA, numberB);
                return comandDouble.execute(numberA, numberB);
            case "-":
                numberB = Input.InputNumber();
                comandDouble = new SubtractionComand(numberA, numberB);
                return comandDouble.execute(numberA, numberB);
            case "*":
                numberB = Input.InputNumber();
                comandDouble = new MultiplicationCommand(numberA, numberB);
                return comandDouble.execute(numberA, numberB);
            case "/":
                numberB = Input.InputNumber();
                comandDouble = new DivisionCommand(numberA, numberB);
                return comandDouble.execute(numberA, numberB);
            case "^":
                int degree = Input.InputDegree();
                comandInt = new PowerCommand(numberA, degree);
                return comandInt.execute(numberA, degree);
            case "!":
                comandUnary = new FactorialCommand(numberA);
                return comandUnary.execute(numberA);
            default:
                throw new OperationsException("введена неизвестная команда");
        }
    }
    public static void Print(long number){
        System.out.println("ответ: " + number);
    }
    public static void Print(double number){
        System.out.printf("ответ: %.2f%n", number);
    }

    public static boolean IntTryParse(double number){
        if (number == Math.floor(number)){
            return true;
        }
        return false;
    }
    public static void PrintControls(){
        System.out.println("чтобы произвести опперацию нужно ввести первое чилсо. затем ввести нужную опперацию");
        System.out.println("доступные опперации:\n" +
                "+ — сложение\n" +
                "- — разница\n" +
                "* — умножение\n" +
                "/ — деление\n" +
                "^ — возведение в степень\n" +
                "! — найти факториал\n" +
                "q — завершить работу");
        return;
    }
}