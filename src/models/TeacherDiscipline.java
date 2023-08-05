package models;

import models.discipline.Discipline;
import models.user.Teacher;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class TeacherDiscipline {

    private Discipline discipline;

    private Teacher teacher;

    public TeacherDiscipline(Discipline discipline, Teacher teacher) {
        setDiscipline(discipline);
        setTeacher(teacher);
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Evaluation postEvaluation(StudentDiscipline studentDiscipline, int grade) {
        return new Evaluation(studentDiscipline, this, grade);
    }

    public Frequency postFrequency(StudentDiscipline studentDiscipline, LocalDate date, boolean check) {
        return new Frequency(studentDiscipline, this, date, check);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TeacherDiscipline{");
        sb.append("discipline=").append(discipline);
        sb.append(", teacher=").append(teacher);
        sb.append('}');
        return sb.toString();
    }
}
