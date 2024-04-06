package org.example.observer.subject;

import org.example.observer.observer.Observer;

public interface Subject {

    public void register(Observer observer);
    public void removeObserver(Observer observer);
    public void updateNews(String news);
}
