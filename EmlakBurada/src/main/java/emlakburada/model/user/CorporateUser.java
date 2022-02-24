package emlakburada.model.user;

import emlakburada.model.Address;
import emlakburada.model.Advert;
import emlakburada.model.Message;

import java.util.ArrayList;
import java.util.List;

public class CorporateUser extends User  {
    private String id;
    private String companyName;
    private Address address;
    private String phoneNumber;
    private String email;
    private String companyStaffName;
    private String companyStaffSurname;

    //from base :
    //protected List<Advert> adverts = new ArrayList<Advert>();
    //protected List<Advert> favoriteAdverts = new ArrayList<Advert>();
    //protected List<Message> messages = new ArrayList<>();


    public CorporateUser(String companyName, Address address, String phoneNumber, String email, String companyStaffName, String companyStaffSurname) {
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.companyStaffName = companyStaffName;
        this.companyStaffSurname = companyStaffSurname;
    }
}
