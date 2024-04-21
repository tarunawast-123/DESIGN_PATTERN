package org.example.prototype;

public class PrototypeDesignPattern {

    public void run() {
        Student student = new Student("Tarun", "Awasthi");
        Student clonedStuden = (Student) student.clone();
        System.out.println(clonedStuden.toString());
    }
}
