/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author rachanakeshav
 */
public class MaterialDepot extends Credentials {
    
    private String MaterialDepot_Name;
    private String MaterialDepot_Location;
    private int MaterialDepot_Inventory_Size;
    private int MaterialDepot_Id;

    public String getMaterialDepot_Name() {
        return MaterialDepot_Name;
    }

    public void setMaterialDepot_Name(String MaterialDepot_Name) {
        this.MaterialDepot_Name = MaterialDepot_Name;
    }

    public String getMaterialDepot_Location() {
        return MaterialDepot_Location;
    }

    public void setMaterialDepot_Location(String MaterialDepot_Location) {
        this.MaterialDepot_Location = MaterialDepot_Location;
    }

    public int getMaterialDepot_Inventory_Size() {
        return MaterialDepot_Inventory_Size;
    }

    public void setMaterialDepot_Inventory_Size(int MaterialDepot_Inventory_Size) {
        this.MaterialDepot_Inventory_Size = MaterialDepot_Inventory_Size;
    }

    public int getMaterialDepot_Id() {
        return MaterialDepot_Id;
    }

    public void setMaterialDepot_Id(int MaterialDepot_Id) {
        this.MaterialDepot_Id = MaterialDepot_Id;
    }

    @Override
    public String toString() {
        return "MaterialDepot{" + "MaterialDepot_Name=" + MaterialDepot_Name + ", MaterialDepot_Location=" + MaterialDepot_Location + ", MaterialDepot_Inventory_Size=" + MaterialDepot_Inventory_Size + ", MaterialDepot_Id=" + MaterialDepot_Id + '}';
    }

    public MaterialDepot(String MaterialDepot_Name, String MaterialDepot_Location, int MaterialDepot_Inventory_Size, int MaterialDepot_Id, String Email_Id, String Phone_No, String Password) {
        super(Email_Id, Phone_No, Password);
        this.MaterialDepot_Name = MaterialDepot_Name;
        this.MaterialDepot_Location = MaterialDepot_Location;
        this.MaterialDepot_Inventory_Size = MaterialDepot_Inventory_Size;
        this.MaterialDepot_Id = MaterialDepot_Id;
    }

    public MaterialDepot() {
    }
    
}
