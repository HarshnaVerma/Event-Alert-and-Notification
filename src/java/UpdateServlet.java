import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;


@WebServlet("/UpdateServlet")
@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB

public class UpdateServlet extends HttpServlet {
    String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/project";
        String user = "root";
        String psw = "root";
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String id = request.getParameter("id");
String User_Id=request.getParameter("User_Id");
String Title=request.getParameter("title");
String Category=request.getParameter("category");
String Intended_Audience=request.getParameter("intended");
String Description=request.getParameter("textarea1");
String Expiry_Date=request.getParameter("expireon");
String isImportant=request.getParameter("isImp");
String filename = null;
String savepath = null;
String file=request.getParameter("file");
if (file!=null){
Part part = request.getPart("file");
filename = extractFileName(part);
savepath = "C:\\Users\\Hp\\Documents\\NetBeansProjects\\Event Alerts and Notifications\\web\\uploadedFiles"
        + File.separator + filename;
File fileSaveDir = new File(savepath);
System.out.println(savepath);
part.write(savepath + File.separator);
}
if(User_Id != null)
{
Connection con = null;
PreparedStatement ps = null;
int post_Id = Integer.parseInt(id);
try
{
    
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);

String sql="Update post set Title=?,Category=?,Intended_Audience=?,Description=?,Filename=?, Attachment=?,Expiry_Date=?,isImportant=?,isUpdated=1 where Post_ID="+id;
ps = con.prepareStatement(sql);
ps.setString(1, Title);
ps.setString(2, Category);
ps.setString(3, Intended_Audience);
ps.setString(4, Description);
ps.setString(5, filename);
ps.setString(6, savepath);
ps.setString(7, Expiry_Date);
ps.setString(8, isImportant);
int i = ps.executeUpdate();
if(i > 0)
{
request.getRequestDispatcher("admin.jsp").include(request, response); 
out.println("<script type=\"text/javascript\">");
out.println("alert('Event Updated!');");
out.println("location='admin.jsp';");
out.println("</script>");
}
else
{
out.print("There is a problem in updating Record.");
}
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}           catch (ClassNotFoundException ex) {
                Logger.getLogger(UpdateServlet.class.getName()).log(Level.SEVERE, null, ex);
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
