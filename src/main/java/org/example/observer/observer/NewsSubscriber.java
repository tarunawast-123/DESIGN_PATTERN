package org.example.observer.observer;

public class NewsSubscriber implements Observer{
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }
    @Override
    public void update(String news) {
        System.out.println("News received by subscriber = " + this.name +
                "news = " + news);
    }
}
