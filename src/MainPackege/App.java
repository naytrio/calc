package MainPackege;

import CommandPackege.Command;
import CustomExeptionPackege.OperationsException;
import InputPackege.Input;
import ParsePackege.IntParse;
import PrintPackage.PrintAnswer;
import PrintPackage.PrintControls;

import java.util.HashMap;

public class App {
    private HashMap<String, Command> commands;

    public App(HashMap<String, Command> commands) {
        this.commands = commands;
    }

    public void run() {
        PrintControls.controlsPrint();
        while (true) {
            try {
                double number = Input.InputNumber();
                String operation = Input.InputOperation();

                number = commandControl(number, operation);

                if (IntParse.IntTryParse(number)) {
                    long result = Math.round(number);
                    PrintAnswer.answerPrint(result);
                } else {
                    PrintAnswer.answerPrint(number);
                }

            } catch (IllegalArgumentException | ClassCastException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private double commandControl(double numberA, String operation) throws Exception {
        if (commands.containsKey(operation)) {
            return commands.get(operation).execute(numberA);
        } else {
            throw new OperationsException("Введена неверная операция");
        }
    }
}

