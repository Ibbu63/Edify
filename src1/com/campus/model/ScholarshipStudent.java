package com.campus.model;

public class ScholarshipStudent extends Student {

    private double scholarshipPercentage;

    public ScholarshipStudent(int studentId, String studentName, int Age, String department, int[] marks, double scholarshipPercentage) {
        super(studentId, studentName, Age, department, marks);
        this.scholarshipPercentage = scholarshipPercentage;
    }

    //getters and setters
    public double getScholarshipPercentage() {
        return scholarshipPercentage;

    }
    public void setScholarshipPercentage(double scholarshipPercentage) {
        this.scholarshipPercentage = scholarshipPercentage;
    }

    //override
    @Override
    public void studentType() {
        System.out.println("Scholarship Student");
    }
    @Override
    public void displayStudentInfo(boolean showMarks) {
        super.displayStudentInfo(showMarks);
    }
    @Override
    public void eligibleForScholarship() {
        System.out.println("Eligible for Scholarship");
    }

}
