package CommandPackege;

import StrategyPackage.PowerStrategy;
import StrategyPackage.StrategyCalc;


public class PowerCommand implements Command {
    private StrategyCalc strategy;

    public PowerCommand() {
        this.strategy = new PowerStrategy();
    }

    @Override
    public double execute(double numberA) throws Exception {
        return strategy.execute(numberA);
    }
}
