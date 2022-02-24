package emlakburada.repository;

import emlakburada.enums.Currency;
import emlakburada.model.Advert;
import emlakburada.model.Price;
import emlakburada.model.RealEstates.House;
import emlakburada.model.user.IndividualUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AdvertRepository {

    @Autowired
    AddressRepository addressRepository;

     List<Advert> adverts = new ArrayList<>();

     List<Advert> favoriteAdvertsByUser = new ArrayList<>();

     public List<Advert> fakeAdverts(){
        List<Advert> fakeAdverts = new ArrayList<>();
        IndividualUser individualUser = new IndividualUser("alperen","mutlu","alperen@alperen.com",
                "123456789",addressRepository.fakeAddress().get(1));
        Advert advert = new Advert("Satılık Ev","Boğaz manazaralı", new House(),individualUser,new Price(5000, Currency.TL));
        fakeAdverts.add(advert);

        return fakeAdverts;
    }

    public Advert addAdvert(Advert advert){
        adverts.add(advert);
        return advert;
    }


    public List<Advert> getAll(){
        return adverts;

    }


    public Advert getAdvertById(String id){
        for(Advert advert : adverts){
            if(advert.getAdvertId().equals(id)){
                return advert;
            }
        }
        return null;
    }

    public void deleteAdvertById(String id){
        for(Advert advert : adverts){
            if(advert.getAdvertId().equals(id)){
               adverts.remove(advert);
            }
        }
    }




}
