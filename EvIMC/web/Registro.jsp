<%-- 
    Document   : Registro
    Created on : 6 abr 2021, 21:47:48
    Author     : JPP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset="utf-8">
        <title>Registrot</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css">
        <link href="css/Estilo_Registro.css" rel="stylesheet" type="text/css"/>
        <link href="css/Popup.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

                <form action="Registro" method="post">
                 <div class="wrapper rounded bg-white">
    <div class="h3">Registro</div>
    <div class="form">
        <div class="row">
        <div class="col-md-6 mt-md-0 mt-3"> <label>Nombre Completo</label><input type="text" placeholder="" name="nombre_full" class="form-control" required></div>
        <div class="col-md-6 mt-md-0 mt-3"> <label>Sexo</label> <input type="text" placeholder="" name="sexo" class="form-control" required> </div>
        <div class="col-md-6 mt-md-0 mt-3"> <label>Edad</label><button id="lol" onclick="alertar('Solo se pueden registrar personas mayores de 15 años');"><img src="img/1176.png"width="20px" height="20px"/></button> <input type="text" placeholder="" name="edad" class="form-control" required> </div>
        <div class="col-md-6 mt-md-0 mt-3"> <label>Altura</label> <input type="text" placeholder="" name="Altura" class="form-control" required> </div>
        <div class="col-md-6 mt-md-0 mt-3"> <label>Usuario</label> <input type="text" placeholder="" name="name_user" class="form-control" required> </div>
        <div class="col-md-6 mt-md-0 mt-3"> <label>contrasena</label> <input type="password" placeholder="" name="password" class="form-control" required> </div>
        </div>
        </div>
        <div class="btn btn-primary mt-3"><input type="submit" value="Registro"></div>
        <div class="btn btn-primary mt-3"><input type="button" class="button_active" onclick="location.href='Index.jsp';" value="Cancelar" /></div>
    </div>
</div>
                </form>
<script type="text/javascript">
    function alertar(texto) {
       alert(texto);
    }
</script>
       
    </body>
</html>
