/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.communityadmin;

import model.main.MainJFrame;

import model.main.MainJFrame;
import model.registration.ContractorFormJPanel;
import model.registration.MaterialDepotFormJPanel;

/**
 *
 * @author Dell
 */
public class CommunityAdminRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdminRegistrationJPanel
     */
    javax.swing.JSplitPane splitPane;
    public CommunityAdminRegistrationJPanel(javax.swing.JSplitPane splitPane) {
        initComponents();
        this.splitPane=splitPane;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRoleHeading = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        lblBack = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        imgMaterialDepot = new javax.swing.JLabel();
        lblMaterialDepot = new javax.swing.JLabel();
        btnMaterialDepot = new javax.swing.JButton();
        imgContractor = new javax.swing.JLabel();
        lblContractor = new javax.swing.JLabel();
        btnContractor = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRoleHeading.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblRoleHeading.setForeground(new java.awt.Color(102, 102, 102));
        lblRoleHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRoleHeading.setText("Choose Role");
        add(lblRoleHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 230, 50));
        add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, -1, 90));
        add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 70, -1));

        lblBack.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Double Left.png"))); // NOI18N
        lblBack.setText("BACK");
        add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 70, 30));

        imgMaterialDepot.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgMaterialDepot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMaterialDepot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Pharmacy Shop.png"))); // NOI18N
        add(imgMaterialDepot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 190, 120));

        lblMaterialDepot.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblMaterialDepot.setForeground(new java.awt.Color(255, 255, 255));
        lblMaterialDepot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaterialDepot.setText("Material Depot");
        add(lblMaterialDepot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 190, 40));

        btnMaterialDepot.setBackground(new java.awt.Color(153, 204, 255));
        btnMaterialDepot.setForeground(new java.awt.Color(255, 0, 153));
        btnMaterialDepot.setBorder(null);
        btnMaterialDepot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMaterialDepotActionPerformed(evt);
            }
        });
        add(btnMaterialDepot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 190, 200));

        imgContractor.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        imgContractor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgContractor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Hospital 3.png"))); // NOI18N
        add(imgContractor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 200, 60));

        lblContractor.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblContractor.setForeground(new java.awt.Color(255, 255, 255));
        lblContractor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContractor.setText("Contractor");
        add(lblContractor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 200, 20));

        btnContractor.setBackground(new java.awt.Color(255, 51, 102));
        btnContractor.setForeground(new java.awt.Color(255, 0, 153));
        btnContractor.setBorder(null);
        btnContractor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContractorActionPerformed(evt);
            }
        });
        add(btnContractor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 200, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new MainJFrame().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewMaterialDepotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMaterialDepotActionPerformed
        // TODO add your handling code here:
        splitPane.setRightComponent(new ViewMaterialDepotJPanel(splitPane));
    }//GEN-LAST:event_btnViewMaterialDepotActionPerformed

    private void btnContractorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContractorActionPerformed
        // TODO add your handling code here:
        splitPane.setRightComponent(new ViewContractorJPanel(splitPane));
    }//GEN-LAST:event_btnContractorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnContractor;
    private javax.swing.JButton btnMaterialDepot;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel imgContractor;
    private javax.swing.JLabel imgMaterialDepot;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblContractor;
    private javax.swing.JLabel lblMaterialDepot;
    private javax.swing.JLabel lblRoleHeading;
    // End of variables declaration//GEN-END:variables
}