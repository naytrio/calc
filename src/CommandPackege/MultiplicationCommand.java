package CommandPackege;

import StrategyPackage.StrategyCalc;
import StrategyPackage.MultiplicationStrategy;

public class MultiplicationCommand implements Command {
    private StrategyCalc strategy;

    public MultiplicationCommand() {
        this.strategy = new MultiplicationStrategy();
    }

    @Override
    public double execute(double numberA) throws Exception {
        return strategy.execute(numberA);
    }
}
