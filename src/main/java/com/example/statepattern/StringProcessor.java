package com.example.statepattern;


public class StringProcessor {

    private ProcessingStrategy strategy;

    public StringProcessor(ProcessingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ProcessingStrategy strategy) {
        this.strategy = strategy;
    }

    public String process(String input) {
        return strategy.process(input);
    }
}
