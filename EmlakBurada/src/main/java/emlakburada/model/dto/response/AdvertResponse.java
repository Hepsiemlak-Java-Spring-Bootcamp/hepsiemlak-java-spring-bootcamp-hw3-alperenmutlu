package emlakburada.model.dto.response;

import emlakburada.enums.Status;
import emlakburada.model.Price;
import emlakburada.model.RealEstates.RealEstate;
import emlakburada.model.user.User;
import lombok.Data;

import java.util.Date;

@Data
public class AdvertResponse {
    private String title;
    private String description;
    private Status status;
    private RealEstate realEstate;
    private User user;
    private Price price;
    private boolean putForward;
    private Date createdDate;
}
