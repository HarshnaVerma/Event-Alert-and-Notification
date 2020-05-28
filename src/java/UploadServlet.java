/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
//import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author Hp
 */
@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB
public class UploadServlet extends HttpServlet {
       // database connection settings
    private final String dbURL = "jdbc:mysql://localhost:3306/project";
    private final String dbUser = "root";
    private final String dbPass = "root";
     
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // gets values of text fields
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String uid = null;
        String category = request.getParameter("category");
        String [] audience = request.getParameterValues("intended");
        String intended = String.join(",", audience);
        String title = request.getParameter("title");
        String cdesc = request.getParameter("textarea1");
        String isImp = request.getParameter("isImp");
        String createdon = request.getParameter("createdon");
        String expireon = request.getParameter("expireon");
        String isUpdated = request.getParameter("isUpd");
        String isDeleted = request.getParameter("isDel");
        String filename = null;
        String savepath = null;
        String file = request.getParameter("filename");
        if (file!=null){
        Part part = request.getPart("filename");
        filename = extractFileName(part);
        savepath = "C:\\Users\\Hp\\Documents\\NetBeansProjects\\Event Alerts and Notifications\\web\\uploadedFiles"
                + File.separator + filename;
        File fileSaveDir = new File(savepath);
        System.out.println(savepath);
        part.write(savepath + File.separator);
        }
        if (session != null) {
                       if (session.getAttribute("user") != null) {
                          uid = (String) session.getAttribute("uid");
                      } else {
                          response.sendRedirect("index.jsp");
                       }
                    }
        
        Connection conn = null; // connection to the database
//        String message = null;  // message will be sent back to client
         
        try {
            // connects to the database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
 
            // constructs SQL statement
            String sql = "INSERT INTO post (Category, Intended_Audience, Title, Description, Filename, Attachment, Created_On,Expiry_Date ,isImportant,User_ID, isUpdated, isDeleted) values (?, ?, ?, ?, ?, ?, ?, ?, ?,'"+uid+"', 0, 0)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, category);
            statement.setString(2, intended);
            statement.setString(3, title);
            statement.setString(4, cdesc);
            statement.setString(5, filename);
            statement.setString(6, savepath);
            statement.setString(7, createdon);
            statement.setString(8, expireon);
            statement.setString(9, isImp);
             
            
            // sends the statement to the database server
            int row = statement.executeUpdate();
            if (row > 0) {
                request.getRequestDispatcher("admin.jsp").include(request, response); 
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Upload Successful!');");
                out.println("location='admin.jsp';");
                out.println("</script>");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                // closes the database connection
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String [] items = contentDisp.split(";");
        for (String s : items){
            if (s.trim().startsWith("filename")){
                return s.substring(s.indexOf("=")+2, s.length()-1);
            }
        }
        return "";
    }

}
