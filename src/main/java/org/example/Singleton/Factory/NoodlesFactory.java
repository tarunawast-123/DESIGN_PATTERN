package org.example.Singleton.Factory;

import org.example.Singleton.Dish;
import org.example.Singleton.Noodles;

public class NoodlesFactory implements DishFactory{
    @Override
    public Dish getDish() {
        return new Noodles();
    }
}
