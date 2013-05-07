<%@ page import ="java.util.*,com.modelo.estructuras.*" %>

<%@ page import ="java.util.*;" %>

<% if(session.getAttribute("departamento")!= null){%>
<head>
<title>Bienvenido Jefe Control de Estudios</title>

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
<script>

function verSelects(){
	document.getElementById("erfor").style.visibility='visible';

}
function validarSel(){
		var campoTipo = document.getElementById("tipo").value;
		var campoPer = document.getElementById("periodo").value;
		var campoAno = document.getElementById("ano").value;
		var campoLic = document.getElementById("lic").value;
		
		if(campoTipo=="Estado"){
				alert("Debe seleccionar un Estado");
				return false;	
		 }
		if(campoPer=="Periodo"){
				alert("Debe seleccionar un Periodo");
				return false;	
		 }
		 if(campoAno=="Ano"){
				alert("Debe seleccionar un Año");
				return false;	
		 }
		 if(campoLic=="licen"){
				alert("Debe seleccionar una Licenciatura");
				return false;	
		 }
		 if((campoPer==02) && (campoAno==2007)){
				alert("La Programacion Docente 2-2007 aun no ha sido Ejecutada");
				return false;
		 }
		 if((campoPer=="I") && (campoAno==2007)){
				alert("La Programacion Docente I-2007 aun no ha sido Ejecutada");
				return false;
		 }
		 return true;
		
}
function sobre_enlace(columna) {
	x=document.getElementById(columna);
	x.style.color = "#403f81";
}
function fuera_enlace(columna) {
	x=document.getElementById(columna);
	x.style.color = "#ffffff";
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
	
	<div style="float:left;width:830px;height:20px;">
		
	</div>	
	
	<div id="centro" style="left:105">
		<div id="centro_izq" class="menu" style="padding-left:10px; padding-top:5px;" >
			
			<table border="0" bgcolor="#8C8C8C" id="latabla" name="latabla" width="135" border="0" cellpadding="0" cellspacing="4" valign="center" onmouseover="">
			<tr><!--<script>onmouseover = "#403f81"</script>-->
				<td id="col1" name="col1" align="center" style="color: #ffffff; font-size:11px;font-weight:bold;" >
					<a onmouseover="sobre_enlace('col1');" onmouseout="fuera_enlace('col1');" onclick="verSelects()">Ver Programación Docente</a>
				</td>
			</tr>
			<tr>
				<td id="col5" name="col5" align="center" style="color: #ffffff; font-size:11px;font-weight:bold;">
					<a onmouseover="sobre_enlace('col5');" onmouseout="fuera_enlace('col5');" onclick="window.location.href='cargaRecord3'">Generar Reporte</a>
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
			<form action="verProg" id="erfor" name="formul" method="get" style="visibility:hidden;" onSubmit="return validarSel();">
			
				Seleccione Programacion Docente a Ver</br>
				</br>
				<select name="tipo" id="tipo">
							<option value="Estado">Estado</option>
							<option value="Ofertada">Ofertada</option>
							<option value="Ejecutada">Ejecutada</option>
				</select>
				<select name="periodo" id="periodo">
							<option value="Periodo">Periodo</option>
							<option value="01">01</option>
							<option value="02">02</option>
							<option value="I">I</option>
				</select>
				<select name="ano" id="ano">
							<option value="Ano">Año</option>
							<option value="2000">2000</option>
							<option value="2001">2001</option>
							<option value="2002">2002</option>
							<option value="2003">2003</option>
							<option value="2004">2004</option>
							<option value="2005">2005</option>
							<option value="2006">2006</option>
							<option value="2007">2007</option>
				</select>
				<select name="lic" id="lic">
							<option value="licen">Licenciatura</option>
							<option value="Computacion">Computacion</option>
							<option value="Fisica">Fisica</option>
							<option value="Quimica">Quimica</option>
							<option value="Matematica">Matematica</option>
							<option value="Biologia">Biologia</option>
							<option value="Geoquimica">Geoquimica</option>
				</select>
				</br>
				</br>
				<input type="submit" name="ver" id="ver" value="Ver" class="botones">
			</form>
			</br>
			</br>
			<%
			Collection prog = (Collection)session.getAttribute("progEjecutadas");
			Collection prog2 = (Collection)session.getAttribute("progOfer");
			Collection error2=((Collection)session.getAttribute("error2"));
			Collection error3=((Collection)session.getAttribute("error3"));
			
			if (error2!=null){
			%>
				<!--<h1>No se Encontraron Materias en Dicha partida Docente</h1>-->
				<script>
					alert("No se Encontraron Materias en Dicha Partida Docente");
				</script>
				
			<%
			}
			else{
					int i=1;
				
				if (prog!=null){
				
				%>
					<table  border="1" CELLPADDING="5" id="tabla_prog" name="tabla_prog" style="text-align:center">
					<tr style="font-weight:bold">
						<td>Codigo</td>
						<td>Nombre</td>
						<td>Seccion</td>
						<td>Periodo</td>
						<td>Año Lectivo</td>					
						<td>Licenciatura</td>
						<td>Numero</td>
					</tr>
				<%
					Iterator iteradorProg=prog.iterator();
					String lic="";
					while (iteradorProg.hasNext()){
						programacion_ejecutada pe = (programacion_ejecutada)iteradorProg.next();
						
								if((pe.get_licenciatura_id()).equals("C")){
									lic="COMPUTACION";
								}else if((pe.get_licenciatura_id()).equals("Q")){
									lic="QUIMICA";
								}else if((pe.get_licenciatura_id()).equals("M")){
									lic="MATEMATICAS";
								}else if((pe.get_licenciatura_id()).equals("F")){
									lic="FISICA";
								}else if((pe.get_licenciatura_id()).equals("G")){
									lic="GEOQUIMICA";
								}else if((pe.get_licenciatura_id()).equals("B")){
									lic="BIOLOGIA";
								}
				%>
				<tr>
					<td><%=pe.get_materia_codigo()%></td>
					<td><%=pe.get_materia_nombre()%></td>
					<td><%=pe.get_nombre_seccion()%></td>
					<td><%=pe.get_periodo_academico()%></td>
					<td><%=pe.get_ano_lectivo()%></td>
					<td><%=lic%></td>			
					<td><%=i%></td>	
				</tr>
				<%
					i++;
					}
				}
			}
			if (error3!=null){
			%>
				<!--<h1>No se Encontraron Materias en Dicha partida Docente</h1>-->
				<script>
					alert("No se Encontraron Materias en Dicha Partida Docente");
				</script>
				
			<%
			}
			else{
					int i=1;
				
				if (prog2!=null){
				
				%>
					<table  border="1" CELLPADDING="5" id="tabla_prog_of" name="tabla_prog_of" style="text-align:center">
					<tr style="font-weight:bold">
						<td>Codigo</td>
						<td>Periodo</td>
						<td>Año Lectivo</td>					
						<td>Licenciatura</td>
						<td>Numero de Secciones</td>
						<td>Cupo por Seccion</td>
					</tr>
				<%
					Iterator iteradorProgOf=prog2.iterator();
					String lic="";
					while (iteradorProgOf.hasNext()){
						programacion_ofertada po = (programacion_ofertada)iteradorProgOf.next();
						
								if((po.get_licenciatura_id()).equals("C")){
									lic="COMPUTACION";
								}else if((po.get_licenciatura_id()).equals("Q")){
									lic="QUIMICA";
								}else if((po.get_licenciatura_id()).equals("M")){
									lic="MATEMATICAS";
								}else if((po.get_licenciatura_id()).equals("F")){
									lic="FISICA";
								}else if((po.get_licenciatura_id()).equals("G")){
									lic="GEOQUIMICA";
								}else if((po.get_licenciatura_id()).equals("B")){
									lic="BIOLOGIA";
								}
				%>
				<tr>
					<td><%=po.get_materia_codigo()%></td>
					<td><%=po.get_periodo_academico()%></td>
					<td><%=po.get_ano_lectivo()%></td>
					<td><%=lic%></td>			
					<td><%=po.get_nro_secciones()%></td>	
					<td><%=po.get_cupo_por_seccion()%></td>
				</tr>
				<%
					i++;
					}
				}
			}
			session.removeAttribute("progEjecutadas");
			session.removeAttribute("error2");
			session.removeAttribute("progOfer");
			session.removeAttribute("error3");
			%>
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
