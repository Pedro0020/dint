/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examenes.primer_trimestre.parte_1;

import java.awt.CardLayout;
import java.awt.Color;

/**
 *
 * @author neo
 */
public class Parte1 extends javax.swing.JFrame {

    /**
     * Creates new form Parte1
     */
    public Parte1() {
        initComponents();
        deshabilitarBotones();
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
        panelSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        btnActivar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        panelInferiror = new javax.swing.JPanel();
        panelIzquierda = new javax.swing.JPanel();
        rdBtnGrid = new javax.swing.JRadioButton();
        rdBtnDatosPersonales = new javax.swing.JRadioButton();
        panelDerecha = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        panelCentral = new javax.swing.JPanel();
        panelPersonales = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblUsuarioCard = new javax.swing.JLabel();
        panelGrid = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Examen");

        panelSuperior.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Usuario:");

        btnActivar.setText(" Activar");
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        jLabel2.setText("Usuario Activo: ");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuperiorLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSuperiorLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lblUsuario)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActivar))
                .addGap(18, 18, 18)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblUsuario))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(panelSuperior, java.awt.BorderLayout.PAGE_START);

        panelInferiror.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout panelInferirorLayout = new javax.swing.GroupLayout(panelInferiror);
        panelInferiror.setLayout(panelInferirorLayout);
        panelInferirorLayout.setHorizontalGroup(
            panelInferirorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );
        panelInferirorLayout.setVerticalGroup(
            panelInferirorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(panelInferiror, java.awt.BorderLayout.PAGE_END);

        panelIzquierda.setBackground(new java.awt.Color(204, 255, 255));

        buttonGroup1.add(rdBtnGrid);
        rdBtnGrid.setText("Datos Grid");
        rdBtnGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnGridActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdBtnDatosPersonales);
        rdBtnDatosPersonales.setSelected(true);
        rdBtnDatosPersonales.setText("Datos Personales");
        rdBtnDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnDatosPersonalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIzquierdaLayout = new javax.swing.GroupLayout(panelIzquierda);
        panelIzquierda.setLayout(panelIzquierdaLayout);
        panelIzquierdaLayout.setHorizontalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdBtnGrid)
                    .addComponent(rdBtnDatosPersonales))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelIzquierdaLayout.setVerticalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(rdBtnGrid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtnDatosPersonales)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        getContentPane().add(panelIzquierda, java.awt.BorderLayout.LINE_START);

        panelDerecha.setBackground(new java.awt.Color(204, 255, 255));

        jCheckBox1.setText("Fondos Normales");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDerechaLayout = new javax.swing.GroupLayout(panelDerecha);
        panelDerecha.setLayout(panelDerechaLayout);
        panelDerechaLayout.setHorizontalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechaLayout.createSequentialGroup()
                .addComponent(jCheckBox1)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelDerechaLayout.setVerticalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jCheckBox1)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        getContentPane().add(panelDerecha, java.awt.BorderLayout.LINE_END);

        panelCentral.setLayout(new java.awt.CardLayout());

        jLabel3.setText("Usuario");

        javax.swing.GroupLayout panelPersonalesLayout = new javax.swing.GroupLayout(panelPersonales);
        panelPersonales.setLayout(panelPersonalesLayout);
        panelPersonalesLayout.setHorizontalGroup(
            panelPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonalesLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuarioCard)
                .addContainerGap(349, Short.MAX_VALUE))
        );
        panelPersonalesLayout.setVerticalGroup(
            panelPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonalesLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(panelPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblUsuarioCard))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        panelCentral.add(panelPersonales, "card3");

        panelGrid.setBackground(new java.awt.Color(255, 255, 0));
        panelGrid.setLayout(new java.awt.GridLayout(2, 0, 20, 20));

        jButton1.setText("jButton1");
        panelGrid.add(jButton1);

        jButton2.setText("jButton2");
        panelGrid.add(jButton2);

        jButton3.setText("jButton3");
        panelGrid.add(jButton3);

        jButton4.setText("jButton4");
        panelGrid.add(jButton4);

        jButton5.setText("jButton5");
        panelGrid.add(jButton5);

        jButton6.setText("jButton6");
        panelGrid.add(jButton6);

        panelCentral.add(panelGrid, "card2");

        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        Color c = panelInferiror.getBackground();
        panelInferiror.setBackground(panelSuperior.getBackground());
        panelSuperior.setBackground(c);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void rdBtnGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnGridActionPerformed
        CardLayout paneisLayout = (CardLayout) this.panelCentral.getLayout();
        paneisLayout.show(this.panelCentral, "card2");
    }//GEN-LAST:event_rdBtnGridActionPerformed

    private void rdBtnDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnDatosPersonalesActionPerformed
        CardLayout paneisLayout = (CardLayout) this.panelCentral.getLayout();
        paneisLayout.show(this.panelCentral, "card3");    }//GEN-LAST:event_rdBtnDatosPersonalesActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        String usr;
        if (!(usr= textUsuario.getText()).isEmpty()){
            habilitarBotones();
            lblUsuario.setText(usr);
            lblUsuarioCard.setText(usr);
            
        }
    }//GEN-LAST:event_btnActivarActionPerformed

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
            java.util.logging.Logger.getLogger(Parte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parte1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioCard;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelGrid;
    private javax.swing.JPanel panelInferiror;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JPanel panelPersonales;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JRadioButton rdBtnDatosPersonales;
    private javax.swing.JRadioButton rdBtnGrid;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables

    private void deshabilitarBotones() {
        rdBtnDatosPersonales.setEnabled(false);
        rdBtnGrid.setEnabled(false);
    }

    private void habilitarBotones() {
        rdBtnDatosPersonales.setEnabled(true);
        rdBtnGrid.setEnabled(true);
    }
}