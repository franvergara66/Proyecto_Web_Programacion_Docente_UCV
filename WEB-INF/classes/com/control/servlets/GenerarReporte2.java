package com.control.servlets;

import java.io.IOException;
import java.io.*;
import java.util.*;
import java.util.Collection;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.modelo.ManejadorVerificacionUsuarios;
import com.modelo.ManejadorGenerarReporte;

public class GenerarReporte2 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
			
			HttpSession session = request.getSession();
			String login=(session.getAttribute("departamento")).toString();
			Date fecha=new Date();
			String info=fecha+" "+login+" Genera Reportes Historicos";
			try{
				FileWriter fw = new FileWriter("webapps\\proyecto_ati\\bitacora.txt", true);
				fw.write(info);
				fw.write('\n');
				fw.close();
				//System.out.println("Your file has been written bitacora"); 
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			String tipo1 = request.getParameter("tipo1");
			String tipo2 = request.getParameter("tipo2");
			
		//	System.out.println("el periodo desde mostrador partidas docentes es: "+periodo);
			String docente = request.getParameter("docente");
			String materia = request.getParameter("materia");
			//System.out.println(docente);
			System.out.println("mat "+materia);
		//	System.out.println("el estado desde mostrador partidas docentes es: "+estado);			
			System.out.println("Estoy en el servlet GR");			
			ManejadorGenerarReporte ClienteBD = new ManejadorGenerarReporte();
			ClienteBD.crearReporte(tipo1, tipo2, docente, materia);
			//session.setAttribute("realizado", "realizado");
			response.sendRedirect("generar_reporte_dep.jsp");
			/*String tabla = request.getParameter("datos_tabla");
			System.out.println(tabla);*/
	}			
}