/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

//import java.util.Date;
import java.sql.Date;

/**
 *
 * @author rachanakeshav
 */
public class Material {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String Material_Name;
    private String Material_Status;
    private String Material_Category;
    private Date Date_Of_Manufacture;
    private int Shell_Life;
    private String Manufacturer_Name;
   

    public String getManufacturer_Name() {
        return Manufacturer_Name;
    }

    public void setManufacturer_Name(String Manufacturer_Name) {
        this.Manufacturer_Name = Manufacturer_Name;
    }
    private String Ingredients;

    public String getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String Ingredients) {
        this.Ingredients = Ingredients;
    }

    
    
    public String getMaterial_Name() {
        return Material_Name;
    }

    public void setMaterial_Name(String Material_Name) {
        this.Material_Name = Material_Name;
    }

    public String getMaterial_Status() {
        return Material_Status;
    }

    public void setMaterial_Status(String Material_Status) {
        this.Material_Status = Material_Status;
    }

    public String getMaterial_Category() {
        return Material_Category;
    }

    public void setMaterial_Category(String Material_Category) {
        this.Material_Category = Material_Category;
    }

    public Date getDate_Of_Manufacture() {
        return Date_Of_Manufacture;
    }

    public void setDate_Of_Manufacture(Date Date_Of_Manufacture) {
        this.Date_Of_Manufacture = Date_Of_Manufacture;
    }

    public int getShell_Life() {
        return Shell_Life;
    }

    public void setShell_Life(int Shell_Life) {
        this.Shell_Life = Shell_Life;
    }

    public Material(String Material_Name, String Material_Status, String Material_Category, Date Date_Of_Manufacture, int Shell_Life, String Manufacturer_Name, String Ingredients) {
        this.Material_Name = Material_Name;
        this.Material_Status = Material_Status;
        this.Material_Category = Material_Category;
        this.Date_Of_Manufacture = Date_Of_Manufacture;
        this.Shell_Life = Shell_Life;
        this.Manufacturer_Name = Manufacturer_Name;
        this.Ingredients = Ingredients;
    }

    public Material() {
    }

    @Override
    public String toString() {
        return "Material{" + "Material_Name=" + Material_Name + ", Material_Status=" + Material_Status + ", Material_Category=" + Material_Category + ", Date_Of_Manufacture=" + Date_Of_Manufacture + ", Shell_Life=" + Shell_Life + ", Manufacturer_Name=" + Manufacturer_Name + ", Ingredients=" + Ingredients + '}';
    }

   
    

    

    
    
}
