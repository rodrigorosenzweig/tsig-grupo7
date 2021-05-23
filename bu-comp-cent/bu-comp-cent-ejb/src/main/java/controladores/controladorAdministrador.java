package controladores;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import datatypes.DTAdministrador;
import datos.DatosAdministradorLocal;
import entities.Administrador;


@Stateless
@LocalBean
public class controladorAdministrador implements controladorAdministradorRemote {
	@EJB
	DatosAdministradorLocal dal;
    public controladorAdministrador() {
        // TODO Auto-generated constructor stub
    }
    
    public void altaAdministrador(DTAdministrador administrador) {
    	Administrador newAdminsitrador = new Administrador(administrador);
    	dal.altaAdminsitrador(newAdminsitrador);
    }
    
    public void modificarAdministrador(DTAdministrador administrador) {
    	Administrador editAdminsitrador = new Administrador(administrador);
    	dal.modificarAdministrador(editAdminsitrador);
    }
    
    public void eliminarAdministrador(DTAdministrador administrador) {
    	Administrador deleteAdministrador = new Administrador(administrador);
    	dal.eliminarAdministrador(deleteAdministrador);
    }
    
    public DTAdministrador buscarAdministrador(int id) {
    	Administrador administrador = dal.buscarAdministrador(id);
    	if(administrador != null) {
    		DTAdministrador dtAdministrador = new DTAdministrador(administrador);
    		return dtAdministrador;
    	}
    	else {
    		return null;
    	}
    	
    }

}
