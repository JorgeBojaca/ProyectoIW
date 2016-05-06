package co.edu.udea.iw.dto;

/**
 * DTO
 * Clase para manejar la tabla Usuario
 * 
 * @author Diana Ciro
 * @author Milena Cardenas
 * @author Jorge Bojacá
 * 
 *@version 1.0
 *
 */
public class Usuario {
	
	private String user; //PK
	private String password;
	private int rol; //FK
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRol() {
		return rol;
	}
	public void setRol(int rol) {
		this.rol = rol;
	}
	
	

}
