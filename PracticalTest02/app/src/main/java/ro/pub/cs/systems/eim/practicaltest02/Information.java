package ro.pub.cs.systems.eim.practicaltest02;

public class Information {
    public Information(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    private String course;

    @Override
    public String toString() {
        return "A BITCOIN is : " + this.course;
    }

}
