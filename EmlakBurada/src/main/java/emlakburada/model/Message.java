package emlakburada.model;

import emlakburada.model.user.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Message {
    private String id;
    private Advert advert;
    private User sender;
    private User receiver;
    private String message;
    private Date sendDate;

    public Message(Advert advert, User sender, User receiver, String message) {
        this.advert = advert;
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.sendDate = new Date();
        sender.getMessages().add(this);
        receiver.getMessages().add(this);




    }

}
