package util;

import java.util.ArrayList;

import model.Perfil;

public class ListaNombres {
	
	public static ArrayList<Perfil> lista;
	
	public static int numberOfSearchedProfiles() {
		int f = lista.size();
		return f;
	}
	
	public static int numberOfFoundProfiles() {
		int f = 0;
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getEstado()==1) {
				f++;
			}
		}
		return f;
	}
}
