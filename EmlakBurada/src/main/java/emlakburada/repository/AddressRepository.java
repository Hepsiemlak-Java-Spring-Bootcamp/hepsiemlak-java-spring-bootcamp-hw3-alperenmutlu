package emlakburada.repository;

import emlakburada.model.Address;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressRepository {
    List<Address> addresses = new ArrayList<>();



    public List<Address> fakeAddress(){
        List<Address> fakeAddressList = new ArrayList<>();
        Address canakkale = new Address("Çanakkale","Biga","Sakarya","Çanakkale/Biga Sakarya Mahallesi/ Çiçek Caddesi, NO:1, Daire:2");
        Address istanbul = new Address("İstanbul","Beşiktaş","Sakarya","İstanbul/Beşiktaş İstiklal Mahallesi/ Alperen Caddesi, NO:2, Daire:3");
        fakeAddressList.add(canakkale);
        fakeAddressList.add(istanbul);

        return fakeAddressList;
    }


    public List<Address> getAll(){
        return  addresses;
    }

    public List<String> getByProvince(String province){
        List<String> getByProvince = new ArrayList<>();
        for(Address address : addresses){
            if(address.getProvince().equals(province)){
                getByProvince.add(province);
            }
        }
        return  getByProvince;
    }

    public void addAddress(Address address){
        addresses.add(address);
    }

    public void updateAddress(Address address){
        for(Address updatedAddress : addresses){
            if(updatedAddress.getId().equals(address.getId())){
                updatedAddress.setFullAddress(address.getFullAddress());
                updatedAddress.setDistrict(address.getDistrict());
                updatedAddress.setNeighborhood(address.getNeighborhood());
                updatedAddress.setProvince(address.getProvince());
            }
        }
    }

    public void deleteAddress(String id){
        addresses.removeIf(deletedAddress -> deletedAddress.getId().equals(id));
    }

}
