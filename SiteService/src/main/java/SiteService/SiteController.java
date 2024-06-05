package SiteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sites")
public class SiteController {

    @Autowired
    private SiteServiceImpl siteService;

    @GetMapping("/all")
    public List<Site> getAllSites() {
        return siteService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Site> getSiteById(@PathVariable Long id) {
        Optional<Site> site = siteService.findById(id);
        return site.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Site createSite(@RequestBody Site site) {
        return siteService.save(site);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Site> updateSite(@PathVariable Long id, @RequestBody Site siteDetails) {
        Optional<Site> optionalSite = siteService.findById(id);
        if (optionalSite.isPresent()) {
            Site site = optionalSite.get();
            site.setName(siteDetails.getName());
            site.setLatitude(siteDetails.getLatitude());
            site.setLongitude(siteDetails.getLongitude());
            site.setParalympic(siteDetails.getParalympic());
            return ResponseEntity.ok(siteService.save(site));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSite(@PathVariable Long id) {
        siteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
