package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Consultas {
    Conexion con = new Conexion();
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public void deleteProduct(int cantidad, int id){
        
        try{
        
            Connection c = con.getConnection();
            String sql = "UPDATE productos SET cantidad = cantidad -"+ cantidad+" WHERE id_producto = "+ id;
            ps = c.prepareStatement(sql);
            ps.executeUpdate();
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
        
    }
    
    public void AddProduct(int cantidad, int id){
        try{
        
            Connection c = con.getConnection();
            String sql = "UPDATE productos SET cantidad = cantidad +"+ cantidad+" WHERE id_producto = "+ id;
            ps = c.prepareStatement(sql);
            ps.executeUpdate();
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }
    
    
}
