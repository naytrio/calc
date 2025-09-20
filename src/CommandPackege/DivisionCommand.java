package CommandPackege;

import StrategyPackage.StrategyCalc;
import StrategyPackage.DivisionStrategy;

public class DivisionCommand implements Command {
    private StrategyCalc strategy;

    public DivisionCommand() {
        this.strategy = new DivisionStrategy();
    }

    @Override
    public double execute(double numberA) throws Exception {
        return strategy.execute(numberA);
    }
}
