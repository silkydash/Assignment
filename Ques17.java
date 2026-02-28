package com.example1;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/validate")
public class Ques17 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        if(name == null || name.isEmpty())
            out.println("<h3 style='color:red'>Name cannot be empty</h3>");
        else
            out.println("Welcome " + name);
    }
}