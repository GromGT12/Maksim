package home_work_28.Task1;

import java.util.List;

public class PostUsersXml {
    private String UserId;
    private String id;
    private String title;
    private String body;

    private List<CharacteristicsOfUsers> characteristics;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<CharacteristicsOfUsers> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<CharacteristicsOfUsers> characteristics) {
        this.characteristics = characteristics;
    }

    @Override
    public String toString() {
        return "PostUsersXml{" +
                "UserId='" + UserId + '\'' +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", characteristics=" + characteristics +
                '}';
    }
}
