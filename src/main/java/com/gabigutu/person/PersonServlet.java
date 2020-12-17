package com.gabigutu.person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PersonServlet", value = "/person-servlet")
public class PersonServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setStatus(200);
        PrintWriter printWriter = response.getWriter();
        printWriter.println("It works");

        Person person = new Person("Georgel", 30);
        request.setAttribute("person", person);
        getServletContext().getRequestDispatcher("/person.jsp").forward(request, response);
    }
}
