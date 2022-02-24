package emlakburada.model.RealEstates;

import emlakburada.enums.RealEstateType;
import emlakburada.enums.ReleaseType;
import emlakburada.model.Address;
import emlakburada.model.Category;
import emlakburada.model.Image;
import emlakburada.model.Price;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class RealEstate {
    protected String id;
    protected RealEstateType realEstateType;
    protected Category category;
    protected Address address;
    protected Price rentalPrice;
    protected ReleaseType releaseType;
    protected List<Image> images;

    protected RealEstate(RealEstateType realEstateType, Category category, Address address, Price rentalPrice, ReleaseType releaseType, List<Image> images) {
        this.realEstateType = realEstateType;
        this.category = category;
        this.address = address;
        this.rentalPrice = rentalPrice;
        this.releaseType = releaseType;
        this.images = images;
    }

    protected RealEstate(){

    }


    @Override
    public String toString() {
        return "RealEstate{" +
                "id='" + id + '\'' +
                ", estateType=" + realEstateType +
                ", category=" + category +
                ", address=" + address +
                ", rentalPrice=" + rentalPrice +
                ", releaseType=" + releaseType +
                ", images=" + images +
                '}';
    }
}
