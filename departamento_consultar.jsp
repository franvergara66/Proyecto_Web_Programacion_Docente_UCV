<%@ page import ="java.util.*,com.modelo.estructuras.*,java.lang.Number;" %>
<% if(session.getAttribute("departamento")!= null){%>
<head>
<title>Bienvenido Departamento</title>

<style>
.latabla{font-family: Times new Roman; font-color: #ffffff; font-size:11px;font-weight:bold; onmouseover = "#403f81"}

#banner{width:752; height:98; position:absolute; background-image:url(images/top.jpg); top:0; left:5;}
#submitlogoff{ position:absolute; top:105; left:765;}
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
var indice = 0;
var yaledio=false;
asignatures;
codes;
anos_lectivos;

function xhr2CompletadoAnosLectivos(){
	if (xhr2.readyState != 4) 
		return;
	anos_lectivos = new Array();
	anos_lectivos=xhr2.responseText.split('\n');
	//alert("1er aviso hay "+ anos_lectivos.length+"años lectivos");
	
	crear_tabla_CPD();
}

function xhr2CompletadoCodigos() {
			
	if (xhr1.readyState != 4) 
		return;
	
	codes = new Array();
	codes=xhr1.responseText.split('\n');
	
}

function xhr2Completado() {
				
	if (xhr.readyState != 4) 
		return;
	
	asignatures = new Array();
	asignatures=xhr.responseText.split('\n');

}

function crearTope(){
	//alert("creartope");
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
	
	//i = -1;//document.cookie.indexOf(x);
	if((indice==0) && (!yaledio)){
	   	//alert("despues del 1er if");	
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
		if((indice==0) ){
			//alert("despues del 2do if");
			var Count =document.getElementById("Count");
			//document.getElementById("agr").style.visibility="visible";
			
			x=document.getElementById("tabla_CPD");
			var fila;
			var col;
			var cbP;
			var nav=navigator.appName;
			tabla_crear=new Array("Código","Materia","Número de \nSecciones","Estudiantes \nEstimados por \nSección","Eliminar");
			
			fila = document.createElement("tr");
			for(p=0;p<4;p++){
				col=document.createElement("td");
				col.style.fontWeight="bold";
				col.style.textAlign="center";
				col.id=tabla_crear[p];
				texto=document.createTextNode(tabla_crear[p]);
				col.appendChild(texto);
				fila.appendChild(col);
				//alert(col.id);
			}
			if(nav=="Microsoft Internet Explorer"){
				document.getElementById("tabla_CPD").tBodies[0].appendChild(fila);
			}else{
				document.getElementById("tabla_CPD").appendChild(fila);
			}
		}
	}
	yaledio=true;
}
function crear_fila_CPD(n_cod, n_mat, n_sec, n_est_sec){
//alert("entre!!");
	var a = parseInt(document.getElementById("Countfilas").value);
	document.getElementById("Countfilas").value = a + 1;
	var row = document.createElement("TR");
		cell = document.createElement("TD");
		//var txtNodo=document.createTextNode("coje"); 
		var campo=document.createElement("input");
		campo.type="text";
		campo.id="codigo"/*+Count.value*/;
		//alert(campo.id);
		campo.disabled="true";
		campo.size="7"
		campo.maxlength="6"
		campo.value=n_cod;
		//campo.onclick=muestra_id
		cell.appendChild(campo);
		//cell.style.cellpading='0';
		row.appendChild(cell);
		/**************************************************************/
		cell = document.createElement("TD");
		//var txtNodo=document.createTextNode("coje"); 
		var campo=document.createElement("input");
		campo.type="text";
		campo.id="materia"+(a+1);
		campo.name="materia"+(a+1);
		campo.disabled="true";
		//alert(campo.id);
		campo.size="30"
		campo.maxlength="30"
		campo.value=n_mat;
		campo.onclick=function(){
			
			autocomp("materia"+(a+1));
		}
		campo.onblur=function(){
			autocomp2(a+1);
		}
		cell.appendChild(campo);
		//cell.style.cellpading='0';
		row.appendChild(cell);
		/**************************************************************/
		cell = document.createElement("TD");
		//var txtNodo=document.createTextNode("coje"); 
		var campo=document.createElement("input");
		campo.type="text";
		campo.id="nro_secciones"/*+Count.value*/;
		campo.disabled="true";
		//alert(campo.id);
		campo.size="14"
		campo.maxlength="2"
		campo.value=n_sec;
		cell.appendChild(campo);
		//cell.style.cellpading='0';
		row.appendChild(cell);
		/**************************************************************/
		cell = document.createElement("TD");
		//var txtNodo=document.createTextNode("coje"); 
		var campo=document.createElement("input");
		campo.type="text";
		campo.id="estu_est_seccion"/*+Count.value*/;
		campo.disabled="true";
		//alert(campo.id);
		campo.size="16"
		campo.maxlength="2"
		campo.value=n_est_sec;
		cell.appendChild(campo);
		//cell.style.cellpading='0';
		row.appendChild(cell);
		/**************************************************************/
	//}
	var nav=navigator.appName;
	if(nav=="Microsoft Internet Explorer"){
		document.getElementById("tabla_CPD").tBodies[0].appendChild(row);
	}else{
		document.getElementById("tabla_CPD").appendChild(row);
	}
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



function autocomp(nombre){

	var c=document.getElementById("materia");
	var div=document.getElementById("ac4update");	
	new Autocompleter.Local(nombre,'ac4update',asignatures, { /*tokens: new Array(',','\n'), fullSearch: true, partialSearch: true */});
	
}

function autocomp2(fila){
	
	var tablamia = document.getElementById('tabla_CPD');
	var filas=tablamia.getElementsByTagName('tr');
	var columnas=filas[fila].getElementsByTagName('td');
	var c=document.getElementById("materia");
	
		
		var nav1=navigator.appName;
		
		if(nav1=="Microsoft Internet Explorer"){
				
				var aux2 = "";
				
				var tamano = columnas[1].lastChild.value.length-1;
				if(columnas[1].lastChild.value.charAt(tamano) == " "){
				
					for(i=0;i<(columnas[1].lastChild.value.length-1); i++){
					
						aux2 = aux2 + columnas[1].lastChild.value.charAt(i);
					
					}
				}else{
					for(i=0;i<(columnas[1].lastChild.value.length); i++){
					
						aux2 = aux2 + columnas[1].lastChild.value.charAt(i);
					
					}
				}
							
				for(o=0;o<asignatures.length;o++){	
				
					var aux = "";
					tamano = asignatures[o].length;
					
						for(i=0;i<(asignatures[o].length -1 ); i++){
					
							aux = aux + (asignatures[o]).charAt(i);
					
						}
								
					if(aux2 == aux){
						columnas[0].lastChild.value=codes[o];
						break;
					}
				}
			
		
		}else{
			
			
			for(o=0;o<asignatures.length;o++){	
				
				var aux = "";
				
				for(i=0;i<(asignatures[o].length-1); i++){
				
					aux = aux + (asignatures[o]).charAt(i);
				
				}	
				
				if(columnas[1].lastChild.value == aux){
			
					columnas[0].lastChild.value=codes[o];
					break;
				}
			}
		}
				
		
		
}
var indice = 0;

function crear_tabla_CPD(/*anos_lectivos, periodos_academicos*/){
	//midiv=document.getElementById("centro_der");
	select_uno=document.getElementById('ano_lec');
	//alert("el 1er select deberia ser: "+select_uno);
	//periodo_aca=document.getElementById("periodo_aca");
	//alert("el 2do select deberia ser: "+periodo_aca);
	//alert("crearTablaCPD" + select_uno);
	document.getElementById("ano_lec").style.visibility="visible";
	document.getElementById("busca").style.visibility="visible";
	
	//document.getElementById("ano_lec").style.visibility="visible";
	//alert("crearTablaCPD " + anos_lectivos[0]);
	//alert("crearTablaCPD " +anos_lectivos.length);
	var nav1=navigator.appName;
		
		if(nav1=="Microsoft Internet Explorer"){
			//mi_select=document.createElement("select"); 
			//mi_select.id="ano_lec";
			//alert("el año arreglado es: ---"+aux2+"---");
			for(x=0; x<anos_lectivos.length - 1 ; x++){
				aux2="";
				for(i=0;i<(anos_lectivos[x].length-1); i++){
					aux2 = aux2 + anos_lectivos[x].charAt(i);
				}
				opcion = document.createElement("option");
				opcion.id = "option"+x/*= document.createElement("option"); */
				opcion.value = aux2;
				texto = document.createTextNode(aux2);
				//alert("años lectivos es: ---"+aux2+"---");
				opcion.appendChild(texto);
				select_uno.appendChild(opcion);
				//mi_select.appendChild(opcion);				
			}
			//document.getElementById("ano_lec").appendChild(mi_select);
		}else{
			for(x=0; x<anos_lectivos.length - 1 ; x++){
				aux2="";
				opcion = document.createElement("option");
				opcion.id = document.createElement("option"); 
				texto = document.createTextNode(anos_lectivos[x]);
				opcion.appendChild(texto);
				select_uno.appendChild(opcion);
			}
		}
		
	
	
	select_dos=document.getElementById("periodo_aca");
	document.getElementById("periodo_aca").style.visibility="visible";

	
	
	//alert();
	/*
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
	
	//i = -1;//document.cookie.indexOf(x);
	
	
	if((indice==0) && (!yaledio)){
	   		
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
		if((indice==0) ){
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
				col.id=tabla_crear[p];
				texto=document.createTextNode(tabla_crear[p]);
				col.appendChild(texto);
				fila.appendChild(col);
				//alert(col.id);
			}
			if(nav=="Microsoft Internet Explorer"){
				document.getElementById("tabla_CPD").tBodies[0].appendChild(fila);
			}else{
				document.getElementById("tabla_CPD").appendChild(fila);
			}
		}
	}
	yaledio=true;
	*/
	//alert("Termino de crar la tabla q fatidio");
}
function revisarTabla(form){

	var ano= document.getElementById('ano1');
	var ano_elegido=document.getElementById("ano_lec").value;
	ano.value=ano_elegido;
	
	
	
	var periodo= document.getElementById('periodo1');
	var periodo_elegido=document.getElementById("periodo_aca").value;
	periodo.value=periodo_elegido;
	
	//alert("periodo :" + periodo_elegido);

	var tablamia = document.getElementById('tabla_CPD');
	var datos = document.getElementById('datos_tabla');
	var filas=tablamia.getElementsByTagName('tr');
	
	if(filas.length==1){
		alert("Debe ingresar al menos una materia");
	return false;
	}
	var columnas=filas[1].getElementsByTagName('td');	
	for(i=1;i<filas.length;i++){
		columnas=filas[i].getElementsByTagName('td');
		for(j=0;j<4;j++){
			if(columnas[j].lastChild.value==""){
				alert("No deben existir campos vacios en ninguna fila");
				return false;
			}
			
			if(j == 2 || j == 3){
				if(!(/^([0-9])*$/.test(columnas[j].lastChild.value))){
					alert("La cantidad de Estudiantes Estimados por Seccion y de Secciones deben ser enteros");
					return false;
				}
			}
			if(j==3){
				datos.value=datos.value+columnas[j].lastChild.value;
			}else{
				datos.value=datos.value+columnas[j].lastChild.value+",";
			}
		}
		datos.value=datos.value+";";
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
function error(){
	alert ("ya creo una partida docente");
}

function procesarDatos(form){
//alert("estoy en procesar datos");
	//var ano= document.getElementById('ano');
	//var ano_elegido=document.getElementById("ano_lec").value;
	var ano_elegido=document.getElementById("ano_lec").options[document.getElementById("ano_lec").selectedIndex].value
	
	document.getElementById('ano').value=ano_elegido;
	//alert("el año es: "+document.getElementById('ano').value);
	//alert("ano elegido : " + document.getElementById("ano_lec").options[document.getElementById("ano_lec").selectedIndex].value);
	//alert("ano : " + ano_elegido);
}



</script>
<body >
<center>
	<div id="banner" style="position:relative;"> 
		
	</div>
	
	<div id="log_off" >
		<form name="cerrar_sesion" action="log_off" method="get">
			<input type="submit" name="submitlogoff" id="submitlogoff" value="Cerrar sesion" class="botones" onclick()="alert('tocado')">
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
			<form id="buscador" name="buscador" action="buscarPDConsultar" onsubmit="return procesarDatos(this);">
				<select id="ano_lec" name="ano_lec" style="width:100px; visibility:hidden; position:absolute; left:410;"> 
				</select>
				<select id="periodo_aca" name="periodo_aca" style="width:50px; visibility:hidden;position:absolute;left:525;">
					<option id="01"> 01 </option>
					<option id="02"> 02 </option>
					<option id="I"> I </option>
				</select>
				<input type="submit" id="busca" name="busca" value="Buscar PD" style="visibility:hidden;"></input>
				<input type="hidden" name="ano" id="ano" value="" />
			</form>
			
			<form id="programacion_docente" name="programacion_docente" onsubmit="return revisarTabla(this);" method="get" action="modificarMaterias">
			
						
				</br>
				
				<input type="hidden" name="Count" id="Count" value="0" />
				</br></br>
				<!--<table  border="1" CELLPADDING="5" cellspacing="0" id="tabla_CPD" name="tabla_CPD">
					
				</table>-->
				<table  border="1" CELLPADDING="5" cellspacing="0" id="tabla_CPD" name="tabla_CPD" style="font-weight=bold;">
				
				</table>
				</br>
				
				<input type="hidden" name="Countfilas" id="Countfilas" value="0" />
				<input type="hidden" name="datos_tabla" id="datos_tabla" value="" />
				<input type="hidden" name="ano1" id="ano1" value="" />
				<input type="hidden" name="periodo1" id="periodo1" value="" />
				
				
				 <script>
	var busca = "tab"+"=";
	if (document.cookie.length > 0){
		//alert("Estamos aqui");
		i = document.cookie.indexOf(busca);
		
		if (i != -1){
			//alert("Estamos aqui dentro de las cookies");</script>
			
			<%ArrayList error=((ArrayList)session.getAttribute("PD_resultados"));
			ArrayList errorPD=((ArrayList)session.getAttribute("PD_resultados_error"));
					if (error!=null ){
						if(error.size()>0){
				%>
			
					
						<script>crearTope();</script>
						<%for(int x=0;x<error.size();x++){
							String codigo = ((programacion_ofertada)error.get(x)).get_materia_codigo();
							String nombre = ((programacion_ofertada)error.get(x)).get_materia_nombre();
							String nsecciones = (new Integer(((programacion_ofertada)error.get(x)).get_nro_secciones()).toString());
							String estsec = (new Integer(((programacion_ofertada)error.get(x)).get_cupo_por_seccion()).toString());
						
						
						
						%>
							<script>crear_fila_CPD("<%out.print(codigo);%>","<%out.print(nombre);%>","<%out.print(nsecciones);%>","<%out.print(estsec);%>");</script>
						<%}%>
						
					<% 
						}else{
							out.println("Se ha Modificado la partida docente");
						}
					}
						if(errorPD!=null){
							out.println("No Existe Partida Docente asociada a este Periodo Lectivo de este año");
						}
				
					session.removeAttribute("PD_resultados");
					session.removeAttribute("PD_resultados_error");
				%>
				
				<%ArrayList error1=((ArrayList)session.getAttribute("resultados2"));
				if (error1!=null ){
					if(error1.size()>0){
			%>
				Ocurrio un error al momento de modificar las siguientes materias:
				<div align="justify" style="left:100; position:absolute;">
				<ol>
				<%for(int x=0;x<error1.size();x++){%>
					<li type="square">
						<%System.out.println(error1.get(x));
						out.println(error1.get(x));%>
					</li>	
				<%}%>
				</ol>	
				</div>
				<%
					}else{
						out.println("...Todas las materias se han modificado correctamente ...");
					}
				
				}
				
				session.removeAttribute("resultados2");
			%>
			
		<script>	
		}
	}	
  </script>
				
				
				
			<form>
		</div>
	</div>
  </center>
  
  <script>
	var buscamos = "datos" + "=";
	if (document.cookie.length > 0){
		//alert("Estamos aqui");
		i = document.cookie.indexOf(buscamos);
		
		if (i != -1){
			//alert("Estamos aqui dentro de las cookies");
			
		/*****************************************************************************************************************************************/
		
			try {
			// Internet Explorer 5.5+
			xhr = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
				// Internet Explorer 5.0+
					xhr = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (ex) {
				xhr = false;
				}
			}
		
			
			if (!xhr && typeof XMLHttpRequest != 'undefined') {
				// Mozilla 1.0+ y Safari 1.2+
				xhr = new XMLHttpRequest();
			}
		
			xhr.onreadystatechange=xhr2Completado;
			xhr.open("GET", "materias.txt", true);
			xhr.send(null);
			//alert(asignatures.length);
	/*****************************************************************************************************************************************/
	
			try {
				// Internet Explorer 5.5+
				xhr1 = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
					// Internet Explorer 5.0+
					xhr1 = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (ex) {
					xhr1 = false;
				}
			}
			if (!xhr1 && typeof XMLHttpRequest != 'undefined') {
				// Mozilla 1.0+ y Safari 1.2+
				xhr1 = new XMLHttpRequest();
			}
			xhr1.onreadystatechange=xhr2CompletadoCodigos;
			xhr1.open("GET", "codigos.txt", true);
			xhr1.send(null);
			
	/*****************************************************************************************************************************************/		
			try {
			// Internet Explorer 5.5+
			xhr2 = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
				// Internet Explorer 5.0+
					xhr2 = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (ex) {
				xhr2 = false;
				}
			}
		
			
			if (!xhr2 && typeof XMLHttpRequest != 'undefined') {
				// Mozilla 1.0+ y Safari 1.2+
				xhr2 = new XMLHttpRequest();
			}
		
			xhr2.onreadystatechange=xhr2CompletadoAnosLectivos;
			xhr2.open("GET", "anos_lectivos.txt", true);
			xhr2.send(null);
			//alert("pac x aki");
			//alert("2do aviso hay "+ anos_lectivos.length+"años lectivos");
			
			
	/*****************************************************************************************************************************************/		
					//for(p=0;p<periodos_academicos;p++){}
			//alert("el 1er año lectivo es: "+anos_lectivos[0]);
			//alert("el 1er año periodo academico es: "+periodos_academicos[0]);
			
			if (document.cookie != "") {
				la_cookie = document.cookie.split("; ")
				fecha_fin = new Date
				fecha_fin.setDate(fecha_fin.getDate()-1)
				for (i=0; i<la_cookie.length; i++) {
					mi_cookie = la_cookie[i].split("=")[0]
					if(mi_cookie == "datos"){ 
						//alert("Borrando la cokkie de datos");				
						document.cookie = mi_cookie + "=;expires=" + fecha_fin.toGMTString();
					}
				}
			}
		}
	}
  </script>
  
 
  
</body>

<script>


		
			
	
	/*if (document.cookie != "") {
		la_cookie = document.cookie.split("; ")
		fecha_fin = new Date
		fecha_fin.setDate(fecha_fin.getDate()-1)
		for (i=0; i<la_cookie.length; i++) {
			mi_cookie = la_cookie[i].split("=")[0]
			document.cookie = mi_cookie + "=;expires=" + fecha_fin.toGMTString()
		}
	}*/
</script>
<% }else{
	%>
		<SCRIPT>
			window.location.href = "index.jsp";
		</SCRIPT>
	<%
	}%>
</html>


