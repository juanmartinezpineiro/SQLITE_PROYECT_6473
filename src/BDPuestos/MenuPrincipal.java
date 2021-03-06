/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDPuestos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import BDPuestos.Mostrar;
/**
 *
 * @author Juan Martinez
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        BotonCrearTablas = new javax.swing.JButton();
        BotonInsertar = new javax.swing.JButton();
        BBorrar = new javax.swing.JButton();
        BModificar = new javax.swing.JButton();
        bMostrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaComp = new javax.swing.JTable();
        BConsulta = new javax.swing.JButton();
        ComboBox = new javax.swing.JComboBox<>();
        TConsulta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PuestosDB by JuanM");

        BotonCrearTablas.setText("Añadir tabla");
        BotonCrearTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearTablasActionPerformed(evt);
            }
        });

        BotonInsertar.setText("Insertar");
        BotonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertarActionPerformed(evt);
            }
        });

        BBorrar.setText("Borrar");
        BBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBorrarActionPerformed(evt);
            }
        });

        BModificar.setText("Modificar");
        BModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModificarActionPerformed(evt);
            }
        });

        bMostrar.setText("Mostrar");
        bMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarActionPerformed(evt);
            }
        });

        tablaComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "dni", "puesto"
            }
        ));
        jScrollPane2.setViewportView(tablaComp);

        BConsulta.setText("Consulta");
        BConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConsultaActionPerformed(evt);
            }
        });

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dni", "puesto", "nombre" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        TConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TConsultaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel1.setText("Puestos");

        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonCrearTablas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(TConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BConsulta)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCrearTablas)
                    .addComponent(BotonInsertar)
                    .addComponent(BBorrar)
                    .addComponent(BModificar)
                    .addComponent(bMostrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearTablasActionPerformed
   FromCrear obx=new FromCrear();
        obx.setVisible(true);
        this.setVisible(false);    }//GEN-LAST:event_BotonCrearTablasActionPerformed

    private void BotonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarActionPerformed
insertar.insercion();    }//GEN-LAST:event_BotonInsertarActionPerformed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
Borrar.eliminar();
    }//GEN-LAST:event_BBorrarActionPerformed

    private void BModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModificarActionPerformed
        //Modificar.update2();
        int fila = tablaComp.getSelectedRow();
        if (fila == -1){
            System.out.println("No hay ninguna fila seleccionada");
        }else{
             Modificar app=new Modificar();
        String nombre=JOptionPane.showInputDialog(null,"Introduce el nombre para modificar");
       
        int dni=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el dni para modificar"));
        app.update(nombre,dni);
        }
      
    }//GEN-LAST:event_BModificarActionPerformed

    private void bMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarActionPerformed


            try {                                         
                DefaultTableModel modelo =new DefaultTableModel();
                String tabla=JOptionPane.showInputDialog(null,"introduce el nombre de la tabla");
                ResultSet rs=Mostrar.getTabla("select * from "+tabla+"companhias");
                ResultSet rs2=Mostrar.getTabla("select * from "+tabla);
                modelo.setColumnIdentifiers(new Object[]{"dni","puesto"});
                try {
                    modelo.addColumn("nombre");
                    while (rs.next()&& rs2.next()){
                        modelo.addRow(new Object[]{rs.getLong("dni"),rs.getString("puesto"),rs2.getString("nombre")});
                    }
                    tablaComp.setModel(modelo);
                } catch (SQLException e) {
                    System.out.println(e);
                    
                    
                }

                


            } catch (SQLException ex) {
                Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null,ex);
            }
           
    
           
    

       
    }//GEN-LAST:event_bMostrarActionPerformed

    private void BConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConsultaActionPerformed
         try {                                         
                DefaultTableModel modelo =new DefaultTableModel();
                String condicion="";
                String tabla=JOptionPane.showInputDialog(null,"introduce el nombre de la tabla");
                if (ComboBox.getSelectedIndex()==0) {
                  condicion="dni";
             }
                else if(ComboBox.getSelectedIndex()==1){
                   condicion="puesto";
                }else
                    condicion="nombre";
                ResultSet rs=Mostrar.getTabla("select * from "+tabla+"companhias where "+condicion+"= "+TConsulta.getText());
                System.out.println(condicion);
                ResultSet rs2=Mostrar.getTabla("select * from "+tabla+" where "+condicion+"= "+TConsulta.getText());
                modelo.setColumnIdentifiers(new Object[]{"dni","puesto","nombre"});
                
                try {
                    modelo.addColumn("nombre");
                   
                        modelo.addRow(new Object[]{rs.getLong("dni"),rs.getString("puesto"),rs2.getString("nombre")});
                    
                    tablaComp.setModel(modelo);
                } catch (Exception e) {
                    System.out.println(e);
                }
 } catch (SQLException ex) {
                Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null,ex);
            }
           
        
    }//GEN-LAST:event_BConsultaActionPerformed

    private void TConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TConsultaActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        DefaultTableModel dm = (DefaultTableModel) tablaComp.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
        dm.removeRow(i);
}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BConsulta;
    private javax.swing.JButton BModificar;
    private javax.swing.JButton BotonCrearTablas;
    private javax.swing.JButton BotonInsertar;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTextField TConsulta;
    private javax.swing.JButton bMostrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tablaComp;
    // End of variables declaration//GEN-END:variables
}
