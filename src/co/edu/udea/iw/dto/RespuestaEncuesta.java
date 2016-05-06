package co.edu.udea.iw.dto;

/**
 * DTO
 * Clase para manejar la tabla RespuestaEncuesta
 * 
 * @author Diana Ciro
 * @author Milena Cardenas
 * @author Jorge Bojacá
 * 
 *@version 1.0
 *
 */

public class RespuestaEncuesta {
	
	private int id;
	private String cliente; // Debe ser FK
	//private String respuesta;  revisar
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	

}
