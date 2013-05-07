/*
 * Created on 21-abr-2005
 *
 
 */
package com.control.servlets;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.modelo.ManejadorMateria;

/**
 * Ejemplo de Controlador
 * 
 * @author Sergio Rivas sergiojoserivas@yahoo.com
 */

public class ControladorMaterias extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
System.out.println("FUERA!!!");
        //llamando al dominio
        ManejadorMateria ClienteBD = new ManejadorMateria();
        Collection materias = ClienteBD.obtenerMaterias();

        //obteniendo la sesion
        HttpSession session = request.getSession();

        //guardando parametros en la session
        session.setAttribute("materias", materias);
        
        //redireccionando a la interfaz
        response.sendRedirect("ver_materias.jsp");
    }
}