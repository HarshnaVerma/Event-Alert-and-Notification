/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hp
 */
public class FacultyServlet extends HttpServlet {
    public static final String CONTENT_TYPE = "text/html; charset=UTF-8";
    
    private static Connection con;
    private String psw;
    private String username;
    private static final String database_url = "jdbc:mysql://localhost:3306/project";
    private static final String db_user = "root";
    private static final String db_psw = "root";
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType(CONTENT_TYPE);
            PrintWriter out = response.getWriter();
            
            username = request.getParameter("username");
            psw = request.getParameter("psw");
            
            boolean result = checkPassword(username, psw, request);
            System.out.println(result);
            
            
            if(result == true){
//                HttpSession session = request.getSession();
//                session.setAttribute("user", username);
                response.sendRedirect("studentdash.jsp");
            }
            else {
                request.getRequestDispatcher("index.jsp").include(request, response); 
                out.println("<script type=\"text/javascript\">");
                out.println("alert('User or Password incorrect');");
                out.println("location='index.jsp';");
                out.println("</script>");
//                out.println("<html><head></head><body onload=\"alert('Invalid Username or Password')\"></body></html>");
//                response.sendRedirect("index.jsp");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FacultyServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    protected boolean checkPassword(String username, String psw, HttpServletRequest request) throws SQLException {
            String correctPassword = null;
            try{
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection(database_url,db_user,db_psw);
                    con.setAutoCommit(true);
            }   
                catch (Exception e) {
                    System.out.println("Connection failed: " + e.toString());
                }
                
                Statement st = con.createStatement();
                st.executeQuery("select Password, User_Name, User_ID from user where User_ID = '"+username+"'");
                ResultSet rs = st.getResultSet();

                while (rs.next()){
                    correctPassword = rs.getString(1);
                    String name =rs.getString(2);
                    String uid = rs.getString(3);
                    HttpSession session = request.getSession();
                    session.setAttribute("user", name);
                    session.setAttribute("uid", uid);
                }
                st.close();
                
                if (correctPassword.equals(psw)){
                    return true;
                }
                else{
                    return false;
                }
                
              }
            catch(Exception e){
                System.out.println("Exception in"
                        + " verifyPassword()=" + e.toString());
                return false;
            }
    }


}
