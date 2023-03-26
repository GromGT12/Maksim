package home_work_17.Task2;

import java.io.Serializable;

public class Track implements Serializable {
    private String author;
    private String name;
    private int listeningCount;

    public Track() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getListeningCount() {
        return listeningCount;
    }

    public void setListeningCount(int listeningCount) {
        this.listeningCount = listeningCount;
    }

    @Override
    public String toString() {
        return "Track{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", listeningCount=" + listeningCount +
                '}';
    }
}