package SportService;


import java.util.List;
import java.util.Optional;


public interface SportService {

    List<Sport> findAll();
    Optional<Sport> findById(Long id);
    Sport save(Sport sport);
    void deleteById(Long id);
}
