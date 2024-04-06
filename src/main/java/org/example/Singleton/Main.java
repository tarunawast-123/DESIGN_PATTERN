package org.example.Singleton;

import org.example.Singleton.Factory.DishFactory;
import org.example.Singleton.Factory.NoodlesFactory;
import org.example.Singleton.Factory.PizzaFactory;

public class Main {

    public static void main(String[] args) {

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
