/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.superadmin;

import classes.IngredientSupplier;
import java.sql.Date;
import javax.swing.JOptionPane;
import model.registration.*;
import util.sql.IngredientSupplierSqlQuery;

/**
 *
 * @author Dell
 */
public class UpdateIngredientSupplierFormJPanel extends javax.swing.JPanel {

    /**
     * Creates new form IngredientSupplierFormJPanel
     */
    private boolean validation;
    javax.swing.JSplitPane splitPane;
    IngredientSupplier is;
    public UpdateIngredientSupplierFormJPanel(javax.swing.JSplitPane splitPane,IngredientSupplier is) {
        initComponents();
        this.splitPane=splitPane;
        this.is=is;
        formReset();
        txtName.setText(is.getSupplier_Name());
        txtLocation.setText(is.getSupplier_Location());
        comboboxCategory.setSelectedItem(is.getSupplier_Category());
        datechooserDateofEst.setDate(is.getSupplier_Date_Of_Establishment());
        txtEmailId.setText(is.getEmail_Id());
        txtPhoneNumber.setText(is.getPhone_No());
        txtPassword.setText(is.getPassword());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        valName = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        valLocation = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblDateofEst = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 32767));
        btnReset = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();
        lbllogo = new javax.swing.JLabel();
        comboboxCategory = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblEmailId = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        valEmailId = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        valPhoneNumber = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        valPassword = new javax.swing.JLabel();
        datechooserDateofEst = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeading.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 51, 153));
        lblHeading.setText("Update Ingredient Supplier Details");
        jPanel2.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 590, 90));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(102, 102, 102));
        lblName.setText("Name");
        jPanel2.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 70, 30));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 290, 30));

        valName.setForeground(new java.awt.Color(255, 61, 0));
        valName.setText("Please enter valid Name");
        jPanel2.add(valName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 290, 20));

        lblLocation.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(102, 102, 102));
        lblLocation.setText("Location");
        jPanel2.add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 120, 30));

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        jPanel2.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 290, 30));

        valLocation.setForeground(new java.awt.Color(255, 61, 0));
        valLocation.setText("Please enter valid Location");
        jPanel2.add(valLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 290, 20));

        lblCategory.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(102, 102, 102));
        lblCategory.setText("Category");
        jPanel2.add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 110, 30));

        lblDateofEst.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblDateofEst.setForeground(new java.awt.Color(102, 102, 102));
        lblDateofEst.setText("Date of Establishment");
        jPanel2.add(lblDateofEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 200, 30));
        jPanel2.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 710, -1, 90));
        jPanel2.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 190, 0));

        btnReset.setBackground(new java.awt.Color(255, 51, 0));
        btnReset.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Reverse.png"))); // NOI18N
        btnReset.setText("RESET");
        btnReset.setIconTextGap(10);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 740, 160, 40));

        btnsubmit.setBackground(new java.awt.Color(0, 153, 0));
        btnsubmit.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Double Tick.png"))); // NOI18N
        btnsubmit.setText("SUBMIT");
        btnsubmit.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel2.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 740, 160, 40));

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        jPanel2.add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 730, 110, 70));

        comboboxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Structural", "Finishing", "Insulation", "Eletrical", "Plumbing", "Cement" }));
        comboboxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxCategoryActionPerformed(evt);
            }
        });
        jPanel2.add(comboboxCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 290, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/IngredientSupplier.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 390, 440));

        lblEmailId.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblEmailId.setForeground(new java.awt.Color(102, 102, 102));
        lblEmailId.setText("Email Id");
        jPanel2.add(lblEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 70, 30));

        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 290, 30));

        valEmailId.setForeground(new java.awt.Color(255, 61, 0));
        valEmailId.setText("Please enter valid Email Id");
        jPanel2.add(valEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 290, 20));

        lblPhoneNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(102, 102, 102));
        lblPhoneNumber.setText("Phone Number");
        jPanel2.add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 140, 30));

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        jPanel2.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 290, 30));

        valPhoneNumber.setForeground(new java.awt.Color(255, 61, 0));
        valPhoneNumber.setText("Please enter valid Phone Number");
        jPanel2.add(valPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, 290, 20));

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(102, 102, 102));
        lblPassword.setText("Password");
        jPanel2.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 110, 30));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 290, 30));

        valPassword.setForeground(new java.awt.Color(255, 61, 0));
        valPassword.setText("Please enter valid Password");
        jPanel2.add(valPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 290, 20));
        jPanel2.add(datechooserDateofEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 290, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxCategoryActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
        //collecting values
        String IngredientSupplier_Name = txtName.getText();
        String IngredientSupplier_Location = txtLocation.getText();
        String IngredientSupplier_Material_Type= " ";
        if(comboboxCategory.getSelectedIndex()==0) IngredientSupplier_Material_Type = "Tablets";
        if(comboboxCategory.getSelectedIndex()==1) IngredientSupplier_Material_Type = "Capsules";
        if(comboboxCategory.getSelectedIndex()==2) IngredientSupplier_Material_Type = "Syrups";
        if(comboboxCategory.getSelectedIndex()==3) IngredientSupplier_Material_Type = "Injections";
        if(comboboxCategory.getSelectedIndex()==4) IngredientSupplier_Material_Type = "Implants";
        if(comboboxCategory.getSelectedIndex()==5) IngredientSupplier_Material_Type = "Ointments";
        if(comboboxCategory.getSelectedIndex()==6) IngredientSupplier_Material_Type = "Vitamins";
        Date IngredientSupplier_date = new java.sql.Date(datechooserDateofEst.getDate().getTime());
        String Email_Id = txtEmailId.getText();
        String Phone_No = txtPhoneNumber.getText();
        String Password = txtPassword.getText();
        
        //Database Query Object
        IngredientSupplierSqlQuery sql = new IngredientSupplierSqlQuery();
        int result = 0;
        
        
        //Create a patient object
        IngredientSupplier obj = new IngredientSupplier();
        
        
        //Fill he object using setter
        obj.setSupplier_Id(is.getSupplier_Id());
        obj.setSupplier_Name(IngredientSupplier_Name);
        obj.setSupplier_Location(IngredientSupplier_Location);
        obj.setSupplier_Category(IngredientSupplier_Material_Type);
        obj.setSupplier_Date_Of_Establishment(IngredientSupplier_date);
        obj.setEmail_Id(Email_Id);
        obj.setPhone_No(Phone_No);
        obj.setPassword(Password);
        
        if (validation()) {
//            testEmail a = new testEmail();
//            try {
//                a.sendMail(Email_Id,"AVS MaterialDepot -  Account Creation","Ingredient Supplier account created successfully !");
//            } catch (Exception ex) {
//                Logger.getLogger(PatientRegFormJPanel.class.getName()).log(Level.SEVERE, null, ex);
//            }
            result = sql.updateIngredientSupplier(obj);        
        }
        if (result == 1) {
            formReset();        
            splitPane.setRightComponent(new SuccessGifJPanel());
        } else {
            validation();
            JOptionPane.showMessageDialog(this, "Ingredient Supplier not created !");

        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
         formReset();
        /**
     * Form reset implementation
     */
    
    }//GEN-LAST:event_btnResetActionPerformed
     private void formReset() 
    {

        txtName.setText("");
        txtLocation.setText("");
        comboboxCategory.setSelectedItem("");
        datechooserDateofEst.setDate(null);
        txtEmailId.setText("");
        txtPhoneNumber.setText("");
        txtPassword.setText("");
        
        valName.setText("");
        valLocation.setText("");
        valEmailId.setText("");
        valPhoneNumber.setText("");
        valPassword.setText("");
        
        
    }
    
      /**
     * Validation implementation
     *
     * @return
     */
    private boolean validation() {
        boolean validation = true;
        
        
        valName.setText("");
        valLocation.setText("");
        valEmailId.setText("");
        valPhoneNumber.setText("");
        valPassword.setText("");
                
        
        String IngredientSupplier_Name = txtName.getText();
        String IngredientSupplier_Location = txtLocation.getText();
        String Email_Id = txtEmailId.getText();
        String Phone_No = txtPhoneNumber.getText();
        String Password = txtPassword.getText();
       

        System.out.println("Ingredient Supplier Name->" + IngredientSupplier_Name);

        //Name Validation
        if (IngredientSupplier_Name.length() <= 0) {
            valName.setText("Please Enter Name");
            validation = false;
        }
        //Location Validation
        if (IngredientSupplier_Location.length() <= 0) {
            valLocation.setText("Please Enter Location");
            validation = false;
        }
         //Email_Id Validation
        if (Email_Id.length() <= 0) {
            valEmailId.setText("Please Enter EmailId");
            validation = false;
        }
        //Phone_No Validation
        if (Phone_No.length() <= 0) {
            valPhoneNumber.setText("Please Enter Phone_No");
            validation = false;
        }
        //Password Validation
        if (Password.length() <= 0) {
            valPassword.setText("Please Enter Password");
            validation = false;
        }

        return validation;
    }
    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox<String> comboboxCategory;
    private com.toedter.calendar.JDateChooser datechooserDateofEst;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblDateofEst;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JLabel valEmailId;
    private javax.swing.JLabel valLocation;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valPassword;
    private javax.swing.JLabel valPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
