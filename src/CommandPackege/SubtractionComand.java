package CommandPackege;
import InputPackege.Input;
import StrategyPackage.StrategyCalc;
import StrategyPackage.SubtractionStrategy;

public class SubtractionComand implements Command {
    private StrategyCalc strategy;

    public SubtractionComand() {
        this.strategy = new SubtractionStrategy();
    }

    @Override
    public double execute(double numberA) throws Exception {
        return strategy.execute(numberA);
    }
}
