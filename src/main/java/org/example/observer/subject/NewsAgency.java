package org.example.observer.subject;

import org.example.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{

    List<Observer> list = new ArrayList<>();
    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void updateNews(String news) {
      for(Observer observer : list) {
          observer.update(news);
      }
    }
}
