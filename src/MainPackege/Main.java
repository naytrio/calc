package MainPackege;

import CommandPackege.*;
import CustomExeptionPackege.OperationsException;
import InputPackege.Input;
import ParsePackege.IntParse;
import PrintPackage.PrintAnswer;
import PrintPackage.PrintControls;

import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws Exception {
        PrintControls.controlsPrint();
        while (true){
            try{
                double number = Input.InputNumber();
                String operation = Input.InputOperation();
                HashMap<String, Command> commands = new HashMap<>();
                commands.put("+", new AdditionCommand());
                commands.put("-", new SubtractionComand());
                commands.put("/", new DivisionCommand());
                commands.put("!", new FactorialCommand());
                commands.put("^", new PowerCommand());
                commands.put("*", new MultiplicationCommand());
                number = commandControl(number, operation, commands);
                if (IntParse.IntTryParse(number)){
                    long result  = Math.round(number);
                    PrintAnswer.answerPrint(result);
                }
                else {
                    PrintAnswer.answerPrint(number);
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
    public static double commandControl(double numberA, String operation, HashMap<String, Command> commands)throws Exception {
        if(commands.containsKey(operation)){
            Command command = commands.get(operation);
            return command.execute(numberA);
        }
        else
            throw new OperationsException("введена невенрная опперация");
    }
}