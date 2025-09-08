package TestPackege;

import CommandPackege.*;
import CustomExeptionPackege.FactorialException;
import CustomExeptionPackege.PowerException;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

public class CommandTest extends Test{
    @org.junit.jupiter.api.Test
    void additionCommand()throws Exception{
        List<Double> testResult = new ArrayList<>();
        List<Double> correctResult = new ArrayList<>();

        DoubleOperationComand command = new AdditionCommand(doubleNumber1, doubleNumber2); // 4.2+7.9
        DoubleOperationComand command2 = new AdditionCommand(doubleNumber1, intNumber1); // 4.2 + 5
        DoubleOperationComand command3 = new AdditionCommand(intNumber1, intNumber2); // 5 + 4

        testResult.add(command.execute(doubleNumber1,doubleNumber2));
        testResult.add(command2.execute(doubleNumber1, intNumber1));
        testResult.add(command3.execute(intNumber1, intNumber2));

        correctResult.add(4.2 + 7.9);
        correctResult.add(4.2 + 5.0);
        correctResult.add(5.0 + 4.0);

        Assert.assertEquals(testResult, correctResult);
    }

    @org.junit.jupiter.api.Test
    void divisionCommand() throws Exception{
        List<Double> testResult = new ArrayList<>();
        List<Double> correctResult = new ArrayList<>();

        DoubleOperationComand command = new DivisionCommand(doubleNumber1, doubleNumber2); // 4.2 / 7.9
        DoubleOperationComand command2 = new DivisionCommand(doubleNumber1, intNumber1); // 4.2 / 5
        DoubleOperationComand command3 = new DivisionCommand(intNumber1, intNumber2); // 5 / 4

        testResult.add(command.execute(doubleNumber1,doubleNumber2));
        testResult.add(command2.execute(doubleNumber1, intNumber1));
        testResult.add(command3.execute(intNumber1, intNumber2));

        correctResult.add(4.2 / 7.9);
        correctResult.add(4.2 / 5.0);
        correctResult.add(5.0 / 4.0);

        Assert.assertEquals(testResult, correctResult);
    }

    @org.junit.jupiter.api.Test
    void factorialCommand() throws Exception{
        List<Double> testResult = new ArrayList<>();
        List<Double> correctResult = new ArrayList<>();

        UnaryOperationComand command = new FactorialCommand(intNumber1); // 5!
        UnaryOperationComand command2 = new FactorialCommand(intNumber2); // 4!

        testResult.add(command.execute(intNumber1));
        testResult.add(command2.execute(intNumber2));

        correctResult.add(120.0);
        correctResult.add(24.0);

        Assert.assertEquals(testResult, correctResult);
    }

    @org.junit.jupiter.api.Test
    void factorialException()throws FactorialException {
        assertThrows(FactorialException.class, () -> {
            UnaryOperationComand command = new FactorialCommand(doubleNumber1); // 4.2!
            command.execute(doubleNumber1);
        });
        assertThrows(FactorialException.class, () -> {
            UnaryOperationComand command = new FactorialCommand(-intNumber1);
            command.execute(-intNumber1);
        });
    }

    @org.junit.jupiter.api.Test
    void multiplicationCommand()throws Exception{
        List<Double> testResult = new ArrayList<>();
        List<Double> correctResult = new ArrayList<>();

        DoubleOperationComand command = new MultiplicationCommand(doubleNumber1, doubleNumber2); // 4.2 * 7.9
        DoubleOperationComand command2 = new MultiplicationCommand(doubleNumber1, intNumber1); // 4.2 * 5
        DoubleOperationComand command3 = new MultiplicationCommand(intNumber1, intNumber2); // 5 * 4

        testResult.add(command.execute(doubleNumber1, doubleNumber2));
        testResult.add(command2.execute(doubleNumber1, intNumber1));
        testResult.add(command3.execute(intNumber1, intNumber2));

        correctResult.add(4.2 * 7.9);
        correctResult.add(4.2 * 5);
        correctResult.add(5.0 * 4.0);

        Assert.assertEquals(testResult, correctResult);
    }

    @org.junit.jupiter.api.Test
    void powerCommand()throws Exception{
        List<Double> testResult = new ArrayList<>();
        List<Double> correctResult = new ArrayList<>();

        PowerCommand command = new PowerCommand(doubleNumber1, degree); // 4.2 ^4
        PowerCommand command2 = new PowerCommand(intNumber1, degree); // 5^4

        testResult.add(command.execute(doubleNumber1, degree));
        testResult.add(command2.execute(intNumber1, degree));

        correctResult.add(311.16960000000006);
        correctResult.add(625.0);

        Assert.assertEquals(testResult, correctResult);
    }
}
