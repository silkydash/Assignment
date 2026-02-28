package com.example1;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/login")
public class Ques11 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String u = req.getParameter("username");
        String p = req.getParameter("password");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        if(u.equals("sruti") && p.equals("123456")) {
            out.println("<h2>Login Successful</h2>");
        } else {
            out.println("<h2 style='color:red'>Invalid Login</h2>");
        }
    }
}