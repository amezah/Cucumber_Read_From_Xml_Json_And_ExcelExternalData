/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conexion {
    
    private static Connection conexion;
    private static final String servidor="localhost";//Normalmente seria localhost
    private static final String database="test";
    private static final String usuario="root";
    private static final String password="root1234";
    private static String url="";   
 
    public static Connection crearConexion(){
        try {
            
            url="jdbc:mysql://"+servidor+"/"+database;
            conexion=(Connection) DriverManager.getConnection(url, usuario, password);
            if(conexion!= null){
                System.out.println("Conexion a Base de Datos "+url+" . . . . .Ok");
            }            
 
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return conexion;
    }    
    
 
    public static void cerrarConexion(){
        try {
            conexion.close();
             System.out.println("Cerrando conexion a "+url+" . . . . . Ok");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        conexion=null;
    }
    
}
