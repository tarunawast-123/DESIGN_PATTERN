package org.example.Strategy;

import org.example.Strategy.cars.LuxuryCar;
import org.example.Strategy.cars.SportsCar;
import org.example.Strategy.cars.Vehicle;
import org.example.Strategy.strategies.NormalDriveStrategy;
import org.example.Strategy.strategies.ProfessionalDriveStrategy;

public class StrategyDesignPattern {
    public void run() {
        Vehicle car1 = new SportsCar(new ProfessionalDriveStrategy());
        Vehicle car2 = new SportsCar(new NormalDriveStrategy());
        Vehicle car3 = new LuxuryCar(new ProfessionalDriveStrategy());
        Vehicle car4 = new LuxuryCar(new NormalDriveStrategy());

        car1.drive();
        car2.drive();
        car3.drive();
        car4.drive();
    }
}
