/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author rachanakeshav
 */
public class Contractor extends Credentials {
    
    private String Contractor_Name;
    private String Contractor_Location;
    private String Contractor_Type;
    private int Contractor_Id;

    public String getContractor_Name() {
        return Contractor_Name;
    }

    public void setContractor_Name(String Contractor_Name) {
        this.Contractor_Name = Contractor_Name;
    }

    public String getContractor_Location() {
        return Contractor_Location;
    }

    public void setContractor_Location(String Contractor_Location) {
        this.Contractor_Location = Contractor_Location;
    }

    public String getContractor_Type() {
        return Contractor_Type;
    }

    public void setContractor_Type(String Contractor_Type) {
        this.Contractor_Type = Contractor_Type;
    }

    public int getContractor_Id() {
        return Contractor_Id;
    }

    public void setContractor_Id(int Contractor_Id) {
        this.Contractor_Id = Contractor_Id;
    }

    @Override
    public String toString() {
        return "Contractor{" + "Contractor_Name=" + Contractor_Name + ", Contractor_Location=" + Contractor_Location + ", Contractor_Type=" + Contractor_Type + ", Contractor_Id=" + Contractor_Id + '}';
    }

    public Contractor(String Contractor_Name, String Contractor_Location, String Contractor_Type, int Contractor_Id, String Email_Id, String Phone_No, String Password) {
        super(Email_Id, Phone_No, Password);
        this.Contractor_Name = Contractor_Name;
        this.Contractor_Location = Contractor_Location;
        this.Contractor_Type = Contractor_Type;
        this.Contractor_Id = Contractor_Id;
    }

    public Contractor() {
    }

    
}
