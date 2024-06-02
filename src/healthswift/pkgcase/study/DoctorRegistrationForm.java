/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthswift.pkgcase.study;

import java.sql.Date;

/**
 *
 * @author Kheymp
 */
public class DoctorRegistrationForm {
    
    // Basic Information
    private String FirstName; 
    private String LastName; 
    private String FullName; 
    private String Gender;
    private Date BirthDate; 
    private String Age;
    private String Specialty; 
    private String LicenseNo; 
    private String ClinicDay; 
    private String TimeHour; 
    private String TimeMinute;
    private String ContactNo;
    
    // login information 
    private String Email;
    private String Password;
    
    // Schedule
    public String monTimeStart = "00:00:00";
    public String tueTimeStart = "00:00:00";
    public String wedTimeStart = "00:00:00";
    public String thurTimeStart = "00:00:00";
    public String friTimeStart = "00:00:00";
    public String satTimeStart = "00:00:00";

    public String monTimeEnd = "00:00:00";
    public String tueTimeEnd = "00:00:00";
    public String wedTimeEnd = "00:00:00";
    public String thurTimeEnd = "00:00:00";
    public String friTimeEnd = "00:00:00";
    public String satTimeEnd = "00:00:00";
   
    
// SETTERS 
     public void setFirstName(String FirstName) {
         this.FirstName = FirstName;
     }
     public void setLastName(String LastName) {
         this.LastName = LastName;
     }
     public void setFullName(String FullName) {
         this.FullName = FullName;
     }
     public void setGender(String Gender) {
         this.Gender = Gender;
     }
     public void setBirthDate(Date BirthDate) { 
         this.BirthDate = BirthDate;
     }
     public void setAge(String Age) { 
         this.Age = Age;
     }
     public void setSpecialty(String Specialty) { 
         this.Specialty = Specialty;
     }
     
     public void setLicenseNo(String LicenseNo) { 
         this.LicenseNo = LicenseNo;
     }
     public void setClinicDay(String ClinicDay) { 
         this.ClinicDay = ClinicDay;
     }
     public void setTimeHour(String TimeHour) { 
         this.TimeHour = TimeHour;
     }
     public void setTimeMinute(String TimeMinute) { 
         this.TimeMinute = TimeMinute;
     }
     public void setContactNo(String ContactNo) { 
          this.ContactNo = ContactNo;
     }
     public void setEmail(String Email) { 
          this.Email = Email;
     }
     public void setPassword(String Password) { 
          this.Password = Password;
     }
     
     
// GETTERS
    public String getEmail() {
        return Email;
     }
    public String getPassword() {
        return Password;
     }
    public String getFirstName() {
        return FirstName;
     }
    public String getLastName() {
        return LastName;
     }
    public String getFullName() {
        return FullName;
     }
    public String getGender() {
        return Gender;
     }
    public Date getBirthDate() {
        return BirthDate;
     }
    public String getAge() {
        return Age;
     }
    public String getSpecialty(){
        return Specialty;
    }      
    public String getLicenseNo(){
        return LicenseNo;  
     }
    public String getContactNo(){
        return ContactNo;
     }
}
    