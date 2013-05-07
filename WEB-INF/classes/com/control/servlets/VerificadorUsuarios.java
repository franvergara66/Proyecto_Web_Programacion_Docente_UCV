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

import com.modelo.ManejadorVerificacionUsuarios;
import com.modelo.estructuras.Usuario;
import java.util.Enumeration;
import java.util.Date;


public class VerificadorUsuarios extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//System.out.println("FUERA!!!");
        //llamando al dominio
		
        ManejadorVerificacionUsuarios ClienteBD = new ManejadorVerificacionUsuarios();
        //ClienteBD.doGet();
		String login=request.getParameter("login");
		String password=request.getParameter("password");
		//System.out.println(login);
		//System.out.println(password);
		Collection usuarios = ClienteBD.obtenerUsuarios(login,password);
		String licenciatura= ClienteBD.obtenerLicenciatura(login);
		System.out.println( "la licenciatura es: "+licenciatura);
		/*=""*/;
        //obteniendo la sesion
        
		Date fecha=new Date();
		String info="";
		//System.out.println("la fecha es: "+ fecha);
		//System.out.println(usuarios.size());
        //redireccionando a la interfaz
		if(usuarios.size()==0){
			//error="error";
			ArrayList error= new ArrayList();
			error.add(true);
			HttpSession session = request.getSession();
			session.setAttribute("error", error);
			response.sendRedirect("index.jsp");
			fecha=new Date();
			info=fecha+" "+login+" no pudo completar su logueo";
			try{
				FileWriter fw = new FileWriter("webapps\\proyecto_ati\\bitacora.txt", true);
				fw.write(info);
				fw.write('\n');
				fw.close();
				//System.out.println("Your file has been written bitacora"); 
			}catch(Exception e) {
	            e.printStackTrace();
			}
		}else{
			fecha=new Date();
			info=fecha+" "+login+" se logueo exitosamente";
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
			//System.out.println("el tipo se logueo bien a las:  "+ fecha);
			HttpSession session = request.getSession();
				
			//guardando parametros en la session
			session.setAttribute("usuarios", usuarios);
			session.setAttribute("licenciatura", licenciatura);
			session.setAttribute("departamento", login);
			
			for (Enumeration e = session.getAttributeNames() ; e.hasMoreElements() ;) {
				System.out.println("El elemento es " + e.nextElement());
			}
			
			System.out.println("la licenciatura" + session.getAttribute("licenciatura"));
			
			//session.removeAttribute("error");
			//response.sendRedirect("login_usuarios.jsp");
			ArrayList A = (ArrayList)usuarios;
			Usuario U = (Usuario)A.get(0);
			if((U.get_cargo()).equalsIgnoreCase("secretario") || (U.get_cargo()).equalsIgnoreCase("secretaria"))
				response.sendRedirect("control_estudios.jsp");
			else if((U.get_cargo()).equalsIgnoreCase("jefe ce")){
				response.sendRedirect("control_estudios2.jsp");
			}
			else if((U.get_cargo()).equalsIgnoreCase("jefe")){
				response.sendRedirect("jefe_departamento.jsp");/*"jefe_departamento.jsp"*/
			}
			else{
				response.sendRedirect("error_cargo.jsp");
			}
		}
       
    }
}