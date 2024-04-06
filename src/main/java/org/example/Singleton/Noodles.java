package org.example.Singleton;

public class Noodles implements Dish{
    @Override
    public void prepare() {
        System.out.println("preparing noodles");
    }

    @Override
    public void serve() {
        System.out.println("Serving noodles");
    }
}
