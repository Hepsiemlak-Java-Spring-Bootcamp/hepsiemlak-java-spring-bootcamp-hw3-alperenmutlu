package emlakburada.controller;

import emlakburada.model.Address;
import emlakburada.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/add")
    public void addAddress(Address address){
        addressService.addAddress(address);
    }

    @GetMapping("/getall")
    public List<Address> getAll(){
        return addressService.getAll();
    }

}
