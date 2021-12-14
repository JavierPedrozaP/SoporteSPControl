<%-- 
    Document   : Index
    Created on : 6 abr 2021, 19:41:52
    Author     : JPP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesion</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
        <link href="css/estilo_index.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
     <div class="container">
    <div class="row">
        <div class="col-md-6">
            <div class="card">
                <form action="Ingresar" method="post" class="box">
                    <h1>Inicio de Sesion</h1> 
                    <input type="text" name="user_name" placeholder="Username" required> 
                    <input type="password" name="contrasena" placeholder="Password" required> 
                    <input type="submit" value="Login" >
                    
                    <a href="Registro.jsp">Create New Account</a>
                </form>
            </div>
        </div>
    </div>
</div>
    </body>
</html>
