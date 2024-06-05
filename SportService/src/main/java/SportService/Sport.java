package SportService;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "sports")
public class Sport {

    @Id
    private long id;
    private String name;

    private String rules;

    private String competition_categories;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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