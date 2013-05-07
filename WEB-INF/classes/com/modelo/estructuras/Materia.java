package com.modelo.estructuras;

public class Materia {

	private String codigo;
	private String licenciatura_id_origen;
	private String nombre_completo;
	private String nombre_corto;
	private String activa;
	private String observaciones;
	private int nro_horas_teoria;
	private int nro_horas_practica;
	private int nro_horas_laboratorio;
	
	public Materia(){
		codigo="";
		licenciatura_id_origen="";
		nombre_completo="";
		nombre_corto="";
		activa="";
		observaciones="";
		nro_horas_teoria=0;
		nro_horas_practica=0;
		nro_horas_laboratorio=0;
    }
	public String get_codigo(){
		return codigo;
	}
	public String get_licenciatura_id_origen(){
		return licenciatura_id_origen;
	}
	public String get_nombre_completo(){
		return nombre_completo;
	}
	public String get_nombre_corto(){
		return nombre_corto;
	}
	public String get_activa(){
		return activa;
	}
	public String get_observaciones(){
		return observaciones;
	}
	public int get_nro_horas_teoria(){
		return nro_horas_teoria;
	}
	public int get_nro_horas_practica(){
		return nro_horas_practica;
	}
	public int get_nro_horas_laboratorio(){
		return nro_horas_laboratorio;
	}
	public void set_codigo(String codigo){
		this.codigo=codigo;
	}
	public void set_licenciatura_id_origen(String licenciatura_id_origen){
		this.licenciatura_id_origen=licenciatura_id_origen;
	}
	public void set_nombre_completo(String nombre_completo){
		this.nombre_completo=nombre_completo;
	}
	public void set_nombre_corto(String nombre_corto){
		this.nombre_corto=nombre_corto;
	}
	public void set_observaciones(String observaciones){
		this.observaciones=observaciones;
	}
	public void set_nro_horas_teoria(int nro_horas_teoria){
		this.nro_horas_teoria=nro_horas_teoria;
	}
	public void set_nro_horas_practica(int nro_horas_practica){
		this.nro_horas_practica=nro_horas_practica;
	}
	public void set_nro_horas_laboratorio(int nro_horas_laboratorio){
		this.nro_horas_laboratorio=nro_horas_laboratorio;
	}
	
}