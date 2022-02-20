package emlakburada.model.user;

import emlakburada.model.Advert;
import emlakburada.model.Message;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class User {
    protected List<Advert> adverts = new ArrayList<Advert>();
    protected List<Advert> favoriteAdverts = new ArrayList<Advert>();
    protected List<Message> messages = new ArrayList<>();
}
