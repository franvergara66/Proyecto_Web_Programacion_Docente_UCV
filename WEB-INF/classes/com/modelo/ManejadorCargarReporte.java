package com.modelo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.*;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.modelo.estructuras.*;

public class ManejadorCargarReporte{
	
    public ArrayList cargarDocentes() {
		ArrayList AL = new ArrayList();
        try{
			BufferedReader bf = new BufferedReader(new FileReader("webapps/proyecto_ati/dbconex.txt"));
			String db=bf.readLine();
			String user=bf.readLine();
			String pass=bf.readLine();
			bf.close();
			Connection conn = null;
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection(db, user, pass);
			//System.out.println("justo antes de la consulta");
	        PreparedStatement pstmt = conn.prepareStatement("SELECT nombre FROM docente");
			ResultSet rset = pstmt.executeQuery();
			if (rset.next()){
				System.out.println("la consulta arrojo resultados");
			}else{
				System.out.println("la consulta no arrojo resultados");
			}
			rset.previous(); 
			String docente="";
            while (rset.next()) {
				docente = rset.getString("nombre");
                AL.add(docente);
			//	System.out.println("ano: "+ano);
            }

            if (rset != null)
                rset.close();
            if (pstmt != null)
                pstmt.close();
            if (conn != null)
                conn.close();
	    } catch (Exception e) { e.printStackTrace();}
		
		return AL;
    }
	
	public ArrayList cargarMaterias() {
		ArrayList AL = new ArrayList();
        try{
			Connection conn = null;
	        Class.forName("org.gjt.mm.mysql.Driver");
	        conn = DriverManager.getConnection("jdbc:mysql://localhost/proy_ati", "root", "kira");
			//System.out.println("justo antes de la consulta");
	        PreparedStatement pstmt = conn.prepareStatement("SELECT nombre_corto FROM materia");
			ResultSet rset = pstmt.executeQuery();
			if (rset.next()){
				System.out.println("la consulta arrojo resultados");
			}else{
				System.out.println("la consulta no arrojo resultados");
			}
			rset.previous(); 
			String materia="";
            while (rset.next()) {
				materia = rset.getString("nombre_corto");
                AL.add(materia);
			//	System.out.println("ano: "+ano);
            }

            if (rset != null)
                rset.close();
            if (pstmt != null)
                pstmt.close();
            if (conn != null)
                conn.close();
	    } catch (Exception e) { e.printStackTrace();}
		
		return AL;
    }
}