package org.example.Strategy.cars;

import org.example.Strategy.cars.Vehicle;
import org.example.Strategy.strategies.Drive;

public class SportsCar extends Vehicle {

    public  SportsCar(Drive driveWay) {
        super(driveWay);
    }

    public void drive() {
        super.drive();
    }
}
