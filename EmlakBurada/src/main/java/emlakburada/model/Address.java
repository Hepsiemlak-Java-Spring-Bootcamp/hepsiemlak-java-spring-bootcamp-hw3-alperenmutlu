package emlakburada.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {
    private String id;
    private String province;
    private String district;
    private String neighborhood;
    private String fullAddress;

    public Address(String province, String district, String neighborhood, String fullAddress){

        this.province = province;
        this.district = district;
        this.neighborhood = neighborhood;
        this.fullAddress = fullAddress;

    }

}
