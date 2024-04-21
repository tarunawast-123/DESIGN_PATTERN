package org.example.prototype;

public class Student implements Prototype {
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public Object clone() {
        return new Student(this.firstName,this.lastName);
    }
}
