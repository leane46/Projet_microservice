package SportService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sports")
public class SportController {

    @Autowired
    public SportServiceImpl sportService;

    @GetMapping("/all")
    public List<Sport> getAllSports() {
        return sportService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sport> getSportById(@PathVariable Long id) {
        Optional<Sport> sport = sportService.findById(id);
        return sport.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Sport createSport(@RequestBody Sport sport) {
        return sportService.save(sport);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sport> updateSport(@PathVariable Long id, @RequestBody Sport sportDetails) {
        Optional<Sport> optionalSport = sportService.findById(id);
        if (optionalSport.isPresent()) {
            Sport sport = optionalSport.get();
            sport.setName(sportDetails.getName());
            sport.setRules(sportDetails.getRules());
            sport.setCompetition_categories(sportDetails.getCompetition_categories());
            return ResponseEntity.ok(sportService.save(sport));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSport(@PathVariable Long id) {
        sportService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
