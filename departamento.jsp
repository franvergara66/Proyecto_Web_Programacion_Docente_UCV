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
<script>
function agregar_fila_CPD(el){ 
	var a = parseInt(document.getElementById("Countfilas").value);
	document.getElementById("Countfilas").value = a + 1;
	//Count.value = parseInt(Count.value) +1;
	
    //var y = document.createElement("tr");
	
	var row = document.createElement("TR");
	//for (j = 0; j < 5; j++){
		cell = document.createElement("TD");
		//var txtNodo=document.createTextNode("coje"); 
		var campo=document.createElement("input");
		campo.type="text";
		campo.id="codigo"/*+Count.value*/;
		alert(campo.id);
		campo.disabled="true";
		campo.size="7"
		campo.maxlength="6"
		//campo.onclick=muestra_id
		cell.appendChild(campo);
		//cell.style.cellpading='0';
		row.appendChild(cell);
		/**************************************************************/
		cell = document.createElement("TD");
		//var txtNodo=document.createTextNode("coje"); 
		var campo=document.createElement("input");
		campo.type="text";
		campo.id="materia"/*+Count.value*/;
		alert(campo.id);
		campo.size="30"
		campo.maxlength="30"
		campo.onclick=autocomp;
		campo.onchange=autocomp2;
		cell.appendChild(campo);
		//cell.style.cellpading='0';
		row.appendChild(cell);
		/**************************************************************/
		cell = document.createElement("TD");
		//var txtNodo=document.createTextNode("coje"); 
		var campo=document.createElement("input");
		campo.type="text";
		campo.id="nro_secciones"/*+Count.value*/;
		alert(campo.id);
		campo.size="14"
		campo.maxlength="2"
		cell.appendChild(campo);
		//cell.style.cellpading='0';
		row.appendChild(cell);
		/**************************************************************/
		cell = document.createElement("TD");
		//var txtNodo=document.createTextNode("coje"); 
		var campo=document.createElement("input");
		campo.type="text";
		campo.id="estu_est_seccion"/*+Count.value*/;
		alert(campo.id);
		campo.size="16"
		campo.maxlength="2"
		cell.appendChild(campo);
		//cell.style.cellpading='0';
		row.appendChild(cell);
		/**************************************************************/
		cell = document.createElement("TD");/////////////////////////////////////////////////////
		//var txtNodo=document.createTextNode("coje"); 
		var campo=document.createElement("input");
		campo.type="radio";
		var n_fila="borrar"/*+Count.value*/;
		campo.id="eliminar"+(a+1);
		campo.name="eliminar"+(a+1);
		alert(campo.id);
		//campo.value="Borrar"
		campo.onclick=function(){
			this.checked = true;		
			eliminar_fila();
		
		}

		//campo.id=n_fila;//////////////////////////////////////////
		//alert(campo.id);
		//campo.value="Borrar"
		//campo.onclick=eliminar_fila;
		//campo.size="7"
		//campo.maxlength="2"
		cell.appendChild(campo);
		//cell.style.cellpading='0';
		row.appendChild(cell);
	//}
	var nav=navigator.appName;
	if(nav=="Microsoft Internet Explorer"){
		document.getElementById("tabla_CPD").tBodies[0].appendChild(row);
	}else{
		document.getElementById("tabla_CPD").appendChild(row);
	}
	//alert(document.getElementById("borrar"))/*.onclick())=alert("borrado")*/;
	//el.appendChild(row);
}

function eliminar_fila(){
	var valor = parseInt(document.getElementById("Countfilas").value);
	document.getElementById("Countfilas").value = valor - 1 ;
	var mitabla = document.getElementById("tabla_CPD");
	for(var i = 0 ; i < valor; i++){
		if (document.getElementById("eliminar"+(i+1)).checked==true) {
			var navegador = navigator.appName;
			if (navegador == "Microsoft Internet Explorer"){
				var aux = parseInt(i);
				mitabla.deleteRow(aux+1);
				var c = parseInt(aux+1);
				for(var h=aux+1; h<valor; h++){
					var aux2 = parseInt(h);
					aux2 = aux2 + 1;
					var cambiar = document.getElementById("eliminar"+aux2);
					cambiar.id = "eliminar" + c;
					c = c+1;
				}
			}else {
				var aux = parseInt(i);
				document.getElementById("eliminar")
				var myrows = mitabla.getElementsByTagName("tr");
				mitabla.removeChild(myrows[aux+1]);
				var c = parseInt(aux+1);
				for(var h=aux+1; h<valor; h++){
					var aux2 = parseInt(h);
					aux2 = aux2 + 1;
					var cambiar = document.getElementById("eliminar"+aux2);
					cambiar.id = "eliminar" + c;
					c = c+1;
				}
			}
		}
	}
}
asignatures= new Array ("mate1", "", "mate2", "", "mate3", "", "fisica1", "", "fisica2", "", "quimica1", "", "quimica2", "", "discretas1", "", "discretas2", "", "discretas3", "", "algoritmos1", "", "orga1", "", "orga2", "", "ati1", "", "ati2", "", "redes", "", "abd", "", "ihc", "", "ia");
codes=new Array("0000", "", "0001", "", "0002", "", "0003", "", "0004", "", "0005", "", "0006", "", "0007", "", "0008", "", "0009", "", "0010", "", "0011", "", "0012", "", "0013", "", "0014", "", "0015", "", "0016", "", "0017", "", "0018");

