package com.campus.service;

import com.campus.model.Student;

public class StudentService {
    // calculate total marks of student
    public int calculateTotalMarks(Student student) {
        if (student == null || student.getMarks() == null) {
            return 0;
        }

        int total = 0;
        for (int mark : student.getMarks()) {
            total += mark;
        }
        return total;
    }

    // calculate total marks from an array
    public int calculateTotalMarks(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0;
        }

        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // calculate average marks of student
    public double calculateAverageMarks(Student student) {
        if (student == null || student.getMarks() == null || student.getMarks().length == 0) {
            return 0.0;
        }

        int total = calculateTotalMarks(student.getMarks());
        return (double) total / student.getMarks().length;
    }

    // calculate average marks from an array
    public double calculateAverageMarks(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        int total = calculateTotalMarks(marks);
        return (double) total / marks.length;
    }

    // find maximum marks of student
    public int findMaxmarks(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0;
        }

        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    // find minimum marks of student
    public int findMinmarks(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0;
        }

        int min = marks[0];
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    // calculate grade
    public char calculateGrade(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 'F';
        }

        double average = calculateAverageMarks(marks);
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // pass or fail using student object
    public String passOrFail(Student student) {
        if (student == null || student.getMarks() == null || student.getMarks().length == 0) {
            return "Fail";
        }

        double average = calculateAverageMarks(student);
        return average >= 40 ? "Pass" : "Fail";
    }

    // pass or fail using marks array
    public String passOrFail(int[] marks) {
        if (marks == null || marks.length == 0) {
            return "Fail";
        }
        int average = (int) calculateAverageMarks(marks);
        if (average >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    //display report card
    public void displayReportCard(Student student) {
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("total Marks: " + calculateTotalMarks(student));
        System.out.println("Average Marks: " + calculateAverageMarks(student));
        System.out.println("Maximum Marks: " + findMaxmarks(student.getMarks()));
        System.out.println("Minimum Marks: " + findMinmarks(student.getMarks()));
        System.out.println("Grade: " + calculateGrade(student.getMarks()));
        System.out.println("Result: " + passOrFail(student));
    }
}