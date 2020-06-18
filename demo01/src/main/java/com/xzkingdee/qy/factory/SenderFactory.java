package com.xzkingdee.qy.factory;

import com.xzkingdee.qy.factory.entity.MailSender;
import com.xzkingdee.qy.factory.entity.SmsSender;
import com.xzkingdee.qy.factory.entity.Sender;

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
