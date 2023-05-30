import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Sender {

    public Sender() {
        sendMessage("Hello");
    }

    public void sendMessage(String msg) {
        Twilio.init("ACc34e5b196ef807f246603a495b8915bc", "127a107acc3badb7a1b4002f8839abd5");

        Message message = Message.creator(new PhoneNumber("+12367889773"), new PhoneNumber("+16473603533"), msg).create();

        System.out.println(message.getSid());
    }
}
