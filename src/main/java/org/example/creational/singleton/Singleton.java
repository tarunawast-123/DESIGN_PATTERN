package org.example.creational.singleton;

public class Singleton implements Cloneable {

    private static volatile Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {

        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    System.out.println("Thread created by " +
                            Thread.currentThread().getName());
                    instance = new Singleton();
                }
            }
        }
        return instance;

    }

    @Override
    public Object clone() throws CloneNotSupportedException{
       throw new CloneNotSupportedException();
    }

}
