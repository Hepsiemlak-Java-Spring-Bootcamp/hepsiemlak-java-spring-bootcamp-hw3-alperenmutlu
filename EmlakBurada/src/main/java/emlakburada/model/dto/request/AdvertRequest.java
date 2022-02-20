package emlakburada.model.dto.request;

import emlakburada.enums.Status;
import emlakburada.model.RealEstates.RealEstate;
import lombok.Data;

@Data
public class AdvertRequest {

    private String title;
    private String description;
    private Status status;
    private RealEstate realEstate;
}
