<%-- 
    Document   : Cal_IMC
    Created on : 8 abr 2021, 22:14:35
    Author     : JPP
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="Controller.IMC"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrot</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    
    </head>
    <body>
        
                <h1>Calculando IMC</h1>
     <%
        String altura=request.getParameter("altura");
        String Peso_ind=request.getParameter("Peso_ind");
     %>
     
     <%
        IMC a=new IMC(altura,Peso_ind);
        a.IMC_calcular();
        double IMC_calcular=a.getIMC_Calcular();
        DecimalFormat formato1 = new DecimalFormat("#.000");
       
        %>
                <form action="Registro_IMC" method="post">

                    <input type="text" id="user" name="Usuario_Name_IMC" >
                    <input id="alt" name="Altura"/>
                    <p>Peso</p>
                    <input type="text" placeholder="" name="Peso" id="Peso" required>
                    <p>IMC</p>
                    <input type="text" placeholder="" name="IMC" id="IMC" value="<%=formato1.format(IMC_calcular)%>">
                    <p>Fecha y Hora</p>
                    <input type="datetime-local" name="Fecha_y_Hora">
                   
                    <input type="submit" value="Registro">
                    <a href="javascript:history.back()">Cancelar</a>
<script type="text/javascript">
var url_string = window.location.href; //
var url = new URL(url_string);
var c = url.searchParams.get("IMC");
var p = url.searchParams.get("altura");
var d = url.searchParams.get("Peso_ind");
document.getElementById("user").value = c;
document.getElementById("alt").value = p;
document.getElementById("Peso").value = d;
</script>    
                </form>
    </From
            </div>
        </div>
    </body>
<body>

</body>

</html>
