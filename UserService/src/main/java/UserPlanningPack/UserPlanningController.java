package UserPlanningPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users_planning")
public class UserPlanningController {
    @Autowired
    public UserPlanningService userPlanningService;

    @GetMapping("/all")
    public List<UserPlanning> getAllUsersPlanning() {
        return userPlanningService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserPlanning> getUserPlanningById(@PathVariable Long id) {
        Optional<UserPlanning> userPlanning = userPlanningService.findById(id);
        return userPlanning.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public UserPlanning createUserPlanning(@RequestBody UserPlanning userPlanning) {
        return userPlanningService.save(userPlanning);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserPlanning> updateUserPlanning(@PathVariable Long id, @RequestBody UserPlanning userPlanningDetails) {
        Optional<UserPlanning> optionalUserPlanning = userPlanningService.findById(id);
        if (optionalUserPlanning.isPresent()) {
            UserPlanning userPlanning = optionalUserPlanning.get();
            userPlanning.setSite(userPlanningDetails.getSite());
            userPlanning.setSport(userPlanning.getSport());
            userPlanning.setDate(userPlanning.getDate());
            return ResponseEntity.ok(userPlanningService.save(userPlanning));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserPlanning(@PathVariable Long id) {
        userPlanningService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
