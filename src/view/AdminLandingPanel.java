/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.directories.DoctorDirectory;
import model.directories.EncounterDirectory;
import model.directories.HospitalDirectory;
import model.directories.PatientDirectory;

/**
 *
 * @author Akash
 */
public class AdminLandingPanel extends javax.swing.JPanel {
    String adminType;
    DoctorDirectory allDoctors;
    HospitalDirectory allHospitals;
    PatientDirectory allPatients;
    EncounterDirectory allEncounters;

    /**
     * Creates new form SystemAdminLoginPanel
     */
    public AdminLandingPanel(String adminType, DoctorDirectory allDoctors, HospitalDirectory allHospitals, PatientDirectory allPatients, EncounterDirectory allEncounters) {
        initComponents();
        this.adminType = adminType;
        this.allDoctors = allDoctors;
        this.allHospitals = allHospitals;
        this.allPatients = allPatients;
        this.allEncounters = allEncounters;
        
        setButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        viewHospitalsButton = new javax.swing.JButton();
        viewDoctorsButton = new javax.swing.JButton();
        createHospitalButton = new javax.swing.JButton();
        createDoctorButton = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();

        splitPane.setDividerLocation(120);

        viewHospitalsButton.setText("View Hospitals");
        viewHospitalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHospitalsButtonActionPerformed(evt);
            }
        });

        viewDoctorsButton.setText("View Doctors");
        viewDoctorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDoctorsButtonActionPerformed(evt);
            }
        });

        createHospitalButton.setText("Create Hospital");
        createHospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createHospitalButtonActionPerformed(evt);
            }
        });

        createDoctorButton.setText("Create Doctor");
        createDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDoctorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(viewHospitalsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createDoctorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createHospitalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewDoctorsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(createHospitalButton)
                .addGap(68, 68, 68)
                .addComponent(viewHospitalsButton)
                .addGap(130, 130, 130)
                .addComponent(createDoctorButton)
                .addGap(62, 62, 62)
                .addComponent(viewDoctorsButton)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(leftPanel);

        rightPanel.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDoctorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDoctorsButtonActionPerformed
        // TODO add your handling code here
        ViewDoctorsPanel viewDoctorsPanel = new ViewDoctorsPanel(allDoctors);
        rightPanel.add(viewDoctorsPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_viewDoctorsButtonActionPerformed

    private void viewHospitalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHospitalsButtonActionPerformed
        // TODO add your handling code here:
        HospitalViewPanel hospitalViewPanel = new HospitalViewPanel(rightPanel, allHospitals);
        rightPanel.add(hospitalViewPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_viewHospitalsButtonActionPerformed

    private void createHospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createHospitalButtonActionPerformed
        // TODO add your handling code here:
        CreateHospitalPanel createHospitalPanel = new CreateHospitalPanel(allHospitals);
        rightPanel.add(createHospitalPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_createHospitalButtonActionPerformed

    private void createDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDoctorButtonActionPerformed
        // TODO add your handling code here:
        DoctorSignUpPanel doctorSignUpPanel = new DoctorSignUpPanel(rightPanel, allDoctors, allPatients, allEncounters);
        rightPanel.add(doctorSignUpPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_createDoctorButtonActionPerformed

    private void setButtons() {
        if(adminType.equals("Community")) {
            viewDoctorsButton.setEnabled(false);
            createDoctorButton.setEnabled(false);
        }
        
        if(adminType.equals("Hospital")) {
            viewHospitalsButton.setEnabled(false);
            createHospitalButton.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createDoctorButton;
    private javax.swing.JButton createHospitalButton;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JButton viewDoctorsButton;
    private javax.swing.JButton viewHospitalsButton;
    // End of variables declaration//GEN-END:variables

}