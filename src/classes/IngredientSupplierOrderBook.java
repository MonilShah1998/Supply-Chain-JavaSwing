/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author rachanakeshav
 */
public class IngredientSupplierOrderBook {
    
    private String Ingredient_Name;
    private int quantity;
    private int price;
    private String status;
    private int IS_OrderBook_Id;

    public int getIS_OrderBook_Id() {
        return IS_OrderBook_Id;
    }

    public void setIS_OrderBook_Id(int IS_OrderBook_Id) {
        this.IS_OrderBook_Id = IS_OrderBook_Id;
    }
    

    public String getIngredient_Name() {
        return Ingredient_Name;
    }

    public void setIngredient_Name(String Ingredient_Name) {
        this.Ingredient_Name = Ingredient_Name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "IngredientSupplierOrderBook{" + "Ingredient_Name=" + Ingredient_Name + ", quantity=" + quantity + ", price=" + price + ", status=" + status + ", IS_OrderBook_Id=" + IS_OrderBook_Id + '}';
    }

    public IngredientSupplierOrderBook(String Ingredient_Name, int quantity, int price, String status, int IS_OrderBook_Id) {
        this.Ingredient_Name = Ingredient_Name;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.IS_OrderBook_Id = IS_OrderBook_Id;
    }


    public IngredientSupplierOrderBook() {
    }
    
}
