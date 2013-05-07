<%@ page import ="java.util.*,com.modelo.estructuras.*" %>



<html>
<head>
	<title>Sistema Administrador de Partidas Docentes</title>
<style>
.cap{font-family:Tahoma; font-weight:bold; font-size:11px; color:#403f81;}
.cap2{font-family:Tahoma; font-weight:bold; font-size:8px; color:#403f81;}
.txt{font-family:Tahoma; font-weight:regular; font-size:11px; color:#000000; padding-top:5px;padding-left:15px;padding-right:15px;}
.menu{font-family:Tahoma; font-weight:bold; font-size:10px; color:#403f81; text-decoration:none;}
.footer{font-family:Tahoma;font-size:11px; color:#9e0c0f;}
.botones{background-color: #dddddd; color: #403f81; font-weight: bold; font-size: 8pt; font-family:Tahoma;}
</style>
	<script language="JavaScript">
			function validarFormulario(formulario){
				if(formulario.login.value == "" & formulario.password.value == "" ){
					alert("Debe ingresar el login y el password...");
					return false;
				}else{
					if(formulario.login.value == "" ){
						alert("Debe ingresar el login...");
						return false;
					}
					if(formulario.password.value == "" ){
						alert("Debe ingresar el password...");
						return false;
					}
					/*if((formulario.login.value != "departamento")&&(formulario.login.value != "jefe")&&(formulario.login.value != "ce")){
						alert("Debe ingresar un login valido (departamento, jefe o ce)");
						return false;
					}
					if(((formulario.login.value == "ce")&&(formulario.password.value != "ce" ))||((formulario.login.value == "departamento")&&(formulario.password.value != "departamento" ))||((formulario.login.value == "jefe")&&(formulario.password.value != "jefe" ))){
						alert("el password no se corresponde con el login");
						return false;
					}		*/			
					return true;			
				}
			}	   
	   </script>
	
</head>
<%@ page import ="java.util.*,com.modelo.estructuras.*" %>

<body topmargin="0" leftmargin="0">
<center>
<table cellspacing="0" cellpadding="0" border="0" >
<tr>
	<td colspan="2"><img src="images/top.jpg"></td>
</tr>
<tr>
	<td valign="top">
	<table cellpadding="0" cellspacing="0" border="0">
		<tr><td colspan="2"><img src="images/pic.jpg"></td></tr>
		<tr>
			<td><img src="images/pic2.jpg"></td>
			<td width="186" height="213" background="images/bg1.jpg" valign="top">
			<div class="cap"><br>Facultad de Ciencias UCV</div>
			<div class="cap2">Finalidad:</div>
			<div class="txt">Agrupar todo el proceso de Creaci&oacute;n y Procesamiento de las Partidas Docentes mediante una herramienta digital de f&aacute;cil acceso y manejo, a fin de optimizar dicho proceso de vital importancia para nuestra Facultad</div>
			</td>
		</tr>
	</table>
	</td>
	<td valign="top" height="100%">
	<table cellpadding="0" cellspacing="0" border="0">
		<tr><td><img src="images/caplogin.gif"></td></tr>
		<tr>
			<td width="404" height="142" background="images/form.gif" align="center" >	
				<!--<form action="manejadores/validarusuario.php" method="get" onsubmit="return validarFormulario(this)"> -->
				
				<form name="formulario" action="verificarUsuario" method="get" onsubmit="return validarFormulario(this)" >
				
					
					
					<table cellpadding="0" cellspacing="0" border="0">
							<tr>
								<td height = "30" class="cap" align="right">Login:</td>
								<td style="padding-left:10px;"><input type="text" name="login" id="login"></td>
							</tr>									
							<tr>
								<td height = "40" class="cap" align="right">Password:</td>
								<td style="padding-left:10px;"><input type="password" name="password" id="password"></td>
							</tr>
							<tr>
								<td align="right" valign="middle" colspan="2">
									<input type="submit" name="submit" id="submit" value="Ingresar" class="botones">								
								</td>
							</tr>
							<%	
								Collection error=((Collection)session.getAttribute("error"));
								if (error!=null){
									session.removeAttribute("error");
							%>
							<tr>
								<td align="right" valign="middle" colspan="2">
									login o password incorrecto								
								</td>
							</tr>
							<%
								}
							%>	
							<tr>
								<td align="right" valign="middle" colspan="2" class="footer" height="20">
								</td>
							</tr>
					</table>
				</form>
			</td>
			
		</tr>
		<tr>
			<td width="370" height="139" background="images/bg2.jpg" valign="top" align="center" class="txt" style="padding-top:30px;"></td>
		</tr>
	</table>
	</td>
</tr>
<tr>
	<td colspan= "2" width="752" height="58" background="images/menu.gif" align="center" class="menu">
	<a href="mailto:dbarrant@fisica.ciens.ucv.ve" class="menu">Contáctanos</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="http://www.ciens.ucv.ve/cestudio/index.php" class="menu">Control de Estudios</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</td>
	
</tr>
<tr>
	<td colspan="2" width="752" height="97" background="images/footer.gif" align="center"></td>
</tr>
</table>
</center>

</body>

</html>