/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package healthswift.pkgcase.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kheymp
 */
public class PanelDoctorDashboard extends javax.swing.JPanel {

    /**
     * Creates new form PanelDoctorDashboard
     */
    public PanelDoctorDashboard() {
        this.setBounds(0, 0, 800, 600);
        this.setVisible(false);
        initComponents();
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

        pnlSignIn = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        dashDocEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dashDocName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dashDocContact = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dashDocSpecialty = new javax.swing.JTextField();
        dashDocLicense = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblMonTime = new javax.swing.JLabel();
        lblTueTime = new javax.swing.JLabel();
        lblWedTime = new javax.swing.JLabel();
        lblThurTime = new javax.swing.JLabel();
        lblFriTime = new javax.swing.JLabel();
        lblSatTime = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        appointmentList = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        enterNote = new javax.swing.JTextArea();
        leaveNoteTo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        dashPatientHeight = new javax.swing.JTextField();
        dashPatientWeight = new javax.swing.JTextField();
        dashPatientBMI = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dashAdditionalInfo = new javax.swing.JTextArea();
        dashBMIClass = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        dashPatientBlood = new javax.swing.JTextField();
        patientList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnBackToSignIn = new javax.swing.JButton();
        refreshDashDcotor = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        pnlSignIn.setBackground(new java.awt.Color(51, 102, 255));
        pnlSignIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Doctor Information");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        dashDocEmail.setEditable(false);
        jPanel3.add(dashDocEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 180, -1));

