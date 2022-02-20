package emlakburada.model.RealEstates;

import emlakburada.enums.*;
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
public class House extends RealEstate {

    private Integer numberOfRooms;
    private Integer numberOfHalls;
    private Integer numberOfBathRooms;
    private Integer grossSquareMeters;
    private Integer netSquareMeters;
    private WarmingType warmingType;
    private Integer ageOfBuilding;
    private Integer floorLocation;
    private Integer numberOfFloors;
    private HousingShape housingShape;
    private boolean furnishedHouse;
    private FuelType fuelType;
    private State state;
    private UsingStatus usingStatus;
    private Price deposit;
    private Price dues;
    private boolean inSite;

    public House(){
        this.realEstateType = RealEstateType.HOUSE;
    }


    public House(Category category, Address address, Price rentalPrice, ReleaseType releaseType, List<Image> images,
                 Integer numberOfRooms, Integer numberOfHalls, Integer numberOfBathRooms, Integer grossSquareMeters,
                 Integer netSquareMeters, WarmingType warmingType, Integer ageOfBuilding, Integer floorLocation,
                 Integer numberOfFloors, HousingShape housingShape, boolean furnishedHouse, FuelType fuelType,
                 State state, UsingStatus usingStatus, Price deposit, Price dues, boolean inSite){
        super(RealEstateType.HOUSE, category, address , rentalPrice, releaseType, images);

       this.numberOfRooms = numberOfRooms;
       this.numberOfHalls = numberOfHalls;
       this.numberOfBathRooms = numberOfBathRooms;
       this.grossSquareMeters = grossSquareMeters;
       this.netSquareMeters = netSquareMeters;
       this.warmingType = warmingType;
       this.ageOfBuilding = ageOfBuilding;
       this.floorLocation = floorLocation;
       this.numberOfFloors = numberOfFloors;
       this.housingShape = housingShape;
       this.furnishedHouse = furnishedHouse;
       this.fuelType = fuelType;
       this.state = state;
       this.usingStatus = usingStatus;
       this.deposit = deposit;
       this.dues = dues;
       this.inSite = inSite;



    }


    @Override
    public String toString() {
        return "House{" +
                "numberOfRooms=" + numberOfRooms +
                ", numberOfHalls=" + numberOfHalls +
                ", numberOfBathRooms=" + numberOfBathRooms +
                ", grossSquareMeters=" + grossSquareMeters +
                ", netSquareMeters=" + netSquareMeters +
                ", warmingType=" + warmingType +
                ", ageOfBuilding=" + ageOfBuilding +
                ", floorLocation=" + floorLocation +
                ", numberOfFloors=" + numberOfFloors +
                ", housingShape=" + housingShape +
                ", furnishedHouse=" + furnishedHouse +
                ", fuelType=" + fuelType +
                ", state=" + state +
                ", usingStatus=" + usingStatus +
                ", deposit=" + deposit +
                ", dues=" + dues +
                ", inSite=" + inSite +
                ", estateType=" + realEstateType +
                ", category=" + category +
                ", address=" + address +
                ", rentalPrice=" + rentalPrice +
                ", releaseType=" + releaseType +
                ", images=" + images +
                '}';
    }

}
