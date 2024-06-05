package PlanningService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class PlanningServiceImpl implements PlanningService {

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    public PlanningRepository planningRepository;

    @Autowired
    public CalendrierRepository calendrierRepository;
    @Override
    public List<Planning> findAll() {
        return planningRepository.findAll();
    }

    @Override
    public Optional<Planning> findById(Long id) {
        return planningRepository.findById(id);
    }

    @Override
    public Planning save(Planning planning) {
        return planningRepository.save(planning);
    }

    @Override
    public void deleteById(Long id) {
        planningRepository.deleteById(id);
    }

    @Override
    public List<SiteDTO> findBySportAndDate(Long sportId, Long date) {
        List<Long> siteIds = planningRepository.findBySportAndDate(sportId, date);
        List<SiteDTO> sitesInfo = new ArrayList<>();
        for (Long siteId : siteIds) {
            ResponseEntity<SiteDTO> response = restTemplate.getForEntity("http://localhost:8080/api/sites/" + siteId, SiteDTO.class);
            SiteDTO siteInfo = response.getBody();
            if (siteInfo != null) {
                sitesInfo.add(siteInfo);
            }
        }
        return sitesInfo;
    }

    @Override
    public List<SportDTO> findByEventDateAndSite(Long siteId, Long date) {
        List<Long> sportIds = planningRepository.findByEventDateAndSite(siteId, date);
        List<SportDTO> sportsInfo = new ArrayList<>();
        for (Long sportId : sportIds) {
            ResponseEntity<SportDTO> response = restTemplate.getForEntity("http://localhost:8082/api/sports/" + sportId, SportDTO.class);
            SportDTO sportInfo = response.getBody();
            if (sportInfo != null) {
                sportsInfo.add(sportInfo);
            }
        }
        return sportsInfo;
    }

    @Override
    public List<Optional<Calendrier>> findBySportAndSite(Long siteId, Long sportId){
    List<Long> dateIds = planningRepository.findBySportAndSite(siteId, sportId);
    List<Optional<Calendrier>> dates = new ArrayList<>();
    for (Long dateid: dateIds) {
            dates.add(calendrierRepository.findById(dateid));
        };
    return dates;
    }
}
