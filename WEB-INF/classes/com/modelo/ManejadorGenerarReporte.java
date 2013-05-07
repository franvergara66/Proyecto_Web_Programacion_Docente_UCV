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

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import com.lowagie.text.Image;
import java.lang.Object;
import com.lowagie.text.FontFactory;
import java.awt.Font;
import java.awt.Color;
import com.lowagie.text.Element;

import com.modelo.estructuras.*;

public class ManejadorGenerarReporte{
	
    public void crearReporte(String t1, String t2, String doc, String mat) {
		try{
			Document document = new Document();
			
			BufferedReader bf = new BufferedReader(new FileReader("webapps/proyecto_ati/dbconex.txt"));
			String db=bf.readLine();
			String user=bf.readLine();
			String pass=bf.readLine();
			bf.close();
			Connection conn = null;
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection(db, user, pass);
			PreparedStatement pstmt, pstmt2, pstmt3;
		/*	System.out.println("tipo1 "+t1);
			System.out.println("tipo2 "+t2);*/
			if(t1 != null){
				PdfWriter.getInstance(document, new FileOutputStream("webapps/proyecto_ati/RecordHistoricoDocente.pdf"));
				document.open();
				
				Image jpg = Image.getInstance("webapps/proyecto_ati/ucv.jpg");
				jpg.setAlignment(Element.ALIGN_CENTER);
				document.add(jpg);
				
				Paragraph p = new Paragraph("SISTEMA ADMINISTRADOR DE PROGRAMACIONES DOCENTES",
				FontFactory.getFont(FontFactory.HELVETICA, 16, Font.ITALIC, new Color(0, 0, 0)));
				p.setAlignment(Element.ALIGN_CENTER);
				document.add(p);
				
				p = new Paragraph("Record Histórico de Docente"+"\n",
				FontFactory.getFont(FontFactory.HELVETICA, 14, Font.ITALIC, new Color(0, 0, 0)));
				p.setAlignment(Element.ALIGN_CENTER);
				document.add(p);
				
				pstmt2 = conn.prepareStatement("SELECT cedula FROM docente WHERE nombre='"+doc+"'");				
				ResultSet rset2 = pstmt2.executeQuery();
				if (rset2.next()){
					String ced=rset2.getString("cedula");
					
					p = new Paragraph(doc+"  CI"+ced+"\n",
					FontFactory.getFont(FontFactory.HELVETICA, 12, Font.ITALIC, new Color(0, 0, 0)));
					p.setAlignment(Element.ALIGN_CENTER);
					document.add(p);
					
					System.out.println(ced+" "+doc);
					pstmt = conn.prepareStatement("SELECT * FROM programacion_ejecutada WHERE docente_cedula_coordinador='"+ced+"' OR docente_cedula_principal='"+ced+"' OR docente_cedula_jurado_2='"+ced+"' OR docente_cedula_jurado_1='"+ced+"'");
					ResultSet rset = pstmt.executeQuery();
					while(rset.next()){
						String cod=rset.getString("materia_codigo");
						String per=rset.getString("periodo_academico");
						String ano=rset.getString("ano_lectivo");
						pstmt3 = conn.prepareStatement("SELECT nombre_completo FROM materia WHERE codigo='"+cod+"'");
						ResultSet rset3 = pstmt3.executeQuery();
						if(rset3.next()){
							String nom=rset3.getString("nombre_completo");
							
							p = new Paragraph(cod+"      "+nom+"      "+per+"-"+ano,
							FontFactory.getFont(FontFactory.HELVETICA, 11, Font.ITALIC, new Color(0, 0, 0)));
							p.setAlignment(Element.ALIGN_LEFT);
							document.add(p);
							
							System.out.println(cod+" "+nom+" "+per+"-"+ano);
						}
						if (pstmt3 != null)
							pstmt3.close();
						if (rset3 != null)
							rset3.close();
					}
					if (rset2 != null)
						rset.close();	
					if (rset != null)
						rset.close();					
		            if (pstmt != null)
		                pstmt.close();
					if (pstmt2 != null)
		                pstmt2.close();					
				}
			}else{
				PdfWriter.getInstance(document, new FileOutputStream("webapps/proyecto_ati/RecordHistoricoMateria.pdf"));
				document.open();
				
				Image jpg = Image.getInstance("webapps/proyecto_ati/ucv.jpg");
				jpg.setAlignment(Element.ALIGN_CENTER);
				document.add(jpg);
				
				Paragraph p = new Paragraph("SISTEMA ADMINISTRADOR DE PROGRAMACIONES DOCENTES",
				FontFactory.getFont(FontFactory.HELVETICA, 16, Font.ITALIC, new Color(0, 0, 0)));
				p.setAlignment(Element.ALIGN_CENTER);
				document.add(p);
				
				p = new Paragraph("Record Histórico de Materia"+"\n",
				FontFactory.getFont(FontFactory.HELVETICA, 14, Font.ITALIC, new Color(0, 0, 0)));
				p.setAlignment(Element.ALIGN_CENTER);
				document.add(p);
				System.out.println("por materia");
				//System.out.println("materia: "+mat);
				pstmt2 = conn.prepareStatement("SELECT codigo FROM materia WHERE nombre_corto='"+mat+"'");				
				ResultSet rset2 = pstmt2.executeQuery();
				if (rset2.next()){
					String cod=rset2.getString("codigo");
				//	System.out.println(cod);
					
					p = new Paragraph(mat+"  Código "+cod+"\n",
					FontFactory.getFont(FontFactory.HELVETICA, 12, Font.ITALIC, new Color(0, 0, 0)));
					p.setAlignment(Element.ALIGN_CENTER);
					document.add(p);
					
					pstmt = conn.prepareStatement("SELECT * FROM programacion_ejecutada WHERE materia_codigo='"+cod+"'");
					ResultSet rset = pstmt.executeQuery();
					while(rset.next()){
						String per=rset.getString("periodo_academico");
						String ano=rset.getString("ano_lectivo");
						String lic=rset.getString("licenciatura_id");
						String doc1=rset.getString("docente_cedula_coordinador");
						String doc2=rset.getString("docente_cedula_principal");
						String doc3=rset.getString("docente_cedula_jurado_2");
						String doc4=rset.getString("docente_cedula_jurado_1");
						System.out.println(per+"-"+ano+" "+lic+" "+doc1+" "+doc2+" "+doc3+" "+doc4);
						pstmt3 = conn.prepareStatement("SELECT nombre FROM docente WHERE cedula='"+doc1+"' OR cedula='"+doc2+"' OR cedula='"+doc3+"' OR cedula='"+doc4+"'");
						ResultSet rset3 = pstmt3.executeQuery();
						String nom[]=new String[4];
						
						int i=0;
						while(rset3.next()){
							nom[i]=rset3.getString("nombre");
							if(nom[i] == null) nom[i]=" ";
							System.out.println(nom[i]+" ");
							i++;
						}
						if(lic.equals("C")){
							lic="COMPUTACION";
						}else if(lic.equals("Q")){
							lic="QUIMICA";
						}else if(lic.equals("M")){
							lic="MATEMATICAS";
						}else if(lic.equals("F")){
							lic="FISICA";
						}else if(lic.equals("G")){
							lic="GEOQUIMICA";
						}else if(lic.equals("B")){
							lic="BIOLOGIA";
						}
						p = new Paragraph(per+"-"+ano+"\t"+lic+"\t"+nom[0]+"\t"+nom[1]+"\t"+nom[2]+"\t"+nom[3],
						FontFactory.getFont(FontFactory.HELVETICA, 11, Font.ITALIC, new Color(0, 0, 0)));
						p.setAlignment(Element.ALIGN_LEFT);
						document.add(p);
						
						if (pstmt3 != null)
							pstmt3.close();
						if (rset3 != null)
							rset3.close();
					}
					if (rset2 != null)
						rset.close();	
					if (rset != null)
						rset.close();					
		            if (pstmt != null)
		                pstmt.close();
					if (pstmt2 != null)
		                pstmt2.close();					
				}				
			}			
            
			if (conn != null)
                conn.close();
			document.close();
	    } catch (Exception e) { e.printStackTrace();}
    }
}