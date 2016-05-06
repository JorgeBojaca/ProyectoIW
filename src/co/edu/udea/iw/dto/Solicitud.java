package co.edu.udea.iw.dto;

import java.util.Date;

/**
 * DTO
 * Clase para manejar la tabla Solicitud
 * 
 * @author Diana Ciro
 * @author Milena Cardenas
 * @author Jorge Bojacá
 * 
 *@version 1.0
 *
 */

public class Solicitud {
	
	private int id;//PK
	private int tipoSolicitud;//FK
	private String cliente;//FK
	private String descripcion;
	private String complejidad;
	private String responsable;// FK a la tabla EMPLEADO
	private String producto;
	private int sucursal; //FK
	private Date fechaSolicitud;
	private String respuesta;
	private Date fechaRespuesta;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTipoSolicitud() {
		return tipoSolicitud;
	}
	public void setTipoSolicitud(int tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getComplejidad() {
		return complejidad;
	}
	public void setComplejidad(String complejidad) {
		this.complejidad = complejidad;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getSucursal() {
		return sucursal;
	}
	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public Date getFechaRespuesta() {
		return fechaRespuesta;
	}
	public void setFechaRespuesta(Date fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}
	
	

}
