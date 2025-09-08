package CommandPackege;

import StrategyPackage.DoubleOperationStrategy;
import StrategyPackage.DivisionStrategy;

public class DivisionCommand implements DoubleOperationComand {
    private double numberA, numberB;
    private DoubleOperationStrategy strategy;

    public DivisionCommand(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.strategy = new DivisionStrategy();
    }

    @Override
    public double execute(double numberA, double numberB) throws Exception {
        return strategy.execute(numberA, numberB);
    }
}
