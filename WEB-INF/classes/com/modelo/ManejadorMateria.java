package com.modelo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
import java.io.*;
import java.lang.Object;

import com.modelo.estructuras.Materia;

public class ManejadorMateria{

     public Collection obtenerMaterias() {
        ArrayList materias = new ArrayList();
        try {
			BufferedReader bf = new BufferedReader(new FileReader("webapps/proyecto_ati/dbconex.txt"));
			String db=bf.readLine();
			String user=bf.readLine();
			String pass=bf.readLine();
			bf.close();
			Connection conn = null;
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection(db, user, pass);

            PreparedStatement pstmt = conn
                    .prepareStatement("SELECT * FROM materia");

            ResultSet rset = pstmt.executeQuery();
			
            while (rset.next()) {
				//System.out.println("entreeeeeeeeeee");
                Materia materia = new Materia();
                materia.set_licenciatura_id_origen(rset.getString("id"));
                materia.set_nombre_corto(rset.getString("nombre"));
                materia.set_codigo(rset.getString("codigo"));
                materias.add(materia);
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

        return materias;
    }
}