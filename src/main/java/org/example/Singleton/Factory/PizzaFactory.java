package org.example.Singleton.Factory;

import org.example.Singleton.Dish;
import org.example.Singleton.Pizza;

public class PizzaFactory implements DishFactory{
    @Override
    public Dish getDish() {
        return new Pizza();
    }
}
