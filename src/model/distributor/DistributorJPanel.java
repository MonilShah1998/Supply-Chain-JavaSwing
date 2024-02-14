/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.distributor;

import classes.ContractorOrderBook;
import classes.Material;
import classes.MaterialDepotOrderBook;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import util.sql.Contractor_OrderBook_SqlQuery;
import util.sql.MaterialSqlQuery;
import util.sql.MaterialDepot_OrderBook_SqlQuery;

/**
 *
 * @author Dell
 */
public class DistributorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DistributorJPanel
     */
    
    DefaultPieDataset manANSItaset;
    DefaultPieDataset categoryDataset;
    public DistributorJPanel() {
        initComponents();
        populateTable();
        populateMaterialDepotOrdersTable();
        populateContractorOrdersTable();
        this.manANSItaset = new DefaultPieDataset();
        this.categoryDataset = new DefaultPieDataset();
        ArrayList<Material> mList = new ArrayList<>();
        MaterialSqlQuery msq = new MaterialSqlQuery();
        mList = msq.readAllMaterial();
        HashMap<String,Integer> manufacturerMap =  new HashMap<>();
        HashMap<String,Integer> categoryMap =  new HashMap<>();

        for(Material m : mList){
            if(!m.getMaterial_Status().equals("Rejected")){
                if(manufacturerMap.containsKey(m.getManufacturer_Name())){
                    int old= manufacturerMap.get(m.getManufacturer_Name());
                    manufacturerMap.put(m.getManufacturer_Name(),old+1);
                }
                else{
                    manufacturerMap.put(m.getManufacturer_Name(),1);
                }
                if(categoryMap.containsKey(m.getMaterial_Category())){
                    int old= categoryMap.get(m.getMaterial_Category());
                    categoryMap.put(m.getMaterial_Category(),old+1);
                }
                else{
                    categoryMap.put(m.getMaterial_Category(),1);
                }
            }
        }
        manufacturerMap.forEach((k,v)->this.manANSItaset.setValue(k,v));
        categoryMap.forEach((k,v)->this.categoryDataset.setValue(k,v));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelInventoryM = new javax.swing.JTabbedPane();
        Inventory = new javax.swing.JPanel();
        lblOrderTable = new javax.swing.JLabel();
        lbllogo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMaterial = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnChart1 = new javax.swing.JButton();
        btnChart2 = new javax.swing.JButton();
        MaterialDepot_Orders = new javax.swing.JPanel();
        lbllogo1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMaterialDepotOrder = new javax.swing.JTable();
        btnNewOrder3 = new javax.swing.JButton();
        Cotractor_Orders = new javax.swing.JPanel();
        lbllogo2 = new javax.swing.JLabel();
        btnNewOrder2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblContractorOrder = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Distributor");

        PanelInventoryM.setBackground(new java.awt.Color(255, 255, 255));
        PanelInventoryM.setForeground(new java.awt.Color(0, 51, 153));
        PanelInventoryM.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N

        Inventory.setBackground(new java.awt.Color(255, 255, 255));
        Inventory.setForeground(new java.awt.Color(0, 51, 153));
        Inventory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrderTable.setBackground(new java.awt.Color(255, 255, 255));
        lblOrderTable.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblOrderTable.setForeground(new java.awt.Color(153, 153, 153));
        lblOrderTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Shipped.png"))); // NOI18N
        lblOrderTable.setText("Manage Shipment");
        lblOrderTable.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblOrderTable.setIconTextGap(10);
        Inventory.add(lblOrderTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 24, 499, 56));

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        Inventory.add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 608, 110, 70));

        tblMaterial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Material Name", "Material Category", "Date of Manufacturing", "Manufacturer Name", "Material Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMaterial);

        Inventory.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 114, 764, 440));

        btnView.setBackground(new java.awt.Color(0, 153, 255));
        btnView.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Eye.png"))); // NOI18N
        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        Inventory.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 120, 34));

        btnChart1.setBackground(new java.awt.Color(255, 102, 102));
        btnChart1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnChart1.setForeground(new java.awt.Color(255, 255, 255));
        btnChart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Chart.png"))); // NOI18N
        btnChart1.setText("MANUFACTURERS");
        btnChart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChart1ActionPerformed(evt);
            }
        });
        Inventory.add(btnChart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 210, 34));

        btnChart2.setBackground(new java.awt.Color(255, 153, 0));
        btnChart2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnChart2.setForeground(new java.awt.Color(255, 255, 255));
        btnChart2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Chart.png"))); // NOI18N
        btnChart2.setText("MATERIALS");
        btnChart2.setToolTipText("");
        btnChart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChart2ActionPerformed(evt);
            }
        });
        Inventory.add(btnChart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 160, 34));

        PanelInventoryM.addTab("Inventory", Inventory);

        MaterialDepot_Orders.setBackground(new java.awt.Color(255, 255, 255));
        MaterialDepot_Orders.setForeground(new java.awt.Color(255, 255, 255));
        MaterialDepot_Orders.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        MaterialDepot_Orders.add(lbllogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 608, 110, 70));

        tblMaterialDepotOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Material Id", "Material Depot Id", "Material Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblMaterialDepotOrder);

        MaterialDepot_Orders.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 114, 764, 440));

        btnNewOrder3.setBackground(new java.awt.Color(0, 153, 255));
        btnNewOrder3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnNewOrder3.setForeground(new java.awt.Color(255, 255, 255));
        btnNewOrder3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Eye.png"))); // NOI18N
        btnNewOrder3.setText("VIEW");
        btnNewOrder3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrder3ActionPerformed(evt);
            }
        });
        MaterialDepot_Orders.add(btnNewOrder3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 120, 34));

        PanelInventoryM.addTab("Material Depot Orders", MaterialDepot_Orders);

        Cotractor_Orders.setBackground(new java.awt.Color(255, 255, 255));
        Cotractor_Orders.setForeground(new java.awt.Color(255, 255, 255));
        Cotractor_Orders.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllogo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        Cotractor_Orders.add(lbllogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 608, 110, 70));

        btnNewOrder2.setBackground(new java.awt.Color(0, 153, 255));
        btnNewOrder2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnNewOrder2.setForeground(new java.awt.Color(255, 255, 255));
        btnNewOrder2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Eye.png"))); // NOI18N
        btnNewOrder2.setText("VIEW");
        btnNewOrder2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrder2ActionPerformed(evt);
            }
        });
        Cotractor_Orders.add(btnNewOrder2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 120, 34));

        tblContractorOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Material Id", "Contractor Id", "Material Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblContractorOrder);

        Cotractor_Orders.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 114, 764, 440));

        PanelInventoryM.addTab("Contractor Orders", Cotractor_Orders);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PanelInventoryM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(PanelInventoryM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMaterial.getSelectedRow() ;

        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }
        
        ArrayList<Material> mList =  new  ArrayList<>();
        MaterialSqlQuery msq = new MaterialSqlQuery();
        mList = msq.readAllMaterial();
        String materialName = (String) tblMaterial.getValueAt(selectedRow, 0);

        // Search for the specific material using the material name
        Material m = mList.stream()
                .filter(material -> material.getMaterial_Name().equals(materialName))
                .findFirst()
                .orElse(null);

        if (m != null) {
            new DistributorJDialog(null, true, m, "", "").show();
            populateTable();
            populateMaterialDepotOrdersTable();
            populateContractorOrdersTable();
        }

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnNewOrder2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrder2ActionPerformed
        int selectedRow = tblContractorOrder.getSelectedRow() ;

        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblContractorOrder.getModel();
        int materialId = (int) model.getValueAt(selectedRow, 0);
        
        //Get the original order from the DB
        String status = "";
        ArrayList<ContractorOrderBook> hList =  new  ArrayList<>();
                  Contractor_OrderBook_SqlQuery msq_h_sql = new Contractor_OrderBook_SqlQuery();
                  hList = msq_h_sql.readAllContractorOrderBook();
                  for(ContractorOrderBook hob : hList){
                      if(hob.getMaterial_Id() == materialId){
                          status = hob.getStatus();
                      }
                  }
        
        ArrayList<Material> mList =  new  ArrayList<>();
        MaterialSqlQuery msq = new MaterialSqlQuery();
        mList = msq.readAllMaterial();
        Material selectedMaterial = mList.stream()
                .filter(material -> material.getId() == materialId)
                .findFirst()
                .orElse(null);

        if (selectedMaterial != null) {
            // Now you have the selectedMaterial, use it as needed
            new DistributorJDialog(null, true, selectedMaterial, "H", status).show();
            populateTable();
            populateMaterialDepotOrdersTable();
            populateContractorOrdersTable();
        }
    }//GEN-LAST:event_btnNewOrder2ActionPerformed

    private void btnChart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChart1ActionPerformed
        // TODO add your handling code here:
        JFreeChart chart = ChartFactory.createPieChart("Manufacturers", this.manANSItaset, true, true, false);
        ChartFrame frame = new ChartFrame("Pie Chart", chart);
        frame.setVisible(true);
        frame.setSize(450, 450);
    }//GEN-LAST:event_btnChart1ActionPerformed

    private void btnChart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChart2ActionPerformed
        // TODO add your handling code here:
        JFreeChart chart = ChartFactory.createPieChart("Categories", this.categoryDataset, true, true, false);
        ChartFrame frame = new ChartFrame("Pie Chart", chart);
        frame.setVisible(true);
        frame.setSize(450, 450);
    }//GEN-LAST:event_btnChart2ActionPerformed

    private void btnNewOrder3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrder3ActionPerformed
        int selectedRow = tblMaterialDepotOrder.getSelectedRow() ;

        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblMaterialDepotOrder.getModel();
        int materialId = (int) model.getValueAt(selectedRow, 0);
        
        //Get Order details for the order table
        String status = "";
        ArrayList<MaterialDepotOrderBook> pList =  new  ArrayList<>();
                MaterialDepot_OrderBook_SqlQuery msq_p_sql = new MaterialDepot_OrderBook_SqlQuery();
                pList = msq_p_sql.readAllMaterialDepotOrderBook();
                for(MaterialDepotOrderBook pob : pList){
                      if(pob.getMaterial_Id() == materialId){
                          status = pob.getStatus();
                      }
                  }
                
        ArrayList<Material> mList =  new  ArrayList<>();
        MaterialSqlQuery msq = new MaterialSqlQuery();
        mList = msq.readAllMaterial();
        Material selectedMaterial = mList.stream()
                .filter(material -> material.getId() == materialId)
                .findFirst()
                .orElse(null);
        if (selectedMaterial != null) {
            // Now you have the selectedMaterial, use it as needed
            new DistributorJDialog(null,true,selectedMaterial, "P", status).show();
            populateTable();
            populateMaterialDepotOrdersTable();
            populateContractorOrdersTable();
        }
        
    }//GEN-LAST:event_btnNewOrder3ActionPerformed
    private void populateTable() {
        ArrayList<Material> mList =  new  ArrayList<>();
        MaterialSqlQuery msq = new MaterialSqlQuery();
        mList = msq.readAllMaterial();
        
        DefaultTableModel model =(DefaultTableModel) tblMaterial.getModel();
        model.setRowCount(0);
        
        for(Material e: mList){
            Object row[]=new Object[10];
            row[0] = e.getMaterial_Name();
            row[1] = e.getMaterial_Category();
            row[2] = e.getDate_Of_Manufacture();
            row[3] = e.getManufacturer_Name();
            row[4] = e.getMaterial_Status();
            
            if((e.getMaterial_Status().equals("Available"))  )
            model.addRow(row);
            
        }
    }
    private void populateMaterialDepotOrdersTable() {
        ArrayList<MaterialDepotOrderBook> mList =  new  ArrayList<>();
        MaterialDepot_OrderBook_SqlQuery msq = new MaterialDepot_OrderBook_SqlQuery();
        mList = msq.readAllMaterialDepotOrderBook();
        
        DefaultTableModel model =(DefaultTableModel) tblMaterialDepotOrder.getModel();
        model.setRowCount(0);
        
        for(MaterialDepotOrderBook e: mList){
            Object row[]=new Object[10];
            row[0] = e.getMaterial_Id();
            row[1] = e.getMaterialDepot_Id();
            row[2] = e.getStatus();
            
            
            model.addRow(row);
            
        }
    }
    private void populateContractorOrdersTable() {
        ArrayList<ContractorOrderBook> mList =  new  ArrayList<>();
        Contractor_OrderBook_SqlQuery msq = new Contractor_OrderBook_SqlQuery();
        mList = msq.readAllContractorOrderBook();
        
        DefaultTableModel model =(DefaultTableModel) tblContractorOrder.getModel();
        model.setRowCount(0);
        
        for(ContractorOrderBook e: mList){
            Object row[]=new Object[10];
            row[0] = e.getMaterial_Id();
            row[1] = e.getContractor_Id();
            row[2] = e.getStatus();
            
            
            model.addRow(row);
            
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cotractor_Orders;
    private javax.swing.JPanel Inventory;
    private javax.swing.JPanel MaterialDepot_Orders;
    private javax.swing.JTabbedPane PanelInventoryM;
    private javax.swing.JButton btnChart1;
    private javax.swing.JButton btnChart2;
    private javax.swing.JButton btnNewOrder2;
    private javax.swing.JButton btnNewOrder3;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblOrderTable;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lbllogo1;
    private javax.swing.JLabel lbllogo2;
    private javax.swing.JTable tblContractorOrder;
    private javax.swing.JTable tblMaterial;
    private javax.swing.JTable tblMaterialDepotOrder;
    // End of variables declaration//GEN-END:variables
}
