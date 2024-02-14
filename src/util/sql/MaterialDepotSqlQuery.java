/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.MaterialDepot;
import java.sql.Connection;
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
public class MaterialDepotSqlQuery {
    
    /**
     * DataBase Connection Details
     */
    private final String URL = DB_URL;
    private final String USER = "root";
    private final String PASSWORD = DB_PASSWORD;
    
    /**
     * MaterialDepot Queries
     */
    private static final String SQL_INSERT_MATERIAL_DEPOT = "INSERT INTO MATERIAL_DEPOT (MaterialDepot_Name, MaterialDepot_Location, MaterialDepot_Inventory_Size,Email_Id,Phone_no,Password ) VALUES (?,?,?,?,?,?)";
    private static final String SQL_READ_MATERIAL_DEPOT = "SELECT * FROM MATERIAL_DEPOT";
    
    /**
     *
     * @return int Create MaterialDepot Function
     */
    public int createMaterialDepot(MaterialDepot materialDepot) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_MATERIAL_DEPOT)) {

            preparedStatement.setString(1, materialDepot.getMaterialDepot_Name());
            preparedStatement.setString(2, materialDepot.getMaterialDepot_Location());
            preparedStatement.setInt(3, materialDepot.getMaterialDepot_Inventory_Size());
            preparedStatement.setString(4, materialDepot.getEmail_Id());
            preparedStatement.setString(5, materialDepot.getPhone_No());
            preparedStatement.setString(6, materialDepot.getPassword());
        
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
     * Select all MaterialDepot function
     */
    public ArrayList<MaterialDepot> readAllMaterialDepot() {
        
        ArrayList<MaterialDepot> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_MATERIAL_DEPOT)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                
                int id  = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String location = resultSet.getString(3);
                int inventory_size = resultSet.getInt(4);
                String emailID = resultSet.getString(5);
                String phoneNo = resultSet.getString(6);
                String password = resultSet.getString(7);

                MaterialDepot obj = new MaterialDepot();
                
                obj.setMaterialDepot_Id(id);
                obj.setMaterialDepot_Name(name);
                obj.setMaterialDepot_Location(location);
                obj.setMaterialDepot_Inventory_Size(inventory_size);
                obj.setEmail_Id(emailID);
                obj.setPhone_No(phoneNo);
                obj.setPassword(password);
                
                System.out.println(obj);
                
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
     * Validate MaterialDepot Function
     */
   public MaterialDepot validateMaterialDepot(String Email_Id, String Password) {
        String query = "SELECT * FROM MATERIAL_DEPOT WHERE Email_Id=" +"\""+Email_Id+"\""+" AND Password="+"\""+Password+"\""+";";  //get username
        MaterialDepot obj = null;
        
        try {
            Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);
             Statement stmt = conn.prepareStatement(query);
             ResultSet resultSet = stmt.executeQuery(query) ;
             
             while(resultSet.next()){
                 
                 obj = new MaterialDepot();
                 
                int id = resultSet.getInt(1); 
                String name = resultSet.getString(2);
                String location = resultSet.getString(3);
                int inventory_size = resultSet.getInt(4);
                String emailID = resultSet.getString(5);
                String phoneNo = resultSet.getString(6);
                String password = resultSet.getString(7);
               
                obj.setMaterialDepot_Id(id);
                obj.setMaterialDepot_Name(name);
                obj.setMaterialDepot_Location(location);
                obj.setMaterialDepot_Inventory_Size(inventory_size);
                obj.setEmail_Id(emailID);
                obj.setPhone_No(phoneNo);
                obj.setPassword(password);
                
                System.out.println(obj);
                 
             }
             return obj;
             
           } catch (SQLException e) {
                       e.printStackTrace();
                      return obj ;
           }
 } 
   
   /**
     *
     * @return int Update MaterialDepot Function
     */
    public int updateMaterialDepot(MaterialDepot materialDepot) {
        int result = 0;
        String SQL_UPDATE_MATERIAL_DEPOT = "UPDATE MATERIAL_DEPOT SET MaterialDepot_Name = ? ,MaterialDepot_Location = ? ,MaterialDepot_Inventory_Size = ? , Email_Id = ?,Phone_No = ?,Password = ? WHERE MaterialDepot_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_MATERIAL_DEPOT)) {

            preparedStatement.setString(1, materialDepot.getMaterialDepot_Name());
            preparedStatement.setString(2, materialDepot.getMaterialDepot_Location());
            preparedStatement.setInt(3, materialDepot.getMaterialDepot_Inventory_Size());
            preparedStatement.setString(4, materialDepot.getEmail_Id());
            preparedStatement.setString(5, materialDepot.getPhone_No());
            preparedStatement.setString(6, materialDepot.getPassword());
            preparedStatement.setInt(7, materialDepot.getMaterialDepot_Id());
        
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
     * @return int Delete MaterialDepot Function
     */
    public int deleteMaterialDepot(MaterialDepot materialDepot) {
        int result = 0;
        String SQL_DELETE_MATERIAL_DEPOT = "DELETE FROM MaterialDepot WHERE MaterialDepot_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE_MATERIAL_DEPOT)) {

            preparedStatement.setInt(1, materialDepot.getMaterialDepot_Id());
        
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
