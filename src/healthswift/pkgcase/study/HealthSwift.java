/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package healthswift.pkgcase.study;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.Timer;

/**
 *
 * @author Kheymp
 */
public class HealthSwift extends javax.swing.JFrame {
    static PanelPatientRegistration pnlPatientRegistration = new PanelPatientRegistration();
    static PanelPatientDashboard pnlPatientDashboard = new PanelPatientDashboard();
    static PanelDoctorRegistration pnlDoctorRegistration = new PanelDoctorRegistration();
    static DoctorRegistrationForm doctorRegistrationForm = new DoctorRegistrationForm();
    static PanelDoctorDashboard pnlDoctorDashboard = new PanelDoctorDashboard(); 
    static UserPatient userPatient = new UserPatient();
    static UserDoctor  userDoctor = new UserDoctor();
    static NewJPanel animationPanel = new NewJPanel();
    static String appointmentTable;
    static String getDoctorName;
    
    
    
    /**
     * Creates new form HealthSwift
     */
    public HealthSwift() {
        
        this.add(pnlPatientRegistration);
        this.add(pnlPatientDashboard);
        this.add(pnlDoctorRegistration);
        this.add(pnlDoctorDashboard);
        this.add(animationPanel);
        
        initComponents();
        //this.add(animationPanel);
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
        btnForPatients = new javax.swing.JButton();
        txtPatientEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegisterPatient = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblPatientsImg = new javax.swing.JLabel();
        txtPatientPassword = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnForDoctors = new javax.swing.JButton();
        txtDoctorPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegisterDoctor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblDoctorsImg = new javax.swing.JLabel();
        txtDoctorEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HealthSwift");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSignIn.setBackground(new java.awt.Color(51, 102, 255));
        pnlSignIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnForPatients.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnForPatients.setText("For Patients");
        btnForPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForPatientsActionPerformed(evt);
            }
        });

        jLabel1.setText("Email:");

        jLabel2.setText("Password:");

        btnRegisterPatient.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnRegisterPatient.setText("Register");
        btnRegisterPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterPatientActionPerformed(evt);
            }
        });

        jLabel5.setText("Not registerd yet?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegisterPatient))
                            .addComponent(btnForPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(lblPatientsImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPatientsImg, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtPatientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnForPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterPatient)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        pnlSignIn.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 310, 360));

        jPanel2.setBackground(new java.awt.Color(15, 41, 64));

        btnForDoctors.setBackground(new java.awt.Color(15, 41, 64));
        btnForDoctors.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnForDoctors.setForeground(new java.awt.Color(255, 255, 255));
        btnForDoctors.setText("For Doctors");
        btnForDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForDoctorsActionPerformed(evt);
            }
        });

        txtDoctorPassword.setToolTipText("");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");

        btnRegisterDoctor.setBackground(new java.awt.Color(15, 41, 64));
        btnRegisterDoctor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnRegisterDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterDoctor.setText("Register");
        btnRegisterDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterDoctorActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Not registerd yet?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegisterDoctor))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(btnForDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDoctorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDoctorsImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDoctorsImg, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtDoctorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnForDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterDoctor)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        pnlSignIn.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 310, 360));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HealthSwift");
        pnlSignIn.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, 800, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Welcome to");
        pnlSignIn.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, -1));

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        pnlSignIn.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 780, 570));

        getContentPane().add(pnlSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
        //getContentPane().add(animationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnForPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForPatientsActionPerformed
        
        String email = txtPatientEmail.getText();
        String password = txtPatientPassword.getText();
        String query = "SELECT * FROM patient WHERE email = ? and password = ?";
        String insertQuery = "UPDATE patient SET bmi = ?, classification = ?, age = ? WHERE email = ?;";
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthswift?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "password");
            java.sql.PreparedStatement prestate = connection.prepareStatement(query);
            java.sql.PreparedStatement prestate2 = connection.prepareStatement(insertQuery);
            
            prestate.setString(1, email);
            prestate.setString(2, encrypt(password));
            
            
            
            java.sql.ResultSet rs = prestate.executeQuery();
            
            if (rs.next()) {
                pnlSignIn.setVisible(false);
                HealthSwift.animationPanel.setVisible(false);
                System.out.println(rs.getDate("birthdate"));
                
                userPatient.setFullName(rs.getString("name"));
                userPatient.setEmail(rs.getString("email"));
                userPatient.setPassword(rs.getString("password"));
                userPatient.setGender(rs.getString("gender"));
                userPatient.setBirthDate(rs.getDate("birthdate"));
                userPatient.setWeight(rs.getInt("weight"));
                userPatient.setHeight(rs.getInt("height"));
                userPatient.setBloodType(rs.getString("bloodtype"));
                userPatient.setStatus(rs.getString("status"));
                userPatient.setDescription(rs.getString("description"));
                userPatient.setContactNo(rs.getString("contactNo"));
                userPatient.setAddress(rs.getString("address"));
                userPatient.setEmergencyEmail(rs.getString("emergencyEmail"));
                userPatient.setEmergencyNo(rs.getString("emergencyNo"));
                userPatient.setEmergencyRelation(rs.getString("emergencyRelation"));
                userPatient.setAge();
                userPatient.setNote(rs.getString("note"));
                
                prestate2.setDouble(1, userPatient.setBMI(userPatient.getHeight(), userPatient.getWeight()));
                prestate2.setString(2, userPatient.setClassification(userPatient.setBMI(userPatient.getHeight(), userPatient.getWeight())));
                prestate2.setInt(3, userPatient.getAge());
                prestate2.setString(4, email);
                prestate2.executeUpdate();
                
                pnlPatientDashboard.dashPatientName.setText(userPatient.getFullName());
                pnlPatientDashboard.dashPatientBirthDate.setText(userPatient.getBirthDate().toString());
                
                pnlPatientDashboard.dashPatientGender.setText(userPatient.getGender());
                pnlPatientDashboard.dashPatientStatus.setText(userPatient.getStatus());
                pnlPatientDashboard.dashPatientContact.setText(userPatient.getContactNo());
                pnlPatientDashboard.dashPatientEmail.setText(userPatient.getEmail());
                pnlPatientDashboard.dashPatientAddress.setText(userPatient.getAddress());
                pnlPatientDashboard.dashPatientEmergency.setText(userPatient.getEmergencyEmail());
                pnlPatientDashboard.dashPatientRelationship.setText(userPatient.getEmergencyRelation());
                
                pnlPatientDashboard.dashPatientWeight.setText(String.valueOf(userPatient.getWeight()));
                pnlPatientDashboard.dashPatientHeight.setText(String.valueOf(userPatient.getHeight()));
                pnlPatientDashboard.dashPatientBlood.setText(userPatient.getBloodType());
                pnlPatientDashboard.dashAdditionalInfo.setText(userPatient.getDescription());
                
                pnlPatientDashboard.dashPatientBMI.setText(String.valueOf(userPatient.getBMI()));
                pnlPatientDashboard.dashBMIClass.setText(userPatient.getClassification());
                pnlPatientDashboard.dashPatientAge.setText(String.valueOf(userPatient.getAge()));
                pnlPatientDashboard.dashDoctorNote.setText(userPatient.getNote());
                
               /*
                DecimalFormat numberFormat = new DecimalFormat("#0.00");
                pnlPatientDashboard.dashPatientBMI.setText(numberFormat.format(userPatient.getBMI(userPatient.getHeight(), userPatient.getWeight())));
                pnlPatientDashboard.dashBMIClass.setText(userPatient.getClassification(userPatient.getBMI(userPatient.getHeight(), userPatient.getWeight())));
               */

                String getDoctorName = "SELECT name FROM doctor";

                try {
                    java.sql.PreparedStatement prestate3 = connection.prepareStatement(getDoctorName);

                    java.sql.ResultSet rs2 = prestate3.executeQuery();

                    while (rs2.next()) {
                        HealthSwift.pnlPatientDashboard.chooseDoctor.addItem(rs2.getString("name"));
                    }


                } catch (SQLException ex) {
                    Logger.getLogger(HealthSwift.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                //HealthSwift.animationPanel.setVisible(false);
                pnlPatientDashboard.setVisible(true);
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect email or password.", "Warning!", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HealthSwift.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txtDoctorEmail.setText("");
        txtDoctorPassword.setText("");
        txtPatientEmail.setText("");
        txtPatientPassword.setText("");
    }//GEN-LAST:event_btnForPatientsActionPerformed

    private void btnRegisterPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterPatientActionPerformed
        pnlSignIn.setVisible(false);
        HealthSwift.animationPanel.setVisible(false);
        pnlPatientRegistration.setVisible(true);
    }//GEN-LAST:event_btnRegisterPatientActionPerformed

    private void btnForDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForDoctorsActionPerformed
        
        String email = txtDoctorEmail.getText();
        String password = txtDoctorPassword.getText();
        String query = "SELECT * FROM doctor WHERE email = ? and password = ?";
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthswift?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "password");
            java.sql.PreparedStatement prestate = connection.prepareStatement(query);
            
            prestate.setString(1, email);
            prestate.setString(2, encrypt(password));
            
            java.sql.ResultSet rs = prestate.executeQuery();
            
            if (rs.next()) {
                pnlSignIn.setVisible(false);
                HealthSwift.animationPanel.setVisible(false);
                
                userDoctor.setFullName(rs.getString("name"));
                userDoctor.setSpecialty(rs.getString("specialty"));
                userDoctor.setLicenseNo(rs.getString("licenseNo"));
                userDoctor.setEmail(rs.getString("email"));
                userDoctor.setContactNo(rs.getString("contact"));
                
                userDoctor.monTimeStart = rs.getTime("mondayStart").toString();
                userDoctor.monTimeEnd = rs.getTime("mondayEnd").toString();
                userDoctor.tueTimeStart = rs.getTime("tuesdayStart").toString();
                userDoctor.tueTimeEnd = rs.getTime("tuesdayEnd").toString();
                userDoctor.wedTimeStart = rs.getTime("wednesdayStart").toString();
                userDoctor.wedTimeEnd = rs.getTime("wednesdayEnd").toString();
                userDoctor.thurTimeStart = rs.getTime("thursdayStart").toString();
                userDoctor.thurTimeEnd = rs.getTime("thursdayEnd").toString();
                userDoctor.friTimeStart = rs.getTime("fridayStart").toString();
                userDoctor.friTimeEnd = rs.getTime("fridayEnd").toString();
                userDoctor.satTimeStart = rs.getTime("saturdayStart").toString();
                userDoctor.satTimeEnd = rs.getTime("saturdayEnd").toString();
                
                pnlDoctorDashboard.dashDocName.setText(userDoctor.getFullName());
                pnlDoctorDashboard.dashDocSpecialty.setText(userDoctor.getSpecialty());
                pnlDoctorDashboard.dashDocLicense.setText(userDoctor.getLicenseNo());
                pnlDoctorDashboard.dashDocEmail.setText(userDoctor.getEmail());
                pnlDoctorDashboard.dashDocContact.setText(userDoctor.getContactNo());
                
                pnlDoctorDashboard.lblMonTime.setText(userDoctor.monTimeStart + "-" + userDoctor.monTimeEnd);
                pnlDoctorDashboard.lblTueTime.setText(userDoctor.tueTimeStart + "-" + userDoctor.tueTimeEnd);
                pnlDoctorDashboard.lblWedTime.setText(userDoctor.wedTimeStart + "-" + userDoctor.wedTimeEnd);
                pnlDoctorDashboard.lblThurTime.setText(userDoctor.thurTimeStart + "-" + userDoctor.thurTimeEnd);
                pnlDoctorDashboard.lblFriTime.setText(userDoctor.friTimeStart + "-" + userDoctor.friTimeEnd);
                pnlDoctorDashboard.lblSatTime.setText(userDoctor.satTimeStart + "-" + userDoctor.satTimeEnd);
                
                pnlDoctorDashboard.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect email or password.", "Warning!", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HealthSwift.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        appointmentTable = userDoctor.getLicenseNo() + "appointment";
        getDoctorName = "SELECT name FROM " + appointmentTable;

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthswift?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "password");
                    


                } catch (SQLException ex) {
                    Logger.getLogger(HealthSwift.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                String getDoctorAppointment = "SELECT name, timeStart, timeEnd, date FROM " + appointmentTable;
                
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthswift?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "password");
                    java.sql.PreparedStatement prestate4 = connection.prepareStatement(getDoctorAppointment);

                    java.sql.ResultSet rs3 = prestate4.executeQuery();
                    java.sql.PreparedStatement prestate3 = connection.prepareStatement(getDoctorName);

                    java.sql.ResultSet rs2 = prestate3.executeQuery();
                    
                    try {
                            String delete = "DELETE from " + appointmentTable + " WHERE date < ?";              
                            java.sql.PreparedStatement prestate5 = connection.prepareStatement(delete);
                            //prestate5.setTime(1, java.sql.Time.valueOf(LocalTime.now()));
                            prestate5.setDate(1, java.sql.Date.valueOf(LocalDate.now()));
                            prestate5.execute();
                            
                            
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
                
        txtDoctorEmail.setText("");
        txtDoctorPassword.setText("");
        txtPatientEmail.setText("");
        txtPatientPassword.setText("");
    }//GEN-LAST:event_btnForDoctorsActionPerformed

    private void btnRegisterDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterDoctorActionPerformed
        pnlSignIn.setVisible(false);
        HealthSwift.animationPanel.setVisible(false);
        pnlDoctorRegistration.setVisible(true);
    }//GEN-LAST:event_btnRegisterDoctorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HealthSwift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthSwift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthSwift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthSwift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthSwift().setVisible(true);
            }
        });
    }
    
    public void AppointmentAreaRefresh() {
        
    }
    
    private static final String AES_KEY = "MySecretKey12345"; // 16-character secret key

    // Method to encrypt plaintext using AES
    public static String encrypt(String plaintext) {
        try {
            // Create AES cipher
            Cipher cipher = Cipher.getInstance("AES");
            SecretKeySpec secretKey = new SecretKeySpec(AES_KEY.getBytes(), "AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            // Encrypt the plaintext
            byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes());

            // Encode encrypted bytes to Base64 string
            return Base64.getEncoder().encodeToString(encryptedBytes);

        } catch (Exception e) {
            // Handle exceptions
            e.printStackTrace();
            return null; // Return null in case of an error
        }
    }

    // Method to decrypt ciphertext using AES
    public static String decrypt(String ciphertext) {
        try {
            // Create AES cipher
            Cipher cipher = Cipher.getInstance("AES");
            SecretKeySpec secretKey = new SecretKeySpec(AES_KEY.getBytes(), "AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            // Decode Base64 string to encrypted bytes
            byte[] encryptedBytes = Base64.getDecoder().decode(ciphertext);

            // Decrypt the ciphertext
            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

            // Convert decrypted bytes to plaintext
            return new String(decryptedBytes);

        } catch (Exception e) {
            // Handle exceptions
            e.printStackTrace();
            return null; // Return null in case of an error
        }
    }
    
    public static boolean containsOnlyNumbers(String str) {
    try {
        // Try parsing the string as a number
        Long.parseLong(str);
        return true;
    } catch (NumberFormatException e) {
        // If an exception occurs, it means the string is not a number
        return false;
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForDoctors;
    private javax.swing.JButton btnForPatients;
    private javax.swing.JButton btnRegisterDoctor;
    private javax.swing.JButton btnRegisterPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDoctorsImg;
    private javax.swing.JLabel lblPatientsImg;
    public static javax.swing.JPanel pnlSignIn;
    private javax.swing.JTextField txtDoctorEmail;
    private javax.swing.JTextField txtDoctorPassword;
    private javax.swing.JTextField txtPatientEmail;
    private javax.swing.JTextField txtPatientPassword;
    // End of variables declaration//GEN-END:variables
}
