package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.Gson;

import model.Amigo;
import model.Result;

public class LectorJson {	
	
	public static ArrayList<String> cargarJson() {
		
		ArrayList<String> lista = new ArrayList<>();
		Gson gson = new Gson();
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("amigos.json"));
			Result result = gson.fromJson(br, Result.class);
			
			if(result != null) {
				for (Amigo a: result.getAmigos()) {
					lista.add(a.getNombre());
				}
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

}
