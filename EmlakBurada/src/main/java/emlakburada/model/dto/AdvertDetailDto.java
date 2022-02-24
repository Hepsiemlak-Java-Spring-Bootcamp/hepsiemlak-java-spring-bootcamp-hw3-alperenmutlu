package emlakburada.model.dto;

import emlakburada.enums.RealEstateType;
import emlakburada.enums.State;
import emlakburada.model.Price;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertDetailDto {
    private State state;
    private RealEstateType realEstateType;
    private Price price;
    private String province;
    private String district;
}
