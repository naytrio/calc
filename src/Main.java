import java.util.Arrays;
import java.util.Scanner;

interface UnaryOperationComand{ // опперации где только 1 парраметр
    double execute(double number) throws Exception;
}
interface IntOperationComand{ // опперации где 2 парраметр должен быть int
    double execute(double numberA, int numberB) throws Exception;
}
interface DoubleOperationComand{ // опперации где оба параметра double
    double execute(double numberA, double numberB)throws Exception;
}

class AdditionCommand implements DoubleOperationComand{
    private DoubleOperationStrategy strategy;
    private double numberA,numberB;
    public AdditionCommand(double numberA, double numberB){
        this.numberA = numberA;
        this.numberB = numberB;
        this.strategy = new AdditionStrategy();
    }

    @Override
    public double execute(double numberA, double numberB) throws Exception {
        return strategy.execute(numberA,numberB);
    }
}
class SubtractionComand implements DoubleOperationComand{
    private DoubleOperationStrategy strategy;
    private double numberA, numberB;
    public SubtractionComand(double numberA, double numberB){
        this.numberA = numberA;
        this.numberB = numberB;
        this.strategy = new SubtractionStrategy();
    }

    @Override
    public double execute(double numberA, double numberB) throws Exception {
        return strategy.execute(numberA,numberB);
    }
}
class MultiplicationCommand implements DoubleOperationComand{
    private DoubleOperationStrategy strategy;
    private double numberA, numberB;
    public MultiplicationCommand(double numberA, double numberB){
        this.numberA = numberA;
        this.numberB = numberB;
        this.strategy = new MultiplicationStrategy();
    }

    @Override
    public double execute(double numberA, double numberB) throws Exception {
        return strategy.execute(numberA, numberB);
    }
}
class DivisionCommand implements DoubleOperationComand{
    private double numberA, numberB;
    private DoubleOperationStrategy strategy;
    public DivisionCommand(double numberA, double numberB){
        this.numberA = numberA;
        this.numberB = numberB;
        this.strategy = new DivisionStrategy();
    }

    @Override
    public double execute(double numberA, double numberB) throws Exception {
        return strategy.execute(numberA, numberB);
    }
}
class PowerCommand implements IntOperationComand{
    private PowerStrategy strategy;
    private double numberA;
    private int degree;
    public PowerCommand(double numberA, int degree){
        this.numberA = numberA;
        this.degree = degree;
        this.strategy = new PowerStrategy();
    }

    @Override
    public double execute(double numberA, int degree) throws Exception {
        return strategy.execute(numberA, degree);
    }
}
class FactorialCommand implements UnaryOperationComand{
    private UnaryOperationStrategy strategy;
    private double number;
    public FactorialCommand(double number){
        this.number = number;
        this.strategy = new FactorialStrategy();
    }

    @Override
    public double execute(double number) throws Exception {
        return strategy.execute(number);
    }
}

interface UnaryOperationStrategy{ // опперации где только 1 парраметр
    double execute(double a) throws Exception;
}
interface PowerOperationStrategy{ // опперации где 2 парраметр должен быть int
    double execute(double a, int b) throws Exception;
}
interface DoubleOperationStrategy{ // опперации где оба параметра double
    double execute(double a, double b) throws Exception;
}

