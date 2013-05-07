/*
 * Created on 21-abr-2005
 *
 
 */
package com.control.servlets;

import java.io.IOException;
import java.util.Collection;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;
import java.io.* ;
import java.util.*;

//import com.modelo.ManejadorVerificacionUsuarios;
import com.modelo.ManejadorProcesadorPD;
import com.modelo.ManejadorProcesadorFechas;
import com.modelo.ManejadorProcesadorFechas;
import com.modelo.estructuras.*;

/**
 * Ejemplo de Controlador
 * 
 * @author Sergio Rivas sergiojoserivas@yahoo.com
 */

public class buscarPDConsultar extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
			HttpSession session = request.getSession();
			
			//System.out.println("Estoy en el servlet");
			//String tabla = request.getParameter("datos_tabla");
			String ano = request.getParameter("ano");
			System.out.println("el año desde buscarPD es: "+ano);
			String periodo = request.getParameter("periodo_aca");
			ArrayList PD_resultados_error=new ArrayList();
			//System.out.println(tabla);
			//String[] filas=tabla.split(";");
			String licenciatura=(session.getAttribute("licenciatura")).toString();//request.getParameter("licenciatura");
			System.out.println("la licenciatura por sesion es: "+licenciatura);
			
			String login=(session.getAttribute("departamento")).toString();
			Date fecha=new Date();
			String info=fecha+" "+login+" consulto una Partida Docente en la Base de Datos";
			//System.out.println("ruuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuta: "+this.getClass().getResource("../../../../../bitacora.txt"));
			try{
				FileWriter fw = new FileWriter("webapps\\proyecto_ati\\bitacora.txt", true);
				fw.write(info);
				fw.write('\n');
				fw.close();
				//System.out.println("Your file has been written bitacora"); 
			}catch(Exception e) {
	            e.printStackTrace();
			}
			
			ManejadorProcesadorPD ClienteBD = new ManejadorProcesadorPD();
			ArrayList PD_resultados=ClienteBD.PD_resultado(licenciatura, ano, periodo);
			if(PD_resultados==null){
				session.setAttribute("PD_resultados_error", PD_resultados_error);
			}
			Cookie cookie1 = new Cookie ("tab", "true");
			System.out.println("el nombre de la cookie es: "+cookie1.getName());
			System.out.println("el valor de la cookie es: "+cookie1.getValue());	
			cookie1.setMaxAge(365 * 24 * 60 * 60);
			response.addCookie(cookie1);
			
			session.setAttribute("PD_resultados", PD_resultados);
			
			
			
			/// Codigo que llena los archivos para q todo este bien ////
			String licenciatura2=(session.getAttribute("licenciatura")).toString();
			
			ManejadorProcesadorFechas ClienteBD1=new ManejadorProcesadorFechas();
			/*String materias_lic=*/ ClienteBD1.obtenerMaterias(licenciatura2);
			ClienteBD1.obtenerPeriodosAnos();
			//System.out.println(materias_lic);
			System.out.println("Estoy en el servlet");
			
			
			String[] datos= new String[3];
			//Cookie cookie1 = new Cookie ("datos", materias_lic);
			Cookie cookie2 = new Cookie ("datos", "true");
			System.out.println("el nombre de la cookie es: "+cookie2.getName());
			System.out.println("el valor de la cookie es: "+cookie2.getValue());	
			cookie2.setMaxAge(365 * 24 * 60 * 60);
			response.addCookie(cookie2);
			
			////////////////////////////////////////////////////
			
			response.sendRedirect("departamento_consultar.jsp");
			//System.out.println();
			
	}
	
	
			
}