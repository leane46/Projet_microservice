package SiteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SiteServiceImpl implements SiteService {

    public SiteRepository siteRepository;


    @Autowired
    public SiteServiceImpl(
    SiteRepository siteRepository) {
        this.siteRepository = siteRepository;
    }

    @Override
    public List<Site> findAll() {
        return siteRepository.findAll();
    }

    @Override
    public Optional<Site> findById(Long id) {
        return siteRepository.findById(id);
    }

    @Override
    public Site save(Site site) {
        return siteRepository.save(site);
    }

    @Override
    public void deleteById(Long id) {
        siteRepository.deleteById(id);
    }



}
