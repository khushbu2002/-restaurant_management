/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.foodorderingdesktopapp.screens;

import Interfaces.Values;
import com.mycompany.foodorderingdesktopapp.database_connectivity.ConnectionClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.*;

/**
 *
 * @author acer
 */
public class ManagerList extends javax.swing.JFrame implements Values{

    private final UserModel currentUser;

    /**
     * Creates new form ManagerList
     */
    public ManagerList(UserModel user) {
        initComponents();
        currentUser=user;
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
        headingLabel = new javax.swing.JPanel();
        managerPageLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        addDeleteUpdateTabbedPanel = new javax.swing.JTabbedPane();
        deleteManagerPanel = new javax.swing.JPanel();
        deleteManagerUserNameLabel = new javax.swing.JLabel();
        deleteManagerUserNameTF = new javax.swing.JTextField();
        deleteManagerButton = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        passwordTF = new javax.swing.JTextField();
        updateManagerPanel = new javax.swing.JPanel();
        updateManagerLabel = new javax.swing.JLabel();
        updateNewPasswordLabel = new javax.swing.JLabel();
        updateUserNameTF = new javax.swing.JTextField();
        updateNewPasswordTF = new javax.swing.JTextField();
        updateUserNameButton = new javax.swing.JButton();
        updateNewUserNameTF = new javax.swing.JTextField();
        updateNewManagerNameLabel = new javax.swing.JLabel();
        addManagerPanel = new javax.swing.JPanel();
        addDishNameLabel = new javax.swing.JLabel();
        addpassLabel = new javax.swing.JLabel();
        addUserNameTF = new javax.swing.JTextField();
        addPasswordTF = new javax.swing.JTextField();
        addManagerButton = new javax.swing.JButton();
        addDeleteUpdateManagerButtonPanel = new javax.swing.JPanel();
        addManagerPanelButton = new javax.swing.JButton();
        deleteManagerPanelButton = new javax.swing.JButton();
        updateManagerPanelButton = new javax.swing.JButton();
        managerTableScrollPane = new javax.swing.JScrollPane();
        managerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 450));

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        managerPageLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        managerPageLabel.setText("Manager Page");

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headingLabelLayout = new javax.swing.GroupLayout(headingLabel);
        headingLabel.setLayout(headingLabelLayout);
        headingLabelLayout.setHorizontalGroup(
            headingLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingLabelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(managerPageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 540, Short.MAX_VALUE)
                .addComponent(backButton))
        );
        headingLabelLayout.setVerticalGroup(
            headingLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headingLabelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(managerPageLabel)
                .addGap(16, 16, 16))
            .addGroup(headingLabelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backgroundPanel.add(headingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 80));

        addDeleteUpdateTabbedPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addDeleteUpdateTabbedPanel.setPreferredSize(new java.awt.Dimension(314, 185));

        deleteManagerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteManagerUserNameLabel.setText("Username");
        deleteManagerPanel.add(deleteManagerUserNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        deleteManagerUserNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteManagerUserNameTFActionPerformed(evt);
            }
        });
        deleteManagerPanel.add(deleteManagerUserNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 200, -1));

        deleteManagerButton.setText("REMOVE");
        deleteManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteManagerButtonActionPerformed(evt);
            }
        });
        deleteManagerPanel.add(deleteManagerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        passwordLabel.setText("Password");
        deleteManagerPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, -1));
        deleteManagerPanel.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 200, -1));

        addDeleteUpdateTabbedPanel.addTab("RM", deleteManagerPanel);

        updateManagerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateManagerLabel.setText("Username");
        updateManagerPanel.add(updateManagerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, -1));

        updateNewPasswordLabel.setText("New Password");
        updateManagerPanel.add(updateNewPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, -1));
        updateManagerPanel.add(updateUserNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 190, -1));
        updateManagerPanel.add(updateNewPasswordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 190, -1));

        updateUserNameButton.setText("UPDATE");
        updateUserNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserNameButtonActionPerformed(evt);
            }
        });
        updateManagerPanel.add(updateUserNameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        updateNewUserNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateNewUserNameTFActionPerformed(evt);
            }
        });
        updateManagerPanel.add(updateNewUserNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 190, -1));

        updateNewManagerNameLabel.setText("New Username");
        updateManagerPanel.add(updateNewManagerNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 20));

        addDeleteUpdateTabbedPanel.addTab("UM", updateManagerPanel);

        addManagerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addDishNameLabel.setText("Username");
        addManagerPanel.add(addDishNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        addpassLabel.setText("Password");
        addManagerPanel.add(addpassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        addUserNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserNameTFActionPerformed(evt);
            }
        });
        addManagerPanel.add(addUserNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 200, -1));

        addPasswordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPasswordTFActionPerformed(evt);
            }
        });
        addManagerPanel.add(addPasswordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 200, -1));

        addManagerButton.setText("ADD");
        addManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addManagerButtonActionPerformed(evt);
            }
        });
        addManagerPanel.add(addManagerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        addDeleteUpdateTabbedPanel.addTab("AM", addManagerPanel);

        backgroundPanel.add(addDeleteUpdateTabbedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 640, 180));

        addDeleteUpdateManagerButtonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addManagerPanelButton.setText("Add Manager");
        addManagerPanelButton.setPreferredSize(new java.awt.Dimension(123, 22));
        addManagerPanelButton.setVerifyInputWhenFocusTarget(false);
        addManagerPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addManagerPanelButtonActionPerformed(evt);
            }
        });
        addDeleteUpdateManagerButtonPanel.add(addManagerPanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 123, 22));

        deleteManagerPanelButton.setText("Delete Manager");
        deleteManagerPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteManagerPanelButtonActionPerformed(evt);
            }
        });
        addDeleteUpdateManagerButtonPanel.add(deleteManagerPanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 123, 22));

        updateManagerPanelButton.setText("Update Manager");
        updateManagerPanelButton.setPreferredSize(new java.awt.Dimension(123, 22));
        updateManagerPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateManagerPanelButtonActionPerformed(evt);
            }
        });
        addDeleteUpdateManagerButtonPanel.add(updateManagerPanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 123, 22));

        backgroundPanel.add(addDeleteUpdateManagerButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, 190));

        managerTable.setModel(new javax.swing.table.DefaultTableModel(
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
        managerTableScrollPane.setViewportView(managerTable);

        backgroundPanel.add(managerTableScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 800, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if(currentUser.getRole()==ADMIN_ROLE){
            new HomeScreenForAdmin(currentUser).setVisible(true);
            dispose();
        }else if(currentUser.getRole()==MANAGER_ROLE){
            new HomeScreenForManager(currentUser).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteManagerUserNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteManagerUserNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteManagerUserNameTFActionPerformed

    private void deleteManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteManagerButtonActionPerformed

        String username =deleteManagerUserNameTF.getText();
        UserModel user=userExist(username);
        if(user==null){
            JOptionPane.showMessageDialog(null, "No such manager exist");
            return;
        }
        int userRole=user.getRole();
        if(userRole!=MANAGER_ROLE){
            JOptionPane.showMessageDialog(null, "No such manager exist");
        }

        boolean managerDeleted=deleteUser(user.getUsername());

        if(managerDeleted){
            updateManagerTable();
            JOptionPane.showMessageDialog(null, "Manager deleted");
        }else{
            JOptionPane.showMessageDialog(null, "Manager not deleted");
        }
    }//GEN-LAST:event_deleteManagerButtonActionPerformed

    private void updateUserNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserNameButtonActionPerformed

        String username = updateUserNameTF.getText();
        UserModel user=userExist(username);
        if(user==null){
            JOptionPane.showMessageDialog(null, "No Such User Exist");
            return;
        }
        UserModel newUser=user;

        String newUsername = updateNewUserNameTF.getText();
        String newPassword = updateNewPasswordTF.getText();
        newUser.setUsername(newUsername);
        newUser.setPassword(newPassword);
        if (newUsername.isBlank()) {
            JOptionPane.showMessageDialog(null, "Enter email");
            return;
        }
        if (newPassword.isBlank()) {
            JOptionPane.showMessageDialog(null, "Enter password");
            return;
        }
        int userUpdate=updateUser(newUser);

        switch (userUpdate) {
            case USERNAME_ALREAD_IN_USE:
            break;
            case UPDATE_SUCCESSFUL:
            updateManagerTable();
            break;
            case UPDATE_UNSUCCESSFUL:

            break;
            default:
            break;
        }
    }//GEN-LAST:event_updateUserNameButtonActionPerformed

    private void updateNewUserNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateNewUserNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateNewUserNameTFActionPerformed

    private void addUserNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserNameTFActionPerformed

        if (addUserNameTF.getText().isBlank()) {
            return;
        }
        addPasswordTF.requestFocus();
    }//GEN-LAST:event_addUserNameTFActionPerformed

    private void addPasswordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPasswordTFActionPerformed
        addManagerButtonActionPerformed(evt);
    }//GEN-LAST:event_addPasswordTFActionPerformed

    private void addManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addManagerButtonActionPerformed

        String username = addUserNameTF.getText();
        String password = addPasswordTF.getText();
        int role=MANAGER_ROLE;

        if (username.isBlank()) {
            JOptionPane.showMessageDialog(null, "username is blank");
            return;
        }
        if (password.isBlank()) {
            JOptionPane.showMessageDialog(null, "password is blank");
            return;
        }

        int answer = addUser(username,password,role);
        if(answer==USERNAME_ALREAD_IN_USE){
            JOptionPane.showMessageDialog(null, "username used");
            return;
        }
        if(answer==USER_ADDED){
            JOptionPane.showMessageDialog(null, "Manager added");
            addUserNameTF.setText("");
            addPasswordTF.setText("");
            updateManagerTable();
            return;
        }

        if(answer==USER_NOT_ADDED){
            JOptionPane.showMessageDialog(null, "No manager added");
            addUserNameTF.setText("");
            addPasswordTF.setText("");
        }
    }//GEN-LAST:event_addManagerButtonActionPerformed

    private void addManagerPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addManagerPanelButtonActionPerformed
        addDeleteUpdateTabbedPanel.setSelectedComponent(addManagerPanel);
    }//GEN-LAST:event_addManagerPanelButtonActionPerformed

    private void deleteManagerPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteManagerPanelButtonActionPerformed
        addDeleteUpdateTabbedPanel.setSelectedComponent(deleteManagerPanel);
    }//GEN-LAST:event_deleteManagerPanelButtonActionPerformed

    private void updateManagerPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateManagerPanelButtonActionPerformed
        addDeleteUpdateTabbedPanel.setSelectedComponent(updateManagerPanel);
    }//GEN-LAST:event_updateManagerPanelButtonActionPerformed
    
    private int addUser(String username,String password,int role){

        final String searchStatement = "SELECT * from users where username=?";
            
            try {
                PreparedStatement searchPreparedStatement = ConnectionClass.getInstance().connection.prepareStatement(searchStatement);
                searchPreparedStatement.setString(1, username);
                
                ResultSet searhResultSet = searchPreparedStatement.executeQuery();
                
                while (searhResultSet.next()) {
                    return USERNAME_ALREAD_IN_USE;
                }
                
                final String insertStatement = "INSERT INTO users(username, password, role) values(?,?,?)";
                PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(insertStatement);
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                preparedStatement.setInt(3, role);

                final int isAdded = preparedStatement.executeUpdate();

                if (isAdded > 0) {
                    return USER_ADDED;
                }
            } catch (SQLException ex) {
                System.out.println("error in " + ManagerList.class.getName() + " = " + ex);
            }
        return USER_NOT_ADDED;
    }
    
    private int updateUser(UserModel user){
        String newUsername=user.getUsername();
        String newPassword=user.getPassword();
        int role= user.getRole();
        
        final String searchStatement = "SELECT * from users where username=?";
        try {
            PreparedStatement searchPreparedStatement = ConnectionClass.getInstance().connection.prepareStatement(searchStatement);
            searchPreparedStatement.setString(1, newUsername);

            ResultSet searhResultSet = searchPreparedStatement.executeQuery();

            while (searhResultSet.next()) {                
                return USERNAME_ALREAD_IN_USE;
            }
            final String insertStatement = "update users set `username`=?, `password`=?, `role`=? where `id`=?";
            PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(insertStatement);
            preparedStatement.setString(1, newUsername);
            preparedStatement.setString(2, newPassword);
            preparedStatement.setInt(3, role);
            preparedStatement.setString(4, Integer.toString(user.getId()));

            final int isAdded = preparedStatement.executeUpdate();

            if (isAdded > 0) {
                return UPDATE_SUCCESSFUL;
            } 
        } catch (SQLException ex) {
            System.out.println("error in " +ManagerList.class.getName() + " = " + ex);
        }    
        
        return UPDATE_UNSUCCESSFUL;
    }
    
    //returns true if user deleted.
    private boolean deleteUser(String username){
        
        final String statement = "delete from users where `username`=?";
        try {
            PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(statement);
            preparedStatement.setString(1, username);
            int f=preparedStatement.executeUpdate();
            
            // f>0 means account deleted, f<=0 means not deleted
            return f>0;
        } catch (SQLException ex) {
                System.out.println("error in " + ManagerList.class.getName() + " = " + ex);
        }
        return false;
    }
    
    private void updateManagerTable(){
        final String statement = "SELECT * from users where role=?";
        try {
            PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(statement);
            preparedStatement.setInt(1, MANAGER_ROLE);
            ResultSet resultSet = preparedStatement.executeQuery();
            final String[] headerName = {"ID","Username", "Password"};
            DefaultTableModel model = new DefaultTableModel(null, headerName);
            managerTable.setModel(model);
            Object[] row = new Object[3];

            while (resultSet.next()) {
                row[0] = resultSet.getString("id");
                row[1] = resultSet.getString("username");
                row[2] = resultSet.getString("password");
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private UserModel userExist(String username) {
        try {
            final String searchStatement = "SELECT * from users where username=?";
            PreparedStatement searchPreparedStatement = ConnectionClass.getInstance().connection.prepareStatement(searchStatement);
            searchPreparedStatement.setString(1, username);
            ResultSet searhResultSet = searchPreparedStatement.executeQuery();

            while (searhResultSet.next()) {
                UserModel user=new UserModel();
                user.setId(Integer.parseInt(searhResultSet.getString("id")));
                user.setUsername(username);
                user.setPassword(searhResultSet.getString("password"));
                user.setRole(searhResultSet.getInt("role"));
                return user;
            }
        } catch (SQLException ex) {
                System.out.println("error in " + ManagerList.class.getName() + " = " + ex);
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addDeleteUpdateManagerButtonPanel;
    private javax.swing.JTabbedPane addDeleteUpdateTabbedPanel;
    private javax.swing.JLabel addDishNameLabel;
    private javax.swing.JButton addManagerButton;
    private javax.swing.JPanel addManagerPanel;
    private javax.swing.JButton addManagerPanelButton;
    private javax.swing.JTextField addPasswordTF;
    private javax.swing.JTextField addUserNameTF;
    private javax.swing.JLabel addpassLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton deleteManagerButton;
    private javax.swing.JPanel deleteManagerPanel;
    private javax.swing.JButton deleteManagerPanelButton;
    private javax.swing.JLabel deleteManagerUserNameLabel;
    private javax.swing.JTextField deleteManagerUserNameTF;
    private javax.swing.JPanel headingLabel;
    private javax.swing.JLabel managerPageLabel;
    private javax.swing.JTable managerTable;
    private javax.swing.JScrollPane managerTableScrollPane;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JLabel updateManagerLabel;
    private javax.swing.JPanel updateManagerPanel;
    private javax.swing.JButton updateManagerPanelButton;
    private javax.swing.JLabel updateNewManagerNameLabel;
    private javax.swing.JLabel updateNewPasswordLabel;
    private javax.swing.JTextField updateNewPasswordTF;
    private javax.swing.JTextField updateNewUserNameTF;
    private javax.swing.JButton updateUserNameButton;
    private javax.swing.JTextField updateUserNameTF;
    // End of variables declaration//GEN-END:variables
}
