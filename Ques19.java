package com.example1;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/area")
public class Ques19 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int l = Integer.parseInt(req.getParameter("length"));
        int b = Integer.parseInt(req.getParameter("breadth"));

        res.setContentType("text/html");
        res.getWriter().println("Area: " + (l*b));
    }
}