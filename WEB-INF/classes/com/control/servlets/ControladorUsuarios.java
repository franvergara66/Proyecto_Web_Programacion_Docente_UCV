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

import com.modelo.ManejadorUsuarios;

/**
 * Ejemplo de Controlador
 * 
 * @author Sergio Rivas sergiojoserivas@yahoo.com
 */

public class ControladorUsuarios extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//System.out.println("FUERA!!!");
        //llamando al dominio
        ManejadorUsuarios ClienteBD = new ManejadorUsuarios();
        Collection usuarios = ClienteBD.obtenerUsuarios();

        //obteniendo la sesion
        HttpSession session = request.getSession();

        //guardando parametros en la session
        session.setAttribute("usuarios", usuarios);
        
        //redireccionando a la interfaz
        response.sendRedirect("ver_usuarios.jsp");
    }
}