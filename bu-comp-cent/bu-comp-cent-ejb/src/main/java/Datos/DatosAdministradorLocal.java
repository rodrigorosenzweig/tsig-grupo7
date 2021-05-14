package Datos;

import javax.ejb.Local;

import datatypes.DTAdministrador;
import entities.Administrador;

@Local
public interface DatosAdministradorLocal {
	public void altaAdminsitrador(Administrador administrador);
	public void modificarAdministrador(Administrador administrador);
	public void eliminarAdministrador(Administrador administrador);
	public Administrador buscarAdministrador(int id);
}
