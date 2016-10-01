package com.andrew;

public class ITECCourseManager {

    public static void main(String[] args) {

        ITECCourse maintenance = new ITECCourse("Micro System Maintenance", 1335, 3);

        maintenance.addStudents("Andrew");
        maintenance.addStudents("Brian");
        maintenance.addStudents("Charles");
        maintenance.addStudents("David");
        maintenance.addStudents("Eli");
        maintenance.addStudents("Frank");

        maintenance.setRoom("T.3050");
        System.out.println(maintenance.getNumberStudents() + " students are enrolled in " + maintenance.getName());
        System.out.println(maintenance.getName() + " meets in " + maintenance.getRoom());
        ITECCourse java = new ITECCourse("Java Programming", 2545, 24);
        java.addStudents("Gus");
        java.addStudents("Harry");
        java.addStudents("Izzy");

        java.removeStudents("Harry");

        int numStudents = java.getNumberStudents();
        System.out.println(numStudents + " students are enrolled in " + java.getName());
    }
}
