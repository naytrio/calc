package CommandPackege;
import StrategyPackage.DoubleOperationStrategy;
import StrategyPackage.SubtractionStrategy;

public class SubtractionComand implements DoubleOperationComand {
    private DoubleOperationStrategy strategy;
    private double numberA, numberB;

    public SubtractionComand(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.strategy = new SubtractionStrategy();
    }

    @Override
    public double execute(double numberA, double numberB) throws Exception {
        return strategy.execute(numberA, numberB);
    }
}
