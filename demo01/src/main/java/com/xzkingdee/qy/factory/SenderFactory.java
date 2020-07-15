package com.xzkingdee.qy.factory;

import com.xzkingdee.qy.factory.service.impl.MailSender;
import com.xzkingdee.qy.factory.service.impl.SmsSender;
import com.xzkingdee.qy.factory.service.Sender;

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
