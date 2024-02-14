/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.IngredientSupplier;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static util.extras.Constants.DB_PASSWORD;
import static util.extras.Constants.DB_URL;

/**
 *
 * @author rachanakeshav
 */
public class IngredientSupplierSqlQuery {
    
    /**
     * DataBase Connection Details
     */
    private final String URL = DB_URL;
    private final String USER = "root";
    private final String PASSWORD = DB_PASSWORD;

    /**
     * Ingredient_Supplier Queries
     */
    private static final String SQL_INSERT_INGREDIENT_SUPPLIER = "INSERT INTO INGREDIENT_SUPPLIER (Supplier_Name, Supplier_Category, Supplier_Location, Supplier_Date_Of_Establishment,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?,?)";
    private static final String SQL_READ_INGREDIENT_SUPPLIER = "SELECT * FROM INGREDIENT_SUPPLIER";
    
    /**
     *
     * @return int Create Ingredient_Supplier Function
     */
    public int createIngredientSupplier(IngredientSupplier ingredientSupplier) {
//          Supplier_Id INTEGER PRIMARY KEY auto_increment, 
//         Supplier_Name     TEXT   NOT NULL, 
//         Supplier_Category TEXT NOT NULL, 
//         Supplier_Location TEXT  NOT NULL, 
//         Supplier_Date_Of_Establishment TEXT  NOT NULL,
//         Email_Id TEXT  NOT NULL,

//         Password TEXT  NOT NULL
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_INGREDIENT_SUPPLIER)) {

            preparedStatement.setString(1, ingredientSupplier.getSupplier_Name());
            preparedStatement.setString(2, ingredientSupplier.getSupplier_Category());
            preparedStatement.setString(3, ingredientSupplier.getSupplier_Location());
            preparedStatement.setDate(4, ingredientSupplier.getSupplier_Date_Of_Establishment());
            preparedStatement.setString(5, ingredientSupplier.getEmail_Id());
            preparedStatement.setString(6, ingredientSupplier.getPhone_No());
            preparedStatement.setString(7, ingredientSupplier.getPassword());

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
    public ArrayList<IngredientSupplier> readAllIngredientSupplier() {
        
        ArrayList<IngredientSupplier> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_INGREDIENT_SUPPLIER)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id  = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String category = resultSet.getString(3);
                String location = resultSet.getString(4);
                Date date = resultSet.getDate(5);
                String emailID = resultSet.getString(6);
                String phoneNo = resultSet.getString(7);
                String password = resultSet.getString(8);

                IngredientSupplier obj = new IngredientSupplier();
                obj.setSupplier_Id(id);
                obj.setSupplier_Name(name);
                obj.setSupplier_Category(category);
                obj.setSupplier_Location(location);
                obj.setSupplier_Date_Of_Establishment(date);
                obj.setEmail_Id(emailID);
                obj.setPhone_No(phoneNo);
                obj.setPassword(password);
                
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
     * Validate Ingredient Supplier Function
     */
   public IngredientSupplier validateIngredientSupplier(String Email_Id, String Password) {
        String query = "SELECT * FROM INGREDIENT_SUPPLIER WHERE Email_Id=" +"\""+Email_Id+"\""+" AND Password="+"\""+Password+"\""+";";  //get username
        IngredientSupplier obj = null;
        
        try {
            Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);
             Statement stmt = conn.prepareStatement(query);
             ResultSet resultSet = stmt.executeQuery(query) ;
             
             while(resultSet.next()){
                 
                 obj = new IngredientSupplier();
                 
                String id = resultSet.getString(1);
                String name = resultSet.getString(2);
                String category = resultSet.getString(3);
                String location = resultSet.getString(4);
                Date date = resultSet.getDate(5);
                String emailID = resultSet.getString(6);
                String phoneNo = resultSet.getString(7);
                String password = resultSet.getString(8);
      
                obj.setSupplier_Id(Integer.parseInt(id));
                obj.setSupplier_Name(name);
                obj.setSupplier_Category(category);
                obj.setSupplier_Location(location);
                obj.setSupplier_Date_Of_Establishment(date);
                obj.setEmail_Id(emailID);
                obj.setPhone_No(phoneNo);
                obj.setPassword(password);
                     
                System.out.println(obj);
                   
             }
                 
              return obj;
           } catch (SQLException e) {
                       e.printStackTrace();
                      return obj;
           }
 } 
   
   /**
     *
     * @return int Update Ingredient_Supplier Function
     */
    public int updateIngredientSupplier(IngredientSupplier ingredientSupplier) {
        int result = 0;
        String SQL_UPDATE_INGREDIENT_SUPPLIER = "UPDATE INGREDIENT_SUPPLIER SET Supplier_Name = ? ,Supplier_Category = ? ,Supplier_Location = ?,Supplier_Date_Of_Establishment = ? ,Email_Id = ?,Phone_No = ?,Password = ? WHERE Supplier_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_INGREDIENT_SUPPLIER)) {

            preparedStatement.setString(1, ingredientSupplier.getSupplier_Name());
            preparedStatement.setString(2, ingredientSupplier.getSupplier_Category());
            preparedStatement.setString(3, ingredientSupplier.getSupplier_Location());
            preparedStatement.setDate(4,ingredientSupplier.getSupplier_Date_Of_Establishment());
            preparedStatement.setString(5, ingredientSupplier.getEmail_Id());
            preparedStatement.setString(6, ingredientSupplier.getPhone_No());
            preparedStatement.setString(7, ingredientSupplier.getPassword());
             preparedStatement.setInt(8, ingredientSupplier.getSupplier_Id());


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
    public int deleteIngredientSupplier(IngredientSupplier ingredientSupplier) {
        int result = 0;
        String SQL_DELETE_INGREDIENT_SUPPLIER = "DELETE FROM INGREDIENT_SUPPLIER WHERE Supplier_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE_INGREDIENT_SUPPLIER)) {

            preparedStatement.setInt(1, ingredientSupplier.getSupplier_Id());


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
