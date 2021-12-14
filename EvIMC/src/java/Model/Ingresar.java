
package Model;
import Controller.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Ingresar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ingresar</title>");            
            out.println("</head>");
            out.println("<body>");
            String lName = request.getParameter("user_name");
            String lPass = request.getParameter("contrasena");
            
            Login_base db = new Login_base(Conexion.conectar());
            User_login user = db.loglogin(lName,lPass,lName,lName);
            if(user!=null){
             HttpSession session = request.getSession();
             session.setAttribute("loglogin",user);
             response.sendRedirect("Pruba.jsp");
            }else{
            
            out.print("user not found");
                
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
