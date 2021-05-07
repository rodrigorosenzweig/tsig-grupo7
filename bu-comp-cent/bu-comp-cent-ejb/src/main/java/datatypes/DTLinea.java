package datatypes;

import java.io.Serializable;

import entities.Linea;

public class DTLinea implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String origen;
	private String destino;
	
	//********* CONSTRUCTORS **************
	
	//Constructor por defecto vacio
	public DTLinea() {
		super();
	}

	public DTLinea(int codigo, String origen, String destino) {
		super();
		this.codigo = codigo;
		this.origen = origen;
		this.destino = destino;
	}

	//Se crea un DTLinea a partir de un objeto Linea
	public DTLinea(Linea linea) {
		this.codigo = linea.getCodigo();
		this.origen = linea.getOrigen();
		this.destino = linea.getDestino();
	}
	
	//******** GETTERS AND SETTERS ************
	
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
