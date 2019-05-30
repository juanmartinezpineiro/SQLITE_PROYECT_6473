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
public class insertar {

    /**
     * Conectar a la base de datos y pedimos introducri la tabla para hacer
     * modificaciones en ella
     *  @param url ubicacioin de base de datos
     */
    public static void insercion() {
        String url = "jdbc:sqlite:a.tabla.db";
        String tabla = JOptionPane.showInputDialog(null, "Intoduce la tabla en la que quieras introducir los datos");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        /**
         * introducir las variables para introducirlas en la tabla Generar los
         * inserts para ambas tablas con sus valores
         */
        long dni = Long.parseLong(JOptionPane.showInputDialog(null, "Introduce el dni de la persona"));
        String nombre = JOptionPane.showInputDialog(null, "Introduzca su nombre");
        String puesto = JOptionPane.showInputDialog(null, "Puesto destino");
        String sql = "INSERT INTO " + tabla + "(dni, nombre) VALUES(?,?)";
        String sql2 = "INSERT INTO " + tabla + "companhias(dni, puesto) VALUES(?,?)";
/**
 * @param dni dni de la persona
 * @param nombre nombre de la persona
 */
        try (Connection connect = conn;
                PreparedStatement pstmt = connect.prepareStatement(sql)) {
            pstmt.setLong(1, dni);
            pstmt.setString(2, nombre);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insertados datos personales");
            System.out.println("1 Fila insertada en " + tabla);
          
           /**
 * @param dni de la persona
 * @param puesto puesto de la persona
 */
            try (Connection connect2 = conn;
                    PreparedStatement pstmt2 = connect2.prepareStatement(sql2)) {
                pstmt2.setLong(1, dni);
                pstmt2.setString(2, puesto);
                pstmt2.execute();
                JOptionPane.showMessageDialog(null, "Insertados datos de los puestos");
                System.out.println("1 Fila insertada en " + tabla + "_compañías");
              
                connect2.close();


            } catch (SQLException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "DNI mal introducido, vuelve a intentarlo");
                System.out.println("no se han insertado filas");
            }
        } catch (SQLException e){
//            System.out.println(e.getMessage());
//            JOptionPane.showMessageDialog(null, "Fallo al introducir, puede ser por el DNI, vuelve a introducirlo");
            System.out.println(e.getMessage());
//            System.out.println("no se han insertado filas");
        }
        

    }
}
