package PlanningService;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface PlanningRepository extends JpaRepository<Planning, Long> {

    @Query("select p.sportId from Planning p where p.dateId = :dateId and p.siteId = :siteId")
    List<Long> findByEventDateAndSite(@Param("siteId") Long siteId, @Param("dateId") Long date);

    @Query("select p.siteId from Planning p where p.dateId = :dateId and p.sportId = :sportId")
    List<Long> findBySportAndDate(@Param("sportId") Long sportId, @Param("dateId") Long dateId);

    @Query("select p.dateId from Planning  p where  p.siteId = :siteId and p.sportId = :sportId")
    List<Long> findBySportAndSite(@Param("siteId") Long siteId, @Param("sportId") Long sportId);
}
