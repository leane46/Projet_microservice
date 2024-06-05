package PlanningService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/planning")
public class PlanningController {

    @Autowired
    private PlanningService planningService;


    @GetMapping("/all")
    public List<Planning> getAllPlanning() {
        return planningService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Planning> getPlanningById(@PathVariable Long id) {
        Optional<Planning> planning = planningService.findById(id);
        return planning.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Planning createPlanning(@RequestBody Planning planning) {
        return planningService.save(planning);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Planning> updatePlanning(@PathVariable Long id, @RequestBody Planning planningDetails) {
        Optional<Planning> optionalPlanning = planningService.findById(id);
        if (optionalPlanning.isPresent()) {
            Planning planning = optionalPlanning.get();
            planning.setSportId(planningDetails.getSportId());
            planning.setSiteId(planningDetails.getSiteId());
            planning.setDateId(planningDetails.getDateId());
            return ResponseEntity.ok(planningService.save(planning));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlanning(@PathVariable Long id) {
        planningService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search/sites/")
    public List<SiteDTO> findSitesBySportAndDate(@RequestParam Long sportId, @RequestParam Long date) {
        return planningService.findBySportAndDate(sportId, date);
    }

    @GetMapping("/search/sports/")
    public List<SportDTO> findByEventDateAndSite(@RequestParam Long siteId, @RequestParam Long date) {
        return planningService.findByEventDateAndSite(siteId, date);
    }

    @GetMapping("/search/date/")
    public List<Optional<Calendrier>> findBySportAndSite(@RequestParam Long siteId, @RequestParam Long sportId){
        return planningService.findBySportAndSite(siteId, sportId);
    }

}
