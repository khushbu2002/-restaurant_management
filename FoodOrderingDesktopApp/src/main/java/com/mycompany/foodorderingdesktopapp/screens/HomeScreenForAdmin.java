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
public class HomeScreenForAdmin extends javax.swing.JFrame {
 //static HomeScreenForAdmin homeScreenForAdmin = new HomeScreenForAdmin();
    
    static UserModel currentUser;
    /**
     * Creates new form HomeScreenForAdmin
     */
    public HomeScreenForAdmin(UserModel user) {
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

        backgroundPanel = new javax.swing.JPanel();
        updateManagerButton = new javax.swing.JButton();
        updateMenuButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        placeOrderButton = new javax.swing.JButton();
        categoryButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setMinimumSize(new java.awt.Dimension(800, 450));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(800, 450));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateManagerButton.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        updateManagerButton.setText("Manager");
        updateManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateManagerButtonActionPerformed(evt);
            }
        });
        backgroundPanel.add(updateManagerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 180, 100));

        updateMenuButton.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        updateMenuButton.setText("Menu");
        updateMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMenuButtonActionPerformed(evt);
            }
        });
        backgroundPanel.add(updateMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 174, 112));

        logoutButton.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        backgroundPanel.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        placeOrderButton.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        placeOrderButton.setText("Place Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });
        backgroundPanel.add(placeOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 160, 100));

        categoryButton.setText("Category");
        categoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryButtonActionPerformed(evt);
            }
        });
        backgroundPanel.add(categoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMenuButtonActionPerformed
        // TODO add your handling code here:
        UpdateMenu updateMenu  = new UpdateMenu();
        updateMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_updateMenuButtonActionPerformed

    private void updateManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateManagerButtonActionPerformed
        // TODO add your handling code here:
        ManagerList updateManager  = new ManagerList(currentUser);
        updateManager.setVisible(true);
        dispose();
    }//GEN-LAST:event_updateManagerButtonActionPerformed

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        new PlaceOrderScreen(currentUser).setVisible(true);
        dispose();
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        new LoginScreen().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void categoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryButtonActionPerformed
        // TODO add your handling code here:
        new CategoryScreen(currentUser).setVisible(true);
        dispose();
    }//GEN-LAST:event_categoryButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton categoryButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JButton updateManagerButton;
    private javax.swing.JButton updateMenuButton;
    // End of variables declaration//GEN-END:variables
}