/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Perfil;

import static util.Conexion.cerrarConexion;

public class PerfilCRUD{
    
    private PreparedStatement enunciado;   

    public PerfilCRUD() {
    }
    
    public ArrayList<Perfil> listar() {
        
        ArrayList<Perfil> clientes = new ArrayList();
        
        try {
            String sql = "SELECT * FROM perfiles"; 
            Statement statement = Conexion.crearConexion().createStatement();
            ResultSet resultado = statement.executeQuery(sql);
            
            while(resultado.next()){                
            	Perfil p = new Perfil();
                p.setNombre(resultado.getString("nombre"));
                clientes.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
        	cerrarConexion();
        }
        return clientes;
    }
   
    public void actualizar(Perfil p) {
        try {
            enunciado = Conexion.crearConexion().prepareStatement("UPDATE perfiles SET status = ? WHERE nombre = ?");
            System.out.println(p.getEstado());
            enunciado.setInt(1, p.getEstado());
            enunciado.setString(2, p.getNombre());
            enunciado.execute();
            System.out.println("actualizado");
        } catch (SQLException ex) {
            System.out.println("Error actualizando Cliente");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
        	cerrarConexion();
        }
    }
    
}
