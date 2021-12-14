/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Registro extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");     
            out.println("<title>Servlet Registro</title>");            
            out.println("</head>");
            out.println("<body>");
            String Name = request.getParameter("name_user");
            String Pass = request.getParameter("password");
            String Nombre = request.getParameter("nombre_full");
            String Sexo = request.getParameter("sexo");
            int Edad = Integer.parseInt(request.getParameter("edad"));
            double Altura = Double.parseDouble(request.getParameter("Altura"));
//make user object
            User_login userModel = new User_login(Name, Pass);
            Usuario userModels = new Usuario(Name,Nombre,Sexo,Edad);
            IMC userModelss = new IMC (Name,Altura);
//create a database model
            Login_base regUser = new Login_base(Conexion.conectar());
            Usuario_base regUsers = new Usuario_base (Conexion.conectar());
            IMC_base regUserss = new IMC_base (Conexion.conectar());
            if ((regUser.saverlogin(userModel))&&(regUsers.saver(userModels))&&(regUserss.imc_saver(userModelss))) {
                response.sendRedirect("Index.jsp");
            } else {
                response.sendRedirect("Fallo.jsp");
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
    }// </editor-fold>

}
