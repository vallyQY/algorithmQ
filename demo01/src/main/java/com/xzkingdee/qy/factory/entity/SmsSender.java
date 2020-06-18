package com.xzkingdee.qy.factory.entity;

/**
 * @author Administrator
 */
public class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("send sms");
    }
}
