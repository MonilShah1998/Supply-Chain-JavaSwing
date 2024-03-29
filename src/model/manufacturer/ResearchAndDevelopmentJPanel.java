/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.manufacturer;

import classes.Manufacturer;
import classes.Material;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import util.sql.ManufacturerSqlQuery;
import util.sql.MaterialSqlQuery;

/**
 *
 * @author nitishahuja
 */
public class ResearchAndDevelopmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerJPanel
     */
    private boolean validation;
    javax.swing.JSplitPane splitPane;
    Manufacturer manufacturer;
    String ingTextArea = "";
    DefaultPieDataset dataset;

    public ResearchAndDevelopmentJPanel(javax.swing.JSplitPane splitPane, Manufacturer manufacturer) {
        initComponents();
        this.splitPane = splitPane;
        this.manufacturer = manufacturer;
        txtManufacturerName.setText(manufacturer.getManufacturer_Name());
        formReset();
        populateTable();
        this.dataset = new DefaultPieDataset();
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
        PanelInventoryM = new javax.swing.JTabbedPane();
        panOrderManagement = new javax.swing.JPanel();
        lblOrderTable = new javax.swing.JLabel();
        lbllogo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMaterial = new javax.swing.JTable();
        btnNewOrder = new javax.swing.JButton();
        panInventoryManagement = new javax.swing.JPanel();
        lbllogo1 = new javax.swing.JLabel();
        lblMaterialName = new javax.swing.JLabel();
        txtMaterialName = new javax.swing.JTextField();
        valMedName = new javax.swing.JLabel();
        lblMedStatus = new javax.swing.JLabel();
        lblMedCategory = new javax.swing.JLabel();
        lblManufacturerN = new javax.swing.JLabel();
        txtManufacturerName = new javax.swing.JTextField();
        lblDOM = new javax.swing.JLabel();
        lblShellLife = new javax.swing.JLabel();
        lblName6 = new javax.swing.JLabel();
        txtIng = new javax.swing.JTextField();
        valIngredients = new javax.swing.JLabel();
        drpStatusofMaterial = new javax.swing.JComboBox<>();
        comboCategoryMal = new javax.swing.JComboBox<>();
        spinUnit = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaIngMal = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnResetMed = new javax.swing.JButton();
        btnsubmitMed = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        dateDOM = new com.toedter.calendar.JDateChooser();
        spinShellLife = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(51, 153, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Research and Development Department");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        PanelInventoryM.setBackground(new java.awt.Color(255, 255, 255));
        PanelInventoryM.setForeground(new java.awt.Color(0, 51, 153));
        PanelInventoryM.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N

        panOrderManagement.setBackground(new java.awt.Color(255, 255, 255));
        panOrderManagement.setForeground(new java.awt.Color(0, 51, 153));
        panOrderManagement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrderTable.setBackground(new java.awt.Color(255, 255, 255));
        lblOrderTable.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblOrderTable.setForeground(new java.awt.Color(153, 153, 153));
        lblOrderTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Pill.png"))); // NOI18N
        lblOrderTable.setText("Manage Material");
        lblOrderTable.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblOrderTable.setIconTextGap(10);
        panOrderManagement.add(lblOrderTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 24, 499, 56));

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        panOrderManagement.add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 528, 190, 150));

        tblMaterial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Material Name", "Material Category", "Date of Manufacturing", "Manufacturer Name", "Material Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMaterial);

        panOrderManagement.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 114, 764, 440));

        btnNewOrder.setBackground(new java.awt.Color(0, 153, 255));
        btnNewOrder.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnNewOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnNewOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Eye.png"))); // NOI18N
        btnNewOrder.setText("VIEW");
        btnNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderActionPerformed(evt);
            }
        });
        panOrderManagement.add(btnNewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 120, 34));

        PanelInventoryM.addTab("Manage Material", panOrderManagement);

        panInventoryManagement.setBackground(new java.awt.Color(255, 255, 255));
        panInventoryManagement.setForeground(new java.awt.Color(255, 255, 255));
        panInventoryManagement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        panInventoryManagement.add(lbllogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 608, 110, 70));

        lblMaterialName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblMaterialName.setForeground(new java.awt.Color(102, 102, 102));
        lblMaterialName.setText("Material Name");
        panInventoryManagement.add(lblMaterialName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 290, 30));

        txtMaterialName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaterialNameActionPerformed(evt);
            }
        });
        panInventoryManagement.add(txtMaterialName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 290, 30));

        valMedName.setForeground(new java.awt.Color(255, 61, 0));
        valMedName.setText("Please enter valid material name");
        panInventoryManagement.add(valMedName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 290, 20));

        lblMedStatus.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblMedStatus.setForeground(new java.awt.Color(102, 102, 102));
        lblMedStatus.setText(" Status");
        panInventoryManagement.add(lblMedStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 290, 30));

        lblMedCategory.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblMedCategory.setForeground(new java.awt.Color(102, 102, 102));
        lblMedCategory.setText(" Category");
        panInventoryManagement.add(lblMedCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 290, 30));

        lblManufacturerN.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblManufacturerN.setForeground(new java.awt.Color(102, 102, 102));
        lblManufacturerN.setText("Manufacturer Name");
        panInventoryManagement.add(lblManufacturerN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 290, 30));

        txtManufacturerName.setEnabled(false);
        txtManufacturerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturerNameActionPerformed(evt);
            }
        });
        panInventoryManagement.add(txtManufacturerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 290, 30));

        lblDOM.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblDOM.setForeground(new java.awt.Color(102, 102, 102));
        lblDOM.setText("Date of Manufacturer");
        panInventoryManagement.add(lblDOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 290, 30));

        lblShellLife.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblShellLife.setForeground(new java.awt.Color(102, 102, 102));
        lblShellLife.setText("Shell Life");
        panInventoryManagement.add(lblShellLife, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 290, 30));

        lblName6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblName6.setForeground(new java.awt.Color(102, 102, 102));
        lblName6.setText("Ingredients (Raw materials)");
        panInventoryManagement.add(lblName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 290, 30));

        txtIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngActionPerformed(evt);
            }
        });
        panInventoryManagement.add(txtIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 230, 30));

        valIngredients.setForeground(new java.awt.Color(255, 61, 0));
        valIngredients.setText("Please enter valid ingredients");
        panInventoryManagement.add(valIngredients, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 290, 20));

        drpStatusofMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Formulated" }));
        drpStatusofMaterial.setEnabled(false);
        drpStatusofMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpStatusofMaterialActionPerformed(evt);
            }
        });
        panInventoryManagement.add(drpStatusofMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 290, 30));

        comboCategoryMal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stimulants", "Opioids", "Inhalants", "Hallucinogens", "Dissociative anesthetics", "Depressants", "Cannabis" }));
        panInventoryManagement.add(comboCategoryMal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 290, 30));
        panInventoryManagement.add(spinUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 50, 30));

        txtAreaIngMal.setColumns(20);
        txtAreaIngMal.setRows(5);
        jScrollPane1.setViewportView(txtAreaIngMal);

        panInventoryManagement.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 230, 180));

        btnAdd.setBackground(new java.awt.Color(0, 153, 255));
        btnAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Plus(2).png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panInventoryManagement.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 150, 90, 30));

        btnResetMed.setBackground(new java.awt.Color(255, 51, 0));
        btnResetMed.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnResetMed.setForeground(new java.awt.Color(255, 255, 255));
        btnResetMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Reverse.png"))); // NOI18N
        btnResetMed.setText("RESET");
        btnResetMed.setIconTextGap(10);
        btnResetMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetMedActionPerformed(evt);
            }
        });
        panInventoryManagement.add(btnResetMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 140, 40));

        btnsubmitMed.setBackground(new java.awt.Color(0, 153, 0));
        btnsubmitMed.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnsubmitMed.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmitMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Double Tick.png"))); // NOI18N
        btnsubmitMed.setText("SUBMIT");
        btnsubmitMed.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnsubmitMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitMedActionPerformed(evt);
            }
        });
        panInventoryManagement.add(btnsubmitMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 140, 40));

        jButton1.setText("View Proportions");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panInventoryManagement.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, -1));
        panInventoryManagement.add(dateDOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 290, -1));

        spinShellLife.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        panInventoryManagement.add(spinShellLife, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 90, 30));

        PanelInventoryM.addTab("Create Material", panInventoryManagement);

        add(PanelInventoryM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 800, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMaterial.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }

        ArrayList<Material> mList = new ArrayList<>();
        MaterialSqlQuery msq = new MaterialSqlQuery();
        mList = msq.readAllMaterialbyMName(manufacturer.getManufacturer_Name());
        int materialId = (int) tblMaterial.getValueAt(selectedRow, 0);
        Material m = mList.stream()
            .filter(material -> material.getId() == materialId)
            .findFirst()
            .orElse(null);
        if(m != null){
            new RnDJDialog(null, true, m).show();
            populateTable();
        }
