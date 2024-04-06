package org.example;

import org.example.Strategy.StrategyDesignPattern;
import org.example.factory.FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        // strategy design pattern
        StrategyDesignPattern strategyDesignPattern =
                new StrategyDesignPattern();
        strategyDesignPattern.run();

        //Factory Design Pattern
        FactoryDesignPattern factoryDesignPattern =
                new FactoryDesignPattern();
        factoryDesignPattern.run();
    }
}