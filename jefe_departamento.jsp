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
function crear_tabla_CPD(){
	document.getElementById("ano_lec").style.visibility="visible";
	document.getElementById("periodo_aca").style.visibility="visible";
	document.getElementById("estado").style.visibility="visible";
	document.getElementById("busca").style.visibility="visible";
}
function cambiar_estado_PD(){
	document.getElementById("cambiar_estado").style.visibility="visible";
}
function sobre_enlace(columna) {
	x=document.getElementById(columna);
	x.style.color = "#403f81";
}
function fuera_enlace(columna) {
	x=document.getElementById(columna);
	x.style.color = "#ffffff";
}
function procesarDatos(form){
	var ano_elegido=document.getElementById("ano_lec").options[document.getElementById("ano_lec").selectedIndex].value
	document.getElementById('ano').value=ano_elegido;
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
			<tr>
				<td id="col3" name="col3" align="center" style="color: #ffffff; font-size:11px;font-weight:bold;">
					<a onmouseover="sobre_enlace('col3');" onmouseout="fuera_enlace('col3');" onclick="window.location.href='cargaAnoLectivo'">Cambiar Estado Programación Docente</a>
				</td>
			</tr>
			<tr>
				<td id="col4" name="col4" align="center" style="color: #ffffff; font-size:11px;font-weight:bold;">
					<a onmouseover="sobre_enlace('col4');" onmouseout="fuera_enlace('col4');" onclick="window.location.href='cargaRecord'">Generar Reporte</a>
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
			<form id="buscador" name="buscador" action="mostrarPartidasDocentes" onsubmit="return procesarDatos(this);">
				<select id="ano_lec" name="ano_lec" style="width:90px; position:absolute; visibility:hidden; left:340;">
			<%
				Collection anos = (Collection)session.getAttribute("anos_lectivos");
				if(anos != null){
					Iterator iteradorAnos=anos.iterator();
					String ano="";
					while(iteradorAnos.hasNext()){
						ano = (String)iteradorAnos.next();
			%>
					<option value="<%=ano%>"><%=ano%></option>					
			<%
					}	
				}
			%>
				</select>
				<select id="periodo_aca" name="periodo_aca" style="width:40px; visibility:hidden; position:absolute;left:435;">
					<option id="01"> 01 </option>
					<option id="02"> 02 </option>
					<option id="I"> I </option>
				</select>
				<select id="estado" name="estado" style="width:130px; visibility:hidden; position:absolute;left:480;">
					<option id="OFERTADA"> OFERTADA </option>
					<option id="EN EJECUCION"> EN EJECUCION </option>					
				</select>				
				<input type="submit" id="busca" name="busca" value="Buscar PD" style="visibility:hidden;"></input>
				<input type="hidden" name="ano" id="ano" value=""></input>
				<input type="hidden" name="periodo" id="periodo" value=""></input>
				<input type="hidden" name="stado" id="stado" value=""></input>
			</form>
			<form id="cambio_estado" name="cambio_estado" action="cambiarEstadoPD">
				<input type="submit" id="cambiar_estado" name="cambiar_estado" value="Cambiar Estado" style="visibility:hidden;"></input>
			</form>
			<!--form id="busqueda" name="busqueda" method="get" action="">
				<input type="submit" id="busca" name="busca" value="Buscar PD" style="top:170; left:340; visibility:hidden;"></input>
				<input type="hidden" name="Count" id="Count" value="0" />
			</form-->
			
			<%
				if(session.getAttribute("iniciar")!= null){					
			%>
			<script>
				crear_tabla_CPD();
			</script>
			<%
				}
				boolean error=false;
				Collection partidas=(Collection)session.getAttribute("partidas");				
				String periodo="", lic="";	
				String estado = (String)session.getAttribute("estado");
				//System.out.println("Answer my prayers "+estado);				
				if (partidas==null) error=true;				
				if (!error){
			%>
			<script>
				crear_tabla_CPD();
			</script>
			<%		
					if(estado.equals("OFERTADA")){
			%>
			<table  border="1" CELLPADDING="5" id="tabla_CPD" name="tabla_CPD" style="text-align:center">
				<tr style="font-weight:bold">
					<td>Código Materia</td>
					<td>Período</td>
					<td>Licenciatura</td>
					<td>Número Secciones</td>
					<td>Cupos Sección</td>
					<!--td>Opciones</td-->					
				</tr>
			<%
						Iterator iteradorPartidas=partidas.iterator();
						boolean hay=false;
						while (iteradorPartidas.hasNext()){
							hay=true;
							programacion_ofertada po = (programacion_ofertada)iteradorPartidas.next();
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
							periodo=po.get_periodo_academico()+"-"+po.get_ano_lectivo();						
			%>
			<tr>
				<td><%=po.get_materia_codigo()%></td>
				<td><%=periodo%></td>
				<td><%=lic%></td>
				<td><%=po.get_nro_secciones()%></td>
				<td><%=po.get_cupo_por_seccion()%></td>						
			</tr>
			<%		
						}
						if(hay){
			%>
			<script>
				cambiar_estado_PD();
			</script>
			<%			
						}						
			%>
			</table>
			<%	
					}else if(estado.equals("EN EJECUCION")){
			%>
			<table  border="1" CELLPADDING="5" id="tabla_CPD" name="tabla_CPD" style="text-align:center">
				<tr style="font-weight:bold">
					<td>Código Materia</td>
					<td>Sección</td>
					<td>Período</td>
					<td>Licenciatura</td>
					<td>Coordinador</td>
					<td>Principal</td>
					<td>Jurado 1</td>
					<td>Jurado 2</td>							
				</tr>
			<%
						Iterator iteradorPartidas=partidas.iterator();
						boolean hay=false;						
						while (iteradorPartidas.hasNext()){
							hay=true;
							programacion_ejecutada po = (programacion_ejecutada)iteradorPartidas.next();
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
							periodo=po.get_periodo_academico()+"-"+po.get_ano_lectivo();						
			%>
			<tr>
				<td><%=po.get_materia_codigo()%></td>
				<td><%=po.get_nombre_seccion()%></td>
				<td><%=periodo%></td>
				<td><%=lic%></td>
				<td><%=po.get_docente_cedula_coordinador()%></td>
				<td><%=po.get_docente_cedula_principal()%></td>
				<td><%=po.get_docente_cedula_jurado_1()%></td>
				<td><%=po.get_docente_cedula_jurado_2()%></td>
			</tr>
			<%		
						}
						if(hay){
			%>
			<script>
				cambiar_estado_PD();
			</script>
			<%			
						}						
			%>
			</table>
			<%
					}
					session.removeAttribute("iniciar");
					session.removeAttribute("partidas");
				}else{
					System.out.println("FUERA!!!");
				}
			%>
			<!--%@ include file="WEB-INF/jspf/pie.jspf" %>
			</br>
			<!--input type="submit" name="save" id="save" value="Listar" style="visibility:hidden;">
			<input type="hidden" name="Countfilas" id="Countfilas" value="0" />
			<input type="hidden" name="datos_tabla" id="datos_tabla" value="" />
		<form-->
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
