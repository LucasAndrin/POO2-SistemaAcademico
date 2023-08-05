package models;

public class Phase {

    private String name;

    private Course course;

    public Phase(String name, Course course) {
        setName(name);
        setCourse(course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Phase{");
        sb.append("name='").append(name).append('\'');
        sb.append(", course=").append(course);
        sb.append('}');
        return sb.toString();
    }
}
