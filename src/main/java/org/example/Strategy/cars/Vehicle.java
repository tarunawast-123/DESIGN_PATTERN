package org.example.Strategy.cars;

import org.example.Strategy.strategies.Drive;

public class Vehicle {
    Drive driveWay;
    public Vehicle(Drive driveWay) {
        this.driveWay = driveWay;
    }

    public void drive() {
        this.driveWay.drive();
    }
}
