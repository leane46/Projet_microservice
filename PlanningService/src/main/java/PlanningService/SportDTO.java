package PlanningService;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class SportDTO {
    private Long id;
    private String name;
    private String rules;
    private String competition_categories;


    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getCompetition_categories() {
        return competition_categories;
    }

    public void setCompetition_categories(String competition_categories) {
        this.competition_categories = competition_categories;
    }
}
