package org.example.Strategy.cars;

import org.example.Strategy.cars.Vehicle;
import org.example.Strategy.strategies.Drive;

public class LuxuryCar extends Vehicle {

    public LuxuryCar(Drive driveWay) {
        super((driveWay));
    }

    public void drive() {
        super.drive();
    }
}
