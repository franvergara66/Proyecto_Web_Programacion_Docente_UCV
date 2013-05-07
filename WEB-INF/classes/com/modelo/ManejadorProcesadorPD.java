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

public class ManejadorProcesadorPD{
	public ArrayList PD_resultado(String lic, String ano, String periodo) {
        ArrayList prog_of = new ArrayList();
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
                    .prepareStatement("SELECT * FROM programacion_ofertada, materia WHERE periodo_academico='"+periodo+"' AND ano_lectivo='"+ano+"' AND licenciatura_id='"+lic+"' AND materia.codigo = programacion_ofertada.materia_codigo");
            ResultSet rset = pstmt.executeQuery();
			
			if (rset.next()){
				System.out.println("la consulta de partidas docentes arrojo resultados");
			}else{
				System.out.println("la consulta de partidas docentes no arrojo resultados");
				prog_of=null;
				return prog_of;
			}
			rset.previous(); 
			programacion_ofertada PDO;
            while (rset.next()) {
				PDO=new programacion_ofertada();
				PDO.set_materia_codigo(rset.getString("codigo"));
				PDO.set_materia_nombre(rset.getString("nombre_completo"));
				PDO.set_periodo_academico(rset.getString("periodo_academico"));
				PDO.set_ano_lectivo(Integer.parseInt(rset.getString("ano_lectivo")));
				PDO.set_licenciatura_id(rset.getString("licenciatura_id_origen"));
				PDO.set_nro_secciones(Integer.parseInt(rset.getString("nro_secciones")));
				PDO.set_cupo_por_seccion(Integer.parseInt(rset.getString("cupo_por_seccion")));
				//filasPD=filasPD+rset.getString("materia_codigo")+","+rset.getString("nro_secciones")+","++rset.getString("cupo_por_seccion")+";";
				prog_of.add(PDO);
            }
			
			/*PDO=(programacion_ofertada)prog_of.get(1);
			System.out.println("la codigo de la materia es "+PDO.get_materia_codigo());
			System.out.println("el nombre de la materia es "+PDO.get_materia_nombre());
			System.out.println("el periodo academico es "+PDO.get_periodo_academico());
			System.out.println("el año lectivo es "+PDO.get_ano_lectivo());
			System.out.println("la licenciatura es "+PDO.get_licenciatura_id());
			System.out.println("la cantidad de secciones son: "+PDO.get_nro_secciones());
			System.out.println("el cupo por secciones es: "+PDO.get_cupo_por_seccion());*/
			
            if (rset != null)
                rset.close();
            if (pstmt != null)
                pstmt.close();
            if (conn != null)
                conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return prog_of;
	}
	
}