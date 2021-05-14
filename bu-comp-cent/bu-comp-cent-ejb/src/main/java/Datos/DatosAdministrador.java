package Datos;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import datatypes.DTAdministrador;
import entities.Administrador;

/**
 * Session Bean implementation class DatosAdministrador
 */
@Singleton
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

    public Administrador buscarAdministrador(int id) {
    	return em.find(Administrador.class, id);
    	
    }
    
    

}
