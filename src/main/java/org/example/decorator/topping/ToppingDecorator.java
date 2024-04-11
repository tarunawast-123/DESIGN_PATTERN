package org.example.decorator.topping;

import org.example.decorator.pizza.Pizza;

public abstract class ToppingDecorator implements Pizza {

    Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost();
    }
}
