package models;

public class Evaluation {

    private StudentDiscipline studentDiscipline;
    private TeacherDiscipline teacherDisicipline;
    private int grade;

    public Evaluation(StudentDiscipline studentDiscipline, TeacherDiscipline teacherDiscipline, int grade) {
        setStudentDiscipline(studentDiscipline);
        setTeacherDisicipline(teacherDiscipline);
        setGrade(grade);
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Evaluation{");
        sb.append("studentDiscipline=").append(studentDiscipline);
        sb.append(", teacherDisicipline=").append(teacherDisicipline);
        sb.append(", grade=").append(grade);
        sb.append('}');
        return sb.toString();
    }
}
