package com.example1;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/feedback")
public class Ques14 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h3>Thank you " + req.getParameter("name") + "</h3>");
        out.println("Comment: " + req.getParameter("comment"));
    }
}