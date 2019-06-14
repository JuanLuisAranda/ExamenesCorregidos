
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Resultados electorales</title>
    <style>
      .contenedor {
        display: flex;
        width: 100%;
        justify-content: center;
        flex-direction: column;
      }

      .partido, .boton {
        text-align: center;
        padding: 1em;
      }

      .error {
        text-align: center;
        color: red;
      }
    </style>
  </head>
  <body>

    <h1 style="text-align: center;">Resultados electorales</h1>
    <p style="text-align: center;">Introduzca el número de votos de los partidos políticos.</p>
    <form action="grafica.jsp" method="POST">

      <div class="contenedor">
        <div class="partido">
          PP <input type="number" name="PP">
        </div>
        <div class="partido">
          PSOE <input type="number" name="PSOE">
        </div>

        <div class="partido">
          Ciudadanos <input type="number" name="Ciudadanos">
        </div>

        <div class="partido">
          Vox <input type="number" name="Vox">
        </div>

        <div class="partido">
          PACMA <input type="number" name="PACMA">
        </div>

        <div class="partido">
          Podemos <input type="number" name="Podemos">
        </div>

        <div class="boton">
          <input type="submit" value="Ver gráfica">
        </div>
      </div>

    </form>

  </body>
</html>
