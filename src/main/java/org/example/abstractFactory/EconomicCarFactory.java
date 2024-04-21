package org.example.abstractFactory;

public class EconomicCarFactory implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
        if(price<1000) {
            return new EconomicCar1();
        } else {
            return new EconomicCar2();
        }
    }
}
