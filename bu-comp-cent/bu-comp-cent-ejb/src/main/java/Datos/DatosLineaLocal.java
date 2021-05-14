package Datos;

import javax.ejb.Local;

import datatypes.DTLinea;
import entities.Linea;

@Local
public interface DatosLineaLocal {
	public void altaLinea(Linea linea);
	public void modificarLinea(Linea linea);
	public void eliminarLinea(Linea linea);
	public Linea buscarLinea(int gid);
}
