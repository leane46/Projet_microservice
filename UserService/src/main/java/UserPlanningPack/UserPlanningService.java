package UserPlanningPack;

import java.util.List;
import java.util.Optional;

public interface UserPlanningService {
    List<UserPlanning> findAll();
    Optional<UserPlanning> findById(Long id);
    UserPlanning save(UserPlanning userPlanning);
    void deleteById(Long id);
}
