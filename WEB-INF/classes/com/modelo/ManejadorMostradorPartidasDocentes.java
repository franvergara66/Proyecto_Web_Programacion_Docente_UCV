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

import com.modelo.estructuras.*;

public class ManejadorMostradorPartidasDocentes{
	
    public ArrayList cargarPartidasDocentes(String lic, String ano, String per, String est) {
		ArrayList partidas = new ArrayList();
        try{
			Connection conn = null;
	        Class.forName("org.gjt.mm.mysql.Driver");
	        conn = DriverManager.getConnection("jdbc:mysql://localhost/proy_ati", "root", "kira");
			PreparedStatement pstmt;
			Statement sentence = conn.createStatement();
			if(est.equals("OFERTADA")){
				pstmt = conn.prepareStatement("SELECT * FROM programacion_ofertada WHERE licenciatura_id='"+lic+"' AND ano_lectivo='"+ano+"' AND periodo_academico='"+per+"'");
				
			}else{				
				sentence.execute("CREATE TABLE IF NOT EXISTS programacion_en_ejecucion ( materia_codigo varchar(10) NOT NULL default '',nombre_seccion varchar(200) NOT NULL default '',periodo_academico varchar(2) NOT NULL default '', ano_lectivo int(6) unsigned NOT NULL default '0', licenciatura_id varchar(4) NOT NULL default '', docente_cedula_coordinador varchar(20) default NULL, docente_cedula_principal varchar(20) default NULL, docente_cedula_jurado_2 varchar(20) default NULL, docente_cedula_jurado_1 varchar(20) default NULL, PRIMARY KEY  (materia_codigo,nombre_seccion,periodo_academico,ano_lectivo,licenciatura_id))");
				pstmt = conn.prepareStatement("SELECT * FROM programacion_en_ejecucion WHERE licenciatura_id='"+lic+"'");
				//ResultSet rset = pstmt.executeQuery();
			}
			ResultSet rset = pstmt.executeQuery();			
			if (rset.next()){
				System.out.println("la consulta arrojo resultados");
			}else{
				System.out.println("la consulta no arrojo resultados");
			}
			rset.previous();
			if(est.equals("OFERTADA")){
	            while (rset.next()) {
	                programacion_ofertada po = new programacion_ofertada();
	                po.set_materia_codigo(rset.getString("materia_codigo"));
					System.out.println(po.get_materia_codigo());
	                po.set_periodo_academico(rset.getString("periodo_academico"));
					System.out.println(po.get_periodo_academico());
	                po.set_licenciatura_id(rset.getString("licenciatura_id"));
					System.out.println(po.get_licenciatura_id());
					po.set_nro_secciones(Integer.parseInt(rset.getString("nro_secciones")));
					System.out.println(po.get_nro_secciones());
					po.set_cupo_por_seccion(Integer.parseInt(rset.getString("cupo_por_seccion")));
					System.out.println(po.get_cupo_por_seccion());
					po.set_ano_lectivo(Integer.parseInt(rset.getString("ano_lectivo")));
					System.out.println(po.get_ano_lectivo());				
	                partidas.add(po);
	            }
			}else{
				while (rset.next()) {
	                programacion_ejecutada po = new programacion_ejecutada();
	                po.set_materia_codigo(rset.getString("materia_codigo"));
					System.out.println(po.get_materia_codigo());
	                po.set_nombre_seccion(rset.getString("nombre_seccion"));
					System.out.println(po.get_nombre_seccion());
	                po.set_periodo_academico(rset.getString("periodo_academico"));
					System.out.println(po.get_periodo_academico());
					po.set_ano_lectivo(Integer.parseInt(rset.getString("ano_lectivo")));
					System.out.println(po.get_ano_lectivo());
					po.set_licenciatura_id(rset.getString("licenciatura_id"));
					System.out.println(po.get_licenciatura_id());
					po.set_docente_cedula_coordinador(rset.getString("docente_cedula_coordinador"));
					System.out.println(po.get_docente_cedula_coordinador());
					po.set_docente_cedula_principal(rset.getString("docente_cedula_principal"));
					System.out.println(po.get_docente_cedula_principal());
					po.set_docente_cedula_jurado_2(rset.getString("docente_cedula_jurado_2"));
					System.out.println(po.get_docente_cedula_jurado_2());
					po.set_docente_cedula_jurado_1(rset.getString("docente_cedula_jurado_1"));
					System.out.println(po.get_docente_cedula_jurado_1());				
	                partidas.add(po);
				}
			}
            if (rset != null)
                rset.close();
			if (sentence != null)
				sentence.close();
            if (pstmt != null)
                pstmt.close();
			if (conn != null)
                conn.close();
	    } catch (Exception e) { e.printStackTrace();}
		
		return partidas;
    }
}