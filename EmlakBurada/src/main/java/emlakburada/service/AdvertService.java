package emlakburada.service;

import emlakburada.enums.RealEstateType;
import emlakburada.enums.State;
import emlakburada.model.Advert;
import emlakburada.model.Price;
import emlakburada.model.dto.AdvertDetailDto;
import emlakburada.model.dto.request.AdvertRequest;
import emlakburada.model.dto.response.AdvertResponse;
import emlakburada.model.user.IndividualUser;
import emlakburada.repository.AdvertRepository;
import emlakburada.repository.IndividualUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdvertService {

    private AdvertRepository advertRepository;

    private IndividualUserRepository individualUserRepository;

    @Autowired
    public AdvertService(AdvertRepository advertRepository, IndividualUserRepository individualUserRepository){
        this.advertRepository = advertRepository;
        this.individualUserRepository = individualUserRepository;
    }

    public AdvertResponse addAdvert(AdvertRequest request){
        Advert advert = convertToAdvert(request);
        Advert savedAdvert = advertRepository.addAdvert(advert);
        //advertRepository.addAdvert(advert);
        return convertToAdvertResponse(savedAdvert);
    }

    public List<Advert> getAll(){
        return advertRepository.fakeAdverts();
    }

    public List<Advert> getAdvertsByFilter(AdvertDetailDto advertDetailDto){
        List<Advert> adverts = advertRepository.getAll();
        List<Advert> filteredAdverts = new ArrayList<>();

        for(Advert filteredAdvert : adverts){
            if(advertDetailDto.getState() != null || advertDetailDto.getRealEstateType() != null || advertDetailDto.getPrice() != null
                    || advertDetailDto.getProvince() != null || advertDetailDto.getDistrict() != null){
                filteredAdverts.add(filteredAdvert);
            }
        }
        return filteredAdverts;

    }


    public List<Advert> getFavoriteAdvertsByUser(String id){
        IndividualUser individualUser = individualUserRepository.getIndividualUserById(id);
        return individualUser.getFavoriteAdverts();
    }


    private AdvertResponse convertToAdvertResponse(Advert savedAdvert) {
        AdvertResponse response = new AdvertResponse();
        response.setTitle(savedAdvert.getTitle());
        response.setDescription(savedAdvert.getDescription());
        response.setStatus(savedAdvert.getStatus());
        response.setRealEstate(savedAdvert.getRealEstate());
        return response;
    }


    private Advert convertToAdvert(AdvertRequest request) {
        // Advert advert = new Advert(new RealEstate(), new User(), new String[5]);

        Advert advert = new Advert();
            advert.setTitle(request.getTitle());
            advert.setDescription(request.getDescription());
            advert.setStatus(request.getStatus());
            advert.setRealEstate(request.getRealEstate());

        return advert;
        }


    }


