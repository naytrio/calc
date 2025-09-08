package CommandPackege;

import StrategyPackage.UnaryOperationStrategy;
import StrategyPackage.FactorialStrategy;

public class FactorialCommand implements UnaryOperationComand {
    private UnaryOperationStrategy strategy;
    private double number;

    public FactorialCommand(double number) {
        this.number = number;
        this.strategy = new FactorialStrategy();
    }

    @Override
    public double execute(double number) throws Exception {
        return strategy.execute(number);
    }
}
