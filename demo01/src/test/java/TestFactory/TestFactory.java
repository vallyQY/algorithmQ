package TestFactory;

import com.xzkingdee.qy.factory.SenderFactory;
import com.xzkingdee.qy.factory.service.Sender;

public class TestFactory {
    public static void main(String[] args){
        SenderFactory senderFactory = new SenderFactory();
        Sender mailSender = senderFactory.produceMailSender();
        mailSender.send();
        Sender smsSender = senderFactory.produceSmsSender();
        smsSender.send();
    }
}
