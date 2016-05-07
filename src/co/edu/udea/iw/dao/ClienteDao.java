package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.ExceptionDao;

/**
 * Implementar el dao de Cliente, aqui se crearán las operaciones CRUD
 * @author Diana Ciro
 * @author Milena Cardenas
 * @author Jorge Bojac�
 *@version 1.0
 */
public interface ClienteDao {
	/**
	 * Registrar un nuevo cliente en la tabla clientes
	 * @param cliente registro de cliente que se guardará en la tabla de clientes
	 * @return cliente guardado
 * @throws ExceptionDao cuando ocurre cualquier error en la comunicación con la BD
 */
public Cliente guardar(Cliente cliente) throws ExceptionDao;

/**
 * Actualiza la informacion del cliente en la tabla clientes
 * @param cliente registro que contiene la informacion del cliente que se va a actualizar
 * @return cliente actualizado
 * @throws ExceptionDao cuando ocurre cualquier error en la comunicación con la BD
 */
public Cliente actualizar(Cliente cliente) throws ExceptionDao;


/**
 * Obtiene la lista de clientes almacenados en la tabla clientes de la base de datos
 * @return lista de clientes
 * @throws ExceptionDao cuando ocurre cualquier error en la comunicación con la BD
 */
public List<Cliente> obtenerClientes() throws ExceptionDao;

/**
 * Obtiene el cliente que corresponda a la identificación ingresada como parámetro
 * @param id identificaci�n del cliente
 * @return Cliente con toda su información
 * @throws ExceptionDao cuando ocurre cualquier error en la comunicación con la BD
 */
public Cliente obtenerCliente(String id) throws ExceptionDao;

}
