package com.modelo.estructuras;

public class Usuario{

	public Usuario() {//constructor
    }

    private String login = "";
    private int cedula = 0;
    private String nombres = "";
	private String apellidos = "";
	private String clave = "";
	private String cargo = "";
	private String correo = "";
	//private date fecha_hora_ultimo_login = "";
	private String observaciones = "";
	
/*************************************************************************************************************************/	
	public String get_login() {
        return login;
    }
    public void set_login(String login) {
        this.login = login;
    }
/*************************************************************************************************************************/	
	public int get_cedula() {
        return cedula;
    }
    public void set_cedula(int cedula) {
        this.cedula = cedula;
    }
/*************************************************************************************************************************/	
	public String get_nombres() {
        return nombres;
    }
    public void set_nombres(String nombres) {
        this.nombres = nombres;
    }
/*************************************************************************************************************************/
	public String get_apellidos() {
        return apellidos;
    }
    public void set_apellidos(String apellidos) {
        this.apellidos = apellidos;
    }
/*************************************************************************************************************************/	
	public String get_clave() {
        return clave;
    }
    public void set_clave(String clave) {
        this.clave = clave;
    }
/*************************************************************************************************************************/	
	public String get_cargo() {
        return cargo;
    }
    public void set_cargo(String cargo) {
        this.cargo = cargo;
    }
/*************************************************************************************************************************/   
	public String get_correo() {
        return correo;
    }
    public void set_correo(String correo) {
        this.correo = correo;
    }
/*************************************************************************************************************************/
	public String get_observaciones() {
        return observaciones;
    }
    public void set_observaciones(String observaciones) {
        this.observaciones = observaciones;
    }
/*************************************************************************************************************************/
}