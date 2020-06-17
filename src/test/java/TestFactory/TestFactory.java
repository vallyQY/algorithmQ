package TestFactory;

import com.qy.factory.SenderFactory;
import com.qy.factory.entity.Sender;

public class TestFactory {
    public static void main(String[] args){
        SenderFactory senderFactory = new SenderFactory();
        Sender mailSender = senderFactory.produceMailSender();
        mailSender.send();
        Sender smsSender = senderFactory.produceSmsSender();
        smsSender.send();
    }
}
