package SiteService;

import java.util.List;
import java.util.Optional;

public interface SiteService {
    List<Site> findAll();
    Optional<Site> findById(Long id);
    Site save(Site site);
    void deleteById(Long id);

}
