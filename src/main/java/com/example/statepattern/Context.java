package com.example.statepattern;

/**
 * 状态维护
 *
 * @author 罗勇春
 * @version 3.0.0
 * @since 2024/8/28
 */
public class Context {

    private State state;
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.state = new NormalState();
        // 使用传入的策略
        this.strategy = strategy;
    }
    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public String process(String input) {
        String result = input;
        while (true) {
            String newResult = state.handle(result, this);
            if (newResult.equals(result)) {
                return result;
            }
            result = newResult;
        }
    }
}
