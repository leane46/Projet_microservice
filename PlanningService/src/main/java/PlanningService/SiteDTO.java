package PlanningService;

public class SiteDTO {
    private String name;
    private Double latitude;
    private Double longitude;
    private Boolean paralympic;
    private Long id;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Boolean getParalympic() {
        return paralympic;
    }

    public void setParalympic(Boolean paralympic) {
        this.paralympic = paralympic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;


    }
}