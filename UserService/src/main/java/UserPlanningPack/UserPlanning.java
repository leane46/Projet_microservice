package UserPlanningPack;

import jakarta.persistence.*;

@Entity
@Table(name = "user_planning")
public class UserPlanning {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "user_id", nullable = false)
    private String user_id;

    @Column(name = "site", nullable = false)
    private String site;

    @Column(name = "sport", nullable = false)
    private String sport;

    @Column(name = "date", nullable = false)
    private String date;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
