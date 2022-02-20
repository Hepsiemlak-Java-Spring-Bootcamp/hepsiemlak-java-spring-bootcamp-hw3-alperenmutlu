package emlakburada.model.user;

import emlakburada.model.Address;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.logging.log4j.message.Message;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class IndividualUser extends User {
    private String id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private Address address;

    //from base:
    //private List<Advert> adverts = new ArrayList<Advert>();
    //private List<Advert> favoriteAdverts = new ArrayList<Advert>();
    //private List<Message> messages = new ArrayList<Message>();


    public IndividualUser(String name, String surname, String email, String phoneNumber, Address address){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;

    }

}
