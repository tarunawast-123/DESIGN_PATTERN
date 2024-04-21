package org.example.abstractFactory;

public class AbstractFactoryProduce {

    public AbstractFactory getInstance(String value) {

        if(value.equals("Economic")) {
            return new EconomicCarFactory();
        } else {
            return new LuxuryCarFactory();
        }
    }
}