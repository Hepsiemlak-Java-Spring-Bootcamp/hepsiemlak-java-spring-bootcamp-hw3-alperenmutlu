package emlakburada.model;

import emlakburada.enums.Status;
import emlakburada.model.RealEstates.RealEstate;
import emlakburada.model.user.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class Advert {
    private String advertId;
    private String title;
    private String description;
    private Status status;
    private RealEstate realEstate;
    private User user;
    private Price price;
    private boolean putForward;
    private Date createdDate;

    private List<Message> messages = new ArrayList<>();
    private List<User> favoritesByUser = new ArrayList<>();

    public Advert(String title, String description, RealEstate realEstate, User user, Price price) {
        this.title = title;
        this.description = description;
        this.realEstate = realEstate;
        this.user = user;
        this.price = price;

        this.status = Status.ACTIVE;
        this.putForward = false;
        user.getAdverts().add(this);
    }

    public Advert(){

    }
}