class AdditionStrategy implements DoubleOperationStrategy{
    @Override
    public double execute(double numberA, double numberB) throws Exception {
        return Calc.addition(numberA, numberB);
    }
}
class SubtractionStrategy implements DoubleOperationStrategy{
    @Override
    public double execute(double numberA, double numberB) throws Exception {
        return Calc.subtraction(numberA, numberB);
    }
}
class MultiplicationStrategy implements DoubleOperationStrategy{
    @Override
    public double execute(double numberA, double numberB) throws Exception {
        return Calc.multiplication(numberA, numberB);
    }
}
class DivisionStrategy implements DoubleOperationStrategy{
    @Override
    public double execute(double numberA, double numberB) throws Exception {
        if (numberB == 0){
            throw new ArithmeticException("деление на 0 невозможно");
        }
        return Calc.division(numberA, numberB);
    }
}
class PowerStrategy implements PowerOperationStrategy{
    @Override
    public double execute(double numberA, int degree) throws Exception {
        return Calc.power(numberA,degree);
    }
}
class FactorialStrategy implements UnaryOperationStrategy{
    @Override
    public double execute(double number) throws Exception {
        if(Valid.factorialValid(number)){
            return Calc.factorial(number);
        }
        throw new FactorialException("факториал должен быть целым положительным числом");
    }
}

class Valid{
    public static boolean factorialValid(double num){
        if (num <= 0){
            return  false;
        }
        if (num != Math.round(num)){
            return false;
        }
        return true;
    }
    public static boolean degreeValid(double number){
        if (number == Math.round(number)){
            return true;
        }
        return false;
    }
    public static boolean operationValid(String operation){
        String[] operations = {"+","-","*","/","^","!"};
        if (Arrays.asList(operations).contains(operation)){
            return true;
        }
        return false;
    }
}

class FactorialException extends Exception{
    public FactorialException(String message){
        super(message);
    }
}

class DegreeException extends Exception{
    public DegreeException(String message){
        super(message);
    }
}

class OperationsException extends Exception{
    public OperationsException(String message){
        super(message);
    }
}

class Calc{
    public static double factorial(double number) throws FactorialException{
        if (!Valid.factorialValid(number)){
            throw new FactorialException("факториал должен быть целым положительным числом");
        }
        if (number == 1){
            return number;
        }
        else{
            return number * factorial(number - 1);
        }

    }
    public static double addition(double numberA, double numberB){
        return numberA+numberB;
    }
    public static double subtraction(double numberA,double numberB){return numberA-numberB;}
    public static double multiplication(double numberA,double numberB){
        return numberA*numberB;
    }
    public static double division(double numberA, double numberB)throws ArithmeticException{
        if (numberB == 0){
            throw new ArithmeticException("нельзя делить на 0. введите новое выражение.");
        }
        return numberA/numberB;
    }
    public static double power(double number, int degree)throws DegreeException{
        if(!Valid.degreeValid(degree)){
            throw new DegreeException("степень должна быть целым числом");
        }
         if (degree > 0){
             if (degree == 1){
                 return  number;
             }
             else {
                 double res = 1;
                 for (int i = 0; i<degree;i++){
                     res *= number;
                 }
                 return res;
             }
         }
         else if (degree < 0){
             double num = power(number, Math.abs(degree));
             return 1/num;
         }
         else {
             return 1;
         }
    }
}

class Input{
    static Scanner in = new Scanner(System.in);
    public static String InputOperation() {
        while (true) {
            try {
                System.out.print("Введите действие, которое поддерживает этот калькулятор: ");
                String operation = in.nextLine();
                if (operation.equals("q")){
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
    public static int InputDegree(){
        while (true){
            try{
                System.out.print("введите в какую степень(целое число) возвести число: ");
                String input = in.nextLine();
                if (input.equals("q")){
                    System.exit(0);
                }
                int degree = Integer.parseInt(input);
                if(Valid.degreeValid(degree)){
                    return degree;
                }
                else {
                    throw new DegreeException("ошибка ввода степени");
                }
            }
            catch (Exception e){System.out.println("ошибка ввода. повторите попытку");}
        }
    }
    public static double InputNumber(){
        while (true){
            try{
                System.out.print("введите число: ");
                String number = in.nextLine();
                if(number.equals("q")){
                    System.exit(0);
                }
                return Double.parseDouble(number);
            }
            catch (NumberFormatException e){System.out.println("возможно вы ввели не число. повторите ввод");}
        }
    }
}
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