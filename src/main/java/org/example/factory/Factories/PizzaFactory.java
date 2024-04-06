package org.example.factory.Factories;

import org.example.factory.Dish;
import org.example.factory.Pizza;

public class PizzaFactory implements DishFactory{
    @Override
    public Dish getDish() {
        return new Pizza();
    }
}
