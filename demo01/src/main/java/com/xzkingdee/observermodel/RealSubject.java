package com.xzkingdee.observermodel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qy
 * @date Created in 2020/7/8
 **/
public class RealSubject implements Subject{
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyChanged() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
