package PlanningService;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "planning")
public class Planning implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "sportid", nullable = false)
    private Long sportId;

    @Column(name = "siteid", nullable = false)
    private Long siteId;

    @Column(name = "dateid", nullable = false)
    private Long dateId;


    public Planning() {
    }

    public Planning(Long sportId, Long siteId, Long dateId) {
        this.sportId = sportId;
        this.siteId = siteId;
        this.dateId = dateId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSportId() {
        return sportId;
    }

    public void setSportId(Long sportId) {
        this.sportId = sportId;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public Long getDateId() {
        return dateId;
    }

    public void setDateId(Long dateId) {
        this.dateId = dateId;
    }

    @Override
    public String toString() {
        return "Planning{" +
                "id=" + id +
                ", sportId=" + sportId +
                ", siteId=" + siteId +
                ", dateId=" + dateId +
                '}';
    }
}