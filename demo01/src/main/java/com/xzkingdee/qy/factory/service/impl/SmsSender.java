package com.xzkingdee.qy.factory.service.impl;

import com.xzkingdee.qy.factory.service.Sender;

/**
 * @author Administrator
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("send sms");
    }
}
