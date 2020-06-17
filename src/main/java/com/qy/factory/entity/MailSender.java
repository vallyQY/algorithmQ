package com.qy.factory.entity;

/**
 * @author Administrator
 */
public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("send Mail");
    }
}
