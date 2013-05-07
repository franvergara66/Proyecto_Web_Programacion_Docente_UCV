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

import com.modelo.estructuras.programacion_ejecutada;
import com.modelo.estructuras.programacion_ofertada;

public class ManejadorProgramaciones{

     public Collection obtenerProgramaciones(String per, String ano, String lic) {
        ArrayList prog = new ArrayList();
		//HttpServletRequest request= HttpServletRequest();
		//login=request.getParameter("login");
		//password=request.getParameter("password");	
		//doGet();
		//String log=session.getAttribute("login");
		//String pass=session.getAttribute("password");
		String licen="";
		if(lic.equals("Computacion")){
			licen="C";
		}else if(lic.equals("Quimica")){
			licen="Q";
		}else if(lic.equals("Matematica")){
			licen="M";
		}else if(lic.equals("Fisica")){
			licen="F";
		}else if(lic.equals("Geoquimica")){
			licen="G";
		}else if(lic.equals("Biologia")){
			licen="B";
		}
		
		System.out.println("parametros "+per+" "+ano+" "+licen);
		
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
                    .prepareStatement("SELECT * FROM programacion_ejecutada WHERE periodo_academico='"+per+"' AND ano_lectivo='"+ano+"' AND licenciatura_id='"+licen+"'");
/*'*/
            ResultSet rset = pstmt.executeQuery();
			/*if (rset != null){
			System.out.println("la consulta es distinto de null");
			}else{
			System.out.println("la consulta es  null");
			}*/
			/*if (rset.next()){
			System.out.println("la consulta arrojo resultados");
			//System.out.println("se paso como login: "+log);
			//System.out.println("se  paso como password: "+pass);
			}else{
			System.out.println("la consulta no arrojo resultados");
			}
			rset.previous(); */
			//int i=0;
            while (rset.next()) {
				//System.out.println("es "+i);
				
                programacion_ejecutada pe = new programacion_ejecutada();
                pe.set_materia_codigo(rset.getString("materia_codigo"));
                pe.set_nombre_seccion(rset.getString("nombre_seccion"));
                pe.set_periodo_academico(rset.getString("periodo_academico"));
				pe.set_ano_lectivo(Integer.parseInt(rset.getString("ano_lectivo")));
				pe.set_licenciatura_id(rset.getString("licenciatura_id"));
				pe.set_docente_cedula_coordinador(rset.getString("docente_cedula_coordinador"));
				pe.set_docente_cedula_principal(rset.getString("docente_cedula_principal"));
				pe.set_docente_cedula_jurado_1(rset.getString("docente_cedula_jurado_1"));
				pe.set_docente_cedula_jurado_2(rset.getString("docente_cedula_jurado_2"));
				
				String cod = pe.get_materia_codigo();
				PreparedStatement pstmt2 = conn
                    .prepareStatement("SELECT * FROM materia WHERE codigo='"+cod+"'");

				ResultSet rset2 = pstmt2.executeQuery();
				
				rset2.next();
				
				pe.set_materia_nombre(rset2.getString("nombre_corto"));
				
                prog.add(pe);
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

        return prog;
    }
	
	public Collection obtenerProgOfer(String per, String ano, String lic) {
        ArrayList prog = new ArrayList();
		//HttpServletRequest request= HttpServletRequest();
		//login=request.getParameter("login");
		//password=request.getParameter("password");	
		//doGet();
		//String log=session.getAttribute("login");
		//String pass=session.getAttribute("password");
		String licen="";
		if(lic.equals("Computacion")){
			licen="C";
		}else if(lic.equals("Quimica")){
			licen="Q";
		}else if(lic.equals("Matematica")){
			licen="M";
		}else if(lic.equals("Fisica")){
			licen="F";
		}else if(lic.equals("Geoquimica")){
			licen="G";
		}else if(lic.equals("Biologia")){
			licen="B";
		}
		
		try {
			Connection conn = null;
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/proy_ati", "root", "");
			//System.out.println("justo antes de la consulta");
            PreparedStatement pstmt = conn
                    .prepareStatement("SELECT * FROM programacion_ofertada WHERE periodo_academico='"+per+"' AND ano_lectivo='"+ano+"' AND licenciatura_id='"+licen+"'");
/*'*/
            ResultSet rset = pstmt.executeQuery();
			/*if (rset != null){
			System.out.println("la consulta es distinto de null");
			}else{
			System.out.println("la consulta es  null");
			}*/
			/*if (rset.next()){
			System.out.println("la consulta arrojo resultados");
			//System.out.println("se paso como login: "+log);
			//System.out.println("se  paso como password: "+pass);
			}else{
			System.out.println("la consulta no arrojo resultados");
			}
			rset.previous(); */
			//int i=0;
            while (rset.next()) {
				//System.out.println("es "+i);
				
                programacion_ofertada po = new programacion_ofertada();
                po.set_materia_codigo(rset.getString("materia_codigo"));
                po.set_periodo_academico(rset.getString("periodo_academico"));
				po.set_ano_lectivo(Integer.parseInt(rset.getString("ano_lectivo")));
				po.set_licenciatura_id(rset.getString("licenciatura_id"));
				po.set_nro_secciones(Integer.parseInt(rset.getString("nro_secciones")));
				po.set_cupo_por_seccion(Integer.parseInt(rset.getString("cupo_por_seccion")));				
				
				/*String cod = po.get_materia_codigo();
				PreparedStatement pstmt2 = conn
                    .prepareStatement("SELECT * FROM materia WHERE codigo='"+cod+"'");

				ResultSet rset2 = pstmt2.executeQuery();
				
				rset2.next();
				
				po.set_materia_nombre(rset2.getString("nombre_corto"));*/
				
                prog.add(po);
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
		
		 return prog;
		
	}
	
}