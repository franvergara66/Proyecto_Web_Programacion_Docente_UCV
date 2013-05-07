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
import com.modelo.ManejadorMostradorPartidasDocentes;

public class MostradorPartidasDocentes extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
			
			HttpSession session = request.getSession();
			
			String login=(session.getAttribute("departamento")).toString();
			Date fecha=new Date();
			String info=fecha+" "+login+" busco una Partida Docente en la Base de Datos";
			try{
				FileWriter fw = new FileWriter("webapps\\proyecto_ati\\bitacora.txt", true);
				fw.write(info);
				fw.write('\n');
				fw.close();
				//System.out.println("Your file has been written bitacora"); 
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
			String ano = request.getParameter("ano");
			session.setAttribute("ano", ano);
		//	System.out.println("el año desde mostrador partidas docentes es: "+ano);
			String periodo = request.getParameter("periodo_aca");
			session.setAttribute("periodo_aca", periodo);
		//	System.out.println("el periodo desde mostrador partidas docentes es: "+periodo);
			String estado = request.getParameter("estado");
		//	System.out.println("el estado desde mostrador partidas docentes es: "+estado);
			session.setAttribute("estado", estado);
			String licenciatura = (session.getAttribute("licenciatura")).toString();
		//	System.out.println("Estoy en el servlet MPD");			
			ManejadorMostradorPartidasDocentes ClienteBD = new ManejadorMostradorPartidasDocentes();
			ArrayList partidas = ClienteBD.cargarPartidasDocentes(licenciatura, ano, periodo, estado);
			session.setAttribute("partidas", partidas);
			response.sendRedirect("jefe_departamento.jsp");
			/*String tabla = request.getParameter("datos_tabla");
			System.out.println(tabla);*/
	}			
}