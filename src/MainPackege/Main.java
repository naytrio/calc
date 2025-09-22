package MainPackege;

import CommandPackege.*;
import CustomExeptionPackege.OperationsException;
import InputPackege.Input;
import ParsePackege.IntParse;
import PrintPackage.PrintAnswer;
import PrintPackage.PrintControls;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Command> commands = new HashMap<>();
        commands.put("+", new AdditionCommand());
        commands.put("-", new SubtractionComand());
        commands.put("/", new DivisionCommand());
        commands.put("!", new FactorialCommand());
        commands.put("^", new PowerCommand());
        commands.put("*", new MultiplicationCommand());

        App app = new App(commands);
        app.run();
    }
}