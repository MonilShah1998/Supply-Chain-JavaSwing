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
public class Distributor extends Credentials{
    
    private int Distributor_Id;
    private String Distributor_Name;
    private String Distributor_Location;
    private String Distributor_Mode_Of_Transportation;
    private Date Distributor_Date_Of_Establishment;
    private int Distributor_Price;

    public int getDistributor_Id() {
        return Distributor_Id;
    }

    public void setDistributor_Id(int Distributor_Id) {
        this.Distributor_Id = Distributor_Id;
    }

    public String getDistributor_Name() {
        return Distributor_Name;
    }

    public void setDistributor_Name(String Distributor_Name) {
        this.Distributor_Name = Distributor_Name;
    }

    public String getDistributor_Location() {
        return Distributor_Location;
    }

    public void setDistributor_Location(String Distributor_Location) {
        this.Distributor_Location = Distributor_Location;
    }

    public String getDistributor_Mode_Of_Transportation() {
        return Distributor_Mode_Of_Transportation;
    }

    public void setDistributor_Mode_Of_Transportation(String Distributor_Mode_Of_Transportation) {
        this.Distributor_Mode_Of_Transportation = Distributor_Mode_Of_Transportation;
    }

    public Date getDistributor_Date_Of_Establishment() {
        return Distributor_Date_Of_Establishment;
    }

    public void setDistributor_Date_Of_Establishment(Date Distributor_Date_Of_Establishment) {
        this.Distributor_Date_Of_Establishment = Distributor_Date_Of_Establishment;
    }

    public int getDistributor_Price() {
        return Distributor_Price;
    }

    public void setDistributor_Price(int Distributor_Price) {
        this.Distributor_Price = Distributor_Price;
    }

    public Distributor(int Distributor_Id, String Distributor_Name, String Distributor_Location, String Distributor_Mode_Of_Transportation, Date Distributor_Date_Of_Establishment, int Distributor_Price, String Email_Id, String Phone_No, String Password) {
        super(Email_Id, Phone_No, Password);
        this.Distributor_Id = Distributor_Id;
        this.Distributor_Name = Distributor_Name;
        this.Distributor_Location = Distributor_Location;
        this.Distributor_Mode_Of_Transportation = Distributor_Mode_Of_Transportation;
        this.Distributor_Date_Of_Establishment = Distributor_Date_Of_Establishment;
        this.Distributor_Price = Distributor_Price;
    }

    public Distributor() {
    }
 
    
}
   
    



