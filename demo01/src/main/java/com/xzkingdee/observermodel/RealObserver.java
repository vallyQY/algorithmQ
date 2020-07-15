package com.xzkingdee.observermodel;

/**
 * @author qy
 * @date Created in 2020/7/8
 **/
public class RealObserver implements Observer {
    @Override
    public void update() {
        System.out.println("receive Notification...");
    }
}
