package org.example;

import org.example.Strategy.StrategyDesignPattern;
import org.example.abstractFactory.AbstractFactoryDesignPattern;
import org.example.builder.BuilderDesignPattern;
import org.example.decorator.DecoratorDesignPattern;
import org.example.factory.FactoryDesignPattern;
import org.example.observer.ObserverDesignPattern;
import org.example.prototype.PrototypeDesignPattern;
import org.example.singleton.SingletonDesignPattern;

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

        // Observer design pattern
        ObserverDesignPattern observerDesignPattern =
                new ObserverDesignPattern();
        observerDesignPattern.run();

        // singleton design pattern
        SingletonDesignPattern singletonDesignPattern =
                new SingletonDesignPattern();
        singletonDesignPattern.run();

        // decorator design pattern
        DecoratorDesignPattern decoratorDesignPattern =
                new DecoratorDesignPattern();
        decoratorDesignPattern.run();

        //Builder Design pattern
        BuilderDesignPattern builderDesignPattern =
                new BuilderDesignPattern();
        builderDesignPattern.run();

        // ProtoType Design Pattern
        PrototypeDesignPattern prototypeDesignPattern =
                new PrototypeDesignPattern();
        prototypeDesignPattern.run();

        // Abstract Factory Design Pattern
        AbstractFactoryDesignPattern abstractFactoryDesignPattern =
                new AbstractFactoryDesignPattern();
        abstractFactoryDesignPattern.run();
    }
}