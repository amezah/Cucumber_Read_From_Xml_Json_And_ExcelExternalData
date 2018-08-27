package model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

	@SerializedName("amigos")
	@Expose
	private ArrayList<Amigo> amigos = new ArrayList<>();

	public Result() {		
		
	}


	public Result(ArrayList<Amigo> amigos) {
		
		this.amigos = amigos;
	}

	public ArrayList<Amigo> getAmigos() {
		return amigos;
	}

	public void setAmigos(ArrayList<Amigo> amigos) {
		this.amigos = amigos;
	}
	
}
