package datatypes;

import java.io.Serializable;

import entities.Parada;
import enumerations.Estado;

public class DTParada implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nombre;
	private String ubicacion;
	private int hora;
	private int min;
	private Estado estado;
	
	
	//********* CONSTRUCTORS **************
	
	//Constructor por defecto vacio
	public DTParada() {
		super();
	}

	public DTParada(int id, String nombre, String ubicacion, int hora, int min, Estado estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.hora = hora;
		this.min = min;
		this.estado = estado;
	}

	//Se crea un DTParada a partir de un objeto Parada
	public DTParada(Parada parada) {
		this.id = parada.getId();
		this.nombre = parada.getNombre();
		this.ubicacion = parada.getUbicacion();
		this.hora = parada.getHora();
		this.min = parada.getMin();
		this.estado = parada.getEstado();
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
