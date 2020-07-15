package com.xzkingdee.observermodel;

/**
 * 观察者主题对象
 *
 * @author qy
 * @date Created in 9:41 2020/7/8
 **/
public interface Subject {

    /**
     * 订阅操作
     */
    void attach(Observer observer);

    /**
     * 取消订阅操作
     */
    void detach(Observer observer);

    /**
     * 通知变动
     */
    void notifyChanged();
}
