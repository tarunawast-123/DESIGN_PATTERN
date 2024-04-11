package org.example.decorator.pizza;

public class PlainPizaa implements Pizza{
    @Override
    public int getCost() {
        return 5;
    }
}
