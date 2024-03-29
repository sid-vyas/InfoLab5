/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.dataModels.Hospital;
import model.directories.HospitalDirectory;

/**
 *
 * @author ASUS
 */
public class CreateHospitalPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateHospitalPanel
     */
    HospitalDirectory allHospitals;
    Hospital newHospital;
    
    public CreateHospitalPanel(HospitalDirectory allHospitals) {
        initComponents();
        this.allHospitals = allHospitals;
        newHospital = new Hospital();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employeesField = new javax.swing.JTextField();
        communityMenu = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        communityLabel = new javax.swing.JLabel();
        noOfEmployeesLabel = new javax.swing.JLabel();
        updateTitleLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();

        communityMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uptown", "Downtown", "York" }));
        communityMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityMenuActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Hospital Name:");

        communityLabel.setText("Community:");

        noOfEmployeesLabel.setText("Number of Employees:");

        updateTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateTitleLabel.setText("Create Hospiatls:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateTitleLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(noOfEmployeesLabel)
                                .addComponent(communityLabel))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(employeesField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(communityMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(685, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(updateTitleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityLabel)
                    .addComponent(communityMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noOfEmployeesLabel)
                    .addComponent(employeesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(saveButton)
                .addContainerGap(553, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void communityMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityMenuActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        try {
            newHospital.setName(nameField.getText());
            newHospital.setCommunity(communityMenu.getSelectedItem().toString());
            newHospital.setNumberOfEmployees(Integer.parseInt(employeesField.getText()));
            
            resetForm();
                        
            allHospitals.addHospital(newHospital);
            JOptionPane.showMessageDialog(this, "Hospital Added Successfully", "Update", HEIGHT);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter all details", "Error", HEIGHT);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void resetForm() {
        nameField.setText("");
        communityMenu.setSelectedIndex(0);
        employeesField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel communityLabel;
    private javax.swing.JComboBox<String> communityMenu;
    private javax.swing.JTextField employeesField;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel noOfEmployeesLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel updateTitleLabel;
    // End of variables declaration//GEN-END:variables
}
