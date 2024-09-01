package org.example.creational.factory.Factories;

import org.example.creational.factory.Dish;
import org.example.creational.factory.Noodles;

public class NoodlesFactory implements DishFactory{
    @Override
    public Dish getDish() {
        return new Noodles();
    }
}
