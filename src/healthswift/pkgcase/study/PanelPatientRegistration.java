/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package healthswift.pkgcase.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Kheymp
 */
public class PanelPatientRegistration extends javax.swing.JPanel {
    PatientRegistrationForm patientRegistrationForm = new PatientRegistrationForm();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    /**
     * Creates new form PanelPatientRegistration
     */
    public PanelPatientRegistration() {
        this.setBounds(0, 0, 800, 600);
        this.setVisible(false);
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

        dateChooser1 = new com.raven.datechooser.DateChooser();
        pnlSignIn = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtEnterPatientFName = new javax.swing.JTextField();
        txtEnterPatientLName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEnterPatientGender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtEnterPatientBDate = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtEnterPatientBlood = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtEnterPatientHeight = new javax.swing.JTextField();
        txtEnterPatientWeight = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtEnterPatientStatus = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEnterPatientDescription = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtEnterPatientEmail = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtEnterPatientContact = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtEnterPatientAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEnterEmergencyEmail = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtEnterEmergencyNo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEnterEmergencyRelation = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtEnterPatientPassword = new javax.swing.JTextField();
        btnSubmitPatientReg = new javax.swing.JButton();
        btnBackToSignIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        dateChooser1.setDateFormat("yyyy-MM-dd");
        dateChooser1.setTextRefernce(txtEnterPatientBDate);

        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSignIn.setBackground(new java.awt.Color(51, 102, 255));
        pnlSignIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel16.setText("Basic Information");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel21.setText("First name:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, -1));
        jPanel2.add(txtEnterPatientFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 130, -1));
        jPanel2.add(txtEnterPatientLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 130, -1));

