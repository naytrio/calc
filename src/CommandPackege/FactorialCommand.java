package CommandPackege;

import StrategyPackage.StrategyCalc;
import StrategyPackage.FactorialStrategy;

public class FactorialCommand implements Command {
    private StrategyCalc strategy;

    public FactorialCommand() {
        this.strategy = new FactorialStrategy();
    }

    @Override
    public double execute(double number) throws Exception {
        return strategy.execute(number);
    }
}
