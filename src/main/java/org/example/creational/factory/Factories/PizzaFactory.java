package org.example.creational.factory.Factories;

import org.example.creational.factory.Dish;
import org.example.creational.factory.Pizza;

public class PizzaFactory implements DishFactory{
    @Override
    public Dish getDish() {
        return new Pizza();
    }
}
