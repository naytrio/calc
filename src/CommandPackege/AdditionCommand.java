package CommandPackege;

import StrategyPackage.DoubleOperationStrategy;
import StrategyPackage.AdditionStrategy;

public class AdditionCommand implements DoubleOperationComand {
    private DoubleOperationStrategy strategy;
    private double numberA, numberB;

    public AdditionCommand(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.strategy = new AdditionStrategy();
    }

    @Override
    public double execute(double numberA, double numberB) throws Exception {
        return strategy.execute(numberA, numberB);
    }
}
