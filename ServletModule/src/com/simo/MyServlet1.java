package com.simo;

import com.van.count.ejb.Counter;

import javax.ejb.EJB;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by hvpham on 12/8/2015.
 */
@javax.servlet.annotation.WebServlet(name = "MyServlet1", urlPatterns = {"stateful"})
public class MyServlet1 extends javax.servlet.http.HttpServlet {

    @EJB(beanName = "statefullCounter")
    Counter bean1;



    @EJB(beanName = "statelessCounter")
    Counter bean2;

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // Set response content type
        bean1.increment();
        bean2.increment();
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1> Stateful: " + bean1.increment() + "</h1><br/>");
        out.println("<h1> Stateless: " + bean2.increment() + "</h1>");
    }
}
