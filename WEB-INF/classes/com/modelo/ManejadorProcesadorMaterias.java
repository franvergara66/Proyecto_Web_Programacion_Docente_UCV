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

import com.modelo.estructuras.*;

public class ManejadorProcesadorMaterias{
	String login="no_login";
	String password="no_pass";

     public ArrayList guardarPartidaDocente(String lic,String[] filas_partida, String ano, String periodo) {
        //ArrayList usuarios = new ArrayList();
		String[] datos= new String[4];
		System.out.println("la licenciatura es: "+ lic);
		ArrayList mat_insertadas = new ArrayList();
		for(int i=0;i<filas_partida.length;i++){
			datos=filas_partida[i].split(",");
			/*for(int j=0;j<datos.length;j++){
				System.out.println(datos[j]);
			}*/
			
		    try {
				BufferedReader bf = new BufferedReader(new FileReader("webapps/proyecto_ati/dbconex.txt"));
			String db=bf.readLine();
			String user=bf.readLine();
			String pass=bf.readLine();
			bf.close();
			Connection conn = null;
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection(db, user, pass);
				System.out.println("justo antes de la consulta");
	            PreparedStatement pstmt = conn
	                    .prepareStatement("INSERT INTO programacion_ofertada (materia_codigo, periodo_academico, ano_lectivo, licenciatura_id, nro_secciones, cupo_por_seccion) VALUES ('"+datos[0]+"', '"+periodo+"', '"+ano+"', '"+lic+"', '"+datos[2]+"', '"+datos[3]+"')");
				//System.out.println(sentencia);
				//System.out.println();
	            pstmt.executeUpdate();
				
				//if (rset.next()){
				//System.out.println("la consulta arrojo resultados");
				//System.out.println("se paso como login: "+log);
				//System.out.println("se  paso como password: "+pass);
				//}else{
				//System.out.println("la consulta no arrojo resultados");
				//}
				/*rset.previous(); 
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
	            }*/

	       /*     if (rset != null){
	                rset.close();
				}else{
					System.out.println("insercion fallida");
				}
	            if (pstmt != null)
	                pstmt.close();
	            if (conn != null)
	                conn.close();
*/
	        } catch (Exception e) {
				mat_insertadas.add(datos[1]);
	            e.printStackTrace();
	        }
		}
		return mat_insertadas;
    }
}