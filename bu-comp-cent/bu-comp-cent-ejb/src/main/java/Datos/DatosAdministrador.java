package Datos;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import datatypes.DTAdministrador;
import entities.Administrador;

/**
 * Session Bean implementation class DatosAdministrador
 */
@Stateful
@LocalBean
public class DatosAdministrador implements DatosAdministradorLocal {

    public DatosAdministrador() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext(name = "comp-centPersistenceUnit")
    private EntityManager em;
    
    public void altaAdminsitrador(Administrador administrador) {
    	em.persist(administrador);
    }
    
    public void modificarAdministrador(Administrador administrador) {
    	Administrador toUpdate = em.find(Administrador.class, administrador.getId());
    	toUpdate.setNombre(administrador.getNombre());
    	toUpdate.setApellido(administrador.getApellido());
    	toUpdate.setFechaNac(administrador.getFechaNac());
    	toUpdate.setEmail(administrador.getEmail());
    	toUpdate.setTelefono(administrador.getTelefono());
    	em.refresh(toUpdate);
    }
    
    public void eliminarAdministrador(Administrador administrador) {
    	em.remove(administrador);
    }
    
    /*busca administrador por id;
     * retorna null si el id no existe */
    public DTAdministrador buscarAdministrador(int id) {
    	Administrador administrador = em.find(Administrador.class, id);
    	if(administrador != null) {
    		DTAdministrador DTA = new DTAdministrador(administrador);
			return DTA;
    	}
    	else {
    		return null;
    	}
    }
    
    

}
