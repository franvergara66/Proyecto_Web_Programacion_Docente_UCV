/*
 * JSP generated by Resin-3.0.21 (built Thu, 10 Aug 2006 12:03:19 PDT)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.util.*;;

public class _control_0estudios__jsp extends com.caucho.jsp.JavaPage{
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
      ArrayList error=((ArrayList)session.getAttribute("resultados"));
				if (error!=null ){
					if(error.size()>0){
			
      out.write(_jsp_string2, 0, _jsp_string2.length);
      for(int x=0;x<error.size();x++){
      out.write(_jsp_string3, 0, _jsp_string3.length);
      System.out.println(error.get(x));
						out.println(error.get(x));
      out.write(_jsp_string4, 0, _jsp_string4.length);
      }
      out.write(_jsp_string5, 0, _jsp_string5.length);
      
					}else{
						out.println("...Todas las materias se han agregado correctamente...");
					}
				
				}
				
				session.removeAttribute("resultados");
			
      out.write(_jsp_string6, 0, _jsp_string6.length);
       }else{
	
      out.write(_jsp_string7, 0, _jsp_string7.length);
      
	}
      out.write(_jsp_string8, 0, _jsp_string8.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("control_estudios.jsp"), 105360014969357602L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string4;
  private final static char []_jsp_string3;
  private final static char []_jsp_string2;
  private final static char []_jsp_string7;
  private final static char []_jsp_string5;
  private final static char []_jsp_string0;
  private final static char []_jsp_string6;
  private final static char []_jsp_string8;
  private final static char []_jsp_string1;
  static {
    _jsp_string4 = "\r\n					</li>	\r\n				".toCharArray();
    _jsp_string3 = "\r\n					<li type=\"square\">\r\n						".toCharArray();
    _jsp_string2 = "\r\n				Las siguientes Materias no se han insertado correctamente:\r\n				<div align=\"justify\" style=\"left:100; position:absolute;\">\r\n				<ol>\r\n				".toCharArray();
    _jsp_string7 = "\r\n		<SCRIPT>\r\n			window.location.href = \"index.jsp\";\r\n		</SCRIPT>\r\n	".toCharArray();
    _jsp_string5 = "\r\n				</ol>	\r\n				</div>\r\n				".toCharArray();
    _jsp_string0 = "\r\n\r\n".toCharArray();
    _jsp_string6 = "\r\n			<input type=\"submit\" name=\"save\" id=\"save\" value=\"Guardar PD\" style=\"visibility:hidden;\" >\r\n			<input type=\"hidden\" name=\"Countfilas\" id=\"Countfilas\" value=\"0\" />\r\n			<input type=\"hidden\" name=\"datos_tabla\" id=\"datos_tabla\" value=\"\" />\r\n			<input type=\"hidden\" name=\"ano\" id=\"ano\" value=\"\" />\r\n		<form>\r\n		</div>\r\n	</div>\r\n  </center>\r\n</body>\r\n\r\n<script>\r\n\r\nfunction xhr2CompletadoAnosLectivos(){\r\n	if (xhr2.readyState != 4) \r\n		return;\r\n	anos_lectivos = new Array();\r\n	anos_lectivos=xhr2.responseText.split('\\n');\r\n	//alert(\"1er aviso hay \"+ anos_lectivos.length+\"a\u00f1os lectivos\");\r\n	crear_tabla_CPD();\r\n}\r\n\r\nfunction xhr2CompletadoCodigos() {\r\n			\r\n	if (xhr1.readyState != 4) \r\n		return;\r\n	\r\n	codes = new Array();\r\n	codes=xhr1.responseText.split('\\n');\r\n	\r\n}\r\n\r\nfunction xhr2Completado() {\r\n				\r\n	if (xhr.readyState != 4) \r\n		return;\r\n	\r\n	asignatures = new Array();\r\n	asignatures=xhr.responseText.split('\\n');\r\n\r\n}\r\n		\r\n	var buscamos = \"datos\" + \"=\";\r\n	if (document.cookie.length > 0){\r\n		//alert(\"Estamos aqui\");\r\n		i = document.cookie.indexOf(buscamos);\r\n		\r\n		if (i != -1){\r\n			//alert(\"Estamos aqui dentro de las cookies\");\r\n		\r\n		/*****************************************************************************************************************************************/\r\n		\r\n			try {\r\n			// Internet Explorer 5.5+\r\n			xhr = new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n			} catch (e) {\r\n				try {\r\n				// Internet Explorer 5.0+\r\n					xhr = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n				} catch (ex) {\r\n				xhr = false;\r\n				}\r\n			}\r\n		\r\n			\r\n			if (!xhr && typeof XMLHttpRequest != 'undefined') {\r\n				// Mozilla 1.0+ y Safari 1.2+\r\n				xhr = new XMLHttpRequest();\r\n			}\r\n		\r\n			xhr.onreadystatechange=xhr2Completado;\r\n			xhr.open(\"GET\", \"materias.txt\", true);\r\n			xhr.send(null);\r\n			//alert(asignatures.length);\r\n	/*****************************************************************************************************************************************/\r\n	\r\n			try {\r\n				// Internet Explorer 5.5+\r\n				xhr1 = new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n			} catch (e) {\r\n				try {\r\n					// Internet Explorer 5.0+\r\n					xhr1 = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n				} catch (ex) {\r\n					xhr1 = false;\r\n				}\r\n			}\r\n			if (!xhr1 && typeof XMLHttpRequest != 'undefined') {\r\n				// Mozilla 1.0+ y Safari 1.2+\r\n				xhr1 = new XMLHttpRequest();\r\n			}\r\n			xhr1.onreadystatechange=xhr2CompletadoCodigos;\r\n			xhr1.open(\"GET\", \"codigos.txt\", true);\r\n			xhr1.send(null);\r\n			\r\n	/*****************************************************************************************************************************************/		\r\n			try {\r\n			// Internet Explorer 5.5+\r\n			xhr2 = new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n			} catch (e) {\r\n				try {\r\n				// Internet Explorer 5.0+\r\n					xhr2 = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n				} catch (ex) {\r\n				xhr2 = false;\r\n				}\r\n			}\r\n		\r\n			\r\n			if (!xhr2 && typeof XMLHttpRequest != 'undefined') {\r\n				// Mozilla 1.0+ y Safari 1.2+\r\n				xhr2 = new XMLHttpRequest();\r\n			}\r\n		\r\n			xhr2.onreadystatechange=xhr2CompletadoAnosLectivos;\r\n			xhr2.open(\"GET\", \"anos_lectivos.txt\", true);\r\n			xhr2.send(null);\r\n			//alert(\"pac x aki\");\r\n			//alert(\"2do aviso hay \"+ anos_lectivos.length+\"a\u00f1os lectivos\");\r\n			\r\n			\r\n	/*****************************************************************************************************************************************/		\r\n					//for(p=0;p<periodos_academicos;p++){}\r\n			//alert(\"el 1er a\u00f1o lectivo es: \"+anos_lectivos[0]);\r\n			//alert(\"el 1er a\u00f1o periodo academico es: \"+periodos_academicos[0]);\r\n			\r\n			if (document.cookie != \"\") {\r\n				la_cookie = document.cookie.split(\"; \")\r\n				fecha_fin = new Date\r\n				fecha_fin.setDate(fecha_fin.getDate()-1)\r\n				for (i=0; i<la_cookie.length; i++) {\r\n					mi_cookie = la_cookie[i].split(\"=\")[0]\r\n					if(mi_cookie == \"datos\"){ \r\n						//alert(\"Borrando la cokkie de datos\");				\r\n						document.cookie = mi_cookie + \"=;expires=\" + fecha_fin.toGMTString();\r\n					}\r\n				}\r\n			}\r\n			\r\n		}\r\n	}\r\n	\r\n</script>\r\n\r\n".toCharArray();
    _jsp_string8 = "\r\n</html>\r\n\r\n\r\n".toCharArray();
    _jsp_string1 = "\r\n<head>\r\n<title>Bienvenido Usuario Departamento</title>\r\n\r\n<style>\r\n.latabla{font-family: Times new Roman; font-color: #ffffff; font-size:11px;font-weight:bold; onmouseover = \"#403f81\"}\r\n\r\n#banner{width:752; height:98; position:absolute; background-image:url(images/top.jpg); top:0; left:5;}\r\n#submitlogoff{ position:absolute; top:105; left:765;}\r\n#centro{width:752; height:470; position:absolute; top:122; left:5;}\r\n#centro_izq{width:190; height:470; position:absolute; top:-5; left:-3; font-family:Tahoma; font-weight:bold; font-size:10px; color:#9F0D10; text-decoration:none;}\r\n#fondoAgregar{width:578; height:20; position:absolute; top:0; left:180; background-color: #403f81;}\r\n#centro_der{width:578; height:450; position:absolute; top:25; left:180;}\r\n\r\n.facultad{width:150; height:20; position:absolute; top:15; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_fac{width:250; height:20; position:absolute; top:15; left:150;}\r\n.escuela{width:250; height:20; position:absolute; top:40; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_esc{width:250; height:20; position:absolute; top:40; left:150;}\r\n.departamento{width:250; height:20; position:absolute; top:65; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_dep{width:250; height:20; position:absolute; top:65; left:150;}\r\n.seccion{width:250; height:20; position:absolute; top:90; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_sec{width:250; height:20; position:absolute; top:90; left:150;}\r\n.id_extension{width:250; height:20; position:absolute; top:115; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_id_ext{width:250; height:20; position:absolute; top:115; left:150;}\r\n.id_persona{width:250; height:20; position:absolute; top:140; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_id_per{width:250; height:20; position:absolute; top:140; left:150;}\r\n.condicion_linea{width:250; height:20; position:absolute; top:165; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_cond_linea{width:250; height:20; position:absolute; top:165; left:150;}\r\n.uso_linea{width:250; height:20; position:absolute; top:190; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_uso_linea{width:250; height:20; position:absolute; top:190; left:150;}\r\n.tipo_puerto{width:250; height:20; position:absolute; top:215; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_tipo_puerto{width:250; height:20; position:absolute; top:215; left:150;}\r\n.tipo_cable{width:250; height:20; position:absolute; top:240; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_cable{width:250; height:20; position:absolute; top:240; left:150;}\r\n.cable_par{width:250; height:20; position:absolute; top:265; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_par{width:250; height:20; position:absolute; top:265; left:150;}\r\n.id_equipo{width:250; height:20; position:absolute; top:290; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_id_equipo{width:250; height:20; position:absolute; top:290; left:150;}\r\n.ubicacion_puerto{width:250; height:20; position:absolute; top:315; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_ubicacion_puerto{width:250; height:20; position:absolute; top:315; left:150;}\r\n.ubicacion_fisica{width:250; height:20; position:absolute; top:340; left:10; font-family: Times new Roman; color: #7cb1c8; font-size:14px;font-weight:bold;}\r\n.input_ubicacion_fisica{width:250; height:20; position:absolute; top:340; left:150;}\r\n.input_agregar_extension{width:70; height:25; position:absolute; top:100; left:400; font-family: Times new Roman; color: #7cb1c8; font-size:14px; font-weight:bold; border-color:#000000;}\r\n.input_limpiar{width:70; height:25; position:absolute; top:200; left:400; font-family: Times new Roman; color: #7cb1c8; font-size:14px; font-weight:bold; border-color:#000000;}\r\n\r\n\r\n.cap{font-family:Tahoma; font-weight:bold; font-size:11px; color:#9F0D10;}\r\n.txt{font-family:Tahoma; font-weight:regular; font-size:11px; color:#000000; padding-top:5px;padding-left:15px;padding-right:15px;}\r\n.menu{font-family:Tahoma; font-weight:bold; font-size:10px; color:#9F0D10; text-decoration:none;}\r\n.footer{font-family:Tahoma;font-size:11px; color:#9e0c0f;}\r\n.lefttable{font-family:Tahoma; font-weight:bold; font-size:11px; color:#ffffff;padding-left:15px;}\r\n.inbox{font-family:Tahoma; font-weight:bold; font-size:11px; color:#9F0D10;}\r\n.txttable{font-family:Tahoma; font-weight:regular; font-size:11px; color:#000000;padding-left:15px;}\r\n.opciones{font-family:Tahoma; font-weight:regular; font-size:11px; color:#000000;padding-left:15px;}\r\n\r\n.txttable1{font-family:Tahoma; font-weight:bold; font-size:11px; color:#403f81;padding-left:15px;}\r\n.headerAgregar{color: #ffffff; font-weight: bold; font-size: 8pt; font-family:Tahoma;}\r\n.botones{background-color: #dddddd; color: #403f81; font-weight: bold; font-size: 8pt; font-family:Tahoma;}\r\n\r\n\r\n.seleccionar {font-size: 11px; font-family:Tahoma; font-weight:bold; color:#000000;}\r\n.seleccionar1 {font-size: 12px; color:#403f81;}\r\n</style>\r\n</head>\r\n<script type=\"text/javascript\" src=\"lib/prototype.js\"></script>\r\n<script type=\"text/javascript\" src=\"src/builder.js\"></script>\r\n<script type=\"text/javascript\" src=\"src/controls.js\"></script>\r\n<script type=\"text/javascript\" src=\"src/dragdrop.js\"></script>\r\n<script type=\"text/javascript\" src=\"src/effects.js\"></script>\r\n<script type=\"text/javascript\" src=\"src/scriptaculous.js\"></script>\r\n<script type=\"text/javascript\" src=\"src/slider.js\"></script>\r\n<script type=\"text/javascript\" src=\"src/sound.js\"></script>\r\n<script type=\"text/javascript\" src=\"src/unittest.js\"></script>\r\n<script>\r\nvar indice = 0;\r\nvar yaledio=false;\r\nasignatures;\r\ncodes;\r\nanos_lectivos;\r\n\r\n\r\nfunction agregar_fila_CPD(el){ \r\n	var a = parseInt(document.getElementById(\"Countfilas\").value);\r\n	document.getElementById(\"Countfilas\").value = a + 1;\r\n	//Count.value = parseInt(Count.value) +1;\r\n	\r\n    //var y = document.createElement(\"tr\");\r\n	\r\n	var row = document.createElement(\"TR\");\r\n	//for (j = 0; j < 5; j++){\r\n		cell = document.createElement(\"TD\");\r\n		//var txtNodo=document.createTextNode(\"coje\"); \r\n		var campo=document.createElement(\"input\");\r\n		campo.type=\"text\";\r\n		campo.id=\"codigo\"/*+Count.value*/;\r\n		//alert(campo.id);\r\n		campo.disabled=\"true\";\r\n		campo.size=\"7\"\r\n		campo.maxlength=\"6\"\r\n		//campo.onclick=muestra_id\r\n		cell.appendChild(campo);\r\n		//cell.style.cellpading='0';\r\n		row.appendChild(cell);\r\n		/**************************************************************/\r\n		cell = document.createElement(\"TD\");\r\n		//var txtNodo=document.createTextNode(\"coje\"); \r\n		var campo=document.createElement(\"input\");\r\n		campo.type=\"text\";\r\n		campo.id=\"materia\"+(a+1);\r\n		campo.name=\"materia\"+(a+1);\r\n		//alert(campo.id);\r\n		campo.size=\"30\"\r\n		campo.maxlength=\"30\"\r\n		campo.onfocus=function(){\r\n			\r\n			autocomp(\"materia\"+(a+1));\r\n		}\r\n		campo.onblur=function(){\r\n			autocomp2(a+1);\r\n		}\r\n		cell.appendChild(campo);\r\n		//cell.style.cellpading='0';\r\n		row.appendChild(cell);\r\n		/**************************************************************/\r\n		cell = document.createElement(\"TD\");\r\n		//var txtNodo=document.createTextNode(\"coje\"); \r\n		var campo=document.createElement(\"input\");\r\n		campo.type=\"text\";\r\n		campo.id=\"nro_secciones\"/*+Count.value*/;\r\n		//alert(campo.id);\r\n		campo.size=\"14\"\r\n		campo.maxlength=\"2\"\r\n		cell.appendChild(campo);\r\n		//cell.style.cellpading='0';\r\n		row.appendChild(cell);\r\n		/**************************************************************/\r\n		cell = document.createElement(\"TD\");\r\n		//var txtNodo=document.createTextNode(\"coje\"); \r\n		var campo=document.createElement(\"input\");\r\n		campo.type=\"text\";\r\n		campo.id=\"estu_est_seccion\"/*+Count.value*/;\r\n		//alert(campo.id);\r\n		campo.size=\"16\"\r\n		campo.maxlength=\"2\"\r\n		cell.appendChild(campo);\r\n		//cell.style.cellpading='0';\r\n		row.appendChild(cell);\r\n		/**************************************************************/\r\n		cell = document.createElement(\"TD\");/////////////////////////////////////////////////////\r\n		//var txtNodo=document.createTextNode(\"coje\"); \r\n		var campo=document.createElement(\"input\");\r\n		campo.type=\"radio\";\r\n		var n_fila=\"borrar\"/*+Count.value*/;\r\n		campo.id=\"eliminar\"+(a+1);\r\n		campo.name=\"eliminar\"+(a+1);\r\n		//alert(campo.id);\r\n		//campo.value=\"Borrar\"\r\n		campo.onclick=function(){\r\n			this.checked = true;		\r\n			eliminar_fila();\r\n		\r\n		}\r\n\r\n		//campo.id=n_fila;//////////////////////////////////////////\r\n		//alert(campo.id);\r\n		//campo.value=\"Borrar\"\r\n		//campo.onclick=eliminar_fila;\r\n		//campo.size=\"7\"\r\n		//campo.maxlength=\"2\"\r\n		cell.appendChild(campo);\r\n		//cell.style.cellpading='0';\r\n		row.appendChild(cell);\r\n	//}\r\n	var nav=navigator.appName;\r\n	if(nav==\"Microsoft Internet Explorer\"){\r\n		document.getElementById(\"tabla_CPD\").tBodies[0].appendChild(row);\r\n	}else{\r\n		document.getElementById(\"tabla_CPD\").appendChild(row);\r\n	}\r\n	//alert(document.getElementById(\"borrar\"))/*.onclick())=alert(\"borrado\")*/;\r\n	//el.appendChild(row);\r\n}\r\n\r\nfunction eliminar_fila(){\r\n	var valor = parseInt(document.getElementById(\"Countfilas\").value);\r\n	document.getElementById(\"Countfilas\").value = valor - 1 ;\r\n	var mitabla = document.getElementById(\"tabla_CPD\");\r\n	for(var i = 0 ; i < valor; i++){\r\n		if (document.getElementById(\"eliminar\"+(i+1)).checked==true) {\r\n			var navegador = navigator.appName;\r\n			if (navegador == \"Microsoft Internet Explorer\"){\r\n				var aux = parseInt(i);\r\n				mitabla.deleteRow(aux+1);\r\n				var c = parseInt(aux+1);\r\n				for(var h=aux+1; h<valor; h++){\r\n					var aux2 = parseInt(h);\r\n					aux2 = aux2 + 1;\r\n					var cambiar = document.getElementById(\"eliminar\"+aux2);\r\n					cambiar.id = \"eliminar\" + c;\r\n					c = c+1;\r\n				}\r\n			}else {\r\n				var aux = parseInt(i);\r\n				document.getElementById(\"eliminar\")\r\n				var myrows = mitabla.getElementsByTagName(\"tr\");\r\n				mitabla.removeChild(myrows[aux+1]);\r\n				var c = parseInt(aux+1);\r\n				for(var h=aux+1; h<valor; h++){\r\n					var aux2 = parseInt(h);\r\n					aux2 = aux2 + 1;\r\n					var cambiar = document.getElementById(\"eliminar\"+aux2);\r\n					cambiar.id = \"eliminar\" + c;\r\n					c = c+1;\r\n				}\r\n			}\r\n		}\r\n	}\r\n}\r\n\r\n\r\n\r\nfunction autocomp(nombre){\r\n\r\n	var c=document.getElementById(\"materia\");\r\n	var div=document.getElementById(\"ac4update\");	\r\n	new Autocompleter.Local(nombre,'ac4update',asignatures, { /*tokens: new Array(',','\\n'), fullSearch: true, partialSearch: true */});\r\n	\r\n}\r\n\r\nfunction autocomp2(fila){\r\n	\r\n	var tablamia = document.getElementById('tabla_CPD');\r\n	var filas=tablamia.getElementsByTagName('tr');\r\n	var columnas=filas[fila].getElementsByTagName('td');\r\n	var c=document.getElementById(\"materia\");\r\n	\r\n		\r\n		var nav1=navigator.appName;\r\n		\r\n		if(nav1==\"Microsoft Internet Explorer\"){\r\n				\r\n				var aux2 = \"\";\r\n				\r\n				var tamano = columnas[1].lastChild.value.length-1;\r\n				if(columnas[1].lastChild.value.charAt(tamano) == \" \"){\r\n				\r\n					for(i=0;i<(columnas[1].lastChild.value.length-1); i++){\r\n					\r\n						aux2 = aux2 + columnas[1].lastChild.value.charAt(i);\r\n					\r\n					}\r\n				}else{\r\n					for(i=0;i<(columnas[1].lastChild.value.length); i++){\r\n					\r\n						aux2 = aux2 + columnas[1].lastChild.value.charAt(i);\r\n					\r\n					}\r\n				}\r\n							\r\n				for(o=0;o<asignatures.length;o++){	\r\n				\r\n					var aux = \"\";\r\n					tamano = asignatures[o].length;\r\n					\r\n						for(i=0;i<(asignatures[o].length -1 ); i++){\r\n					\r\n							aux = aux + (asignatures[o]).charAt(i);\r\n					\r\n						}\r\n								\r\n					if(aux2 == aux){\r\n						columnas[0].lastChild.value=codes[o];\r\n						break;\r\n					}\r\n				}\r\n			\r\n		\r\n		}else{\r\n			\r\n			\r\n			for(o=0;o<asignatures.length;o++){	\r\n				\r\n				var aux = \"\";\r\n				\r\n				for(i=0;i<(asignatures[o].length-1); i++){\r\n				\r\n					aux = aux + (asignatures[o]).charAt(i);\r\n				\r\n				}	\r\n				\r\n				if(columnas[1].lastChild.value == aux){\r\n			\r\n					columnas[0].lastChild.value=codes[o];\r\n					break;\r\n				}\r\n			}\r\n		}\r\n				\r\n		\r\n		\r\n}\r\nvar indice = 0;\r\n\r\nfunction crear_tabla_CPD(/*anos_lectivos, periodos_academicos*/){\r\n			//midiv=document.getElementById(\"centro_der\");\r\n	select_uno=document.getElementById('ano_lec');\r\n	//alert(\"el 1er select deberia ser: \"+select_uno);\r\n	//periodo_aca=document.getElementById(\"periodo_aca\");\r\n	//alert(\"el 2do select deberia ser: \"+periodo_aca);\r\n	//alert(\"crearTablaCPD\" + select_uno);\r\n	document.getElementById(\"ano_lec\").style.visibility=\"visible\";\r\n	//document.getElementById(\"busca\").style.visibility=\"visible\";\r\n	\r\n	//document.getElementById(\"ano_lec\").style.visibility=\"visible\";\r\n	//alert(\"crearTablaCPD \" + anos_lectivos[0]);\r\n	//alert(\"crearTablaCPD \" +anos_lectivos.length);\r\n	var nav1=navigator.appName;\r\n		\r\n		if(nav1==\"Microsoft Internet Explorer\"){\r\n			//mi_select=document.createElement(\"select\"); \r\n			//mi_select.id=\"ano_lec\";\r\n			//alert(\"el a\u00f1o arreglado es: ---\"+aux2+\"---\");\r\n			for(x=0; x<anos_lectivos.length - 1 ; x++){\r\n				aux2=\"\";\r\n				for(i=0;i<(anos_lectivos[x].length-1); i++){\r\n					aux2 = aux2 + anos_lectivos[x].charAt(i);\r\n				}\r\n				opcion = document.createElement(\"option\");\r\n				opcion.id = \"option\"+x/*= document.createElement(\"option\"); */\r\n				opcion.value = aux2;\r\n				texto = document.createTextNode(aux2);\r\n				alert(\"a\u00f1os lectivos es: ---\"+aux2+\"---\");\r\n				opcion.appendChild(texto);\r\n				select_uno.appendChild(opcion);\r\n				//mi_select.appendChild(opcion);				\r\n			}\r\n			//document.getElementById(\"ano_lec\").appendChild(mi_select);\r\n		}else{\r\n			for(x=0; x<anos_lectivos.length - 1 ; x++){\r\n				opcion = document.createElement(\"option\");\r\n				opcion.id = document.createElement(\"option\"); \r\n				texto = document.createTextNode(anos_lectivos[x]);\r\n				opcion.appendChild(texto);\r\n				select_uno.appendChild(opcion);\r\n			}\r\n		}\r\n		\r\n	\r\n	\r\n	select_dos=document.getElementById(\"periodo_aca\");\r\n	document.getElementById(\"periodo_aca\").style.visibility=\"visible\";\r\n\r\n	\r\n	\r\n	//alert();\r\n	\r\n	document.getElementById(\"Countfilas\").value = 0;\r\n	Count =document.getElementById(\"Count\");\r\n	var tablamia = document.getElementById('tabla_CPD');\r\n	var nav1=navigator.appName;\r\n	if(nav1==\"Microsoft Internet Explorer\"){\r\n		\r\n		while (tablamia.childNodes.length > 1)\r\n			tablamia.removeChild(tablamia.lastChild);\r\n	}else{\r\n		\r\n		while (tablamia.childNodes.length > 2)\r\n			tablamia.removeChild(tablamia.lastChild);\r\n	}\r\n	\r\n	//i = -1;//document.cookie.indexOf(x);\r\n	\r\n	\r\n	if((indice==0) && (!yaledio)){\r\n	   		\r\n		document.getElementById(\"Countfilas\").value = 0;\r\n		Count =document.getElementById(\"Count\");\r\n		var tablamia = document.getElementById('tabla_CPD');\r\n		var nav1=navigator.appName;\r\n		\r\n		if(nav1==\"Microsoft Internet Explorer\"){\r\n			\r\n			while (tablamia.childNodes.length > 1)\r\n				tablamia.removeChild(tablamia.lastChild);\r\n		}else{\r\n			\r\n			while (tablamia.childNodes.length > 2)\r\n				tablamia.removeChild(tablamia.lastChild);\r\n		}\r\n		if((indice==0) /*&& (!yaledio)*/){\r\n			var Count =document.getElementById(\"Count\");\r\n			document.getElementById(\"agr\").style.visibility=\"visible\";\r\n			document.getElementById(\"save\").style.visibility=\"visible\";\r\n			x=document.getElementById(\"tabla_CPD\");\r\n			var fila;\r\n			var col;\r\n			var cbP;\r\n			var nav=navigator.appName;\r\n			tabla_crear=new Array(\"C\u00f3digo\",\"Materia\",\"N\u00famero de \\nSecciones\",\"Estudiantes \\nEstimados por \\nSecci\u00f3n\",\"Eliminar\");\r\n			\r\n			fila = document.createElement(\"tr\");\r\n			for(p=0;p<5;p++){\r\n				col=document.createElement(\"td\");\r\n				col.style.fontWeight=\"bold\";\r\n				col.style.textAlign=\"center\";\r\n				col.id=tabla_crear[p];\r\n				texto=document.createTextNode(tabla_crear[p]);\r\n				col.appendChild(texto);\r\n				fila.appendChild(col);\r\n				//alert(col.id);\r\n			}\r\n			if(nav==\"Microsoft Internet Explorer\"){\r\n				document.getElementById(\"tabla_CPD\").tBodies[0].appendChild(fila);\r\n			}else{\r\n				document.getElementById(\"tabla_CPD\").appendChild(fila);\r\n			}\r\n		}\r\n	}\r\n	yaledio=true;\r\n	\r\n	//alert(\"Termino de crar la tabla q fatidio\");\r\n}\r\nfunction revisarTabla(form){\r\n\r\n	var ano= document.getElementById('ano');\r\n	var ano_elegido=document.getElementById(\"ano_lec\").value;\r\n	ano.value=ano_elegido;\r\n\r\n	var tablamia = document.getElementById('tabla_CPD');\r\n	var datos = document.getElementById('datos_tabla');\r\n	var filas=tablamia.getElementsByTagName('tr');\r\n	\r\n	if(filas.length==1){\r\n		alert(\"Debe ingresar al menos una materia\");\r\n	return false;\r\n	}\r\n	var columnas=filas[1].getElementsByTagName('td');	\r\n	for(i=1;i<filas.length;i++){\r\n		columnas=filas[i].getElementsByTagName('td');\r\n		for(j=0;j<4;j++){\r\n			if(columnas[j].lastChild.value==\"\"){\r\n				alert(\"No deben existir campos vacios en ninguna fila\");\r\n				return false;\r\n			}\r\n			\r\n			if(j == 2 || j == 3){\r\n				if(!(/^([0-9])*$/.test(columnas[j].lastChild.value))){\r\n					alert(\"La cantidad de Estudiantes Estimados por Seccion y de Secciones deben ser enteros\");\r\n					return false;\r\n				}\r\n			}\r\n			if(j==3){\r\n				datos.value=datos.value+columnas[j].lastChild.value;\r\n			}else{\r\n				datos.value=datos.value+columnas[j].lastChild.value+\",\";\r\n			}\r\n		}\r\n		datos.value=datos.value+\";\";\r\n	}\r\n}\r\n\r\nfunction sobre_enlace(columna) {\r\n	x=document.getElementById(columna);\r\n	x.style.color = \"#403f81\";\r\n}\r\n\r\nfunction fuera_enlace(columna) {\r\n	x=document.getElementById(columna);\r\n	x.style.color = \"#ffffff\";\r\n}\r\nfunction error(){\r\n	alert (\"ya creo una partida docente\");\r\n}\r\n\r\n\r\n\r\n\r\n</script>\r\n<body >\r\n<center>\r\n	<div id=\"banner\" style=\"position:relative;\"> \r\n		\r\n	</div>\r\n	\r\n	<div id=\"log_off\" >\r\n		<form name=\"cerrar_sesion\" action=\"log_off\" method=\"get\">\r\n			<input type=\"submit\" name=\"submitlogoff\" id=\"submitlogoff\" value=\"Cerrar sesion\" class=\"botones\">\r\n		</form>	\r\n	</div>\r\n	\r\n	<div id=\"centro\" style=\"left:105\">\r\n		<div id=\"centro_izq\" class=\"menu\" style=\"padding-left:10px; padding-top:5px;\" >\r\n			\r\n			<table border=\"0\" bgcolor=\"#8C8C8C\" id=\"latabla\" name=\"latabla\" width=\"135\" border=\"0\" cellpadding=\"0\" cellspacing=\"4\" valign=\"center\" onmouseover=\"\">\r\n			<tr><!--<script>onmouseover = \"#403f81\"</script>-->\r\n				<td id=\"col1\" name=\"col1\" align=\"center\" style=\"color: #ffffff; font-size:11px;font-weight:bold;\" >\r\n					<a onmouseover=\"sobre_enlace('col1');\" onmouseout=\"fuera_enlace('col1');\" onclick=\"window.location.href='obtenerFechas'\">Crear Programaci\u00f3n Docente</a>\r\n				</td>\r\n			</tr>\r\n			<tr>\r\n				<td id=\"col2\" name=\"col2\" align=\"center\" style=\"color: #ffffff; font-size:11px;font-weight:bold;\">\r\n					<a onmouseover=\"sobre_enlace('col2');\" onmouseout=\"fuera_enlace('col2');\" onclick=\"window.location.href='obtenerFechasModificar'\">Modificar Programaci\u00f3n Docente</a>\r\n				</td>\r\n			</tr>\r\n			<tr>\r\n				<td id=\"col3\" name=\"col3\" align=\"center\" style=\"color: #ffffff; font-size:11px;font-weight:bold;\">\r\n					<a onmouseover=\"sobre_enlace('col3');\" onmouseout=\"fuera_enlace('col3');\" onclick=\"window.location.href='obtenerFechasEliminar'\">Eliminar Programaci\u00f3n Docente</a>\r\n				</td>\r\n			</tr>\r\n			<tr>\r\n				<td id=\"col4\" name=\"col4\" align=\"center\" style=\"color: #ffffff; font-size:11px;font-weight:bold;\">\r\n					<a onmouseover=\"sobre_enlace('col4');\" onmouseout=\"fuera_enlace('col4');\" onclick=\"window.location.href='obtenerFechasConsultar'\">Consultar Programaci\u00f3n Docente</a>\r\n				</td>\r\n			</tr>\r\n			<tr>\r\n				<td id=\"col5\" name=\"col5\" align=\"center\" style=\"color: #ffffff; font-size:11px;font-weight:bold;\">\r\n					<a onmouseover=\"sobre_enlace('col5');\" onmouseout=\"fuera_enlace('col5');\" onclick=\"window.location.href='cargaRecord2'\">Generar Reporte</a>\r\n				</td>\r\n			</tr>\r\n			</table>\r\n			<!--Local incremental array autocompleter ac4<br/> with full-search. Type 'Jac', hit enter a few <br/>times, type 'gne'.<br/> <textarea rows=5 cols=40 id=\"ac4\" autocomplete=\"off\"></textarea>\r\n			--><div id=\"ac4update\" style=\"display:none;border:1px solid black;background-color:white; text-align:left; font-family:Tahoma; font-weight:regular; font-size:14px; color:#403f81;\"></div>\r\n\r\n	\r\n			<!--<script type=\"text/javascript\" language=\"javascript\" charset=\"utf-8\">\r\n			/*Autocompleter.Local(<id del elemneto donde se ingresa el texto>,<id del div en donde se muestran las opciones>,<arreglo de coincidencias>, { <tokens que detienen la busqueda>,fullSearch: true, partialSearch: true} )*/\r\n			// <![CDATA[\r\n			  \r\n			// ]]>\r\n			</script>-->\r\n			\r\n		</div>\r\n		\r\n		<div width=\"500\" height= \"20\" id=\"fondoAgregar\" name=\"fondoAgregar\">\r\n			<span class=\"headerAgregar\">Bienvenido</span>\r\n			\r\n		</div>\r\n		\r\n		<div id=\"centro_der\" name=\"centro_der\" >\r\n		<form id=\"programacion_docente\" name=\"programacion_docente\" onsubmit=\"return revisarTabla(this);\" method=\"get\" action=\"procesarMaterias\">\r\n		\r\n			<select id=\"ano_lec\" name=\"ano_lec\" style=\"width:100px; visibility:hidden; position:absolute; left:410;\" ></select> \r\n				<!--<option selected id=\"defaulta\"> A\u00f1o lectivo</option>\r\n				<option id=\"opa1\"> 2007 </option>\r\n				<option id=\"opa2\"> 2008 </option>-->\r\n	\r\n			<!--<select id=\"leafs\" name=\"leafs\"  onchange=\"modificarPagina();\" onfocus=\"seleccionarsegundo();\" >-->\r\n			<select  id=\"periodo_aca\" name=\"periodo_aca\" style=\"width:50px; visibility:hidden;position:absolute;left:525;\" >\r\n				<option id=\"01\"> 01 </option>\r\n				<option id=\"02\"> 02 </option>\r\n				<option id=\"I\"> I </option>\r\n			</select>\r\n			\r\n			\r\n			\r\n			</br>\r\n			</br>\r\n		\r\n			<input type=\"button\" id=\"agr\" name=\"agr\" style=\"visibility:hidden;\" value=\"Agregar Materia\" onclick=\"agregar_fila_CPD(tabla_CPD);\"></input>\r\n			\r\n			<input type=\"hidden\" name=\"Count\" id=\"Count\" value=\"0\" />\r\n			</br></br>\r\n			<table  border=\"1\" CELLPADDING=\"5\" cellspacing=\"0\" id=\"tabla_CPD\" name=\"tabla_CPD\">\r\n				\r\n			</table>\r\n			</br>\r\n			".toCharArray();
  }
}
