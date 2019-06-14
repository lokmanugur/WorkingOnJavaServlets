/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import javax.servlet.*;

/**
 *
 * @author Admin
 */
public class HelloServlet extends GenericServlet {

    @Override
    public void service(ServletRequest sr, ServletResponse srr) throws ServletException, IOException {
        srr.setContentType("text/html");
        PrintWriter pw = srr.getWriter();
        pw.println("<B>Hello");
        pw.close();
    }   
}
