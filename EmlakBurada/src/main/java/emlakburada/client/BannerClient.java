package emlakburada.client;

import emlakburada.client.request.BannerRequest;
import emlakburada.client.response.BannerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@Service
@FeignClient(value = "EmlakBurada-banner", url = "http://localhost:8081")
public interface BannerClient {

    @PostMapping("/banners")
    ResponseEntity<BannerResponse> saveBanner(@RequestBody BannerRequest bannerRequest);

}
