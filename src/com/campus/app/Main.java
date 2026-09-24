package com.campus.app;
import com.campus.model.Student;
import com.campus.service.StudentService;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //input from user
        System.out.println("Enter the Student id:");
        int id=sc.nextInt();
        System.out.println("Enter the Student name:");
        String name=sc.next();
        System.out.println("Enter the Student Age:");
        int age=sc.nextInt();
        System.out.println("Enter the Student department:");
        String department=sc.next();
        System.out.println("Number of subjects:");
        int n=sc.nextInt();
        int[] marks=new int[n];
        System.out.println("Enter the marks:" +n+"subjects");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
            sc.nextLine();
        }
        Student student=new Student(id,name,age,department,marks);
        student.displayStudentInfo(true);
        StudentService studentService=new StudentService();
        studentService.displayReportCard(student);
        sc.close();
    }
}