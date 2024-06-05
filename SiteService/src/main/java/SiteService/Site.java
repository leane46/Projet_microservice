package SiteService;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Document(collection = "sites")
public class Site {

    @Id
    private Long site_id;
    private String name;
    private double latitude;
    private double longitude;
    private Boolean paralympic;


    public long getId() {
        return site_id;
    }
    public void setSite_id(Long site_id) {
        this.site_id = site_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setParalympic(Boolean paralympic) {
        this.paralympic = paralympic;
    }

}