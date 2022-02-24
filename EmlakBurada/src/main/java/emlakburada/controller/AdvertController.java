package emlakburada.controller;

import emlakburada.model.Advert;
import emlakburada.model.dto.AdvertDetailDto;
import emlakburada.model.dto.request.AdvertRequest;
import emlakburada.model.dto.response.AdvertResponse;
import emlakburada.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adverts")
public class AdvertController {

    private AdvertService advertService;

    @Autowired
    public AdvertController(AdvertService advertService){
        this.advertService = advertService;
    }

    @PostMapping("/add")
    public ResponseEntity<AdvertResponse> addAdvert(@RequestBody AdvertRequest request){
        //advertService.addAdvert(advert);
        //return advertService.addAdvert(request);
        return new ResponseEntity<>(advertService.addAdvert(request), HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public List<Advert> getAll(){
        return advertService.getAll();
    }

    @GetMapping("/filter")
    public List<Advert> getAdvertsByFilter(@RequestBody AdvertDetailDto advertDetailDto){
        return advertService.getAdvertsByFilter(advertDetailDto);
    }

    @GetMapping("/favorites/{id}")
    public List<Advert> getFavoriteAdvertsByUser(@PathVariable("id") String id){
        return advertService.getFavoriteAdvertsByUser(id);
    }

}
