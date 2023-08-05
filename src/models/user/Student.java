package models.user;

import models.StudentDiscipline;
import models.discipline.OfferedDiscipline;

public class Student extends User {

    private long enrollment;

    public Student(long enrollment, String name, String surname, String email, String password) {
        super(name, surname, email, password);
        setEnrollment(enrollment);
    }

    public Student(long enrollment, String name, String surname, String email) {
        super(name, surname, email);
        setEnrollment(enrollment);
    }

    public long getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(long enrollment) {
        this.enrollment = enrollment;
    }

    public StudentDiscipline enroll(OfferedDiscipline discipline) {
        return new StudentDiscipline(this, discipline);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("enrollment=").append(enrollment);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