//        Material m = mList.get(selectedRow);
        
    }//GEN-LAST:event_btnNewOrderActionPerformed

    private void btnOrderUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrderUpdateActionPerformed

    private void txtMaterialNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaterialNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaterialNameActionPerformed

    private void txtManufacturerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufacturerNameActionPerformed

    private void drpStatusofMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpStatusofMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drpStatusofMaterialActionPerformed

    private void txtIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String ing = txtIng.getText();
        int units = (int) spinUnit.getValue();
        this.ingTextArea += ing + " - " + units + " units" + "\n";
        txtAreaIngMal.setText(ingTextArea);
        txtIng.setText("");
        spinUnit.setValue(1);
        spinUnit.setValue(1);

        this.dataset.setValue(ing, new Integer(units));


    }//GEN-LAST:event_btnAddActionPerformed

    private void btnResetMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetMedActionPerformed
        // TODO add your handling code here:
        formReset();
    }//GEN-LAST:event_btnResetMedActionPerformed

    private void btnsubmitMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitMedActionPerformed
        // TODO add your handling code here:

        String materialName = txtMaterialName.getText();
        String status = "Formulated";
        String manufacturerName = manufacturer.getManufacturer_Name();
        String category = (String) comboCategoryMal.getSelectedItem();
        Date Manufacturer_date = new java.sql.Date(dateDOM.getDate().getTime());
        int shellLife = (int) spinShellLife.getValue();

        ManufacturerSqlQuery sql = new ManufacturerSqlQuery();
        Material obj = new Material();

        obj.setShell_Life(shellLife);
        obj.setIngredients(this.ingTextArea);
        obj.setDate_Of_Manufacture(Manufacturer_date);
        obj.setMaterial_Category(category);
        obj.setMaterial_Name(materialName);
        obj.setMaterial_Status(status);
        obj.setManufacturer_Name(manufacturerName);

        MaterialSqlQuery msq = new MaterialSqlQuery();
        if (validation()) {
            msq.createMaterial(obj);
            formReset();
            splitPane.setRightComponent(new SubmitGifJPanel());
        } else {
            validation();
            JOptionPane.showMessageDialog(this, "Material not created !");

        }

    }//GEN-LAST:event_btnsubmitMedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFreeChart chart = ChartFactory.createPieChart("Proportions", this.dataset, true, true, false);
        ChartFrame frame = new ChartFrame("Pie Chart", chart);
        frame.setVisible(true);
        frame.setSize(450, 450);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void formReset() {

        txtMaterialName.setText("");
        txtIng.setText("");
        comboCategoryMal.setSelectedIndex(1);
        dateDOM.setDate(null);
        spinShellLife.setValue(1);
        spinUnit.setValue(0);

        valIngredients.setText("");
        valMedName.setText("");

    }

    private boolean validation() {
        boolean validation = true;

        valIngredients.setText("");
        valMedName.setText("");

        String materialName = txtMaterialName.getText();

        //materialName Validation
        if (materialName.length() <= 0) {
            valMedName.setText("Please Enter Material Name");
            validation = false;
        }

        //materialName Validation
        if (this.ingTextArea.length() <= 0) {
            valMedName.setText("Please Enter Ingredients Name");
            validation = false;
        }

        return validation;
    }

    private void populateTable() {
        ArrayList<Material> mList = new ArrayList<>();
        MaterialSqlQuery msq = new MaterialSqlQuery();
        mList = msq.readAllMaterialbyMName(manufacturer.getManufacturer_Name());

        DefaultTableModel model = (DefaultTableModel) tblMaterial.getModel();
        model.setRowCount(0);

        for (Material e : mList) {
            Object row[] = new Object[10];
            row[0] = e.getId();
            row[1] = e.getMaterial_Name();
            row[2] = e.getMaterial_Category();
            row[3] = e.getDate_Of_Manufacture();
            row[4] = e.getManufacturer_Name();
            row[5] = e.getMaterial_Status();

            if ((e.getMaterial_Status().equals("Formulated") && manufacturer.getManufacturer_Name().equals(e.getManufacturer_Name())) || (e.getMaterial_Status().equals("Ordered Ingredients") && manufacturer.getManufacturer_Name().equals(e.getManufacturer_Name())) || (e.getMaterial_Status().equals("Rejected") && manufacturer.getManufacturer_Name().equals(e.getManufacturer_Name()))) {
                model.addRow(row);
            }

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PanelInventoryM;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JButton btnResetMed;
    private javax.swing.JButton btnsubmitMed;
    private javax.swing.JComboBox<String> comboCategoryMal;
    private com.toedter.calendar.JDateChooser dateDOM;
    private javax.swing.JComboBox<String> drpStatusofMaterial;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDOM;
    private javax.swing.JLabel lblManufacturerN;
    private javax.swing.JLabel lblMaterialName;
    private javax.swing.JLabel lblMedCategory;
    private javax.swing.JLabel lblMedStatus;
    private javax.swing.JLabel lblName6;
    private javax.swing.JLabel lblOrderTable;
    private javax.swing.JLabel lblShellLife;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lbllogo1;
    private javax.swing.JPanel panInventoryManagement;
    private javax.swing.JPanel panOrderManagement;
    private javax.swing.JSpinner spinShellLife;
    private javax.swing.JSpinner spinUnit;
    private javax.swing.JTable tblMaterial;
    private javax.swing.JTextArea txtAreaIngMal;
    private javax.swing.JTextField txtIng;
    private javax.swing.JTextField txtManufacturerName;
    private javax.swing.JTextField txtMaterialName;
    private javax.swing.JLabel valIngredients;
    private javax.swing.JLabel valMedName;
    // End of variables declaration//GEN-END:variables
}
