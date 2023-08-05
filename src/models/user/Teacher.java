package models.user;

import models.TeacherDiscipline;
import models.discipline.OfferedDiscipline;

public class Teacher extends User {

    public Teacher(String name, String surname, String email, String password) {
        super(name, surname, email, password);
    }

    public Teacher(String name, String surname, String email) {
        super(name, surname, email);
    }

    public TeacherDiscipline ministerDiscipline(OfferedDiscipline discipline) {
        return new TeacherDiscipline(discipline, this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teacher{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
