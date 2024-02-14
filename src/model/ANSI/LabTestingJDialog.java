/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package model.ANSI;

import classes.Material;
import java.awt.Color;
import util.sql.MaterialSqlQuery;

/**
 *
 * @author Dell
 */
public class LabTestingJDialog extends javax.swing.JDialog {

    /**
     * Creates new form MaterialDetailsJDialog
     */
    private static Material m;
    public LabTestingJDialog(java.awt.Frame parent, boolean modal,Material m) {
        super(parent, modal);
        initComponents();
        this.m = m;
        lblCategory.setText(m.getMaterial_Category());
        lblDate.setText(String.valueOf(m.getDate_Of_Manufacture()));
        lblManufacturer.setText(m.getManufacturer_Name());
        lblMaterialName.setText(m.getMaterial_Name());
        lblShellLife.setText(String.valueOf(m.getShell_Life()));
        txtAreaIng.setText(m.getIngredients());
        DisplayBtn();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMaterialName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblShellLife = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblManufacturer = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaIng = new javax.swing.JTextArea();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        lblMsgBox = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Material Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 45));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText(" Name - ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lblMaterialName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblMaterialName.setForeground(new java.awt.Color(102, 0, 102));
        lblMaterialName.setText("{Material Name}");
        getContentPane().add(lblMaterialName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Category - ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        lblCategory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(102, 0, 102));
        lblCategory.setText("{Material Name}");
        getContentPane().add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Date of Manufacturing - ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lblDate.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblDate.setForeground(new java.awt.Color(102, 0, 102));
        lblDate.setText("{Material Name}");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Shell Life - ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblShellLife.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblShellLife.setForeground(new java.awt.Color(102, 0, 102));
        lblShellLife.setText("{Material Name}");
        getContentPane().add(lblShellLife, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        btnReject.setBackground(new java.awt.Color(255, 51, 0));
        btnReject.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Unavailable.png"))); // NOI18N
        btnReject.setText("REJECT");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        getContentPane().add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 110, 30));

        btnAccept.setBackground(new java.awt.Color(0, 153, 51));
        btnAccept.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Approval.png"))); // NOI18N
        btnAccept.setText("LAB TESTED");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 140, 30));

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Manufacturer - ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lblManufacturer.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblManufacturer.setForeground(new java.awt.Color(102, 0, 102));
        lblManufacturer.setText("{Material Name}");
        getContentPane().add(lblManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Ingredients - ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        txtAreaIng.setColumns(20);
        txtAreaIng.setRows(5);
        txtAreaIng.setEnabled(false);
        jScrollPane1.setViewportView(txtAreaIng);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 260, 110));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 245, -1, 60));

        lblMsgBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMsgBox.setForeground(new java.awt.Color(0, 153, 51));
        lblMsgBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblMsgBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 610, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void DisplayBtn(){
        if(m.getMaterial_Status().equals("Rejected") || m.getMaterial_Status().equals("Lab Tested")){
            btnReject.setEnabled(false);
            btnAccept.setEnabled(false);
            if(m.getMaterial_Status().equals("Lab Tested")){
                lblMsgBox.setText("Lab Test Passed");
            }
            else{
                lblMsgBox.setText("This material has been Rejected.");
                lblMsgBox.setForeground(Color.RED);
            }
            lblMsgBox.setVisible(true);
        }
        else{
           lblMsgBox.setText("");
            lblMsgBox.setVisible(false);
            btnAccept.setForeground(Color.WHITE);
            btnReject.setForeground(Color.WHITE); 
        } 
    }
        
    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
         MaterialSqlQuery msq = new MaterialSqlQuery();
         m.setMaterial_Status("Rejected");
         msq.updateMaterial(m);
         setVisible(false);
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        MaterialSqlQuery msq = new MaterialSqlQuery();
        m.setMaterial_Status("Lab Tested");
        msq.updateMaterial(m);
        setVisible(false);
    }//GEN-LAST:event_btnAcceptActionPerformed

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
            java.util.logging.Logger.getLogger(LabTestingJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LabTestingJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LabTestingJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LabTestingJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LabTestingJDialog dialog = new LabTestingJDialog(new javax.swing.JFrame(), true, m);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnReject;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblMaterialName;
    private javax.swing.JLabel lblMsgBox;
    private javax.swing.JLabel lblShellLife;
    private javax.swing.JTextArea txtAreaIng;
    // End of variables declaration//GEN-END:variables
}
