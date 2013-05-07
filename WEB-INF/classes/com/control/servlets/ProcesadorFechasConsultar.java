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

//import com.modelo.ManejadorVerificacionUsuarios;
import com.modelo.ManejadorProcesadorFechas;
import com.modelo.estructuras.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;
import java.io.* ;
import java.util.*;


public class ProcesadorFechasConsultar extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
			HttpSession session = request.getSession();
			String licenciatura=(session.getAttribute("licenciatura")).toString();
			
			ManejadorProcesadorFechas ClienteBD=new ManejadorProcesadorFechas();
			ClienteBD.obtenerMaterias(licenciatura);
			ClienteBD.obtenerPeriodosAnos();
			System.out.println("Estoy en el servlet");
			String login=(session.getAttribute("departamento")).toString();
			Date fecha=new Date();
			String info=fecha+" "+login+" entro en Consultar Partida Docente";
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

			
			String[] datos= new String[3];
			Cookie cookie1 = new Cookie ("datos", "true");
			System.out.println("el nombre de la cookie es: "+cookie1.getName());
			System.out.println("el valor de la cookie es: "+cookie1.getValue());	
			cookie1.setMaxAge(365 * 24 * 60 * 60);
			response.addCookie(cookie1);
			response.sendRedirect("departamento_consultar.jsp");
			
	}
	
	
			
}