package com.mycompany.myapp.warmodule.servlet;
 
import com.mycompany.myapp.warmodule.App;
 
import java.io.IOException;
 
public class TimeServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    }
 
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        App app = new App();
        response.getWriter().println(app.retrieveTime());
    }
}