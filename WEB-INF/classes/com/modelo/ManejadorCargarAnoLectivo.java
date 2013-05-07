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

public class ManejadorCargarAnoLectivo{
	
    public ArrayList cargarAnosLec(String lic) {
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
	        PreparedStatement pstmt = conn.prepareStatement("SELECT ano_lectivo FROM periodo_academico WHERE periodo_academico='01'");
			ResultSet rset = pstmt.executeQuery();
			if (rset.next()){
				//System.out.println("la consulta arrojo resultados");
			}else{
				//System.out.println("la consulta no arrojo resultados");
			}
			rset.previous(); 
			String ano="";
            while (rset.next()) {
				ano = rset.getString("ano_lectivo");
                AL.add(ano);
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