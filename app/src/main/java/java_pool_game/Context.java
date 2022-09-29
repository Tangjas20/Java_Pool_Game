package java_pool_game;

import java.util.List;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public List<Ball> executeStrategy(List<Ball> ballList){
        return strategy.doOperation(ballList);
    }
}
