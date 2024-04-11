package org.example.decorator.topping;

import org.example.decorator.pizza.Pizza;

public class MushroomDecorator extends ToppingDecorator{
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 25;
    }
}
