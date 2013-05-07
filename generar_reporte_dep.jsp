<%@ page import ="java.util.*,com.modelo.estructuras.*" %>

<%@ page import ="java.util.*;" %>

<% if(session.getAttribute("departamento")!= null){%>
<head>
<title>Bienvenido Jefe Departamento</title>

<style>
.latabla{font-family: Times new Roman; font-color: #ffffff; font-size:11px;font-weight:bold; onmouseover = "#403f81"}

#banner{width:752; height:98; position:absolute; background-image:url(images/top.jpg); top:0; left:5;}
#log_off{width:100; height:30; position:absolute; top:100; left:665;}
#centro{width:752; height:470; position:absolute; top:122; left:5;}
#centro_izq{width:190; height:470; position:absolute; top:-5; left:-3; font-family:Tahoma; font-weight:bold; font-size:10px; color:#9F0D10; text-decoration:none;}
#fondoAgregar{width:578; height:20; position:absolute; top:0; left:180; background-color: #403f81;}
#centro_der{width:578; height:450; position:absolute; top:25; left:180;}

.facultad{width:150; height:20; position:absolute; top:15; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}
.input_fac{width:250; height:20; position:absolute; top:15; left:150;}
.escuela{width:250; height:20; position:absolute; top:40; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}
.input_esc{width:250; height:20; position:absolute; top:40; left:150;}
.departamento{width:250; height:20; position:absolute; top:65; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}
.input_dep{width:250; height:20; position:absolute; top:65; left:150;}
.seccion{width:250; height:20; position:absolute; top:90; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}
.input_sec{width:250; height:20; position:absolute; top:90; left:150;}
.id_extension{width:250; height:20; position:absolute; top:115; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}
.input_id_ext{width:250; height:20; position:absolute; top:115; left:150;}
.id_persona{width:250; height:20; position:absolute; top:140; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}
.input_id_per{width:250; height:20; position:absolute; top:140; left:150;}
.condicion_linea{width:250; height:20; position:absolute; top:165; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}
.input_cond_linea{width:250; height:20; position:absolute; top:165; left:150;}
.uso_linea{width:250; height:20; position:absolute; top:190; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}
.input_uso_linea{width:250; height:20; position:absolute; top:190; left:150;}
.tipo_puerto{width:250; height:20; position:absolute; top:215; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}
.input_tipo_puerto{width:250; height:20; position:absolute; top:215; left:150;}
.tipo_cable{width:250; height:20; position:absolute; top:240; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}
.input_cable{width:250; height:20; position:absolute; top:240; left:150;}
.cable_par{width:250; height:20; position:absolute; top:265; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}
.input_par{width:250; height:20; position:absolute; top:265; left:150;}
.id_equipo{width:250; height:20; position:absolute; top:290; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}
.input_id_equipo{width:250; height:20; position:absolute; top:290; left:150;}
.ubicacion_puerto{width:250; height:20; position:absolute; top:315; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}
.input_ubicacion_puerto{width:250; height:20; position:absolute; top:315; left:150;}
.ubicacion_fisica{width:250; height:20; position:absolute; top:340; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}
.input_ubicacion_fisica{width:250; height:20; position:absolute; top:340; left:150;}
.input_agregar_extension{width:70; height:25; position:absolute; top:100; left:400; font-family: Times new Roman; color: #7cb1c8; font-size:14px; font-weight:bold; border-color:#000000;}
.input_limpiar{width:70; height:25; position:absolute; top:200; left:400; font-family: Times new Roman; color: #7cb1c8; font-size:14px; font-weight:bold; border-color:#000000;}


.cap{font-family:Tahoma; font-weight:bold; font-size:11px; color:#9F0D10;}
.txt{font-family:Tahoma; font-weight:regular; font-size:11px; color:#000000; padding-top:5px;padding-left:15px;padding-right:15px;}
.menu{font-family:Tahoma; font-weight:bold; font-size:10px; color:#9F0D10; text-decoration:none;}
.footer{font-family:Tahoma;font-size:11px; color:#9e0c0f;}
.lefttable{font-family:Tahoma; font-weight:bold; font-size:11px; color:#ffffff;padding-left:15px;}
.inbox{font-family:Tahoma; font-weight:bold; font-size:11px; color:#9F0D10;}
.txttable{font-family:Tahoma; font-weight:regular; font-size:11px; color:#000000;padding-left:15px;}
.opciones{font-family:Tahoma; font-weight:regular; font-size:11px; color:#000000;padding-left:15px;}

.txttable1{font-family:Tahoma; font-weight:bold; font-size:11px; color:#403f81;padding-left:15px;}
.headerAgregar{color: #ffffff; font-weight: bold; font-size: 8pt; font-family:Tahoma;}
.botones{background-color: #dddddd; color: #403f81; font-weight: bold; font-size: 8pt; font-family:Tahoma;}


.seleccionar {font-size: 11px; font-family:Tahoma; font-weight:bold; color:#000000;}
.seleccionar1 {font-size: 12px; color:#403f81;}
</style>
</head>
<script type="text/javascript" src="lib/prototype.js"></script>
<script type="text/javascript" src="src/builder.js"></script>
<script type="text/javascript" src="src/controls.js"></script>
<script type="text/javascript" src="src/dragdrop.js"></script>

<script type="text/javascript" src="src/effects.js"></script>
<script type="text/javascript" src="src/scriptaculous.js"></script>
<script type="text/javascript" src="src/slider.js"></script>
<script type="text/javascript" src="src/sound.js"></script>
<script type="text/javascript" src="src/unittest.js"></script>

<script>
function sobre_enlace(columna) {
	x=document.getElementById(columna);
	x.style.color = "#403f81";
}
function fuera_enlace(columna) {
	x=document.getElementById(columna);
	x.style.color = "#ffffff";
}
function procesarDatos1(form){
	document.getElementById("msj").style.visibility="visible";
	var docente_elegido=document.getElementById("docentes").options[document.getElementById("docentes").selectedIndex].value
	document.getElementById('docente').value=docente_elegido;
	var materia_elegido=document.getElementById("materias").options[document.getElementById("materias").selectedIndex].value
	document.getElementById('materia').value=materia_elegido;
	document.getElementById('tipo1').value="activado";
}
function procesarDatos2(form){
	var docente_elegido=document.getElementById("docentes").options[document.getElementById("docentes").selectedIndex].value
	document.getElementById('docente').value=docente_elegido;
	var materia_elegido=document.getElementById("materias").options[document.getElementById("materias").selectedIndex].value
	document.getElementById('materia').value=materia_elegido;
	document.getElementById('tipo2').value="activado";	
	document.getElementById("msj").style.visibility="visible";
}
</script>
<body >
<center>
	<div id="banner" style="position:relative;"> 
		
	</div>
	
	<div id="log_off" >
		<form name="cerrar_sesion" action="log_off" method="get">
			<input type="submit" name="submitlogoff" id="submitlogoff" value="Cerrar sesion" class="botones" style="position:absolute; left:100">
		</form>	
	</div>
			
	<div id="centro" style="left:105">
		<div id="centro_izq" class="menu" style="padding-left:10px; padding-top:5px;" >
			
			<table border="0" bgcolor="#8C8C8C" id="latabla" name="latabla" width="135" border="0" cellpadding="0" cellspacing="4" valign="center" onmouseover="">
						<tr><!--<script>onmouseover = "#403f81"</script>-->
				<td id="col1" name="col1" align="center" style="color: #ffffff; font-size:11px;font-weight:bold;" >
					<a onmouseover="sobre_enlace('col1');" onmouseout="fuera_enlace('col1');" onclick="window.location.href='obtenerFechas'">Crear Programación Docente</a>
				</td>
			</tr>
			<tr>
				<td id="col2" name="col2" align="center" style="color: #ffffff; font-size:11px;font-weight:bold;">
					<a onmouseover="sobre_enlace('col2');" onmouseout="fuera_enlace('col2');" onclick="window.location.href='obtenerFechasModificar'">Modificar Programación Docente</a>
				</td>
			</tr>
			<tr>
				<td id="col3" name="col3" align="center" style="color: #ffffff; font-size:11px;font-weight:bold;">
					<a onmouseover="sobre_enlace('col3');" onmouseout="fuera_enlace('col3');" onclick="window.location.href='obtenerFechasEliminar'">Eliminar Programación Docente</a>
				</td>
			</tr>
			<tr>
				<td id="col4" name="col4" align="center" style="color: #ffffff; font-size:11px;font-weight:bold;">
					<a onmouseover="sobre_enlace('col4');" onmouseout="fuera_enlace('col4');" onclick="window.location.href='obtenerFechasConsultar'">Consultar Programación Docente</a>
				</td>
			</tr>
			<tr>
				<td id="col5" name="col5" align="center" style="color: #ffffff; font-size:11px;font-weight:bold;">
					<a onmouseover="sobre_enlace('col5');" onmouseout="fuera_enlace('col5');" onclick="window.location.href='cargaRecord2'">Generar Reporte</a>
				</td>
			</tr>
			</table>
			<!--Local incremental array autocompleter ac4<br/> with full-search. Type 'Jac', hit enter a few <br/>times, type 'gne'.<br/> <textarea rows=5 cols=40 id="ac4" autocomplete="off"></textarea>
			--><div id="ac4update" style="display:none;border:1px solid black;background-color:white; text-align:left; font-family:Tahoma; font-weight:regular; font-size:14px; color:#403f81;"></div>

	
			<!--<script type="text/javascript" language="javascript" charset="utf-8">
			/*Autocompleter.Local(<id del elemneto donde se ingresa el texto>,<id del div en donde se muestran las opciones>,<arreglo de coincidencias>, { <tokens que detienen la busqueda>,fullSearch: true, partialSearch: true} )*/
			// <![CDATA[
			  
			// ]]>
			</script>-->
		
		</div>
		
		<div width="500" height= "20" id="fondoAgregar" name="fondoAgregar">
			<span class="headerAgregar">Bienvenido</span>
			
		</div>
		
		<div id="centro_der" name="centro_der" >
			<p style="position:absolute; top:40; left:120; font-weight:bold;">Record Histórico de Docente</p>
			<form id="buscador1" name="buscador1" action="generaReporte2" onsubmit="return procesarDatos1(this);">
				<select id="docentes" name="docentes" style="width:160px; position:absolute; top:90; left:120">
			<%
				Collection docentes = (Collection)session.getAttribute("info_docentes");
				if(docentes != null){
					Iterator iteradorDocentes=docentes.iterator();
					String doc="";
					while(iteradorDocentes.hasNext()){
						doc = (String)iteradorDocentes.next();
			%>
					<option value="<%=doc%>"><%=doc%></option>					
			<%
					}	
				}
			%>
				</select>
				
				<input type="submit" id="reporte_docente" name="reporte_docente" value="Generar Reporte" style="position:absolute; top:90; left:320;"></input>
				
				<input type="hidden" name="docente" id="docente" value=""></input>
				<input type="hidden" name="tipo1" id="tipo1" value=""></input>
			</form>
			<p style="position:absolute; top:120; left:120; font-weight:bold;">Reporte Histórico de Materia</p>
			<form id="buscador2" name="buscador2" action="generaReporte2" onsubmit="return procesarDatos2(this);">
				<select id="materias" name="materias" style="width:160px; position:absolute; top:170; left:120">
			<%
				Collection materias = (Collection)session.getAttribute("info_materias");
				if(materias != null){
					Iterator iteradorMaterias=materias.iterator();
					String mat="";
					while(iteradorMaterias.hasNext()){
						mat = (String)iteradorMaterias.next();
			%>
					<option value="<%=mat%>"><%=mat%></option>					
			<%
					}	
				}
			%>
				</select>
				
				<input type="submit" id="reporte_materia" name="reporte_materia" value="Generar Reporte" style="position:absolute; top:170; left:320;"></input>
				
				<input type="hidden" name="materia" id="materia" value=""></input>
				<input type="hidden" name="tipo2" id="tipo2" value=""></input>
			</form>		
			<p id="msj" name="msj" style="top:330; font-weight:bold; visibility:hidden">Se han generado los reportes satisfactoriamente en formato PDF</p>			
		</div>
	</div>
  </center>  
</body>
<% }else{
	%>
		<SCRIPT>
			window.location.href = "index.jsp";
		</SCRIPT>
	<%
	}%>
</html>
</html>
