package UserService;

import PlanningService.Planning;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @lombok.Getter
    @Column(name = "firstname", nullable = false)
    private String firstname;


    // Parameterized constructor
    public User(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

}