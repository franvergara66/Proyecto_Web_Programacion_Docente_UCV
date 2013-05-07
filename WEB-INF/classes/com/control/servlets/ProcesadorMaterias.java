/*
 * Created on 21-abr-2005
 *
 
 */
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
import java.io.*;
import java.util.Date;
//import com.modelo.ManejadorVerificacionUsuarios;
import com.modelo.ManejadorProcesadorMaterias;
import com.modelo.estructuras.Materia;


public class ProcesadorMaterias extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
			HttpSession session = request.getSession();
			
			System.out.println("Estoy en el servlet");
			
			String tabla = request.getParameter("datos_tabla");
			String ano = request.getParameter("ano");
			String periodo = request.getParameter("periodo_aca");
			
			String login=(session.getAttribute("departamento")).toString();
			Date fecha=new Date();
			String info=fecha+" "+login+" Se intento guardar una Partida Docente";
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

			
			
			//System.out.println(tabla);
			String[] filas=tabla.split(";");
			String licenciatura=(session.getAttribute("licenciatura")).toString();//request.getParameter("licenciatura");
			System.out.println("la licenciatura por sesion es: "+licenciatura);
			ManejadorProcesadorMaterias ClienteBD = new ManejadorProcesadorMaterias();
			ArrayList resultados=ClienteBD.guardarPartidaDocente(licenciatura, filas, ano, periodo);
			session.setAttribute("resultados", resultados);
			response.sendRedirect("control_estudios.jsp");
			//System.out.println();
			
	}
	
	
			
}