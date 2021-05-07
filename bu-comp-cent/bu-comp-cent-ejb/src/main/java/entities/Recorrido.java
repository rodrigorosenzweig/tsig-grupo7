package entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import datatypes.DTRecorrido;

@Entity
public class Recorrido {

	@Id
	private int codigo;
	private String nombre;
	private Boolean desvio;
	private LocalDate fechaMod;
	
	//********* CONSTRUCTORS **************
	
	//Constructor por defecto vacio
	public Recorrido() {
		super();
	}

	public Recorrido(int codigo, String nombre, Boolean desvio, LocalDate fechaMod) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.desvio = desvio;
		this.fechaMod = fechaMod;
	}
	
	//Se crea un objeto Recorrido a partir de un Data Type
	public Recorrido(DTRecorrido dtrecorrido) {
		this.codigo = dtrecorrido.getCodigo();
		this.nombre = dtrecorrido.getNombre();
		this.desvio = dtrecorrido.getDesvio();
		this.fechaMod = dtrecorrido.getFechaMod();
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
