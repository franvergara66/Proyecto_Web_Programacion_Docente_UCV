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
import com.modelo.ManejadorCargarReporte;

public class CargarReporte extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
			
			HttpSession session = request.getSession();
			System.out.println("Estoy en el servlet CR");			
			ManejadorCargarReporte ClienteBD = new ManejadorCargarReporte();
			ArrayList AL1 = ClienteBD.cargarDocentes();
			ArrayList AL2 = ClienteBD.cargarMaterias();
			session.setAttribute("info_docentes", AL1);
			session.setAttribute("info_materias", AL2);
			response.sendRedirect("generar_reporte_jefe.jsp");
	}			
}