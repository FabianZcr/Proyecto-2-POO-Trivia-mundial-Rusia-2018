/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.*;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Fabián
 */
public class VentanaComienzo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRegistro
     */
    public VentanaComienzo() {
        initComponents();
        Image icon = new ImageIcon(getClass().getResource("/Imagenes/world-cup-icon.png")).getImage();
        setIconImage(icon);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        equiposBolas = new javax.swing.JLabel();
        fondoEstadio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1087, 615));
        setMinimumSize(new java.awt.Dimension(1087, 615));
        setPreferredSize(new java.awt.Dimension(1087, 615));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Palace Script MT", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("by: Jefry Vidal M. y Fabián Zamora R.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(600, 530, 580, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/picturetopeople.org-9135bf828a071d08c8d4753c3cb6d64ceadf239f8a24f95642.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 80, 610, 120);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Niagara Engraved", 0, 11)); // NOI18N
        jButton1.setText("Iniciar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(510, 540, 90, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/picturetopeople.org-4ee4c213283d7e0bf7cec4f995ea2a62a257b16596e5846e6e.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, -10, 610, 120);

        equiposBolas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equiposBalls.png"))); // NOI18N
        getContentPane().add(equiposBolas);
        equiposBolas.setBounds(80, 0, 1040, 600);

        fondoEstadio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallpaper2.jpg"))); // NOI18N
        getContentPane().add(fondoEstadio);
        fondoEstadio.setBounds(-400, -180, 1621, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VentanaIniciarSesion nVentana = new VentanaIniciarSesion();
        nVentana.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(VentanaIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel equiposBolas;
    private javax.swing.JLabel fondoEstadio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}