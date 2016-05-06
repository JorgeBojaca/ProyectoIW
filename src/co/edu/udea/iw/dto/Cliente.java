package co.edu.udea.iw.dto;

/**
 * DTO
 * Clase para manejar la tabla Cliente de la base de datos
 * 
 * @author Diana Ciro
 * @author Milena Cardenas
 * @author Jorge Bojac�
 * 
 *@version 1.0
 *
 */

public class Cliente {
	
	private String cedula;//PK
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String usuario;//FK
	private String direccion;
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
