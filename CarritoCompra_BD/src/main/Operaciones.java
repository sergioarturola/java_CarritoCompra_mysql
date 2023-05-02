package main;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Operaciones {
    Conexion conector = new Conexion();
    
    public void fillTableDB(JTable tabla){
        //creando el modelo de la tabla y agregandolo
        DefaultTableModel model = new DefaultTableModel();
        tabla.setModel(model);
        //objetos para manipular la base de datos
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
                

        //agregando columnas
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Precio");
        model.addColumn("Cantidad");
        
        try{
            
            String sql = "SELECT * FROM productos";
            con = conector.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData getCol = rs.getMetaData();
            int col = getCol.getColumnCount();
            
            while(rs.next()){
                Object [] rowsTable = new Object[col];
                
                for(int i = 0; i<col; i++){
                    rowsTable[i] = rs.getObject(i+1);//i+1 para que no sea cero
                }
                
                model.addRow(rowsTable);
            }
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
    }

    
    public void fillTableProduct(JTable tabla){
        DefaultTableModel model = new DefaultTableModel();
        tabla.setModel(model);
        
        model.addColumn("Item");
        model.addColumn("Precio a pagar");
        model.addColumn("id");
        
    }
    
    public void removeTable(JTable tabla){
      DefaultTableModel  modelview = (DefaultTableModel) tabla.getModel();
      
     for(int i = 0; i<tabla.getRowCount(); i++){
         modelview.removeRow(i);
         i-=1;//para que se "salte" a la primera en cada ciclo y asi borre todas
     }
    }
            
    
}
