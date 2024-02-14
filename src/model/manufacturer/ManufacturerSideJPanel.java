/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.manufacturer;

import classes.Manufacturer;
import model.main.MainJFrame;

/**
 *
 * @author Dell
 */
public class ManufacturerSideJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerSideJPanel
     */
    javax.swing.JSplitPane splitPane;
    Manufacturer manufacturer;
    public ManufacturerSideJPanel(javax.swing.JSplitPane splitPane,Manufacturer manufacturer) {
        initComponents();
        this.splitPane=splitPane;
        this.manufacturer=manufacturer;
        lblManuName.setText(manufacturer.getManufacturer_Name());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManufacturerDashboard = new javax.swing.JLabel();
        lblavslogomd = new javax.swing.JLabel();
        lbldepartment = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lblavsManufacturer = new javax.swing.JLabel();
        drpDepartment = new javax.swing.JComboBox<>();
        lblManuName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManufacturerDashboard.setBackground(new java.awt.Color(204, 204, 255));
        lblManufacturerDashboard.setFont(new java.awt.Font("Helvetica Neue", 1, 25)); // NOI18N
        lblManufacturerDashboard.setForeground(new java.awt.Color(102, 102, 102));
        lblManufacturerDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManufacturerDashboard.setText("Manufacturer Dashboard");
        add(lblManufacturerDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 400, 50));

        lblavslogomd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblavslogomd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        add(lblavslogomd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 400, 200));

        lbldepartment.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbldepartment.setForeground(new java.awt.Color(102, 102, 102));
        lbldepartment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldepartment.setText("Choose a Department");
        add(lbldepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 450, 400, 40));

        btnLogout.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Shutdown.png"))); // NOI18N
        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 140, 40));

        lblavsManufacturer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblavsManufacturer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/WelcomeIS.gif"))); // NOI18N
        add(lblavsManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        drpDepartment.setForeground(new java.awt.Color(102, 102, 102));
        drpDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose an Option...", "R & D", "Licensing", "Packaging" }));
        drpDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpDepartmentActionPerformed(evt);
            }
        });
        add(drpDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 290, 50));

        lblManuName.setFont(new java.awt.Font("Helvetica Neue", 1, 34)); // NOI18N
        lblManuName.setForeground(new java.awt.Color(0, 51, 153));
        lblManuName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManuName.setText("SUNAINA");
        add(lblManuName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 400, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new MainJFrame().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void drpDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpDepartmentActionPerformed
        // TODO add your handling code here:
        if(drpDepartment.getSelectedItem().equals("R & D")){
            splitPane.setRightComponent(new ResearchAndDevelopmentJPanel(splitPane,manufacturer));
        }
        else if(drpDepartment.getSelectedItem().equals("Licensing")){
            splitPane.setRightComponent(new LicensingJPanel(manufacturer));
        }
        else if(drpDepartment.getSelectedItem().equals("Packaging")){
            splitPane.setRightComponent(new PackagingJPanel(splitPane,manufacturer));
        }
    }//GEN-LAST:event_drpDepartmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> drpDepartment;
    private javax.swing.JLabel lblManuName;
    private javax.swing.JLabel lblManufacturerDashboard;
    private javax.swing.JLabel lblavsManufacturer;
    private javax.swing.JLabel lblavslogomd;
    private javax.swing.JLabel lbldepartment;
    // End of variables declaration//GEN-END:variables
}
