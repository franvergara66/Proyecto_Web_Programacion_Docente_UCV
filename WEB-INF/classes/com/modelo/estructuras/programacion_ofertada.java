package com.modelo.estructuras;

public class programacion_ofertada{
	
	//Atributos
	
	private String materia_codigo;	
	private String materia_nombre;
	private String periodo_academico;	
	private String licenciatura_id;
	private int nro_secciones;
	private int cupo_por_seccion;
	private int ano_lectivo;
	
	//Métodos
	
	public programacion_ofertada(){
	}
	
	public String get_materia_codigo(){
		return materia_codigo;
	}
	public String get_materia_nombre(){
		return materia_nombre;
	}
	public String get_periodo_academico(){
		return periodo_academico;
	}
	public String get_licenciatura_id(){
		return licenciatura_id;
	}
	public int get_nro_secciones(){
		return nro_secciones;
	}
	public int get_cupo_por_seccion(){
		return cupo_por_seccion;
	}
	public int get_ano_lectivo(){
		return ano_lectivo;
	}
	
	public void set_materia_codigo(String materia_codigo){
		this.materia_codigo = materia_codigo;
	}
	public void set_materia_nombre(String materia_nombre){
		this.materia_nombre = materia_nombre;
	}
	public void set_periodo_academico(String periodo_academico){
		this.periodo_academico = periodo_academico;
	}
	public void set_licenciatura_id(String licenciatura_id){
		this.licenciatura_id = licenciatura_id;
	}
	public void set_nro_secciones(int nro_secciones){
		this.nro_secciones = nro_secciones;
	}
	public void set_cupo_por_seccion(int cupo_por_seccion){
		this.cupo_por_seccion = cupo_por_seccion;
	}
	public void set_ano_lectivo(int ano_lectivo){
		this.ano_lectivo = ano_lectivo;
	}
}