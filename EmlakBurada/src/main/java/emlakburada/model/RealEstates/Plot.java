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
public class Plot extends RealEstate{
    private String id;
    private Integer squareMeters;
    private String municipality;
    private Integer islandNumber;
    private Integer parcelNumber;

    public Plot(){
        this.realEstateType = RealEstateType.PLOT;
    }

    public Plot(Category category, Address address, Price rentalPrice, ReleaseType releaseType,
                List<Image> images, Integer squareMeters, String municipality, Integer islandNumber, Integer parcelNumber) {
        super(RealEstateType.PLOT, category, address, rentalPrice, releaseType, images);
        this.squareMeters = squareMeters;
        this.municipality = municipality;
        this.islandNumber = islandNumber;
        this.parcelNumber = parcelNumber;
    }
}
