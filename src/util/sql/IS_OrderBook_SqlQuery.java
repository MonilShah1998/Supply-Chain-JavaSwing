/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.IngredientSupplier;
import classes.IngredientSupplierOrderBook;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static util.extras.Constants.DB_PASSWORD;
import static util.extras.Constants.DB_URL;

/**
 *
 * @author rachanakeshav
 */
public class IS_OrderBook_SqlQuery {
    /**
     * DataBase Connection Details
     */
    private final String URL = DB_URL;
    private final String USER = "root";
    private final String PASSWORD = DB_PASSWORD;

    /**
     * Ingredient_Supplier_Order_Book Queries
     */
    private static final String SQL_INSERT_INGREDIENT_SUPPLIER_ORDER_BOOK = "INSERT INTO INGREDIENT_SUPPLIER_ORDER_BOOK (Ingredient_Name, quantity, price, status) VALUES (?,?,?,?)";
    private static final String SQL_READ_INGREDIENT_SUPPLIER_ORDER_BOOK = "SELECT * FROM INGREDIENT_SUPPLIER_ORDER_BOOK";
    
    /**
     *
     * @return int Create Ingredient_Supplier_Order_Book Function
     */
    public int createIngredientSupplierOrderBook(IngredientSupplierOrderBook ingredientSupplierOrderBook) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_INGREDIENT_SUPPLIER_ORDER_BOOK)) {

            preparedStatement.setString(1, ingredientSupplierOrderBook.getIngredient_Name());
            preparedStatement.setInt(2, ingredientSupplierOrderBook.getQuantity());
            preparedStatement.setInt(3, ingredientSupplierOrderBook.getPrice());
            preparedStatement.setString(4, ingredientSupplierOrderBook.getStatus());

            System.out.println("Prepared Statement ->" + preparedStatement);

            int row = preparedStatement.executeUpdate();
            result = row;

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
        }
        return result;
    }
    
    
     /**
     *
     * Select all ingredient supplier function
     */
    public ArrayList<IngredientSupplierOrderBook> readAllIngredientSupplierOrderBook() {
        
        ArrayList<IngredientSupplierOrderBook> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_INGREDIENT_SUPPLIER_ORDER_BOOK)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                String name = resultSet.getString(1);
                int quantity = resultSet.getInt(2);
                int price = resultSet.getInt(3);
                String status = resultSet.getString(4);
               

                IngredientSupplierOrderBook obj = new IngredientSupplierOrderBook();
                obj.setIngredient_Name(name);
                obj.setQuantity(quantity);
                obj.setPrice(price);
                obj.setStatus(status);
                
                
                record.add(obj);            
                System.out.println(obj);
            }      

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {

        }
        return record;

    }
    
    /**
     *
     * @return int Update Ingredient_Supplier Function
     */
    public int updateIngredientSupplierOrderBook(IngredientSupplierOrderBook ingredientSupplierOrderBook) {
        int result = 0;
        String SQL_UPDATE_INGREDIENT_SUPPLIER = "UPDATE INGREDIENT_SUPPLIER SET Ingredient_Name = ? ,quantity = ? ,price = ?,status = ? WHERE Ingredient_Name = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_INGREDIENT_SUPPLIER)) {

            preparedStatement.setString(1, ingredientSupplierOrderBook.getIngredient_Name());
            preparedStatement.setInt(2, ingredientSupplierOrderBook.getQuantity());
            preparedStatement.setInt(3, ingredientSupplierOrderBook.getPrice());
            preparedStatement.setString(4, ingredientSupplierOrderBook.getStatus());
           


            System.out.println("Prepared Statement ->" + preparedStatement);

            int row = preparedStatement.executeUpdate();
            result = row;

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
        }
        return result;
    }
    
    /**
     *
     * @return int Delete Ingredient_Supplier Function
     */
    public int deleteIngredientSupplierOrderBook(IngredientSupplierOrderBook ingredientSupplierOrderBook) {
        int result = 0;
        String SQL_DELETE_INGREDIENT_SUPPLIER = "DELETE FROM IngredientSupplierOrderBook WHERE Ingredient_Name = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE_INGREDIENT_SUPPLIER)) {

            preparedStatement.setString(1, ingredientSupplierOrderBook.getIngredient_Name());
            preparedStatement.setInt(2, ingredientSupplierOrderBook.getQuantity());
            preparedStatement.setInt(3, ingredientSupplierOrderBook.getPrice());
            preparedStatement.setString(4, ingredientSupplierOrderBook.getStatus());
           


            System.out.println("Prepared Statement ->" + preparedStatement);

            int row = preparedStatement.executeUpdate();
            result = row;

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
        }
        return result;
    }
    
    
}
