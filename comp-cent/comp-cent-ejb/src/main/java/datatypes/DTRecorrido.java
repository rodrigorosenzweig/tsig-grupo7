package datatypes;

import java.io.Serializable;
import java.time.LocalDate;

import entities.Recorrido;

public class DTRecorrido implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String nombre;
	private Boolean desvio;
	private LocalDate fechaMod;
	
	//********* CONSTRUCTORS **************
	
	//Constructor por defecto vacio
	public DTRecorrido() {
		super();
	}

	public DTRecorrido(int codigo, String nombre, Boolean desvio, LocalDate fechaMod) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.desvio = desvio;
		this.fechaMod = fechaMod;
	}

	//Se crea un DTRecorrido a partir de un objeto Recorrido
	public DTRecorrido(Recorrido recorrido) {
		this.codigo = recorrido.getCodigo();
		this.nombre = recorrido.getNombre();
		this.desvio = recorrido.getDesvio();
		this.fechaMod = recorrido.getFechaMod();
	}
	
	//******** GETTERS AND SETTERS ************
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getDesvio() {
		return desvio;
	}

	public void setDesvio(Boolean desvio) {
		this.desvio = desvio;
	}

	public LocalDate getFechaMod() {
		return fechaMod;
	}

	public void setFechaMod(LocalDate fechaMod) {
		this.fechaMod = fechaMod;
	}
	
}
