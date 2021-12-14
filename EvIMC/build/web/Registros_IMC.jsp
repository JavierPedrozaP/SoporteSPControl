<%-- 
    Document   : Registros_IMC
    Created on : 9 abr 2021, 16:11:23
    Author     : JPP
--%>
<%@page import="java.util.List"%>
<%@page import="Controller.*"%>
<% List<IMC> user = (List) session.getAttribute("IMC_login");
    if(user==null){
      response.sendRedirect("index.jsp");
    }
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%for(IMC registro:user){ %>
 <table style="width:100%">  
  <tr>
   Altura <%= registro.getAltura() %>
  </tr>
  <tr>
   Peso <%= registro.getPeso() %>
  </tr>
   <tr>
Total<%= registro.getIMC_Calcular() %>
  </tr>
  <tr>
 Fechayhora <%= registro.getFecha_y_Hora() %>
  </tr>
</table>
 <%}%>
 
 <div class="btn btn-primary mt-3"><input type="button" class="button_active" onclick="location.href='Index.jsp';" value="Cancelar" /></div>
    </body>
</html>
