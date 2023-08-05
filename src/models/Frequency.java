package models;

import java.time.LocalDate;

public class Frequency {

    private StudentDiscipline studentDiscipline;

    private TeacherDiscipline teacherDisicipline;

    private LocalDate date;

    private boolean check;

    /**
     * Para uso hierárquico em StudentDiscipline ou TeacherDiscipline
     */
    public Frequency(LocalDate date, boolean check) {
        setDate(date);
        setCheck(check);
    }

    /**
     * para criação de nova frequência
     */
    public Frequency(StudentDiscipline studentDiscipline, TeacherDiscipline teacherDisicipline, LocalDate date, boolean check) {
        setStudentDiscipline(studentDiscipline);
        setTeacherDisicipline(teacherDisicipline);
        setDate(date);
        setCheck(check);
    }

    public StudentDiscipline getStudentDiscipline() {
        return studentDiscipline;
    }

    public void setStudentDiscipline(StudentDiscipline studentDiscipline) {
        this.studentDiscipline = studentDiscipline;
    }

    public TeacherDiscipline getTeacherDisicipline() {
        return teacherDisicipline;
    }

    public void setTeacherDisicipline(TeacherDiscipline teacherDisicipline) {
        this.teacherDisicipline = teacherDisicipline;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Frequency{");
        sb.append("studentDiscipline=").append(studentDiscipline);
        sb.append(", teacherDisicipline=").append(teacherDisicipline);
        sb.append(", date=").append(date);
        sb.append(", check=").append(check);
        sb.append('}');
        return sb.toString();
    }
}