        jLabel7.setText("Name:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 50, -1));

        dashDocName.setEditable(false);
        dashDocName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashDocNameActionPerformed(evt);
            }
        });
        jPanel3.add(dashDocName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 180, -1));

        jLabel8.setText("Contact No.:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, -1));

        jLabel9.setText("Email:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 50, -1));

        dashDocContact.setEditable(false);
        jPanel3.add(dashDocContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 180, -1));

        jLabel2.setText("Specialty:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, -1));

        dashDocSpecialty.setEditable(false);
        dashDocSpecialty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashDocSpecialtyActionPerformed(evt);
            }
        });
        jPanel3.add(dashDocSpecialty, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 180, -1));

        dashDocLicense.setEditable(false);
        dashDocLicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashDocLicenseActionPerformed(evt);
            }
        });
        jPanel3.add(dashDocLicense, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 180, -1));

        jLabel3.setText("License No.:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, -1));

        jPanel6.setBackground(new java.awt.Color(255, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setText("Tuesday");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel19.setForeground(new java.awt.Color(0, 0, 204));
        jLabel19.setText("Wednesday");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel23.setForeground(new java.awt.Color(0, 0, 204));
        jLabel23.setText("Thursday");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel24.setForeground(new java.awt.Color(0, 0, 204));
        jLabel24.setText("Friday");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        jLabel25.setForeground(new java.awt.Color(0, 0, 204));
        jLabel25.setText("Saturday");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jLabel26.setForeground(new java.awt.Color(0, 0, 204));
        jLabel26.setText("Monday");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        lblMonTime.setForeground(new java.awt.Color(0, 0, 204));
        lblMonTime.setText("00:00");
        jPanel6.add(lblMonTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 120, -1));

        lblTueTime.setForeground(new java.awt.Color(0, 0, 204));
        lblTueTime.setText("00:00");
        jPanel6.add(lblTueTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 120, -1));

        lblWedTime.setForeground(new java.awt.Color(0, 0, 204));
        lblWedTime.setText("00:00");
        jPanel6.add(lblWedTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 120, -1));

        lblThurTime.setForeground(new java.awt.Color(0, 0, 204));
        lblThurTime.setText("00:00");
        jPanel6.add(lblThurTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 120, -1));

        lblFriTime.setForeground(new java.awt.Color(0, 0, 204));
        lblFriTime.setText("00:00");
        jPanel6.add(lblFriTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, -1));

        lblSatTime.setForeground(new java.awt.Color(0, 0, 204));
        lblSatTime.setText("00:00");
        jPanel6.add(lblSatTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 120, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 180, 130));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 220));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("Appointments");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        appointmentList.setEditable(false);
        appointmentList.setColumns(20);
        appointmentList.setRows(5);
        jScrollPane4.setViewportView(appointmentList);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 270, 160));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 290, 220));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("Leave a Note");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        enterNote.setColumns(20);
        enterNote.setRows(5);
        jScrollPane3.setViewportView(enterNote);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 320, 130));

        leaveNoteTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveNoteToActionPerformed(evt);
            }
        });
        jPanel2.add(leaveNoteTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, -1));

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 70, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 340, 230));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Patient Information");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        dashPatientHeight.setEditable(false);
        jPanel4.add(dashPatientHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 80, -1));

        dashPatientWeight.setEditable(false);
        jPanel4.add(dashPatientWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 80, -1));

        dashPatientBMI.setEditable(false);
        jPanel4.add(dashPatientBMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 80, -1));

        jLabel15.setText("Height:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 50, -1));

        jLabel16.setText("Weight:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, -1));

        jLabel14.setText("BMI:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 40, -1));

        dashAdditionalInfo.setEditable(false);
        dashAdditionalInfo.setColumns(20);
        dashAdditionalInfo.setLineWrap(true);
        dashAdditionalInfo.setRows(5);
        jScrollPane2.setViewportView(dashAdditionalInfo);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 230, 150));

        dashBMIClass.setEditable(false);
        jPanel4.add(dashBMIClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 80, -1));

        jLabel17.setText("Classification:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 90, -1));

        jLabel22.setText("Blood type:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 70, -1));

        dashPatientBlood.setEditable(false);
        jPanel4.add(dashPatientBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 80, -1));

        patientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientListActionPerformed(evt);
            }
        });
        jPanel4.add(patientList, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 200, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 410, 230));

        pnlSignIn.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 780, 480));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Dashboard");
        jLabel1.setToolTipText("");
        pnlSignIn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 30, 800, -1));

        btnBackToSignIn.setBackground(new java.awt.Color(255, 102, 102));
        btnBackToSignIn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnBackToSignIn.setText("Sign Out");
        btnBackToSignIn.setToolTipText("");
        btnBackToSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToSignInActionPerformed(evt);
            }
        });
        pnlSignIn.add(btnBackToSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        refreshDashDcotor.setText("Refresh");
        refreshDashDcotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshDashDcotorActionPerformed(evt);
            }
        });
        pnlSignIn.add(refreshDashDcotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dashDocNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashDocNameActionPerformed

    }//GEN-LAST:event_dashDocNameActionPerformed

    private void dashDocSpecialtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashDocSpecialtyActionPerformed

    }//GEN-LAST:event_dashDocSpecialtyActionPerformed

    private void dashDocLicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashDocLicenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashDocLicenseActionPerformed

    private void patientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientListActionPerformed
        try {
             String patientName = patientList.getSelectedItem().toString();
        
        //String appointmentTable = HealthSwift.userDoctor.getLicenseNo() + "appointment";
        String query = "SELECT * FROM patient WHERE name=?";
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthswift?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "password");
            java.sql.PreparedStatement prestate = connection.prepareStatement(query);
            prestate.setString(1, patientName);
            java.sql.ResultSet rs = prestate.executeQuery();
            if (rs.next()) {
                dashPatientHeight.setText(String.valueOf(rs.getInt("height")));
                dashPatientWeight.setText(String.valueOf(rs.getInt("weight")));
                dashPatientBMI.setText(String.valueOf(rs.getDouble("bmi")));
                dashPatientBlood.setText(rs.getString("bloodtype"));
                dashBMIClass.setText(rs.getString("classification"));
                dashAdditionalInfo.setText(rs.getString("description"));
            } else {
                dashPatientHeight.setText("");
                dashPatientWeight.setText("");
                dashPatientBMI.setText("");
                dashPatientBlood.setText("");
                dashBMIClass.setText("");
                dashAdditionalInfo.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PanelPatientDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (NullPointerException e) {
            
        }
        
        
       
       
    }//GEN-LAST:event_patientListActionPerformed

    private void btnBackToSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToSignInActionPerformed
        HealthSwift.pnlDoctorDashboard.setVisible(false);
        HealthSwift.pnlPatientDashboard.setVisible(false);
        HealthSwift.pnlSignIn.setVisible(true);
        HealthSwift.animationPanel.setVisible(true);
        HealthSwift.pnlDoctorDashboard.leaveNoteTo.removeAllItems();
        HealthSwift.pnlDoctorDashboard.patientList.removeAllItems();
        HealthSwift.pnlDoctorDashboard.appointmentList.setText("");
    }//GEN-LAST:event_btnBackToSignInActionPerformed

    private void leaveNoteToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveNoteToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leaveNoteToActionPerformed

    private void refreshDashDcotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshDashDcotorActionPerformed
        HealthSwift.pnlDoctorDashboard.appointmentList.setText("");
        HealthSwift.pnlDoctorDashboard.patientList.removeAllItems();
        HealthSwift.pnlDoctorDashboard.leaveNoteTo.removeAllItems();
        try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthswift?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "password");
                    


                } catch (SQLException ex) {
                    Logger.getLogger(HealthSwift.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                String getDoctorAppointment = "SELECT name, timeStart, timeEnd, date FROM " + HealthSwift.appointmentTable;
                
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthswift?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "password");
                    java.sql.PreparedStatement prestate4 = connection.prepareStatement(getDoctorAppointment);

                    java.sql.ResultSet rs3 = prestate4.executeQuery();
                    java.sql.PreparedStatement prestate3 = connection.prepareStatement(HealthSwift.getDoctorName);

                    java.sql.ResultSet rs2 = prestate3.executeQuery();
                    
                    try {
                            String delete = "DELETE from " + HealthSwift.appointmentTable + " WHERE date < ?";              
                            java.sql.PreparedStatement prestate5 = connection.prepareStatement(delete);
                            //prestate5.setTime(1, java.sql.Time.valueOf(LocalTime.now()));
                            prestate5.setDate(1, java.sql.Date.valueOf(LocalDate.now()));
                            prestate5.execute();
                            /*
                            String delete2 = "DELETE from " + HealthSwift.appointmentTable + " WHERE date < ?";              
                            java.sql.PreparedStatement prestate6 = connection.prepareStatement(delete2);
                            //prestate5.setTime(1, java.sql.Time.valueOf(LocalTime.now()));
                            prestate6.setDate(1, java.sql.Date.valueOf(LocalDate.now().minusDays(1)));
                            prestate6.execute();
                            */
                            
                            while (rs2.next()) {
                                HealthSwift.pnlDoctorDashboard.patientList.addItem(rs2.getString("name"));
                                HealthSwift.pnlDoctorDashboard.leaveNoteTo.addItem(rs2.getString("name"));
                                } 
                            
                            while (rs3.next()) {
                            HealthSwift.pnlDoctorDashboard.appointmentList.append(rs3.getString("name") + " ");
                            HealthSwift.pnlDoctorDashboard.appointmentList.append(rs3.getString("timeStart") + " ");
                            HealthSwift.pnlDoctorDashboard.appointmentList.append(rs3.getString("timeEnd") + " ");
                            HealthSwift.pnlDoctorDashboard.appointmentList.append(rs3.getString("date") + "\n");
                            }
                            
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(HealthSwift.class.getName()).log(Level.SEVERE, null, ex);
                        }
                } catch (SQLException ex) {
                    Logger.getLogger(HealthSwift.class.getName()).log(Level.SEVERE, null, ex);
                }
        if (patientList.getItemCount() == 0) {
            dashPatientHeight.setText("");
                dashPatientWeight.setText("");
                dashPatientBMI.setText("");
                dashPatientBlood.setText("");
                dashBMIClass.setText("");
                dashAdditionalInfo.setText("");
        }
                
                
        
    }//GEN-LAST:event_refreshDashDcotorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name;
        String note;
        String update;
        String original;
        String originalText;
        java.sql.ResultSet rs;
        
        if (leaveNoteTo.getSelectedItem().toString().equals("") || enterNote.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Select doctor or enter proper message", "Warning!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            name = leaveNoteTo.getSelectedItem().toString();
            note = "Dr. " + HealthSwift.userDoctor.getFullName()+ ": " + enterNote.getText() + "\n \n"; 
            update = "UPDATE patient SET note = ? WHERE name = ?";
            original = "SELECT * FROM patient WHERE name = ?";
            originalText = "";
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthswift?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "password");
                java.sql.PreparedStatement updatePS = connection.prepareStatement(update);
                java.sql.PreparedStatement getOriginal = connection.prepareStatement(original);
                
                getOriginal.setString(1, name);
                rs = getOriginal.executeQuery();
                rs.next();
                originalText = rs.getString("note");
                System.out.println(originalText);
                
                note = originalText + note;
                updatePS.setString(1, note);
                updatePS.setString(2, name);
                updatePS.execute();
                JOptionPane.showMessageDialog(null, "Note sent to " + name + " successfully.", "Success!", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                ex.printStackTrace();
                //JOptionPane.showMessageDialog(null, "Note not sent.", "Failed!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea appointmentList;
    public static javax.swing.JButton btnBackToSignIn;
    public javax.swing.JTextArea dashAdditionalInfo;
    public javax.swing.JTextField dashBMIClass;
    public javax.swing.JTextField dashDocContact;
    public javax.swing.JTextField dashDocEmail;
    public javax.swing.JTextField dashDocLicense;
    public javax.swing.JTextField dashDocName;
    public javax.swing.JTextField dashDocSpecialty;
    public javax.swing.JTextField dashPatientBMI;
    public javax.swing.JTextField dashPatientBlood;
    public javax.swing.JTextField dashPatientHeight;
    public javax.swing.JTextField dashPatientWeight;
    private javax.swing.JTextArea enterNote;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JLabel lblFriTime;
    public javax.swing.JLabel lblMonTime;
    public javax.swing.JLabel lblSatTime;
    public javax.swing.JLabel lblThurTime;
    public javax.swing.JLabel lblTueTime;
    public javax.swing.JLabel lblWedTime;
    public javax.swing.JComboBox<String> leaveNoteTo;
    public javax.swing.JComboBox<String> patientList;
    private javax.swing.JPanel pnlSignIn;
    public javax.swing.JButton refreshDashDcotor;
    // End of variables declaration//GEN-END:variables
}
