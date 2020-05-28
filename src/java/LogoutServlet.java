/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hp
 */
public class LogoutServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest request,
         HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");  
    PrintWriter out=response.getWriter();  
              
    request.getRequestDispatcher("index.jsp").include(request, response);  

    HttpSession session=request.getSession();  
    session.invalidate();  
    out.println("<script type=\"text/javascript\">");
    out.println("alert('You are successfully logged out!');");
    out.println("location='index.jsp';");
    out.println("</script>");
    out.close(); 
   }
}
