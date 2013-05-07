package com.modelo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.io.*;
import java.util.*;

import com.modelo.estructuras.Usuario;

public class ManejadorUsuarios{

     public Collection obtenerUsuarios() {
        ArrayList usuarios = new ArrayList();
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
                    .prepareStatement("SELECT * FROM usuario");

            ResultSet rset = pstmt.executeQuery();
			
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
}