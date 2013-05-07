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

public class buscarPDEliminar extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
			HttpSession session = request.getSession();
			

			String ano = request.getParameter("ano");
			System.out.println("el año desde buscarPDEliminar es: "+ano);
			String periodo = request.getParameter("periodo_aca");
			System.out.println("el periodo desde buscarPDEliminar es: "+periodo);
			String licenciatura=(session.getAttribute("licenciatura")).toString();
			//String tabla = request.getParameter("datos_tabla");
			//String[] filas=tabla.split(";");
			
			String login=(session.getAttribute("departamento")).toString();
			Date fecha=new Date();
			String info=fecha+" "+login+" elimino una Partida Docente en la Base de Datos";
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
			
			ArrayList PD_resultados_error=new ArrayList();
			ManejadorProcesadorPD ClienteBD1 = new ManejadorProcesadorPD();
			ArrayList PD_resultados=ClienteBD1.PD_resultado(licenciatura, ano, periodo);
			if(PD_resultados==null){
				session.setAttribute("PD_resultados_error", PD_resultados_error);
			}
			
			borradorPD ClienteBD= new borradorPD();
			ClienteBD.borrar_partida(licenciatura, ano, periodo);
			
			//ManejadorProcesadorMaterias ClienteBD2 = new ManejadorProcesadorMaterias();
			ArrayList borrado= new ArrayList();
			borrado.add("borrado");
			//String borrado="borrado";
			session.setAttribute("resultados_borrar", borrado);
			response.sendRedirect("departamento_eliminar.jsp");
					
	}
	
	
			
}