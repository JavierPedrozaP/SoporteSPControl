<%-- 
    Document   : Pruba
    Created on : 7 abr 2021, 1:30:47
    Author     : JPP
--%>
<%@page import="Controller.*"%>
<% User_login user = (User_login) session.getAttribute("loglogin");
    if(user==null){
        response.sendRedirect("index.jsp");
    }
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css">
        <link href="css/Estilo_Registro.css" rel="stylesheet" type="text/css"/>
        <link href="css/Popup.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
    <div class="wrapper rounded bg-white">
    <div class="h3">Registro</div>
    <div class="form">
        <div class="row">
            <div class="col-md-6 mt-md-0 mt-3"> <label>Nombre Completo</label><input type="text" value="<%= user.getnombre_full() %>" class="form-control" disabled=»disabled» ></div>
        <div class="col-md-6 mt-md-0 mt-3"> <label>Sexo</label> <input type="text" value="<%= user.getsexo() %>" class="form-control" disabled=»disabled» > </div>
        <div class="col-md-6 mt-md-0 mt-3"> <label>Edad</label></button> <input type="text" value="<%= user.getedad() %>"  class="form-control" disabled=»disabled» > </div>
        </div>
    
 
 
 <form action="Cal_IMC.jsp" method="get">
<input type="hidden" type="text" name="IMC" value="<%= user.getUsuario_Name() %>">
<br>
Altura<input type="text" name="altura" value="<%= user.getAltura() %>">
<br>
Peso<input type="text" name="Peso_ind" value="">
<br>
<input type="submit" value="Calcular IMC">
</form>
<form action="Ingresar_IMC" method="post" class="box">
<input type="hidden" type="text" name="ingresar" value="<%= user.getUsuario_Name() %>">

<div class="btn btn-primary mt-3"><input type="submit" value="Cargar los datos de IMC" ></div>
</form>
<div class="btn btn-primary mt-3"><input type="button" class="button_active" onclick="location.href='Index.jsp';" value="Cancelar" /></div>
</div>
</div>  
    </body>
</html>
