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
public class IngredientSupplier extends Credentials {
    
    private String Supplier_Name;
    private String Supplier_Category;
    private String Supplier_Location;
    private Date Supplier_Date_Of_Establishment;
    private int Supplier_Id;

    public String getSupplier_Name() {
        return Supplier_Name;
    }

    public void setSupplier_Name(String Supplier_Name) {
        this.Supplier_Name = Supplier_Name;
    }

    public String getSupplier_Category() {
        return Supplier_Category;
    }

    public void setSupplier_Category(String Supplier_Category) {
        this.Supplier_Category = Supplier_Category;
    }

    public String getSupplier_Location() {
        return Supplier_Location;
    }

    public void setSupplier_Location(String Supplier_Location) {
        this.Supplier_Location = Supplier_Location;
    }

    public Date getSupplier_Date_Of_Establishment() {
        return Supplier_Date_Of_Establishment;
    }

    public void setSupplier_Date_Of_Establishment(Date Supplier_Date_Of_Establishment) {
        this.Supplier_Date_Of_Establishment = Supplier_Date_Of_Establishment;
    }

    public int getSupplier_Id() {
        return Supplier_Id;
    }

    public void setSupplier_Id(int Supplier_Id) {
        this.Supplier_Id = Supplier_Id;
    }

    @Override
    public String toString() {
        return "IngredientSupplier{" + "Supplier_Name=" + Supplier_Name + ", Supplier_Category=" + Supplier_Category + ", Supplier_Location=" + Supplier_Location + ", Supplier_Date_Of_Establishment=" + Supplier_Date_Of_Establishment + ", Supplier_Id=" + Supplier_Id + '}';
    }

    public IngredientSupplier(String Supplier_Name, String Supplier_Category, String Supplier_Location, Date Supplier_Date_Of_Establishment, int Supplier_Id,String Email_Id, String Phone_No, String Password) {
        super(Email_Id, Phone_No, Password);
        this.Supplier_Name = Supplier_Name;
        this.Supplier_Category = Supplier_Category;
        this.Supplier_Location = Supplier_Location;
        this.Supplier_Date_Of_Establishment = Supplier_Date_Of_Establishment;
        this.Supplier_Id = Supplier_Id;
    }

    public IngredientSupplier() {
    }

}
