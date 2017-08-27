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
         <nav>
    <div class="nav-wrapper red">
        <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="index.jsp">Envio Correos</a></li>
        <li><a href="manto.jsp">Mantenimiento</a></li>
      </ul>
    </div>
  </nav>
        
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
    <label>Para</label>
  </div>
     <div class="input-field col s12">
         <select name="usuarios" id="usuarios" multiple>
      <option value="" disabled selected>Seleccione los usuarios</option>
      <%for (Pers temp: new CtrlPers().ver()){%>
      <option value="<%=temp.getEmail()%>"><%=temp.getNomb()%> <%=temp.getApel()%></option>
    <%}%>
    </select>
    <label>CC</label>
  </div>
     <div class="input-field col s12">
         <select name="usuarios" id="usuarios" multiple>
      <option value="" disabled selected>Seleccione los usuarios</option>
      <%for (Pers temp: new CtrlPers().ver()){%>
      <option value="<%=temp.getEmail()%>"><%=temp.getNomb()%> <%=temp.getApel()%></option>
    <%}%>
    </select>
    <label>CCO</label>
  </div>
     <div class="row">
        <div class="input-field col s4 m6 l12">
          <i class="material-icons prefix">account_circle</i>
          <input id="icon_prefix" name="asunto" type="text" class="validate">
          <label for="icon_prefix">Asunto</label>
        </div>
     <div class="row">
        <div class="input-field col s4 m6 l12">
          <i class="material-icons prefix">mode_edit</i>
          <textarea id="icon_prefix2" name="mensaje" class="materialize-textarea"></textarea>
          <label for="icon_prefix2">Mensaje</label>
        </div>
      </div>
     <div class="file-field input-field">
      <div class="btn">
        <span>File</span>
        <input type="file">
      </div>
      <div class="file-path-wrapper">
        <input class="file-path validate" type="text">
      </div>
    </div>
   <input type="submit" class="btn blue-grey col s3 offset-s2" name="btnEnviar" value="Enviar"/>   
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
