package org.example;

import java.util.ArrayList;
import java.util.List;

abstract class Course implements Enrollable
{
    String courseCode;
    String courseName;
    List<Student> enrolledStudents;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Abstract method to display information about the course
    public abstract void displayInfo();

    // Enroll a student
    @Override
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " enrolled in " + courseName);
    }

    // Deregister a student
    @Override
    public void unenrollStudent(Student student) {
        enrolledStudents.remove(student);
        System.out.println(student.getName() + " deregistered from " + courseName);
    }
}
