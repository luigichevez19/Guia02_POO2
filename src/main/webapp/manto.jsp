<%-- 
    Document   : manto
    Created on : ago 27, 2017, 12:59:20 p.m.
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link type='text/css' rel='stylesheet' href='css/icons.css'/>
      <!-- Import materialize.css -->
    <link type='text/css' rel='stylesheet' href='webjars/materialize/0.98.0/dist/css/materialize.min.css'  media='screen,projection'/>
    <!-- Let browser know website is optimized for mobile -->
    <meta name='viewport' content='width=device-width, initial-scale=1.0'/>
     <script type="text/javascript" src="webjars/jquery/3.2.1/dist/jquery.min.js"></script>
    <script type='text/javascript' src='webjars/materialize/0.98.0/dist/js/jquery.min.js'></script>
    <script type='text/javascript' src='webjars/materialize/0.98.0/dist/js/materialize.min.js'></script>
        <title>Mantenimiento Pers</title>
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
         <div class="  container row">
    <form class="col s12">
      <div class="row">
        <div class="input-field col s6">
          <i class="material-icons prefix">account_circle</i>
          <input id="nomb" type="text" class="validate">
          <label for="nomb">Nombre Personas</label>
        </div>
        <div class="input-field col s6">
          <i class="material-icons prefix">account_circle</i>
          <input id="apel" type="tel" class="validate">
          <label for="apel">Apellido Pers</label>
        </div>
         
          <div class="input-field col s6">
          <i class="material-icons prefix">account_circle</i>
          <input id="dui" type="text" class="validate">
          <label for="dui">Dui</label>
        </div>
          <div class="input-field col s6">
          <i class="material-icons prefix">account_circle</i>
          <input id="nit" type="text" class="validate">
          <label for="nit">Nit</label>
        </div>
          <div class="input-field col s6">
          <i class="material-icons prefix">account_circle</i>
          <input id="Email" type="text" class="validate">
          <label for="Email">Nombre Personas</label>
        </div>
          <div class="input-field col s6">
          <i class="material-icons prefix">account_circle</i>
          <input id="sang" type="text" class="validate">
          <label for="sang">Tipo Sangre</label>
        </div>
           <div class="input-field col s6">
              <h6>Edad</h6>
          <i class="material-icons prefix">account_circle</i>
          <input id="fecha" type="date" class="validate">
        </div>
            <div class="input-field col s6">
                <h6>Fecha Alta</h6>
          <i class="material-icons prefix">account_circle</i>
          <input id="fechaA" type="date" class="validate">
        </div>
            <div class="input-field col s6">
                <h6>Fecha Baja</h6>
          <i class="material-icons prefix">account_circle</i>
          <input id="fechaB" type="date" class="validate">
        </div>
          <div class="input-field col s6">
    <select>
      <option value="" disabled selected>Seleccione su genero</option>
      <option value="M">Masculino</option>
      <option value="F">Femenino</option>
    </select>
    <label>Genero</label>
  </div>
      </div>
        <input type="submit" class="btn blue-grey col s3 offset-s2" name="btnManto" value=" Guardar"/>  
         <input type="submit" class="btn blue-grey col s3 offset-s2" name="btnManto" value="Modificar"/>  
    </form>
  </div>
    </body>
    <script>
        
          $(document).ready(function() {
    $('select').material_select();
  });
    </script>
</html>
