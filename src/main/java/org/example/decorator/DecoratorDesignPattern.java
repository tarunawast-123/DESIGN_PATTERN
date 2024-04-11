package org.example.decorator;

import org.example.decorator.pizza.Pizza;
import org.example.decorator.pizza.PlainPizaa;
import org.example.decorator.topping.CheeseDecorator;
import org.example.decorator.topping.MushroomDecorator;

public class DecoratorDesignPattern {

    public void run() {

        Pizza pizza = new CheeseDecorator(new MushroomDecorator(new PlainPizaa()));
        System.out.println(pizza.getCost());
    }
}
