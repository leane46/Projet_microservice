package SportService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SportServiceImpl implements SportService{

    public SportRepository sportRepository;


    public SportServiceImpl(SportRepository sportRepository) {
        this.sportRepository = sportRepository;

    }

    @Override
    public List<Sport> findAll() {
        return sportRepository.findAll();
    }

    @Override
    public Optional<Sport> findById(Long id) {
        return sportRepository.findById(id);
    }

    @Override
    public Sport save(Sport sport) {
        return sportRepository.save(sport);
    }

    @Override
    public void deleteById(Long id) {
        sportRepository.deleteById(id);
    }

}
