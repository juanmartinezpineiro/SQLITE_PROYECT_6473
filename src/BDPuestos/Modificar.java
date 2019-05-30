/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDPuestos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Martinez
 */
public class Modificar {

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:a.tabla.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
 
    /**
     * Update data of a tabla specified by the dni
     *
     * @param nombre
     * @param puesto puesto de la compañia que desees cambiar
     * @param dni
     */
    public void update(String nombre, int dni) {
        String tabla=JOptionPane.showInputDialog(null,"Intoduce la tabla en la que quieras cambiar los datos");

        String sql = "UPDATE "+tabla+" SET nombre = ?"            
                + "WHERE dni = ?";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setString(1, nombre);
            pstmt.setInt(2, dni);
            // update 
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println("AYUWOKI");
            System.out.println(e.getMessage());
        }
    }
 
    /**
     * @param args the command line arguments
     */
   
    
}
