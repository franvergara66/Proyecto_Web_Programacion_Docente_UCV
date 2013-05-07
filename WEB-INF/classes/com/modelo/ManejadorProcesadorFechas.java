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

public class ManejadorProcesadorFechas{
	public void obtenerMaterias(String lic) {
        ArrayList usuarios = new ArrayList();
		String materias="";
		String codigos="";
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
            PreparedStatement pstmt = conn
                    .prepareStatement("SELECT * FROM materia WHERE licenciatura_id_origen='"+lic+"'");
            ResultSet rset = pstmt.executeQuery();
		/*	if (rset.next()){
				System.out.println("la consulta arrojo resultados");
			}else{
				System.out.println("la consulta no arrojo resultados");
			}*/
			//rset.previous(); 
            while (rset.next()) {
				codigos=codigos+rset.getString("codigo")+",";
				materias=materias+rset.getString("nombre_completo")+",";
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
		String[]lista_mat=materias.split(",");
		String[]lista_cod=codigos.split(",");
		try{
	        Writer output = null;
			//String text = "Rajesh Kumar";
			File file = new File("webapps\\proyecto_ati\\materias.txt");
			output = new BufferedWriter(new FileWriter(file));
			for (int i = 0; i <lista_mat.length; i++){
	            output.write(lista_mat[i]);
				output.write("\r\n");
				//salArch.println ();
	        }
			/*String line=""; int numero=0;
			while(line!=null){
				line=file.readLine();
				numero++;
			}
			System.out.println(" numero de lineassssssssssssssssssssssssss: "+numero);*/
			//file.seek(file.length());
			//output.write("cooooooooooooooooooooooooooooooooooooooooooje");
			output.close();
			System.out.println("Your file has been written1"); 
		}catch(Exception e) {
            e.printStackTrace();
		}
		
		try{
	        Writer output = null;
			//String text = "Rajesh Kumar";
			File file = new File("webapps\\proyecto_ati\\codigos.txt");
			output = new BufferedWriter(new FileWriter(file));
			for (int i = 0; i <lista_cod.length; i++){
	            output.write(lista_cod[i]);
				output.write("\r\n");
				//salArch.println ();
	        }
			output.close();
			System.out.println("Your file has been written2"); 
		}catch(Exception e) {
            e.printStackTrace();
		}
    }
	
	public void obtenerPeriodosAnos() {
        ArrayList usuarios = new ArrayList();
		String ano_lec="";
		
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
            PreparedStatement pstmt = conn
                    .prepareStatement("select distinct(ano_lectivo) from periodo_academico");
            ResultSet rset = pstmt.executeQuery();
		/*	if (rset.next()){
				System.out.println("la consulta arrojo resultados");
			}else{
				System.out.println("la consulta no arrojo resultados");
			}
			//rset.previous(); */
            while (rset.next()) {
				ano_lec=ano_lec+rset.getString("ano_lectivo")+",";
				
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
		String[]lista_ano_lec=ano_lec.split(",");
		
		
		
		try{
	        Writer output = null;
			//String text = "Rajesh Kumar";
			File file = new File("webapps\\proyecto_ati\\anos_lectivos.txt");
			output = new BufferedWriter(new FileWriter(file));
			for (int i = 0; i <lista_ano_lec.length; i++){
	            output.write(lista_ano_lec[i]);
				output.write("\r\n");
				//salArch.println ();
	        }
			output.close();
			System.out.println("Your file has been written4"); 
		}catch(Exception e) {
            e.printStackTrace();
		}
    }
}