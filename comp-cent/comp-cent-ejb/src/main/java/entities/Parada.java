package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import datatypes.DTParada;
import enumerations.Estado;

@Entity
public class Parada {

	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	private String ubicacion;
	private int hora;
	private int min;
	private Estado estado;
	
	
	//********* CONSTRUCTORS **************
	
	//Constructor por defecto vacio
	public Parada() {
		super();
	}

	public Parada(int id, String nombre, String ubicacion, int hora, int min, Estado estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.hora = hora;
		this.min = min;
		this.estado = estado;
	}

	//Se crea un objeto Parada a partir de un Data Type
	public Parada(DTParada dtparada) {
		this.id = dtparada.getId();
		this.nombre = dtparada.getNombre();
		this.ubicacion = dtparada.getUbicacion();
		this.hora = dtparada.getHora();
		this.min = dtparada.getMin();
		this.estado = dtparada.getEstado();
	}
	
	//******** GETTERS AND SETTERS ************
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
