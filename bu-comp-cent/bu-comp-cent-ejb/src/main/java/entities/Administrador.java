package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import datatypes.DTAdministrador;

@Entity
public class Administrador {

	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	private String apellido;
	private LocalDate fechaNac;
	private String email;
	private int telefono;
		
	
	//********* CONSTRUCTORS **************
	
	//Constructor por defecto vacio
	public Administrador() {
		super();
	}

	public Administrador(int id, String nombre, String apellido, LocalDate fechaNac, String email, int telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.email = email;
		this.telefono = telefono;
	}

	//Se crea un objeto Administrador a partir de un Data Type
	public Administrador(DTAdministrador dtadm) {
		this.id = dtadm.getId();
		this.nombre = dtadm.getNombre();
		this.apellido = dtadm.getApellido();
		this.fechaNac = dtadm.getFechaNac();
		this.email = dtadm.getEmail();
		this.telefono = dtadm.getTelefono();
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

}
