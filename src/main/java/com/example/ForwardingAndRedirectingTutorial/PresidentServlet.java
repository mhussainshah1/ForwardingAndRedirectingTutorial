package com.example.ForwardingAndRedirectingTutorial;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

//send a request to another spot (servlet/html/jsp)

@WebServlet(name = "PresidentServlet", urlPatterns = "/presidents")
public class PresidentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //forwarding- forward same request
//        getServletContext().getRequestDispatcher("/presidents.jsp").forward(request,response);
//        getServletContext().getRequestDispatcher("/banana.html").forward(request,response);
//        getServletContext().getRequestDispatcher("/secondary").forward(request,response);

        //Redirecting- sent a new response
        response.sendRedirect("https://www.google.com");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
