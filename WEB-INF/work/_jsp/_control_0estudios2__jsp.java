/*
 * JSP generated by Resin-3.0.21 (built Thu, 10 Aug 2006 12:03:19 PDT)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.util.*;
import com.modelo.estructuras.*;
import java.util.*;;

public class _control_0estudios2__jsp extends com.caucho.jsp.JavaPage{
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.Application _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = com.caucho.jsp.QJspFactory.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/html");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
       if(session.getAttribute("departamento")!= null){
      out.write(_jsp_string1, 0, _jsp_string1.length);
      
			Collection prog = (Collection)session.getAttribute("progEjecutadas");
			Collection prog2 = (Collection)session.getAttribute("progOfer");
			Collection error2=((Collection)session.getAttribute("error2"));
			Collection error3=((Collection)session.getAttribute("error3"));
			
			if (error2!=null){
			
      out.write(_jsp_string2, 0, _jsp_string2.length);
      
			}
			else{
					int i=1;
				
				if (prog!=null){
				
				
      out.write(_jsp_string3, 0, _jsp_string3.length);
      
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
				
      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((pe.get_materia_codigo()));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((pe.get_materia_nombre()));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((pe.get_nombre_seccion()));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((pe.get_periodo_academico()));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((pe.get_ano_lectivo()));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((lic));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((i));
      out.write(_jsp_string7, 0, _jsp_string7.length);
      
					i++;
					}
				}
			}
			if (error3!=null){
			
      out.write(_jsp_string2, 0, _jsp_string2.length);
      
			}
			else{
					int i=1;
				
				if (prog2!=null){
				
				
      out.write(_jsp_string8, 0, _jsp_string8.length);
      
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
				
      out.write(_jsp_string4, 0, _jsp_string4.length);
      out.print((po.get_materia_codigo()));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((po.get_periodo_academico()));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((po.get_ano_lectivo()));
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((lic));
      out.write(_jsp_string6, 0, _jsp_string6.length);
      out.print((po.get_nro_secciones()));
      out.write(_jsp_string9, 0, _jsp_string9.length);
      out.print((po.get_cupo_por_seccion()));
      out.write(_jsp_string10, 0, _jsp_string10.length);
      
					i++;
					}
				}
			}
			session.removeAttribute("progEjecutadas");
			session.removeAttribute("error2");
			session.removeAttribute("progOfer");
			session.removeAttribute("error3");
			
      out.write(_jsp_string11, 0, _jsp_string11.length);
       }else{
	
      out.write(_jsp_string12, 0, _jsp_string12.length);
      
	}
      out.write(_jsp_string13, 0, _jsp_string13.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      com.caucho.jsp.QJspFactory.freePageContext(pageContext);
    }
  }

  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.make.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.util.CauchoSystem.getVersionId() != -6418134904411496499L)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.make.Dependency depend;
      depend = (com.caucho.make.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("control_estudios2.jsp"), 5304434532779659857L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string7;
  private final static char []_jsp_string1;
  private final static char []_jsp_string11;
  private final static char []_jsp_string5;
  private final static char []_jsp_string8;
  private final static char []_jsp_string6;
  private final static char []_jsp_string9;
  private final static char []_jsp_string3;
  private final static char []_jsp_string10;
  private final static char []_jsp_string0;
  private final static char []_jsp_string12;
  private final static char []_jsp_string4;
  private final static char []_jsp_string13;
  private final static char []_jsp_string2;
  static {
    _jsp_string7 = "</td>	\r\n				</tr>\r\n				".toCharArray();
    _jsp_string1 = "\r\n<head>\r\n<title>Bienvenido Jefe Control de Estudios</title>\r\n\r\n<style>\r\n.latabla{font-family: Times new Roman; font-color: #ffffff; font-size:11px;font-weight:bold; onmouseover = \"#403f81\"}\r\n\r\n#banner{width:752; height:98; position:absolute; background-image:url(images/top.jpg); top:0; left:5;}\r\n#log_off{width:100; height:30; position:absolute; top:100; left:665;}\r\n#centro{width:752; height:470; position:absolute; top:122; left:5;}\r\n#centro_izq{width:190; height:470; position:absolute; top:-5; left:-3; font-family:Tahoma; font-weight:bold; font-size:10px; color:#9F0D10; text-decoration:none;}\r\n#fondoAgregar{width:578; height:20; position:absolute; top:0; left:180; background-color: #403f81;}\r\n#centro_der{width:578; height:450; position:absolute; top:25; left:180;}\r\n\r\n.facultad{width:150; height:20; position:absolute; top:15; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_fac{width:250; height:20; position:absolute; top:15; left:150;}\r\n.escuela{width:250; height:20; position:absolute; top:40; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_esc{width:250; height:20; position:absolute; top:40; left:150;}\r\n.departamento{width:250; height:20; position:absolute; top:65; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_dep{width:250; height:20; position:absolute; top:65; left:150;}\r\n.seccion{width:250; height:20; position:absolute; top:90; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_sec{width:250; height:20; position:absolute; top:90; left:150;}\r\n.id_extension{width:250; height:20; position:absolute; top:115; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_id_ext{width:250; height:20; position:absolute; top:115; left:150;}\r\n.id_persona{width:250; height:20; position:absolute; top:140; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_id_per{width:250; height:20; position:absolute; top:140; left:150;}\r\n.condicion_linea{width:250; height:20; position:absolute; top:165; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_cond_linea{width:250; height:20; position:absolute; top:165; left:150;}\r\n.uso_linea{width:250; height:20; position:absolute; top:190; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_uso_linea{width:250; height:20; position:absolute; top:190; left:150;}\r\n.tipo_puerto{width:250; height:20; position:absolute; top:215; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_tipo_puerto{width:250; height:20; position:absolute; top:215; left:150;}\r\n.tipo_cable{width:250; height:20; position:absolute; top:240; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_cable{width:250; height:20; position:absolute; top:240; left:150;}\r\n.cable_par{width:250; height:20; position:absolute; top:265; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_par{width:250; height:20; position:absolute; top:265; left:150;}\r\n.id_equipo{width:250; height:20; position:absolute; top:290; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_id_equipo{width:250; height:20; position:absolute; top:290; left:150;}\r\n.ubicacion_puerto{width:250; height:20; position:absolute; top:315; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_ubicacion_puerto{width:250; height:20; position:absolute; top:315; left:150;}\r\n.ubicacion_fisica{width:250; height:20; position:absolute; top:340; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_ubicacion_fisica{width:250; height:20; position:absolute; top:340; left:150;}\r\n.input_agregar_extension{width:70; height:25; position:absolute; top:100; left:400; font-family: Times new Roman; color: #7cb1c8; font-size:14px; font-weight:bold; border-color:#000000;}\r\n.input_limpiar{width:70; height:25; position:absolute; top:200; left:400; font-family: Times new Roman; color: #7cb1c8; font-size:14px; font-weight:bold; border-color:#000000;}\r\n\r\n\r\n.cap{font-family:Tahoma; font-weight:bold; font-size:11px; color:#9F0D10;}\r\n.txt{font-family:Tahoma; font-weight:regular; font-size:11px; color:#000000; padding-top:5px;padding-left:15px;padding-right:15px;}\r\n.menu{font-family:Tahoma; font-weight:bold; font-size:10px; color:#9F0D10; text-decoration:none;}\r\n.footer{font-family:Tahoma;font-size:11px; color:#9e0c0f;}\r\n.lefttable{font-family:Tahoma; font-weight:bold; font-size:11px; color:#ffffff;padding-left:15px;}\r\n.inbox{font-family:Tahoma; font-weight:bold; font-size:11px; color:#9F0D10;}\r\n.txttable{font-family:Tahoma; font-weight:regular; font-size:11px; color:#000000;padding-left:15px;}\r\n.opciones{font-family:Tahoma; font-weight:regular; font-size:11px; color:#000000;padding-left:15px;}\r\n\r\n.txttable1{font-family:Tahoma; font-weight:bold; font-size:11px; color:#403f81;padding-left:15px;}\r\n.headerAgregar{color: #ffffff; font-weight: bold; font-size: 8pt; font-family:Tahoma;}\r\n.botones{background-color: #dddddd; color: #403f81; font-weight: bold; font-size: 8pt; font-family:Tahoma;}\r\n\r\n\r\n.seleccionar {font-size: 11px; font-family:Tahoma; font-weight:bold; color:#000000;}\r\n.seleccionar1 {font-size: 12px; color:#403f81;}\r\n</style>\r\n</head>\r\n<script>\r\n\r\nfunction verSelects(){\r\n	document.getElementById(\"erfor\").style.visibility='visible';\r\n\r\n}\r\nfunction validarSel(){\r\n		var campoTipo = document.getElementById(\"tipo\").value;\r\n		var campoPer = document.getElementById(\"periodo\").value;\r\n		var campoAno = document.getElementById(\"ano\").value;\r\n		var campoLic = document.getElementById(\"lic\").value;\r\n		\r\n		if(campoTipo==\"Estado\"){\r\n				alert(\"Debe seleccionar un Estado\");\r\n				return false;	\r\n		 }\r\n		if(campoPer==\"Periodo\"){\r\n				alert(\"Debe seleccionar un Periodo\");\r\n				return false;	\r\n		 }\r\n		 if(campoAno==\"Ano\"){\r\n				alert(\"Debe seleccionar un A\u00f1o\");\r\n				return false;	\r\n		 }\r\n		 if(campoLic==\"licen\"){\r\n				alert(\"Debe seleccionar una Licenciatura\");\r\n				return false;	\r\n		 }\r\n		 if((campoPer==02) && (campoAno==2007)){\r\n				alert(\"La Programacion Docente 2-2007 aun no ha sido Ejecutada\");\r\n				return false;\r\n		 }\r\n		 if((campoPer==\"I\") && (campoAno==2007)){\r\n				alert(\"La Programacion Docente I-2007 aun no ha sido Ejecutada\");\r\n				return false;\r\n		 }\r\n		 return true;\r\n		\r\n}\r\nfunction sobre_enlace(columna) {\r\n	x=document.getElementById(columna);\r\n	x.style.color = \"#403f81\";\r\n}\r\nfunction fuera_enlace(columna) {\r\n	x=document.getElementById(columna);\r\n	x.style.color = \"#ffffff\";\r\n}\r\n</script>\r\n<body >\r\n<center>\r\n	<div id=\"banner\" style=\"position:relative;\"> \r\n		\r\n	</div>\r\n	\r\n	<div id=\"log_off\" >\r\n		<form name=\"cerrar_sesion\" action=\"log_off\" method=\"get\">\r\n			<input type=\"submit\" name=\"submitlogoff\" id=\"submitlogoff\" value=\"Cerrar sesion\" class=\"botones\" style=\"position:absolute; left:100\">\r\n		</form>	\r\n	</div>\r\n	\r\n	<div style=\"float:left;width:830px;height:20px;\">\r\n		\r\n	</div>	\r\n	\r\n	<div id=\"centro\" style=\"left:105\">\r\n		<div id=\"centro_izq\" class=\"menu\" style=\"padding-left:10px; padding-top:5px;\" >\r\n			\r\n			<table border=\"0\" bgcolor=\"#8C8C8C\" id=\"latabla\" name=\"latabla\" width=\"135\" border=\"0\" cellpadding=\"0\" cellspacing=\"4\" valign=\"center\" onmouseover=\"\">\r\n			<tr><!--<script>onmouseover = \"#403f81\"</script>-->\r\n				<td id=\"col1\" name=\"col1\" align=\"center\" style=\"color: #ffffff; font-size:11px;font-weight:bold;\" >\r\n					<a onmouseover=\"sobre_enlace('col1');\" onmouseout=\"fuera_enlace('col1');\" onclick=\"verSelects()\">Ver Programaci\u00f3n Docente</a>\r\n				</td>\r\n			</tr>\r\n			<tr>\r\n				<td id=\"col5\" name=\"col5\" align=\"center\" style=\"color: #ffffff; font-size:11px;font-weight:bold;\">\r\n					<a onmouseover=\"sobre_enlace('col5');\" onmouseout=\"fuera_enlace('col5');\" onclick=\"window.location.href='cargaRecord3'\">Generar Reporte</a>\r\n				</td>\r\n			</tr>\r\n			</table>\r\n			<!--Local incremental array autocompleter ac4<br/> with full-search. Type 'Jac', hit enter a few <br/>times, type 'gne'.<br/> <textarea rows=5 cols=40 id=\"ac4\" autocomplete=\"off\"></textarea>\r\n			--><div id=\"ac4update\" style=\"display:none;border:1px solid black;background-color:white; text-align:left; font-family:Tahoma; font-weight:regular; font-size:14px; color:#403f81;\"></div>\r\n\r\n	\r\n			<!--<script type=\"text/javascript\" language=\"javascript\" charset=\"utf-8\">\r\n			/*Autocompleter.Local(<id del elemneto donde se ingresa el texto>,<id del div en donde se muestran las opciones>,<arreglo de coincidencias>, { <tokens que detienen la busqueda>,fullSearch: true, partialSearch: true} )*/\r\n			// <![CDATA[\r\n			  \r\n			// ]]>\r\n			</script>-->\r\n			\r\n		</div>\r\n		\r\n		<div width=\"500\" height= \"20\" id=\"fondoAgregar\" name=\"fondoAgregar\">\r\n			<span class=\"headerAgregar\">Bienvenido</span>\r\n			\r\n		</div>\r\n		\r\n		<div id=\"centro_der\" name=\"centro_der\" >\r\n			<form action=\"verProg\" id=\"erfor\" name=\"formul\" method=\"get\" style=\"visibility:hidden;\" onSubmit=\"return validarSel();\">\r\n			\r\n				Seleccione Programacion Docente a Ver</br>\r\n				</br>\r\n				<select name=\"tipo\" id=\"tipo\">\r\n							<option value=\"Estado\">Estado</option>\r\n							<option value=\"Ofertada\">Ofertada</option>\r\n							<option value=\"Ejecutada\">Ejecutada</option>\r\n				</select>\r\n				<select name=\"periodo\" id=\"periodo\">\r\n							<option value=\"Periodo\">Periodo</option>\r\n							<option value=\"01\">01</option>\r\n							<option value=\"02\">02</option>\r\n							<option value=\"I\">I</option>\r\n				</select>\r\n				<select name=\"ano\" id=\"ano\">\r\n							<option value=\"Ano\">A\u00f1o</option>\r\n							<option value=\"2000\">2000</option>\r\n							<option value=\"2001\">2001</option>\r\n							<option value=\"2002\">2002</option>\r\n							<option value=\"2003\">2003</option>\r\n							<option value=\"2004\">2004</option>\r\n							<option value=\"2005\">2005</option>\r\n							<option value=\"2006\">2006</option>\r\n							<option value=\"2007\">2007</option>\r\n				</select>\r\n				<select name=\"lic\" id=\"lic\">\r\n							<option value=\"licen\">Licenciatura</option>\r\n							<option value=\"Computacion\">Computacion</option>\r\n							<option value=\"Fisica\">Fisica</option>\r\n							<option value=\"Quimica\">Quimica</option>\r\n							<option value=\"Matematica\">Matematica</option>\r\n							<option value=\"Biologia\">Biologia</option>\r\n							<option value=\"Geoquimica\">Geoquimica</option>\r\n				</select>\r\n				</br>\r\n				</br>\r\n				<input type=\"submit\" name=\"ver\" id=\"ver\" value=\"Ver\" class=\"botones\">\r\n			</form>\r\n			</br>\r\n			</br>\r\n			".toCharArray();
    _jsp_string11 = "\r\n		</div>\r\n	</div>\r\n  </center>\r\n</body>\r\n".toCharArray();
    _jsp_string5 = "</td>\r\n					<td>".toCharArray();
    _jsp_string8 = "\r\n					<table  border=\"1\" CELLPADDING=\"5\" id=\"tabla_prog_of\" name=\"tabla_prog_of\" style=\"text-align:center\">\r\n					<tr style=\"font-weight:bold\">\r\n						<td>Codigo</td>\r\n						<td>Periodo</td>\r\n						<td>A\u00f1o Lectivo</td>					\r\n						<td>Licenciatura</td>\r\n						<td>Numero de Secciones</td>\r\n						<td>Cupo por Seccion</td>\r\n					</tr>\r\n				".toCharArray();
    _jsp_string6 = "</td>			\r\n					<td>".toCharArray();
    _jsp_string9 = "</td>	\r\n					<td>".toCharArray();
    _jsp_string3 = "\r\n					<table  border=\"1\" CELLPADDING=\"5\" id=\"tabla_prog\" name=\"tabla_prog\" style=\"text-align:center\">\r\n					<tr style=\"font-weight:bold\">\r\n						<td>Codigo</td>\r\n						<td>Nombre</td>\r\n						<td>Seccion</td>\r\n						<td>Periodo</td>\r\n						<td>A\u00f1o Lectivo</td>					\r\n						<td>Licenciatura</td>\r\n						<td>Numero</td>\r\n					</tr>\r\n				".toCharArray();
    _jsp_string10 = "</td>\r\n				</tr>\r\n				".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string12 = "\r\n		<SCRIPT>\r\n			window.location.href = \"index.jsp\";\r\n		</SCRIPT>\r\n	".toCharArray();
    _jsp_string4 = "\r\n				<tr>\r\n					<td>".toCharArray();
    _jsp_string13 = "\r\n</html>\r\n</html>\r\n".toCharArray();
    _jsp_string2 = "\r\n				<!--<h1>No se Encontraron Materias en Dicha partida Docente</h1>-->\r\n				<script>\r\n					alert(\"No se Encontraron Materias en Dicha Partida Docente\");\r\n				</script>\r\n				\r\n			".toCharArray();
  }
}
