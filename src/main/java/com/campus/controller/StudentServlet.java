package com.campus.controller;

import com.campus.services.StudentService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {
    private final StudentService studentService = new StudentService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Student List</h2>");
        for (String student : studentService.getStudents()) {
            out.println("<p>" + student + "</p>");
        }
        out.println("</body></html>");
    }
}