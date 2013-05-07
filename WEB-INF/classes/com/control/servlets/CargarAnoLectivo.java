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
import com.modelo.ManejadorCargarAnoLectivo;

public class CargarAnoLectivo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
			
			HttpSession session = request.getSession();
			session.setAttribute("iniciar", "iniciar");
			String licenciatura = (session.getAttribute("licenciatura")).toString();
			System.out.println("Estoy en el servlet MCAL");			
			ManejadorCargarAnoLectivo ClienteBD = new ManejadorCargarAnoLectivo();
			ArrayList AL = ClienteBD.cargarAnosLec(licenciatura);
			session.setAttribute("anos_lectivos", AL);
			response.sendRedirect("jefe_departamento.jsp");
			/*String tabla = request.getParameter("datos_tabla");
			System.out.println(tabla);*/
	}			
}