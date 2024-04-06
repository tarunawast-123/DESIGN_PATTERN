package org.example.factory.Factories;

import org.example.factory.Dish;
import org.example.factory.Noodles;

public class NoodlesFactory implements DishFactory{
    @Override
    public Dish getDish() {
        return new Noodles();
    }
}
