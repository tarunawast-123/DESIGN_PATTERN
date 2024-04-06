package org.example.factory;

import org.example.factory.Factories.DishFactory;
import org.example.factory.Factories.NoodlesFactory;
import org.example.factory.Factories.PizzaFactory;

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
