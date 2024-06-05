package PlanningService;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "calendrier")
public class Calendrier {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "event_date", nullable = false)
    private Date eventDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
}