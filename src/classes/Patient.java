/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Date;

/**
 *
 * @author rachanakeshav
 */
public class Patient extends Credentials {
    
    private String Patient_Name;
    private int Patient_Age;
    private String Patient_Race;
    private String Patient_Gender;
    private String Patient_Location;
    private String Ailments;
    private int Patient_Id;

    public String getPatient_Name() {
        return Patient_Name;
    }

    public void setPatient_Name(String Patient_Name) {
        this.Patient_Name = Patient_Name;
    }

    public int getPatient_Age() {
        return Patient_Age;
    }

    public void setPatient_Age(int Patient_Age) {
        this.Patient_Age = Patient_Age;
    }

    public String getPatient_Race() {
        return Patient_Race;
    }

    public void setPatient_Race(String Patient_Race) {
        this.Patient_Race = Patient_Race;
    }

    public String getPatient_Gender() {
        return Patient_Gender;
    }

    public void setPatient_Gender(String Patient_Gender) {
        this.Patient_Gender = Patient_Gender;
    }

    public String getPatient_Location() {
        return Patient_Location;
    }

    public void setPatient_Location(String Patient_Location) {
        this.Patient_Location = Patient_Location;
    }

    public String getAilments() {
        return Ailments;
    }

    public void setAilments(String Ailments) {
        this.Ailments = Ailments;
    }

    public int getPatient_Id() {
        return Patient_Id;
    }

    public void setPatient_Id(int Patient_Id) {
        this.Patient_Id = Patient_Id;
    }

    @Override
    public String toString() {
        return "Patient{" + "Patient_Name=" + Patient_Name + ", Patient_Age=" + Patient_Age + ", Patient_Race=" + Patient_Race + ", Patient_Gender=" + Patient_Gender + ", Patient_Location=" + Patient_Location + ", Ailments=" + Ailments + ", Patient_Id=" + Patient_Id + '}';
    }

    public Patient(String Patient_Name, int Patient_Age, String Patient_Race, String Patient_Gender, String Patient_Location, String Ailments, int Patient_Id, String Email_Id, String Phone_No, String Password) {
        super(Email_Id, Phone_No, Password);
        this.Patient_Name = Patient_Name;
        this.Patient_Age = Patient_Age;
        this.Patient_Race = Patient_Race;
        this.Patient_Gender = Patient_Gender;
        this.Patient_Location = Patient_Location;
        this.Ailments = Ailments;
        this.Patient_Id = Patient_Id;
    }

    public Patient() {
    }

    
}
