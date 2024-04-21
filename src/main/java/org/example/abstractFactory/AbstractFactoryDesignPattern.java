package org.example.abstractFactory;

public class AbstractFactoryDesignPattern {

    public void run() {
        AbstractFactoryProduce abstractFactoryob =
                new AbstractFactoryProduce();

        AbstractFactory abstractFactoryObj =
                abstractFactoryob.getInstance("Economic");

        Car car = abstractFactoryObj.getInstance(500);
        System.out.println(car.getTopSpeed());
    }
}
