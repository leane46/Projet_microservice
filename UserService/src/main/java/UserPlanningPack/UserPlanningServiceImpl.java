package UserPlanningPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserPlanningServiceImpl implements UserPlanningService{
    @Autowired
    public UserPlanningRepository userPlanningRepository;

    @Override
    public List<UserPlanning> findAll() {
        return userPlanningRepository.findAll();
    }

    @Override
    public Optional<UserPlanning> findById(Long id) {
        return userPlanningRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        userPlanningRepository.deleteById(id);
    }

    @Override
    public UserPlanning save(UserPlanning userPlanning) {
        return userPlanningRepository.save(userPlanning);
    }
}
