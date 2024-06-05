package PlanningService;

import java.util.List;
import java.util.Optional;

public interface PlanningService {

    List<Planning> findAll();
    Optional<Planning> findById(Long id);

    Planning save(Planning planning);

    void deleteById(Long id);

    List<SiteDTO> findBySportAndDate(Long sportId, Long date);

    List<SportDTO> findByEventDateAndSite(Long siteId, Long date);

    List<Optional<Calendrier>> findBySportAndSite(Long siteId, Long sportId);
}
