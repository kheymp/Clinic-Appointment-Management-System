/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthswift.pkgcase.study;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Kheymp
 */
public class UserPatient extends PatientRegistrationForm {
    private double bmi;
    private String classification;
    private int age;
    private String note;
    
    public void setNote(String note) {
        this.note = note;
    }
    
    public void setAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(getBirthDate().getYear() + 1900, getBirthDate().getMonth() + 1, getBirthDate().getDate());
        age = Period.between(birthDate, today).getYears();
    }
    
    public double setBMI(double height, double weight) {
        double bmi;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        bmi = (weight / ((height / 100) * (height / 100)));
        this.bmi = round(bmi,2);
        return round(bmi,2);
    }
    
    public String setClassification(Double bmi) {
        String classification;
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi < 25) {
            classification = "Normal";
        } else if (bmi < 30) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }
        this.classification = classification;
        return classification;
    }
    
    public double getBMI() {
        return bmi;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getNote() {
        return note;
    }
    
    
    
    public String getClassification() {
        return classification;
    }
    
    public static double round(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();

    long factor = (long) Math.pow(10, places);
    value = value * factor;
    long tmp = Math.round(value);
    return (double) tmp / factor;
}
}

