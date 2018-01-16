package strategy.application;

import java.util.List;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<Integer> doOrder(List<Integer> elements) {
        return strategy.doOperation(elements);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
