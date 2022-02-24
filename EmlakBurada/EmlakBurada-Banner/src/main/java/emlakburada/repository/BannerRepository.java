package emlakburada.repository;

import emlakburada.model.Banner;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BannerRepository {

    private List<Banner> banners = new ArrayList<>();

    public List<Banner> findAllBanners() {
        return banners;
    }

    public Banner saveBanner(Banner banner) {
        banners.add(banner);
        return banner;
    }
}
