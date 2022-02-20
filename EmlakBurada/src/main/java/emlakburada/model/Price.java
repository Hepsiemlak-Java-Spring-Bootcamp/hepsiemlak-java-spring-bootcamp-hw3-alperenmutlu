package emlakburada.model;

import emlakburada.enums.Currency;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Price {
    private Integer price;
    private Currency currency;

    public Price(Integer price, Currency currency){
        this.price = price;
        this.currency = currency;
    }

}
