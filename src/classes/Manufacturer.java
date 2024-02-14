/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.sql.Date;
/**
 *
 * @author rachanakeshav
 */
public class Manufacturer extends Credentials {
    private int Manufacturer_Id;
    private String Manufacturer_Name;
    private String Type_Of_Material;
    private String Manufacturer_Location;
    private Date Manufacturer_Date_Of_Establishment;

    public int getManufacturer_Id() {
        return Manufacturer_Id;
    }

    public void setManufacturer_Id(int Manufacturer_Id) {
        this.Manufacturer_Id = Manufacturer_Id;
    }

    public String getManufacturer_Name() {
        return Manufacturer_Name;
    }

    public void setManufacturer_Name(String Manufacturer_Name) {
        this.Manufacturer_Name = Manufacturer_Name;
    }

    public String getType_Of_Material() {
        return Type_Of_Material;
    }

    public void setType_Of_Material(String Type_Of_Material) {
        this.Type_Of_Material = Type_Of_Material;
    }

    public String getManufacturer_Location() {
        return Manufacturer_Location;
    }

    public void setManufacturer_Location(String Manufacturer_Location) {
        this.Manufacturer_Location = Manufacturer_Location;
    }

    public Date getManufacturer_Date_Of_Establishment() {
        return Manufacturer_Date_Of_Establishment;
    }

    public void setManufacturer_Date_Of_Establishment(Date Manufacturer_Date_Of_Establishment) {
        this.Manufacturer_Date_Of_Establishment = Manufacturer_Date_Of_Establishment;
    }

    @Override
    public String toString() {
        return "Manufacturer{" + "Manufacturer_Id=" + Manufacturer_Id + ", Manufacturer_Name=" + Manufacturer_Name + ", Type_Of_Material=" + Type_Of_Material + ", Manufacturer_Location=" + Manufacturer_Location + ", Manufacturer_Date_Of_Establishment=" + Manufacturer_Date_Of_Establishment + '}';
    }

    public Manufacturer(int Manufacturer_Id, String Manufacturer_Name, String Type_Of_Material, String Manufacturer_Location, Date Manufacturer_Date_Of_Establishment, String Email_Id, String Phone_No, String Password) {
        super(Email_Id, Phone_No, Password);
        this.Manufacturer_Id = Manufacturer_Id;
        this.Manufacturer_Name = Manufacturer_Name;
        this.Type_Of_Material = Type_Of_Material;
        this.Manufacturer_Location = Manufacturer_Location;
        this.Manufacturer_Date_Of_Establishment = Manufacturer_Date_Of_Establishment;
    }

    public Manufacturer() {
    }
   
}
