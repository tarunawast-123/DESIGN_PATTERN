package org.example.decorator.topping;

import org.example.decorator.pizza.Pizza;

public class CheeseDecorator extends ToppingDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return this.pizza.getCost()+15;
    }
}
