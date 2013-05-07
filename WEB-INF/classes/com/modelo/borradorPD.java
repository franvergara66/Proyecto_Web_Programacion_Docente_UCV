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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;

import com.modelo.estructuras.*;

public class borradorPD{
	public void borrar_partida(String lic, String ano, String periodo) {
        //ArrayList prog_of = new ArrayList();
        try {
			BufferedReader bf = new BufferedReader(new FileReader("webapps/proyecto_ati/dbconex.txt"));
			String db=bf.readLine();
			String user=bf.readLine();
			String pass=bf.readLine();
			bf.close();
			Connection conn = null;
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection(db, user, pass);
			//System.out.println("justo antes de la consulta");
			
			//System.out.println("el periodo desde borradorPD es: "+periodo);
			//System.out.println("el periodo desde borradorPD es: "+ano);
			
            PreparedStatement pstmt = conn
                    .prepareStatement("DELETE FROM programacion_ofertada WHERE periodo_academico='"+periodo+"' AND ano_lectivo='"+ano+"' AND licenciatura_id='"+lic+"'");
					
					//System.out.println("DELETE FROM programacion_ofertada WHERE periodo_academico='"+periodo+"' AND ano_lectivo='"+ano+"' AND licenciatura_id='"+lic+"'");
            pstmt.executeUpdate();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}		
		