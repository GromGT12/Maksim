package home_work_28.Task2;

import java.util.List;

public class JacksonAdvertisement {
    private String id;
    private String title;
    private String description;
    private String city;
    private String status;
    private List<ListCarAdverstisement> listCarAdverstisementList;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "JacksonAdvertisement{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", city='" + city + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
