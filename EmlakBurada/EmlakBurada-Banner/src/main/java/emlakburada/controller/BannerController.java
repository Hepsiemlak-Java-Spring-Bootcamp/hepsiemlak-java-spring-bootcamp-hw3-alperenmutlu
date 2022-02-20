package emlakburada.controller;

import emlakburada.dto.request.BannerRequest;
import emlakburada.dto.response.BannerResponse;
import emlakburada.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BannerController {

    @Autowired
    private BannerService service;

    @GetMapping(value = "/banners")
    public ResponseEntity<List<BannerResponse>> getAllBanners() {
        return new ResponseEntity<>(service.getAllBanners(), HttpStatus.OK);
    }

    @PostMapping(value = "/banners")
    public ResponseEntity<BannerResponse> saveBanner(@RequestBody BannerRequest request) {
        return new ResponseEntity<>(service.saveBanner(request), HttpStatus.OK);
    }
}
