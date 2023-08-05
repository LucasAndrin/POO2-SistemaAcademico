import models.*;
import models.discipline.OfferedDiscipline;
import models.user.Student;
import models.user.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Cria curso do BCC
        Course course = new Course("BCC");
        System.out.println(course);

//      Cria as 8 fases do BCC
        ArrayList<Phase> phases = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("ª Fase");
            phases.add(new Phase(sb.toString(), course));
        }
        System.out.println(phases);

//      Cria discipline ofertada
        OfferedDiscipline oop2 = new OfferedDiscipline("poo2", "Programação Orientada à Objetos", phases.get(3));
        System.out.println(oop2);

//      Cria instância do professor
        Teacher curvello = new Teacher("Rodrigo", "Curvêllo", "curvello@gmail.com");
        System.out.println(curvello);

//      Relaciona professor à disciplina por meio do construct padrão ou pelo método ministerDiscipline
//        TeacherDiscipline teacherDiscipline = new TeacherDiscipline(oop2, curvello);
//        ou
        TeacherDiscipline teacherDiscipline = curvello.ministerDiscipline(oop2);
        System.out.println(teacherDiscipline);

//      Cria instância de aluno
        Student lucas = new Student(1234, "Lucas", "Andrin", "lucas@gmail.com");
        System.out.println(lucas);

//      Relaciona aluno à disciplina por meio do construct do StudentDiscipline ou pelo método enroll em Student
//        StudentDiscipline studentDiscipline = new StudentDiscipline(lucas, oop2);
//        ou
        StudentDiscipline studentDiscipline = lucas.enroll(oop2);
        System.out.println(studentDiscipline);

//      Cria avaliação de desempenho de aluno por meio da instância básica ou método postEvaluatino em teacherDiscipline
//        Evaluation evaluation = new Evaluation(studentDiscipline, teacherDiscipline, 10);
//        ou
        Evaluation evaluation = teacherDiscipline.postEvaluation(studentDiscipline, 10);
        System.out.println(evaluation);

//      Cria frequência
//        Frequency frequency = new Frequency(studentDiscipline, teacherDiscipline, LocalDate.now(), false);
//        ou
        Frequency frequency = teacherDiscipline.postFrequency(studentDiscipline, LocalDate.now(), false);
        System.out.println(frequency);

    }
}