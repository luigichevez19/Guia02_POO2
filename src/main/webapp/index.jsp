<%@page import="com.sv.udb.modelo.Pers"%>
<%@page import="com.sv.udb.controlador.CtrlPers"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <!-- Import Google Icon Font -->
    <link type='text/css' rel='stylesheet' href='css/icons.css'/>
      <!-- Import materialize.css -->
    <link type='text/css' rel='stylesheet' href='webjars/materialize/0.98.0/dist/css/materialize.min.css'  media='screen,projection'/>
    <!-- Let browser know website is optimized for mobile -->
    <meta name='viewport' content='width=device-width, initial-scale=1.0'/>
     <script type="text/javascript" src="webjars/jquery/3.2.1/dist/jquery.min.js"></script>
    <script type='text/javascript' src='webjars/materialize/0.98.0/dist/js/jquery.min.js'></script>
    <script type='text/javascript' src='webjars/materialize/0.98.0/dist/js/materialize.min.js'></script>
        <title>Personas</title>
    </head>
    
    <body>
      <div class="container row">
    <form class="col s12" method="POST" action="Llamada" name="Demo">
      <div class="row">
     <div class="input-field col s12">
         <select name="usuarios" id="usuarios" multiple>
      <option value="" disabled selected>Seleccione los usuarios</option>
      <%for (Pers temp: new CtrlPers().ver()){%>
      <option value="<%=temp.getEmail()%>"><%=temp.getNomb()%> <%=temp.getApel()%></option>
    <%}%>
    </select>
    <label>Usuarios con correos</label>
  </div>
   <input type="submit" value="Enviar datos!" name="btnEnviar"  value="Enviar" > 
      </div>
    </form>
  </div>
    </body>
    <script>
         $(document).ready(function() {
    $('select').material_select();
  });
    </script>
</html>
