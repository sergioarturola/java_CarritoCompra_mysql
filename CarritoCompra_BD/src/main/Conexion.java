package main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {

    private final String url = "jdbc:mysql://localhost:3306/carrito";
    private final String user = "root";
    private final String pass = "1234";

    Connection conexion = null;

    public Connection getConnection(){
        try{
            conexion = (Connection)DriverManager.getConnection(url, user, pass);
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return conexion;
    }
    
    
    public void disconnect(){
        conexion = null;
    }
    
}