function autocomp(){
	var c=document.getElementById("materia");
	var div=document.getElementById("ac4update");
	
	new Autocompleter.Local('materia','ac4update',
	asignatures, { tokens: new Array(',','\n'), fullSearch: true, partialSearch: true });
}

function autocomp2(){
	var c=document.getElementById("materia");
	for(o=0;o<asignatures.length;o++){
		if(c.value==asignatures[o]){
			document.getElementById("codigo").value=codes[o];
			break;
		}
	}	
}
var indice = 0;
function crear_tabla_CPD(){
	document.getElementById("Countfilas").value = 0;
	Count =document.getElementById("Count");
	var tablamia = document.getElementById('tabla_CPD');
	var nav1=navigator.appName;
	if(nav1=="Microsoft Internet Explorer"){
		
		while (tablamia.childNodes.length > 1)
			tablamia.removeChild(tablamia.lastChild);
	}else{
		
		while (tablamia.childNodes.length > 2)
			tablamia.removeChild(tablamia.lastChild);
	}
	if((indice==0) /*&& (!yaledio)*/){
		var Count =document.getElementById("Count");
		document.getElementById("agr").style.visibility="visible";
		document.getElementById("save").style.visibility="visible";
		x=document.getElementById("tabla_CPD");
		var fila;
		var col;
		var cbP;
		var nav=navigator.appName;
		tabla_crear=new Array("Código","Materia","Número de \nSecciones","Estudiantes \nEstimados por \nSección","Eliminar");
		
		fila = document.createElement("tr");
		for(p=0;p<5;p++){
			col=document.createElement("td");
			col.style.fontWeight="bold";
			col.style.textAlign="center";
			texto=document.createTextNode(tabla_crear[p]);
			col.appendChild(texto);
			fila.appendChild(col);
		}
		if(nav=="Microsoft Internet Explorer"){
			document.getElementById("tabla_CPD").tBodies[0].appendChild(fila);
		}else{
			document.getElementById("tabla_CPD").appendChild(fila);
		}
	}
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
	
	<div id="log_off" style="position:relative;">
		<form name="cerrar_sesion" action="agregar_ext.html" method="post">
			<input type="submit" name="submit" id="submit" value="Cerrar sesion" class="botones">
		</form>	
	</div>
	
	<div id="centro" style="left:105">
		<div id="centro_izq" class="menu" style="padding-left:10px; padding-top:5px;" >
			
			<table border="0" bgcolor="#8C8C8C" id="latabla" name="latabla" width="135" border="0" cellpadding="0" cellspacing="4" valign="center" onmouseover="">
			<tr><!--<script>onmouseover = "#403f81"</script>-->
				<td id="col1" name="col1" align="center" style="color: #ffffff; font-size:11px;font-weight:bold;" >
					<a onmouseover="sobre_enlace('col1');" onmouseout="fuera_enlace('col1');" onclick="crear_tabla_CPD();">Crear Programación Docente</a>
				</td>
			</tr>
			<tr>
				<td id="col2" name="col2" align="center" style="color: #ffffff; font-size:11px;font-weight:bold;">
					<a onmouseover="sobre_enlace('col2');" onmouseout="fuera_enlace('col2');">Modificar Programación Docente</a>
				</td>
			</tr>
			<tr>
				<td id="col3" name="col3" align="center" style="color: #ffffff; font-size:11px;font-weight:bold;">
					<a onmouseover="sobre_enlace('col3');" onmouseout="fuera_enlace('col3');">Eliminar Programación Docente</a>
				</td>
			</tr>
			<tr>
				<td id="col4" name="col4" align="center" style="color: #ffffff; font-size:11px;font-weight:bold;">
					<a onmouseover="sobre_enlace('col4');" onmouseout="fuera_enlace('col4');">Consultar Programación Docente</a>
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
		<form id="programacion_docente" name="programacion_docente">
			<input type="button" id="agr" name="agr" style="visibility:hidden;" value="Agregar Materia" onclick="agregar_fila_CPD(tabla_CPD);"></input>
			
			<input type="hidden" name="Count" id="Count" value="0" />
			
			<table  border="1" CELLPADDING="5" id="tabla_CPD" name="tabla_CPD">
			
			</table>
			</br>
			<input type="button" name="save" id="save" value="Guardar PD" style="visibility:hidden;" onclick="estado_interfaz();">
			<input type="hidden" name="Countfilas" id="Countfilas" value="0" />
		<form>
		</div>
	</div>
  </center>
</body>

</html>
