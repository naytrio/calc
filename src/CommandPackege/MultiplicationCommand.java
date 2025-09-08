package CommandPackege;

import StrategyPackage.DoubleOperationStrategy;
import StrategyPackage.MultiplicationStrategy;

public class MultiplicationCommand implements DoubleOperationComand {
    private DoubleOperationStrategy strategy;
    private double numberA, numberB;

    public MultiplicationCommand(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.strategy = new MultiplicationStrategy();
    }

    @Override
    public double execute(double numberA, double numberB) throws Exception {
        return strategy.execute(numberA, numberB);
    }
}
