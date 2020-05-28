import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class DeleteServlet extends HttpServlet { 
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String id=request.getParameter("id");
        int no=Integer.parseInt(id);
        try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
        Statement st = conn.createStatement();
        st.executeUpdate("UPDATE post SET isDeleted = 1 WHERE Post_ID = '"+no+"'");
        request.getRequestDispatcher("admin.jsp").include(request, response); 
        out.println("<script type=\"text/javascript\">");
        out.println("alert('Event Deleted!');");
        out.println("location='admin.jsp';");
        out.println("</script>");
        }
        catch(Exception e){}
    }
}