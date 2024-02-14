/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.Contractor;
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
public class ContractorSqlQuery {
    
     /**
     * DataBase Connection Details
     */
    private final String URL = DB_URL;
    private final String USER = "root";
    private final String PASSWORD = DB_PASSWORD;
    
    /**
     * Contractor Queries
     */
    private static final String SQL_INSERT_CONTRACTOR = "INSERT INTO CONTRACTOR (Contractor_Name,Contractor_Location,Contractor_Type,Email_Id,Phone_no,Password) VALUES (?,?,?,?,?,?)";
    private static final String SQL_READ_CONTRACTOR = "SELECT * FROM CONTRACTOR";
    
    /**
     *
     * @return int Create Contractor Function
     */
    public int createContractor(Contractor contractor) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_CONTRACTOR)) {

            preparedStatement.setString(1, contractor.getContractor_Name());
            preparedStatement.setString(2, contractor.getContractor_Location());
            preparedStatement.setString(3, contractor.getContractor_Type());
            preparedStatement.setString(4, contractor.getEmail_Id());
            preparedStatement.setString(5, contractor.getPhone_No());
            preparedStatement.setString(6, contractor.getPassword());
        
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
     * Select all Contractor function
     */
    public ArrayList<Contractor> readAllContractor() {
        
        ArrayList<Contractor> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_CONTRACTOR)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String location = resultSet.getString(3);
                String type = resultSet.getString(4);
                String emailID = resultSet.getString(5);
                String phoneNo = resultSet.getString(6);
                String password = resultSet.getString(7);

                Contractor obj = new Contractor();
                
                obj.setContractor_Id(id);
                obj.setContractor_Name(name);
                obj.setContractor_Location(location);
                obj.setContractor_Type(type);
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
     * Validate Contractor Function
     */
   public Contractor validateContractor(String Email_Id, String Password) {
        String query = "SELECT * FROM CONTRACTOR WHERE Email_Id=" +"\""+Email_Id+"\""+" AND Password="+"\""+Password+"\""+";";  //get username
        Contractor obj = null;
        
        try {
            Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);
             Statement stmt = conn.prepareStatement(query);
             ResultSet resultSet = stmt.executeQuery(query);
             
             while(resultSet.next()){
                 
                 obj = new Contractor();
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String location = resultSet.getString(3);
                String type = resultSet.getString(4);
                String emailID = resultSet.getString(5);
                String phoneNo = resultSet.getString(6);
                String password = resultSet.getString(7);

                obj.setContractor_Id(id);
                obj.setContractor_Name(name);
                obj.setContractor_Location(location);
                obj.setContractor_Type(type);
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
     * @return int Update Contractor Function
     */
    public int updateContractor(Contractor contractor) {
        int result = 0;
        String SQL_UPDATE_CONTRACTOR = "UPDATE CONTRACTOR SET Contractor_Name = ? ,Contractor_Location = ? ,Contractor_Type = ? , Email_Id = ?,Phone_No = ?,Password = ? WHERE Contractor_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_CONTRACTOR)) {

            preparedStatement.setString(1, contractor.getContractor_Name());
            preparedStatement.setString(2, contractor.getContractor_Location());
            preparedStatement.setString(3, contractor.getContractor_Type());
            preparedStatement.setString(4, contractor.getEmail_Id());
            preparedStatement.setString(5, contractor.getPhone_No());
            preparedStatement.setString(6, contractor.getPassword());
            preparedStatement.setInt(7, contractor.getContractor_Id());
        
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
     * @return int Delete Contractor Function
     */
    public int deleteContractor(Contractor contractor) {
        int result = 0;
        String SQL_DELETE_CONTRACTOR = "DELETE FROM Contractor WHERE Contractor_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE_CONTRACTOR)) {

            preparedStatement.setInt(1,contractor.getContractor_Id());
        
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
