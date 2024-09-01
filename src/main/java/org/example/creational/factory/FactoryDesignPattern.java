package org.example.creational.factory;

import org.example.creational.factory.Factories.NoodlesFactory;
import org.example.creational.factory.Factories.PizzaFactory;
import org.example.creational.factory.Factories.DishFactory;

public class FactoryDesignPattern {

    public void run() {

        DishFactory pizzaFactory = new PizzaFactory();
        DishFactory noodlesFactory = new NoodlesFactory();

        Dish pizza = pizzaFactory.getDish();
        pizza.prepare();
        pizza.serve();

        Dish noodles = noodlesFactory.getDish();
        noodles.prepare();
        noodles.serve();
    }
}
