package com.example1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/method")
public class Ques10 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String method = request.getMethod();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("HTTP Method Used: " + method);
    }
}