        jLabel7.setText("Last name:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, -1));

        jLabel12.setText("Gender:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 60, -1));

        txtEnterPatientGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female" }));
        jPanel2.add(txtEnterPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel8.setText("Birth date:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 70, -1));

        txtEnterPatientBDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterPatientBDateActionPerformed(evt);
            }
        });
        jPanel2.add(txtEnterPatientBDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 130, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 460));

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEnterPatientBlood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O" }));
        txtEnterPatientBlood.setPreferredSize(new java.awt.Dimension(64, 22));
        jPanel3.add(txtEnterPatientBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 50, -1));

        jLabel15.setText("Blood type:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, -1));
        jPanel3.add(txtEnterPatientHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 70, -1));
        jPanel3.add(txtEnterPatientWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 70, -1));

        jLabel10.setText("Height:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, -1));

        jLabel18.setText("Status:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, -1));

        txtEnterPatientStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married" }));
        jPanel3.add(txtEnterPatientStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 70, -1));

        jLabel11.setText("Weight:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel19.setText("Medical Information");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel17.setText("Medical history and allergies:");
        jLabel17.setToolTipText("");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 30));

        txtEnterPatientDescription.setColumns(20);
        txtEnterPatientDescription.setLineWrap(true);
        txtEnterPatientDescription.setRows(5);
        txtEnterPatientDescription.setPreferredSize(new java.awt.Dimension(262, 84));
        jScrollPane2.setViewportView(txtEnterPatientDescription);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 250, 210));

        jLabel5.setText("Centimeters (cm)");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel6.setText("Kilograms (kg)");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 280, 460));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel20.setText("Contact Information");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel22.setText("Email:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 50, -1));

        txtEnterPatientEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterPatientEmailActionPerformed(evt);
            }
        });
        jPanel4.add(txtEnterPatientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 130, -1));

        jLabel23.setText("Contact #:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 70, -1));
        jPanel4.add(txtEnterPatientContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 130, -1));

        jLabel14.setText("Address:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 60, -1));
        jPanel4.add(txtEnterPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 130, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setText("Emergency Contact");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel3.setText("Email:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 50, -1));
        jPanel4.add(txtEnterEmergencyEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 130, -1));

        jLabel24.setText("Contact #:");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 70, -1));
        jPanel4.add(txtEnterEmergencyNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 130, -1));

        jLabel13.setText("Relationship:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 90, -1));

        txtEnterEmergencyRelation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mother", "Father", "Aunt", "Uncle", "Cousin", "Friend", "Partner", "Grandfather", "Grandmother", "Others" }));
        jPanel4.add(txtEnterEmergencyRelation, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel4.setText("Password:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 60, -1));
        jPanel4.add(txtEnterPatientPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 130, -1));

        btnSubmitPatientReg.setBackground(new java.awt.Color(153, 255, 153));
        btnSubmitPatientReg.setText("Submit");
        btnSubmitPatientReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitPatientRegActionPerformed(evt);
            }
        });
        jPanel4.add(btnSubmitPatientReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 240, 460));

        pnlSignIn.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 790, 480));

        btnBackToSignIn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnBackToSignIn.setText("Go Back");
        btnBackToSignIn.setToolTipText("");
        btnBackToSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToSignInActionPerformed(evt);
            }
        });
        pnlSignIn.add(btnBackToSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Registration");
        jLabel1.setToolTipText("");
        pnlSignIn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 30, 800, -1));

        add(pnlSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitPatientRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitPatientRegActionPerformed

        if (txtEnterPatientEmail.getText().equals("") || txtEnterPatientPassword.getText().equals("") || txtEnterPatientFName.getText().equals("") || txtEnterPatientLName.getText().equals("") || txtEnterPatientBDate.getText().equals("") || txtEnterPatientHeight.getText().equals("") || txtEnterPatientWeight.getText().equals("") || txtEnterPatientEmail.getText().equals("") || txtEnterPatientContact.getText().equals("") || txtEnterPatientAddress.getText().equals("") || txtEnterEmergencyEmail.getText().equals("") || txtEnterEmergencyNo.getText().equals("") || txtEnterPatientDescription.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fill out all required entry fields.", "Warning!", JOptionPane.INFORMATION_MESSAGE);
        } else if (!(HealthSwift.containsOnlyNumbers(txtEnterPatientHeight.getText()))) {
            JOptionPane.showMessageDialog(null, "Enter valid height.", "Warning!", JOptionPane.INFORMATION_MESSAGE);
        } else if (!(HealthSwift.containsOnlyNumbers(txtEnterPatientWeight.getText()))) {
            JOptionPane.showMessageDialog(null, "Enter valid weight.", "Warning!", JOptionPane.INFORMATION_MESSAGE);
        } else if (!(HealthSwift.containsOnlyNumbers(txtEnterPatientContact.getText())) || !(HealthSwift.containsOnlyNumbers(txtEnterEmergencyNo.getText()))) {
            JOptionPane.showMessageDialog(null, "Enter valid contact number.", "Warning!", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            boolean validReg = true;
            patientRegistrationForm.setFirstName(txtEnterPatientFName.getText());
            patientRegistrationForm.setLastName(txtEnterPatientLName.getText());
            patientRegistrationForm.setGender(txtEnterPatientGender.getSelectedItem().toString());
            
            try { 
            patientRegistrationForm.setBirthDate(Date.valueOf(txtEnterPatientBDate.getText()));
            } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Enter valid date!", "Warning!", JOptionPane.INFORMATION_MESSAGE);
            validReg = false;
            }
            
            patientRegistrationForm.setWeight(Integer.parseInt(txtEnterPatientWeight.getText()));
            patientRegistrationForm.setHeight(Integer.parseInt(txtEnterPatientHeight.getText()));
            patientRegistrationForm.setBloodType(txtEnterPatientBlood.getSelectedItem().toString());
            patientRegistrationForm.setStatus(txtEnterPatientStatus.getSelectedItem().toString());
            patientRegistrationForm.setDescription(txtEnterPatientDescription.getText());
                
            patientRegistrationForm.setContactNo(txtEnterEmergencyNo.getText());
            patientRegistrationForm.setAddress(txtEnterPatientAddress.getText());
                
            patientRegistrationForm.setEmergencyEmail(txtEnterEmergencyEmail.getText());
            patientRegistrationForm.setEmergencyNo(txtEnterEmergencyNo.getText());
            patientRegistrationForm.setEmergencyRelation(txtEnterEmergencyRelation.getSelectedItem().toString());
                
            patientRegistrationForm.setEmail(txtEnterPatientEmail.getText());
            patientRegistrationForm.setPassword(HealthSwift.encrypt(txtEnterPatientPassword.getText()));
            
            if (validReg == true) {
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthswift?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "password");
                    java.sql.Statement statement = connection.createStatement();
                    String query = "INSERT INTO patient(email, name, password, gender, birthdate, weight, height, bloodtype, status, description, contactNo, address, emergencyEmail, emergencyNo, emergencyRelation) " + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    java.sql.PreparedStatement prestate = connection.prepareStatement(query);
                    
                    prestate.setString(1, patientRegistrationForm.getEmail());
                    prestate.setString(2, patientRegistrationForm.getFirstName() + " " + patientRegistrationForm.getLastName());
                    prestate.setString(3, patientRegistrationForm.getPassword());
                    prestate.setString(4, patientRegistrationForm.getGender());
                    prestate.setDate(5, patientRegistrationForm.getBirthDate());
                    prestate.setInt(6, patientRegistrationForm.getWeight());
                    prestate.setInt(7, patientRegistrationForm.getHeight());
                    prestate.setString(8, patientRegistrationForm.getBloodType());
                    prestate.setString(9, patientRegistrationForm.getStatus());
                    prestate.setString(10, patientRegistrationForm.getDescription());
                    prestate.setString(11, patientRegistrationForm.getContactNo());
                    prestate.setString(12, patientRegistrationForm.getAddress());
                    prestate.setString(13, patientRegistrationForm.getEmergencyEmail());
                    prestate.setString(14, patientRegistrationForm.getEmergencyNo());
                    prestate.setString(15, patientRegistrationForm.getEmergencyRelation());
                    
                    prestate.execute();
                    
                    JOptionPane.showMessageDialog(null, "Successfully Registered!", "Warning!", JOptionPane.INFORMATION_MESSAGE);
                    
                    txtEnterPatientFName.setText("");
                    txtEnterPatientLName.setText("");
                    txtEnterPatientBDate.setText("");

                    txtEnterPatientWeight.setText("");
                    txtEnterPatientHeight.setText("");
                    txtEnterPatientDescription.setText("");

                    txtEnterEmergencyNo.setText("");
                    txtEnterPatientAddress.setText("");

                    txtEnterEmergencyEmail.setText("");
                    txtEnterEmergencyNo.setText("");
                    txtEnterPatientEmail.setText("");
                    txtEnterPatientPassword.setText("");
                    
                    connection.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Email is already taken.", "Warning!", JOptionPane.INFORMATION_MESSAGE);
                e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, "Enter valid date!", "Warning!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        }
            
    }//GEN-LAST:event_btnSubmitPatientRegActionPerformed

    private void txtEnterPatientBDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterPatientBDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterPatientBDateActionPerformed

    private void txtEnterPatientEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterPatientEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterPatientEmailActionPerformed

    private void btnBackToSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToSignInActionPerformed
        HealthSwift.pnlPatientRegistration.setVisible(false);
        HealthSwift.pnlSignIn.setVisible(true);
        HealthSwift.animationPanel.setVisible(true);
    }//GEN-LAST:event_btnBackToSignInActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnBackToSignIn;
    private javax.swing.JButton btnSubmitPatientReg;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlSignIn;
    protected static javax.swing.JTextField txtEnterEmergencyEmail;
    private javax.swing.JTextField txtEnterEmergencyNo;
    private javax.swing.JComboBox<String> txtEnterEmergencyRelation;
    private javax.swing.JTextField txtEnterPatientAddress;
    protected static javax.swing.JTextField txtEnterPatientBDate;
    private javax.swing.JComboBox<String> txtEnterPatientBlood;
    private javax.swing.JTextField txtEnterPatientContact;
    private javax.swing.JTextArea txtEnterPatientDescription;
    protected static javax.swing.JTextField txtEnterPatientEmail;
    protected static javax.swing.JTextField txtEnterPatientFName;
    private javax.swing.JComboBox<String> txtEnterPatientGender;
    protected static javax.swing.JTextField txtEnterPatientHeight;
    protected static javax.swing.JTextField txtEnterPatientLName;
    protected static javax.swing.JTextField txtEnterPatientPassword;
    private javax.swing.JComboBox<String> txtEnterPatientStatus;
    protected static javax.swing.JTextField txtEnterPatientWeight;
    // End of variables declaration//GEN-END:variables
}