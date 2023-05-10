package home_work_28.Task2;

public class ListCarAdverstisement {

    private String presentation;
    private int numberOfVisitors;

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public int getNumberOfVisitors() {
        return numberOfVisitors;
    }

    public void setNumberOfVisitors(int numberOfVisitors) {
        this.numberOfVisitors = numberOfVisitors;
    }

    @Override
    public String toString() {
        return "ListCarAdverstisement{" +
                "presentation='" + presentation + '\'' +
                ", numberOfVisitors=" + numberOfVisitors +
                '}';
    }
}
