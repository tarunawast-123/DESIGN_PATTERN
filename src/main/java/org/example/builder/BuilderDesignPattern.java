package org.example.builder;

public class BuilderDesignPattern {

    public void run() {
        Director directorObj1 = new Director(new EnginneringStudentBuilder());
        Director directorObj2 = new Director(new MbaStudentBuilder());

        Student engineerStudent = directorObj1.createStudent();
        Student mbaStudent =directorObj2.createStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());

    }
}
