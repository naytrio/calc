package CommandPackege;

import StrategyPackage.StrategyCalc;
import StrategyPackage.AdditionStrategy;

public class AdditionCommand implements Command {
    private StrategyCalc strategy;

    public AdditionCommand() {
        this.strategy = new AdditionStrategy();
    }

    @Override
    public double execute(double numberA) throws Exception {
        return strategy.execute(numberA);
    }
}
