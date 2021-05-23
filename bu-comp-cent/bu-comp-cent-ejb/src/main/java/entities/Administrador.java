package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import datatypes.DTAdministrador;

@Entity
public class Administrador {

	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String pass;
		
	
	//********* CONSTRUCTORS **************
	
	//Constructor por defecto vacio
	public Administrador() {
		super();
	}

	public Administrador(int id, String nombre, String apellido) {
		super();
		this.id = id;
		this.username = nombre;
		this.pass = apellido;
	}

	//Se crea un objeto Administrador a partir de un Data Type
	public Administrador(DTAdministrador dtadm) {
		this.id = dtadm.getId();
		this.username = dtadm.getUsername();
		this.pass = dtadm.getPass();
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
