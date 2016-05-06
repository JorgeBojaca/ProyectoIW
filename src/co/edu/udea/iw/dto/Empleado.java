package co.edu.udea.iw.dto;

/**
 * DTO
 * Clase para manejar la tabla Empleado de la base de datos
 * 
 * @author Diana Ciro
 * @author Milena Cardenas
 * @author Jorge Bojac�
 * 
 *@version 1.0
 *
 */

public class Empleado {
	
	private String id;//PK
	private String nombre;
	private String apellido;
	private String email;
	private String usuario;//FK
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	

}
