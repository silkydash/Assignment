package com.example1;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/TempServlet")
public class Ques3 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        double c = Double.parseDouble(request.getParameter("c"));
        double f = (c * 9/5) + 32;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Fahrenheit = " + f);
    }
}