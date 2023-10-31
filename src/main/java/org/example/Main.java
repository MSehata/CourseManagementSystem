package org.example;

public class Main {
    public static void main(String[] args)
    {
        // Create instances of RegularCourse and Workshop
        RegularCourse regularCourse = new RegularCourse("SMTH011", "Calculus", "Takalani");
        Workshop workshop = new Workshop("SHELL011", "Advanced Life Orientation", "Sexually Transmitted Diseases");

        Student student1 = new Student("Moloko");
        Student student2 = new Student("Matimba");

        System.out.println();
        regularCourse.displayInfo();
        regularCourse.enrollStudent(student1);
        regularCourse.enrollStudent(student2);
        System.out.println();

        workshop.displayInfo();
        workshop.enrollStudent(student1);
        workshop.enrollStudent(student2);
        System.out.println();

        // Deregister students
        regularCourse.unenrollStudent(student2);
        workshop.unenrollStudent(student2);
    }
}