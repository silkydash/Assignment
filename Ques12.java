package com.example1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/student")
public class Ques12 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String course = request.getParameter("course");
        String gender = request.getParameter("gender");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Student Registration Details</h2>");
        out.println("<hr>");
        out.println("<b>Name:</b> " + name + "<br>");
        out.println("<b>Age:</b> " + age + "<br>");
        out.println("<b>Course:</b> " + course + "<br>");
        out.println("<b>Gender:</b> " + gender);
    }
}