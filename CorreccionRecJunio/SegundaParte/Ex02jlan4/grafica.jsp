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
      }
      
      table {
        border: 2px solid gray;
        border-collapse: collapse;
      }
      
      td {
        border: 1px solid gray;
        text-align: center;
        padding: 2px;
        
      }
    </style>
    <script src="js/Chart.js"></script>
  </head>
  <body>
    <h1 style="text-align: center;">Resultados electorales</h1>

    <div class="contenedor">
      <canvas id="pie-chart" height="100%"></canvas>
    </div>

    <div class="contenedor">

      <table>
        <thead>
          <tr>
            <th></th>
            <th>PP</th>
            <th>PSOE</th>
            <th>Ciudadanos</th>
            <th>Vox</th>
            <th>PACMA</th>
            <th>Podemos</th>
            <th>TOTAL</th>
          </tr>

        </thead>
        <tbody>
          <tr>
            <th>Votos</th>
            <td><% out.print(request.getParameter("PP")) ;%></td>
            <td><% out.print(request.getParameter("PSOE")) ;%></td>
            <td><% out.print(request.getParameter("Ciudadanos")) ;%></td>
            <td><% out.print(request.getParameter("Vox")) ;%></td>
            <td><% out.print(request.getParameter("PACMA")) ;%></td>
            <td><% out.print(request.getParameter("Podemos")) ;%></td>
            <td><% int total;
                           total = Integer.parseInt(request.getParameter("PP")) + Integer.parseInt(request.getParameter("PSOE")) + Integer.parseInt(request.getParameter("Ciudadanos")) + Integer.parseInt(request.getParameter("Vox")) + Integer.parseInt(request.getParameter("PACMA")) + Integer.parseInt(request.getParameter("Podemos"));
              out.print(total);%></td>
          </tr>
          <tr>
            <th>Porcentaje</th>
            <td><%
                    double porcentajePP;
                    porcentajePP = Double.parseDouble(request.getParameter("PP")) * 100 / total ;
                    out.print(porcentajePP);
                %></td>
            <td><%
                    double porcentajePSOE;
                    porcentajePSOE = Double.parseDouble(request.getParameter("PSOE")) * 100 / total ;
                    out.print(porcentajePSOE);
                %></td>
            <td><%
                    double porcentajeCiudadanos;
                    porcentajeCiudadanos = Double.parseDouble(request.getParameter("Ciudadanos")) * 100 / total ;
                    out.print(porcentajeCiudadanos);
                %></td>
            <td><%
                    double porcentajeVox;
                    porcentajeVox = Double.parseDouble(request.getParameter("Vox")) * 100 / total ;
                    out.print(porcentajeVox);
                %></td>
            <td><%
                    double porcentajePACMA;
                    porcentajePACMA = Double.parseDouble(request.getParameter("PACMA")) * 100 / total ;
                    out.print(porcentajePACMA);
                %></td>
            <td><%
                    double porcentajePodemos;
                    porcentajePodemos = Double.parseDouble(request.getParameter("Podemos")) * 100 / total ;
                    out.print(porcentajePodemos);
                %></td>
            <td><%
                    double totalPorcentajes;
                    totalPorcentajes = porcentajePP + porcentajePSOE + porcentajeCiudadanos + porcentajeVox + porcentajePACMA + porcentajePodemos;
                    out.print(totalPorcentajes);
                %></td>
          </tr>
        </tbody>
      </table>

    </div>
    
  </div>

  <script>
    new Chart(document.getElementById("pie-chart"), {
      type: 'pie',
      data: {
        labels: ["PP", "PSOE", "Ciudadanos", "Vox", "PACMA", "Podemos"],
        datasets: [{
            backgroundColor: ["#0055A7", "#FF2527", "#FE6139", "#66BC29", "#FEDB44", "#6A3468"],
            data: [<%out.print(request.getParameter("PP"));%> , <%out.print(request.getParameter("PSOE"));%> , <%out.print(request.getParameter("Ciudadanos"));%>, <%out.print(request.getParameter("Vox"));%>, <%out.print(request.getParameter("PACMA"));%>, <%out.print(request.getParameter("Podemos"));%>]
          }]
      }
    });
  </script>

</body>
</html>
