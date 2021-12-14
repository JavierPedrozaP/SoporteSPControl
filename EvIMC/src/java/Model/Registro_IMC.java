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

/**
 *
 * @author JPP
 */
public class Registro_IMC extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registro_IMC</title>");            
            out.println("</head>");
            out.println("<body>");
            String Name = request.getParameter("Usuario_Name_IMC");
            double Altura = Double.parseDouble(request.getParameter("Altura"));
            double Peso = Double.parseDouble(request.getParameter("Peso"));
            double IMC = Double.parseDouble(request.getParameter("IMC"));
            String Fecha_y_Hora = request.getParameter("Fecha_y_Hora");
//make user object
           IMC userModelss = new IMC (Name,Altura,Peso,IMC,Fecha_y_Hora);
//create a database model
            IMC_base regUserss = new IMC_base (Conexion.conectar());
            if ((regUserss.IMC_SAVER(userModelss))) {
                out.println("Registrado");
            out.println("<a href=\"javascript:window.history.go(-2);\">Cancelar</a>");
            } else {
                response.sendRedirect("Pruba.jsp");
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
