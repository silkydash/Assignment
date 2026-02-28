package com.example1;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/hobby")
public class Ques16 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String[] hobbies = req.getParameterValues("hobby");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        if(hobbies != null)
            for(String h : hobbies)
                out.println(h + "<br>");
    }
}