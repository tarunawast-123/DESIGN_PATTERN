package org.example.Strategy.strategies;

public class PublicDriveStrategy implements Drive {
    @Override
    public void drive() {
        System.out.println("Public driving");
    }
}
