package com.xzkingdee.observermodel;

/**
 * @author qy
 * @date Created in 2020/7/8
 **/
public class Entrance {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Observer observer = new RealObserver();
        subject.attach(observer);
        subject.notifyChanged();
    }
}
