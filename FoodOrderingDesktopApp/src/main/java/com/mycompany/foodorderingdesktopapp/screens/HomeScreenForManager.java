/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.foodorderingdesktopapp.screens;

import models.*;

/**
 *
 * @author acer
 */
public class HomeScreenForManager extends javax.swing.JFrame {
    static UserModel currentUser;
    /**
     * Creates new form HomeScreenForManager
     */
    public HomeScreenForManager(UserModel user) {
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
        menuButton = new javax.swing.JButton();
        placeOrderButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        categoryButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuButton.setText("Menu");
        jPanel1.add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 173, -1, -1));

        placeOrderButton.setText("PlaceOrder");
        jPanel1.add(placeOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 173, -1, -1));

        logoutButton.setText("LOGOUT");
        jPanel1.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 369, -1, -1));

        exitButton.setText("Exit");
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 357, -1, -1));

        categoryButton.setText("Category");
        jPanel1.add(categoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton categoryButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton menuButton;
    private javax.swing.JButton placeOrderButton;
    // End of variables declaration//GEN-END:variables
}