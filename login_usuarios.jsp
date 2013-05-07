<%@ include file="WEB-INF/jspf/tope.jspf" %>
<%@ page import ="java.util.*,com.modelo.estructuras.*" %>
<%
	boolean error=false;
	Collection usuarios=(Collection)session.getAttribute("usuarios");
	if (usuarios==null) error=true;
	
	if (!error){
	
%>
<table border="1" cellpadding="0" cellspacing="0" width="100%">
	<tr bgcolor="#EEEEEE">
		<td>login</td>
		<td>cedula</td>
		<td>nombre</td>
		<td>apellido</td>
		<td>clave</td>
		<td>cargo</td>
		<td>correo</td>
		<td>observaciones</td>
	</tr>
<%
		Iterator iteradorUsuarios=usuarios.iterator();
		while (iteradorUsuarios.hasNext()){
			Usuario usuarioActual=(Usuario)iteradorUsuarios.next();
		
%>
	<tr>
		<td><%=usuarioActual.get_login()%></td>
		<td><%=usuarioActual.get_cedula()%></td>
		<td><%=usuarioActual.get_nombres()%></td>
		<td><%=usuarioActual.get_apellidos()%></td>
		<td><%=usuarioActual.get_clave()%></td>
		<td><%=usuarioActual.get_cargo()%></td>
		<td><%=usuarioActual.get_correo()%></td>
		<td><%=usuarioActual.get_observaciones()%></td>
	</tr>
<%			
			
		}
%>
</table>
<%
	} //fin de error
	else{
	//System.out.println("FUERA!!!");
%>
	login o password incorrectos!
<%
	}
%>
<%@ include file="WEB-INF/jspf/pie.jspf" %>