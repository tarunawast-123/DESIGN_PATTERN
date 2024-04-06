package org.example.Strategy.strategies;

public class NormalDriveStrategy implements Drive {
    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}
