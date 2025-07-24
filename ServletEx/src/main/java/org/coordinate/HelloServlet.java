package org.coordinate;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Request received, in service");

        response.setContentType("text/html");

        PrintWriter printwriter=response.getWriter();
        printwriter.println("<h2><b>Hello World</b></h2>");

//        response.setContentType("text/plain");
        response.getWriter().println("Hello World");
    }
}
