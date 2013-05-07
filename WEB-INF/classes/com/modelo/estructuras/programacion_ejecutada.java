package com.modelo.estructuras;

public class programacion_ejecutada{
	
	//Atributos
	
	private String materia_codigo;
	private String materia_nombre;
	private String nombre_seccion;
	private String periodo_academico;	
	private String licenciatura_id;
	private String docente_cedula_coordinador;
	private String docente_cedula_principal;
	private String docente_cedula_jurado_1;
	private String docente_cedula_jurado_2;
	private int ano_lectivo;
	
	//Métodos
	public programacion_ejecutada() {//constructor
    }
	
	/*public programacion_ejecutada(String materia_codigo, String nombre_seccion, String periodo_academico, String licenciatura_id, String docente_cedula_coordinador, String docente_cedula_principal, String docente_cedula_jurado_1, String docente_cedula_jurado_2){
		this.materia_codigo = materia_codigo;
		this.nombre_seccion = nombre_seccion;
		this.periodo_academico = periodo_academico;
		this.licenciatura_id = licenciatura_id;
		this.docente_cedula_coordinador = docente_cedula_coordinador;
		this.docente_cedula_principal = docente_cedula_principal;
		this.docente_cedula_jurado_1 = docente_cedula_jurado_1;
		this.docente_cedula_jurado_1 = docente_cedula_jurado_2;
	}*/
	
	public String get_materia_codigo(){
		return materia_codigo;
	}
	public String get_materia_nombre(){
		return materia_nombre;
	}
	public String get_nombre_seccion(){
		return nombre_seccion;
	}
	public String get_periodo_academico(){
		return periodo_academico;
	}
	public String get_licenciatura_id(){
		return licenciatura_id;
	}
	public String get_docente_cedula_coordinador(){
		return docente_cedula_coordinador;
	}
	public String get_docente_cedula_principal(){
		return docente_cedula_principal;
	}
	public String get_docente_cedula_jurado_1(){
		return docente_cedula_jurado_1;
	}
	public String get_docente_cedula_jurado_2(){
		return docente_cedula_jurado_2;
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
	public void set_nombre_seccion(String nombre_seccion){
		this.nombre_seccion = nombre_seccion;
	}
	public void set_periodo_academico(String periodo_academico){
		this.periodo_academico = periodo_academico;
	}
	public void set_licenciatura_id(String licenciatura_id){
		this.licenciatura_id = licenciatura_id;
	}
	public void set_docente_cedula_coordinador(String docente_cedula_coordinador){
		this.docente_cedula_coordinador = docente_cedula_coordinador;
	}
	public void set_docente_cedula_principal(String docente_cedula_principal){
		this.docente_cedula_principal = docente_cedula_principal;
	}
	public void set_docente_cedula_jurado_1(String docente_cedula_jurado_1){
		this.docente_cedula_jurado_1 = docente_cedula_jurado_1;
	}
	public void set_docente_cedula_jurado_2(String docente_cedula_jurado_2){
		this.docente_cedula_jurado_2 = docente_cedula_jurado_2;
	}
	public void set_ano_lectivo(int ano_lectivo){
		this.ano_lectivo = ano_lectivo;
	}
}