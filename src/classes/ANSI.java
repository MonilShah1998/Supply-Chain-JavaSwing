/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author rachanakeshav
 */
public class ANSI extends Credentials {
    
    private String ANSI_Board_Name;
    private String ANSI_City;
    private String ANSI_Country;
    private int ANSI_Id;

    public String getANSI_Board_Name() {
        return ANSI_Board_Name;
    }

    public void setANSI_Board_Name(String ANSI_Board_Name) {
        this.ANSI_Board_Name = ANSI_Board_Name;
    }

    public String getANSI_City() {
        return ANSI_City;
    }

    public void setANSI_City(String ANSI_City) {
        this.ANSI_City = ANSI_City;
    }

    public String getANSI_Country() {
        return ANSI_Country;
    }

    public void setANSI_Country(String ANSI_Country) {
        this.ANSI_Country = ANSI_Country;
    }

    public int getANSI_Id() {
        return ANSI_Id;
    }

    public void setANSI_Id(int ANSI_Id) {
        this.ANSI_Id = ANSI_Id;
    }

    @Override
    public String toString() {
        return "ANSI{" + "ANSI_Board_Name=" + ANSI_Board_Name + ", ANSI_City=" + ANSI_City + ", ANSI_Country=" + ANSI_Country + ", ANSI_Id=" + ANSI_Id + '}';
    }

    public ANSI(String ANSI_Board_Name, String ANSI_City, String ANSI_Country, int ANSI_Id, String Email_Id, String Phone_No, String Password) {
        super(Email_Id, Phone_No, Password);
        this.ANSI_Board_Name = ANSI_Board_Name;
        this.ANSI_City = ANSI_City;
        this.ANSI_Country = ANSI_Country;
        this.ANSI_Id = ANSI_Id;
    }

    public ANSI() {
    }

    
}
