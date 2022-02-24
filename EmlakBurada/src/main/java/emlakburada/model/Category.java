package emlakburada.model;

import emlakburada.enums.RealEstateType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Category {
    private String id;
    private RealEstateType realEstateType;
    private String name;

    public Category(RealEstateType realEstateType, String name){
        this.realEstateType = realEstateType;
        this.name = name;
    }
}
