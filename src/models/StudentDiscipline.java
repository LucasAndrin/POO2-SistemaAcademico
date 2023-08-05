package models;

import models.discipline.Discipline;
import models.user.Student;

import java.util.ArrayList;

public class StudentDiscipline {

    private Student student;

    private Discipline discipline;

    public StudentDiscipline(Student student, Discipline discipline) {
        setStudent(student);
        setDiscipline(discipline);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudentDiscipline{");
        sb.append("student=").append(student);
        sb.append(", discipline=").append(discipline);
        sb.append('}');
        return sb.toString();
    }
}
