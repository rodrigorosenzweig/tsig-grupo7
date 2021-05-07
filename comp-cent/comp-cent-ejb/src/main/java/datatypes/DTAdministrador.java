package datatypes;

import java.io.Serializable;
import java.time.LocalDate;

import entities.Administrador;

public class DTAdministrador implements Serializable{

	private static final long serialVersionUID = 1L;

	private int id;
	private String nombre;
	private String apellido;
	private LocalDate fechaNac;
	private String email;
	private int telefono;
	
	
	//********* CONSTRUCTORS **************
	
	//Constructor por defecto vacio
	public DTAdministrador() {
		super();
	}

	public DTAdministrador(int id, String nombre, String apellido, LocalDate fechaNac, String email, int telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.email = email;
		this.telefono = telefono;
	}

	//Se crea un DTAdministrador a partir de un objeto Administrador
	public DTAdministrador(Administrador adm) {
		this.id = adm.getId();
		this.nombre = adm.getNombre();
		this.apellido = adm.getApellido();
		this.fechaNac = adm.getFechaNac();
		this.email = adm.getEmail();
		this.telefono = adm.getTelefono();
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
