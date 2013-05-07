<%@ include file="WEB-INF/jspf/tope.jspf" %>
<%@ page import ="java.util.*,com.modelo.estructuras.*" %>
<%
	boolean error=false;
	Collection materias=(Collection)session.getAttribute("materias");
	if (materias==null) error=true;
	
	if (!error){
	
%>
<table border="1" cellpadding="0" cellspacing="0" width="100%">
	<tr bgcolor="#EEEEEE">
		<td>Id</td>
		<td>Nombre</td>
		<td>Codigo</td>
	</tr>
<%
		Iterator iteradorMaterias=materias.iterator();
		while (iteradorMaterias.hasNext()){
			Materia materiaActual=(Materia)iteradorMaterias.next();
%>
	<tr>
		<td><%=materiaActual.getId()%></td>
		<td><%=materiaActual.getNombre()%></td>
		<td><%=materiaActual.getCodigo()%></td>
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
	Imposible cargar las materias!
<%
	}
%>
<%@ include file="WEB-INF/jspf/pie.jspf" %>