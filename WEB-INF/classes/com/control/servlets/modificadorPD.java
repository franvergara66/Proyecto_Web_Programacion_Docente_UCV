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
import com.modelo.borradorPD;
import com.modelo.ManejadorProcesadorFechas;
import com.modelo.ManejadorProcesadorMaterias;
import com.modelo.estructuras.*;

/**
 * Ejemplo de Controlador
 * 
 * @author Sergio Rivas sergiojoserivas@yahoo.com
 */

public class modificadorPD extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
			HttpSession session = request.getSession();
			
			//System.out.println("Estoy en el servlet");
			//String tabla = request.getParameter("datos_tabla");
			String ano = session.getAttribute("ano").toString();
			
			System.out.println("el año desde modificadorPD es: "+ano);
			String periodo = session.getAttribute("periodo").toString();
			System.out.println("el periodo desde modificadorPD es: "+periodo);
			String licenciatura=(session.getAttribute("licenciatura")).toString();
			String tabla = request.getParameter("datos_tabla");
			String[] filas=tabla.split(";");
			
			String login=(session.getAttribute("departamento")).toString();
			Date fecha=new Date();
			String info=fecha+" "+login+" Modifico una Partida Docente en la Base de Datos";
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
			
			borradorPD ClienteBD= new borradorPD();
			ClienteBD.borrar_partida(licenciatura, ano, periodo);
			
			ManejadorProcesadorMaterias ClienteBD2 = new ManejadorProcesadorMaterias();
			ArrayList resultados2=ClienteBD2.guardarPartidaDocente(licenciatura, filas,ano, periodo);
			
			session.setAttribute("resultados2", resultados2);
			response.sendRedirect("departamento_modificar.jsp");
					
	}
	
	
			
}