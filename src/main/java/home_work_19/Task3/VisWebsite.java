package home_work_19.Task3;

import java.util.Objects;

public class VisWebsite {
    private String user;
    private String nameWebsite;

    public VisWebsite(String user, String nameWebsite) {
        this.user = user;
        this.nameWebsite = nameWebsite;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNameWebsite() {
        return nameWebsite;
    }

    public void setNameWebsite(String nameWebsite) {
        this.nameWebsite = nameWebsite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VisWebsite that = (VisWebsite) o;
        return Objects.equals(user, that.user) && Objects.equals(nameWebsite, that.nameWebsite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, nameWebsite);
    }

    @Override
    public String toString() {
        return "VisitingTheWebsite{" +
                "user='" + user + '\'' +
                ", nameWebsite='" + nameWebsite + '\'' +
                '}';
    }
}