package datos;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import entities.Compania;

/**
 * Session Bean implementation class DatosCompania
 */
@Singleton
@LocalBean
public class DatosCompania implements DatosCompaniaLocal {


    public DatosCompania() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext(name = "comp-centPersistenceUnit")
    private EntityManager em;
    
    public void altaCompania(Compania compania) {
    	em.persist(compania);
    }
    
    public void modificarCompania(Compania compania) {
    	Compania toUpdate = em.find(Compania.class, compania.getId());
    	toUpdate.setNombre(compania.getNombre());
    	em.refresh(toUpdate);
    }
    
    public void eliminarCompania(Compania compania) {
    	em.remove(compania);
    }

    public Compania buscarCompania(int id) {
    	return em.find(Compania.class, id);
    }
}
