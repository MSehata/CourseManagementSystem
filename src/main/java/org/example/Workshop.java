package org.example;

public class Workshop extends Course
{
    String topic;

    public Workshop(String courseCode, String courseName, String topic) {
        super(courseCode, courseName);
        this.topic = topic;
    }

    // Override displayInfo for Workshop
    @Override
    public void displayInfo() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Topic: " + topic);
    }
}
