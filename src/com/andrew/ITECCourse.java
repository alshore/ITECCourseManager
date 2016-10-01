package com.andrew;

import java.util.ArrayList;


public class ITECCourse {

    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private String room;

    public int getCode() {
        return code;
    }
    public void setCode(int newCode) {
        this.code = newCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public String getRoom() {
        return room;
    }
    public void setRoom(String newRoom) {
        this.room = newRoom;
    }

    ITECCourse(String courseName, int courseCode, int courseMaxStudents, String courseRoom) {

        this.name = courseName;
        this.code = courseCode;
        this.maxStudents = courseMaxStudents;
        this.room = courseRoom;
        this.students = new ArrayList<>();
    }
    public void addStudents(String studentName) {
        if (students.size() == maxStudents) {
            System.out.println("Sorry! The class has reached capacity.");
        }
        else {
            if (students == null) {
                students = new ArrayList<String>();
            }
            students.add(studentName);
        }
    }

    public int getNumberStudents() {
        if (students != null) {
            return students.size();
        }
        return 0;
    }

    public void removeStudents(String studentName) {
        if (students != null) {
            students.remove(studentName);
        }
    }
    public int getRemainingSeats() {
        return this.maxStudents - this.students.size();
    }
}
