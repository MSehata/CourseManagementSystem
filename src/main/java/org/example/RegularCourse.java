package org.example;

public class RegularCourse extends Course
{
    String instructor;

    public RegularCourse(String courseCode, String courseName, String instructor) {
        super(courseCode, courseName);
        this.instructor = instructor;
    }

    // Override displayInfo for RegularCourse
    @Override
    public void displayInfo() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
    }
}
