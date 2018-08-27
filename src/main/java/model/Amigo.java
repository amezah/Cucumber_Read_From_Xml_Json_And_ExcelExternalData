package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Amigo {

	@SerializedName("nombre")
	@Expose
	private String nombre;
	
	public Amigo() {
		
	}
	
	public Amigo(String nombre) {		
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
