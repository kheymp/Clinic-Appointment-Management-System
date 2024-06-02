/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthswift.pkgcase.study;

import java.awt.RenderingHints.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import java.sql.Date;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Kheymp
 */
public class PatientRegistrationForm {
    // BASIC INFORMATION
    private String firstName;
    private String lastName;
    private String fullName;
    private String gender;
    private Date birthDate;
    
    // MEDICAL INFORMATION
    private int height;
    private int weight;
    private String bloodType;
    private String status;
    private String description;
    
    // CONTACT INFORMATION
    private String contactNo;
    private String address;
    
    // EMERGENCY CONTACT
    private String emergencyEmail;
    private String emergencyNo;
    private String emergencyRelation;
    
    // LOGIN INFORMATION
    private String email = "";
    private String password = "";
    
    // SETTERS 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setEmergencyEmail(String emergencyEmail) {
        this.emergencyEmail = emergencyEmail;
    }
    
    public void setEmergencyNo(String emergencyNo) {
        this.emergencyNo = emergencyNo;
    }
    
    public void setEmergencyRelation(String emergencyRelation) {
        this.emergencyRelation = emergencyRelation;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    // GETTERS
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getGender() {
        return gender;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public String getBloodType() {
        return bloodType;
    }
    
    public String getStatus() {
        return status;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getContactNo() {
        return contactNo;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getEmergencyEmail() {
        return emergencyEmail;
    }
    
    public String getEmergencyNo() {
        return emergencyNo;
    }
    
    public String getEmergencyRelation() {
        return emergencyRelation;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getFullName() {
        return fullName;
    }
}

