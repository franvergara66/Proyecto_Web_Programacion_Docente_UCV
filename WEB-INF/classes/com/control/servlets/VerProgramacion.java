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

import com.modelo.ManejadorProgramaciones;
import com.modelo.estructuras.programacion_ejecutada;

public class VerProgramacion extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//System.out.println("FUERA!!!");
        //llamando al dominio
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
		
		String tip=	request.getParameter("tipo");
		String per = request.getParameter("periodo");
		String ano = request.getParameter("ano");
		String licen= request.getParameter("lic");
		
		
        ManejadorProgramaciones MP = new ManejadorProgramaciones();
		
        //ClienteBD.doGet();

		//System.out.println(login);
		//System.out.println(password);
		if (tip.equals("Ejecutada")){
			Collection program = MP.obtenerProgramaciones(per,ano,licen);
		/*=""*/;
        //obteniendo la sesion
			
				
        //guardando parametros en la session
			session.setAttribute("progEjecutadas", program);
		
		
			if(program.size()==0){
				//error="error";
				ArrayList error2= new ArrayList();
				error2.add(true);
				session.setAttribute("error2", error2);
			}
		}
		else{
			Collection program2 = MP.obtenerProgOfer(per,ano,licen);
		/*=""*/;
        //obteniendo la sesion
			
				
        //guardando parametros en la session
			session.setAttribute("progOfer", program2);
		
		
			if(program2.size()==0){
				//error="error";
				ArrayList error3= new ArrayList();
				error3.add(true);
				session.setAttribute("error3", error3);
			}
		}
		//System.out.println(usuarios.size());
        //redireccionando a la interfaz
		response.sendRedirect("control_estudios2.jsp");
       
    }
}