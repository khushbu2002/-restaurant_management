/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.foodorderingdesktopapp.screens;

import Interfaces.Values;
import models.*;

/**
 *
 * @author acer
 */
public class PlaceOrderScreen extends javax.swing.JFrame implements Values{

    private final UserModel currentUser;

    /**
     * Creates new form PlaceOrderScreen
     */
    public PlaceOrderScreen(UserModel user) {
        currentUser=user;
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

        jPanel1 = new javax.swing.JPanel();
        placeOrderHeadingLabel = new javax.swing.JLabel();
        billIDLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        customerNameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contactTF = new javax.swing.JTextField();
        billIdLAbel2 = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dishNameLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        addToCArtButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        dishNameTF = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 450));
        setPreferredSize(new java.awt.Dimension(800, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        placeOrderHeadingLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        placeOrderHeadingLabel.setText("Place Order");
        jPanel1.add(placeOrderHeadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 119, 32));

        billIDLabel1.setText("Bill Id");
        jPanel1.add(billIDLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 66, 90, -1));

        jLabel2.setText("Customer Details and Requirments");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 110, 194, -1));

        customerNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameTFActionPerformed(evt);
            }
        });
        jPanel1.add(customerNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 144, 192, 31));

        jLabel3.setText("Customer Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 151, 90, -1));
        jPanel1.add(contactTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 193, 190, 30));

        billIdLAbel2.setText("--");
        jPanel1.add(billIdLAbel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 76, 30, -1));

        contactLabel.setText("Phone Number");
        jPanel1.add(contactLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 193, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 58, -1, 392));

        dishNameLabel.setText("Dish Name");
        jPanel1.add(dishNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 227, -1, -1));

        quantityLabel.setText("Quantity");
        jPanel1.add(quantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 269, -1, -1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 277, 191, -1));

        addToCArtButton.setText("Add to Cart");
        jPanel1.add(addToCArtButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        clearButton.setText("Clear");
        jPanel1.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 410, -1, -1));

        jButton3.setText("jButton3");
        jButton3.setMaximumSize(new java.awt.Dimension(72, 22));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 0, -1, -1));
        jPanel1.add(dishNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 241, 190, -1));

        priceLabel.setText("Price");
        jPanel1.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 316, 45, -1));
        jPanel1.add(priceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 311, 191, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void customerNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCArtButton;
    private javax.swing.JLabel billIDLabel1;
    private javax.swing.JLabel billIdLAbel2;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField contactTF;
    private javax.swing.JTextField customerNameTF;
    private javax.swing.JLabel dishNameLabel;
    private javax.swing.JTextField dishNameTF;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel placeOrderHeadingLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTF;
    private javax.swing.JLabel quantityLabel;
    // End of variables declaration//GEN-END:variables
}
