/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author rachanakeshav
 */
public class MaterialDepotOrderBook {
    
    private int MaterialDepot_Order_Book_Id;
    private int Material_Id;
    private int MaterialDepot_Id;
    private String Status;

    public int getMaterialDepot_Order_Book_Id() {
        return MaterialDepot_Order_Book_Id;
    }

    public void setMaterialDepot_Order_Book_Id(int MaterialDepot_Order_Book_Id) {
        this.MaterialDepot_Order_Book_Id = MaterialDepot_Order_Book_Id;
    }

    public int getMaterial_Id() {
        return Material_Id;
    }

    public void setMaterial_Id(int Material_Id) {
        this.Material_Id = Material_Id;
    }

    public int getMaterialDepot_Id() {
        return MaterialDepot_Id;
    }

    public void setMaterialDepot_Id(int MaterialDepot_Id) {
        this.MaterialDepot_Id = MaterialDepot_Id;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "MaterialDepotOrderBook{" + "MaterialDepot_Order_Book_Id=" + MaterialDepot_Order_Book_Id + ", Material_Id=" + Material_Id + ", MaterialDepot_Id=" + MaterialDepot_Id + ", Status=" + Status + '}';
    }

    public MaterialDepotOrderBook(int MaterialDepot_Order_Book_Id, int Material_Id, int MaterialDepot_Id, String Status) {
        this.MaterialDepot_Order_Book_Id = MaterialDepot_Order_Book_Id;
        this.Material_Id = Material_Id;
        this.MaterialDepot_Id = MaterialDepot_Id;
        this.Status = Status;
    }


    public MaterialDepotOrderBook() {
    }
    
    
}
