package co.edu.udea.iw.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * DTO
 * Clase para manejar la Tabla Pregunta
 * de la Base de Datos atencionSolicitudes..
 * 
 * @author Diana Ciro
 * @author Milena Cardenas
 * @author Jorge Bojaca  
 * @version 1.0
 */

@XmlRootElement
public class Pregunta {

	private Integer id;
	private String descripcion;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
