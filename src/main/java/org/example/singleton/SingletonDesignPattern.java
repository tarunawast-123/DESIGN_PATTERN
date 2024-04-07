package org.example.singleton;

public class SingletonDesignPattern {

    public void run() {
        Thread thread1 = new Thread(new SingletonDesignPattern().new SingletonThread());
        Thread thread2 = new Thread(new SingletonDesignPattern().new SingletonThread());
        thread1.setName("Thread1");
        thread2.setName("Thread2");

        thread1.start();
        thread2.start();
    }

    private class SingletonThread implements Runnable {

        @Override
        public void run() {
           Singleton.getInstance();
        }
    }
}
