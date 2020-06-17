package com.qy.factory;

import com.qy.factory.entity.MailSender;
import com.qy.factory.entity.Sender;
import com.qy.factory.entity.SmsSender;

/**
 * 外观模式(Facade)的demo
 * @author qy
 */
public class SenderFactory {
    public Sender produceMailSender(){
        return new MailSender();
    }

    public Sender produceSmsSender(){
        return new SmsSender();
    }
}
