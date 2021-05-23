package datatypes;

import java.io.Serializable;
import java.time.LocalDate;

import entities.Administrador;

public class DTAdministrador implements Serializable{

	private static final long serialVersionUID = 1L;

	private int id;
	private String username;
	private String pass;
	
	
	//********* CONSTRUCTORS **************
	
	//Constructor por defecto vacio
	public DTAdministrador() {
		super();
	}

	public DTAdministrador(int id, String nombre, String apellido, LocalDate fechaNac, String email, int telefono) {
		super();
		this.id = id;
		this.username = nombre;
		this.pass = apellido;
	}

	//Se crea un DTAdministrador a partir de un objeto Administrador
	public DTAdministrador(Administrador adm) {
		this.id = adm.getId();
		this.username = adm.getUsername();
		this.pass = adm.getPass();
	}
	
	//******** GETTERS AND SETTERS ************
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
