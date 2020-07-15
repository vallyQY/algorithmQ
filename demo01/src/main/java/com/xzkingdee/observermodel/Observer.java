package com.xzkingdee.observermodel;

/**
 * 观察者订阅人对象
 *
 * @author qy
 * @date Created in 2020/7/8
 **/
public interface Observer {
    /**
     * 接收变动通知
     */
    void update();
}
