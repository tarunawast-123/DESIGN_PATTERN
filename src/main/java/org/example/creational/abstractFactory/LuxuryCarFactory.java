package org.example.creational.abstractFactory;

public class LuxuryCarFactory implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
        if(price < 1000) {
            return new LuxuryCar1();
        } else {
            return new LuxuryCar2();
        }
    }
}
