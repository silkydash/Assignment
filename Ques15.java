package com.example1;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/employee")
public class Ques15 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<table border='1'>");
        out.println("<tr><th>Name</th><th>Salary</th><th>Department</th></tr>");
        out.println("<tr>");
        out.println("<td>"+req.getParameter("name")+"</td>");
        out.println("<td>"+req.getParameter("salary")+"</td>");
        out.println("<td>"+req.getParameter("dept")+"</td>");
        out.println("</tr></table>");
    }
}