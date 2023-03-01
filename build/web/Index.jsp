<%-- 
    Document   : PrimeraJSP
    Created on : 27/02/2023, 10:26:26 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FORMULARIO</title>
    </head>
    <body>
        <h1>FORMULARIO</h1>
     <form action="Servletito" method="POST">
            <p>Cuál es la gravedad en la tierra? <input type="text"name="respuesta" <br></p>    
            <input type="submit" value="Enviar respuesta">  
        </form>
    </body>
</html>
