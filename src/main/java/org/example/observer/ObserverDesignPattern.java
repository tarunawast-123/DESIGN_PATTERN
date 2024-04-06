package org.example.observer;

import org.example.observer.observer.NewsSubscriber;
import org.example.observer.observer.Observer;
import org.example.observer.subject.NewsAgency;
import org.example.observer.subject.Subject;

public class ObserverDesignPattern {

    public void run() {
        Subject newsAgency = new NewsAgency();
        Observer observer1 = new NewsSubscriber("subscriber1");
        Observer observer2 = new NewsSubscriber("subscriber2");

        newsAgency.register(observer1);
        newsAgency.register(observer2);

        newsAgency.updateNews("news1");

        newsAgency.removeObserver(observer1);
        newsAgency.updateNews("news2");
    }
}
