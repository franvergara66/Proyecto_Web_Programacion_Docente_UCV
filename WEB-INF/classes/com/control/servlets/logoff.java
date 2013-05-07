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

public class logoff extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
			HttpSession session = request.getSession();
			String login=(session.getAttribute("departamento")).toString();;
			String licenciatura=(session.getAttribute("licenciatura")).toString();//request.getParameter("licenciatura");
			System.out.println("la licenciatura por sesion es: "+licenciatura);
			
			//String login=(session.getAttribute("departamento")).toString();
			Date fecha=new Date();
			String info=fecha+" "+login+" salió del Sistema Manejador de Partidas Docentes";
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
			
			session.invalidate();
			response.sendRedirect("index.jsp");
			//System.out.println();
			
	}
	
	
			
}