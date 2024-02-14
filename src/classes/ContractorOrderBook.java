/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author rachanakeshav
 */
public class ContractorOrderBook {
    
    private int Contractor_Order_Book_Id;
    private int Material_Id;
    private int Contractor_Id;
    private String Status;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getContractor_Order_Book_Id() {
        return Contractor_Order_Book_Id;
    }

    public void setContractor_Order_Book_Id(int Contractor_Order_Book_Id) {
        this.Contractor_Order_Book_Id = Contractor_Order_Book_Id;
    }

    public int getMaterial_Id() {
        return Material_Id;
    }

    public void setMaterial_Id(int Material_Id) {
        this.Material_Id = Material_Id;
    }


    public int getContractor_Id() {
        return Contractor_Id;
    }

    public void setContractor_Id(int Contractor_Id) {
        this.Contractor_Id = Contractor_Id;
    }

    @Override
    public String toString() {
        return "ContractorOrderBook{" + "Contractor_Order_Book_Id=" + Contractor_Order_Book_Id + ", Material_Id=" + Material_Id + ", Contractor_Id=" + Contractor_Id + ", Status=" + Status + '}';
    }

    public ContractorOrderBook(int Contractor_Order_Book_Id, int Material_Id, int Contractor_Id, String Status) {
        this.Contractor_Order_Book_Id = Contractor_Order_Book_Id;
        this.Material_Id = Material_Id;
        this.Contractor_Id = Contractor_Id;
        this.Status = Status;
    }


    public ContractorOrderBook() {
    }
  
}
