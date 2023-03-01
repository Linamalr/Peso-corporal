<%-- 
    Document   : nasajsp
    Created on : 1/03/2023, 11:53:25 AM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <script> type="text/javascript">
             function convertir(){
                 var valor = parseFloat(document.getElementById("valor").value);
                 var resultado=0;
                 var mercurio=3.7;
                 if(document.getElementById("uno").checked){
                     resultado=valor*mercurio;
                     alert("El peso es: kilogramos"+resultado);
                 }
             }       
            
        </script>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor</title>
        
    </head>
    <body>
        <h3>CONVERTIDOR DE PESO </h3>
        <form class="Formulario">
            <p>Seleccionar Planeta a Convertir peso:</p>
            <input type="radio"name="Cambio"id="uno">MERCURIO
            <input type="radio"name="Convertir"id="dos">VENUS
            <input type="radio"name="Convertir"id="cuatro">JUPITER
            <input type="radio"name="Convertir"id="cinco">SATURNO
            <input type="radio"name="Convertir"id="seis">URANO
            <input type="radio"name="Convertir"id="siete">NEPTUNO
            <input type="radio"name="Convertir"id="ocho">PLUTON
            <p>Ingrese Peso:</p>
            <input type="number"id="valor" min="1"max="10000">
            <input type="button"id="Convertidor" value="Convertir"onClick="convertir()">
        </form>
                
    </body>
</html>
