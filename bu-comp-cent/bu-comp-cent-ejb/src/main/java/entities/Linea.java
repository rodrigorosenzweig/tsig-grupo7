package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import datatypes.DTLinea;

@Entity
public class Linea {

	@Id
	private int codigo;
	private String origen;
	private String destino;
	
	//********* CONSTRUCTORS **************
	
	//Constructor por defecto vacio
	public Linea() {
		super();
	}

	public Linea(int codigo, String origen, String destino) {
		super();
		this.codigo = codigo;
		this.origen = origen;
		this.destino = destino;
	}

	//Se crea un objeto Linea a partir de un Data Type
	public Linea(DTLinea dtlinea) {
		this.codigo = dtlinea.getCodigo();
		this.origen = dtlinea.getOrigen();
		this.destino = dtlinea.getDestino();
	}
	
	//******** GETRERS AND SETTERS ************
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
}
