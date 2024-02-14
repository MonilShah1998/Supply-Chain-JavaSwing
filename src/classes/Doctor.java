/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author rachanakeshav
 */
public class Doctor extends Credentials {
    
    
    private int Doctor_Id;
    private String Doctor_Name;
    private int Doctor_Age;
    private String Doctor_Race;
    private String Doctor_Gender;
    private String Doctor_Location;
    private String Type;

    public int getDoctor_Id() {
        return Doctor_Id;
    }

    public void setDoctor_Id(int Doctor_Id) {
        this.Doctor_Id = Doctor_Id;
    }

    public String getDoctor_Name() {
        return Doctor_Name;
    }

    public void setDoctor_Name(String Doctor_Name) {
        this.Doctor_Name = Doctor_Name;
    }

    public int getDoctor_Age() {
        return Doctor_Age;
    }

    public void setDoctor_Age(int Doctor_Age) {
        this.Doctor_Age = Doctor_Age;
    }

    public String getDoctor_Race() {
        return Doctor_Race;
    }

    public void setDoctor_Race(String Doctor_Race) {
        this.Doctor_Race = Doctor_Race;
    }

    public String getDoctor_Gender() {
        return Doctor_Gender;
    }

    public void setDoctor_Gender(String Doctor_Gender) {
        this.Doctor_Gender = Doctor_Gender;
    }

    public String getDoctor_Location() {
        return Doctor_Location;
    }

    public void setDoctor_Location(String Doctor_Location) {
        this.Doctor_Location = Doctor_Location;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    @Override
    public String toString() {
        return "Doctor{" + "Doctor_Id=" + Doctor_Id + ", Doctor_Name=" + Doctor_Name + ", Doctor_Age=" + Doctor_Age + ", Doctor_Race=" + Doctor_Race + ", Doctor_Gender=" + Doctor_Gender + ", Doctor_Location=" + Doctor_Location + ", Type=" + Type + '}';
    }

    public Doctor(int Doctor_Id, String Doctor_Name, int Doctor_Age, String Doctor_Race, String Doctor_Gender, String Doctor_Location, String Type, String Email_Id, String Phone_No, String Password) {
        super(Email_Id, Phone_No, Password);
        this.Doctor_Id = Doctor_Id;
        this.Doctor_Name = Doctor_Name;
        this.Doctor_Age = Doctor_Age;
        this.Doctor_Race = Doctor_Race;
        this.Doctor_Gender = Doctor_Gender;
        this.Doctor_Location = Doctor_Location;
        this.Type = Type;
    }

    public Doctor() {
    }
    
}
