package com.modelo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.modelo.estructuras.Usuario;

public class ManejadorVerificacionUsuarios{
	String login="no_login";
	String password="no_pass";
	String escuela="";
     public Collection obtenerUsuarios(String log,String pass) {
        ArrayList usuarios = new ArrayList();
		//HttpServletRequest request= HttpServletRequest();
		//login=request.getParameter("login");
		//password=request.getParameter("password");	
		//doGet();
		//String log=session.getAttribute("login");
		//String pass=session.getAttribute("password");
        try {
			BufferedReader bf = new BufferedReader(new FileReader("webapps/proyecto_ati/dbconex.txt"));
			String db=bf.readLine();
			String user=bf.readLine();
			String passw=bf.readLine();
			bf.close();
			Connection conn = null;
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection(db, user, passw);
			System.out.println("justo antes de la consulta");
            PreparedStatement pstmt = conn
                    .prepareStatement("SELECT * FROM usuario WHERE login='"+log+"' AND clave='"+pass+"'");
/*'*/
            ResultSet rset = pstmt.executeQuery();
			/*if (rset != null){
			System.out.println("la consulta es distinto de null");
			}else{
			System.out.println("la consulta es  null");
			}*/
			if (rset.next()){
			System.out.println("la consulta arrojo resultados");
			//System.out.println("se paso como login: "+log);
			//System.out.println("se  paso como password: "+pass);
			}else{
			System.out.println("la consulta no arrojo resultados");
			}
			rset.previous(); 
            while (rset.next()) {
				//System.out.println("entreeeeeeeeeee");
                Usuario usuario = new Usuario();
                usuario.set_login(rset.getString("login"));
                usuario.set_cedula(Integer.parseInt(rset.getString("cedula")));
                usuario.set_nombres(rset.getString("nombres"));
				usuario.set_apellidos(rset.getString("apellidos"));
				usuario.set_clave(rset.getString("clave"));
				usuario.set_cargo(rset.getString("cargo"));
				usuario.set_correo(rset.getString("correo"));
				usuario.set_observaciones(rset.getString("observaciones"));
				
                usuarios.add(usuario);
            }

            if (rset != null)
                rset.close();
            if (pstmt != null)
                pstmt.close();
            if (conn != null)
                conn.close();

				
				
        } catch (Exception e) {

            e.printStackTrace();
        }

        return usuarios;
    }
	
	
	public String obtenerLicenciatura(String log) {	
		try {
			BufferedReader bf = new BufferedReader(new FileReader("webapps/proyecto_ati/dbconex.txt"));
			String db=bf.readLine();
			String user=bf.readLine();
			String passw=bf.readLine();
			bf.close();
			Connection conn = null;
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection(db, user, passw);
			PreparedStatement pstmt = conn
                    .prepareStatement("SELECT * FROM usuario_de_licenciatura WHERE usuario_login='"+log+"'");
			ResultSet rset = pstmt.executeQuery();
			rset.next();
			escuela=rset.getString("licenciatura_id");
			System.out.println(escuela);
			if (rset != null)
                rset.close();
            if (pstmt != null)
                pstmt.close();
            if (conn != null)
                conn.close();


		} catch (Exception e) {

            e.printStackTrace();
        }
		return escuela;
	}
}