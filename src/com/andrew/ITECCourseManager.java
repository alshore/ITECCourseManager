package com.andrew;

import java.util.ArrayList;

public class ITECCourseManager {

    public static void main(String[] args) {

        ITECCourse maintenance = new ITECCourse("Micro System Maintenance", 1335, 3, "T.3080");

        maintenance.addStudents("Andrew");
        maintenance.addStudents("Brian");
        maintenance.addStudents("Charles");
        maintenance.addStudents("David");
        maintenance.addStudents("Eli");
        maintenance.addStudents("Frank");

        maintenance.setRoom("T.3070");
        System.out.println(maintenance.getNumberStudents() + " students are enrolled in " + maintenance.getName());
        System.out.println(maintenance.getName() + " meets in " + maintenance.getRoom());
        ITECCourse java = new ITECCourse("Java Programming", 2545, 24, "T.3050");
        java.addStudents("Gus");
        java.addStudents("Harry");
        java.addStudents("Izzy");

        java.removeStudents("Harry");

        int numStudents = java.getNumberStudents();
        System.out.println(numStudents + " students are enrolled in " + java.getName());

        ITECCourse infoTechConcepts = new ITECCourse("Info Tech Concepts", 1100, 30, "T.3050");
        infoTechConcepts.addStudents("Max");
        infoTechConcepts.addStudents("Nancy");
        infoTechConcepts.addStudents("Orson");

        ArrayList<ITECCourse> classList = new ArrayList<>();
        classList.add(maintenance);
        classList.add(java);
        classList.add(infoTechConcepts);

        for (int i = 0; i < classList.size(); i++) {
            System.out.println(classList.get(i).getName() + " has " +
                    classList.get(i).getRemainingSeats() + " seats remaining.");
        }
    }
}
