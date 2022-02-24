package emlakburada.service;

import emlakburada.model.Address;
import emlakburada.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService {

    private AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    public List<Address> getAll(){
        return addressRepository.fakeAddress();
    }

    public void addAddress(Address address){
        addressRepository.addAddress(address);
    }

    public void updateAddress(Address address){
        addressRepository.updateAddress(address);
    }

    public void deleteAddress(String id){
        addressRepository.deleteAddress(id);
    }

}
