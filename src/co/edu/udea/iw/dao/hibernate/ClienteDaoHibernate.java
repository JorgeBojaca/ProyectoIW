package co.edu.udea.iw.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dao.ClienteDao;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.ExceptionDao;

/**
 * Implementación de la interfaz ClienteDao,esta implementación se basara en Hibernate,
 * en esta clase se hereda de HibernateDaoSupport para adquirir la funcionalidad de Hibernate
 * @author Diana Ciro
 * @author Milena Cardenas
 * @author Jorge Bojac�
 * @version 1.0
 */
public class ClienteDaoHibernate extends HibernateDaoSupport implements ClienteDao {

	@Override
	public Cliente guardar(Cliente cliente) throws ExceptionDao {
		/* realizar las operaciones contra la base de datos(Obtención de una session).
		La clase HibernateTemplate usa una SessionFactory interno para obtener el
		objeto de session para interaccionar con Hibernate
		 */
		 
		Session session=null;
		try {
			
			//Obtener la funcionalidad de Hibernate
			session=getHibernateTemplate().getSessionFactory().getCurrentSession();
			session.save(cliente);
		//Cualquier invocación de uno de los métodos de HibernateTemplate produce la excepción 
		} catch (DataAccessException e) {
			throw new ExceptionDao(e);
		}
		return cliente;
	}

	@Override
	public Cliente actualizar(Cliente cliente) throws ExceptionDao {
		Session session=null;
		try {
			session=getHibernateTemplate().getSessionFactory().getCurrentSession();
			session.update(cliente);
		} catch (DataAccessException e) {
			throw new ExceptionDao(e);
		}
		return cliente;
	}

	@Override
	public List<Cliente> obtenerClientes() throws ExceptionDao {
		List<Cliente>clientes=new ArrayList<Cliente>();
		Session session=null;
		try {
			session=getHibernateTemplate().getSessionFactory().getCurrentSession();
			//Realizar la consulta
			Criteria criteria=session.createCriteria(Cliente.class);
			clientes=criteria.list();
		} catch (DataAccessException e) {
			throw new ExceptionDao(e);
		}
		return clientes;
	}

	@Override
	public Cliente obtenerCliente(String id) throws ExceptionDao {
		Session session=null;
		Cliente cliente=null;
		try {
			session=getHibernateTemplate().getSessionFactory().getCurrentSession();
			cliente=(Cliente)session.get(Cliente.class,id);
		} catch (DataAccessException e) {
			throw new ExceptionDao(e);
		}
		return cliente;
	}

}
