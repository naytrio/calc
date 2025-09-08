package CommandPackege;

import StrategyPackage.PowerStrategy;

public class PowerCommand implements IntOperationComand {
    private PowerStrategy strategy;
    private double numberA;
    private int degree;

    public PowerCommand(double numberA, int degree) {
        this.numberA = numberA;
        this.degree = degree;
        this.strategy = new PowerStrategy();
    }

    @Override
    public double execute(double numberA, int degree) throws Exception {
        return strategy.execute(numberA, degree);
    }
}
