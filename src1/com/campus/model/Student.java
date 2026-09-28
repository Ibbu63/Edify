package com.campus.model;

import com.campus.contract.StudentOperations;

public class Student implements StudentOperations {
    //encapsulation
    private  int studentId;
    private String studentName;
    private int Age;
    private String department;
    private int[] marks;


    //static variable to keep track of the number of students
    static int StudentCount=0;

    //default constructor
    public Student() {
        StudentCount++;
    }

    //parameterized constructor
    public Student(int studentId, String studentName, int Age, String department, int[] marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.Age = Age;
        this.department = department;
        this.marks = marks;
        StudentCount++;
    }

    //getter
    public int getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return Age;
    }

    public String getDepartment() {
        return department;
    }

    public int[] getMarks() {
        return marks;
    }

    //setter
    public void setStudentId(int studentId) {
       this.studentId = studentId;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // methods
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + Age);
        System.out.println("Department: " + department);
    }

    public void displayStudentInfo(boolean showMarks) {
        displayStudentInfo();
        if (showMarks) {
            if (marks != null) {
                System.out.println("Marks: " + java.util.Arrays.toString(marks));
            } else {
                System.out.println("Marks: []");
            }
        }
    }

    @Override
    public void studentType() {
        System.out.println("Regular Student");
    }

    @Override
    public void eligibleForScholarship() {
        System.out.println("Not eligible for scholarship");
    }

    // static method belonging to the class rather than an object of the class
    public static void displayStudentCount() {
        System.out.println("Total number of students: " + StudentCount);
    }
}