/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.Distributor;
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
public class DistributorSqlQuery {
    
    /**
     * DataBase Connection Details
     */
    private final String URL = DB_URL;
    private final String USER = "root";
    private final String PASSWORD = DB_PASSWORD;
    
     /**
     * Distributor Queries
     */
    private static final String SQL_INSERT_DISTRIBUTOR = "INSERT INTO DISTRIBUTOR (Distributor_Name, Distributor_Location, Distributor_Date_Of_Establishment, Distributor_Mode_Of_Transportation, Distributor_Price,Email_Id,Phone_no,Password) VALUES (?,?,?,?,?,?,?,?)";
    private static final String SQL_READ_DISTRIBUTOR = "SELECT * FROM DISTRIBUTOR";
    
    
    /**
     *
     * @return int Create Distributor Function
     */
    public int createDistributor(Distributor distributor) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_DISTRIBUTOR)) {

            preparedStatement.setString(1, distributor.getDistributor_Name());
            preparedStatement.setString(2, distributor.getDistributor_Location());
            preparedStatement.setDate(3, distributor.getDistributor_Date_Of_Establishment());
            preparedStatement.setString(4, distributor.getDistributor_Mode_Of_Transportation());
            preparedStatement.setInt(5, distributor.getDistributor_Price());
            preparedStatement.setString(6, distributor.getEmail_Id());
            preparedStatement.setString(7, distributor.getPhone_No());
            preparedStatement.setString(8, distributor.getPassword());
            

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
     * Select all distributor function
     */
    public ArrayList<Distributor> readAllDistributor() {
        
        ArrayList<Distributor> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_DISTRIBUTOR)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id  = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String location = resultSet.getString(3);
                Date doe = resultSet.getDate(4);
                String transportation = resultSet.getString(5);
                int price = resultSet.getInt(6);
                String emailID = resultSet.getString(7);
                String phoneNo = resultSet.getString(8);
                String password = resultSet.getString(9);

                Distributor obj = new Distributor();
                obj.setDistributor_Id(id);
                obj.setDistributor_Name(name);
                obj.setDistributor_Location(location);
                obj.setDistributor_Date_Of_Establishment(doe);
                obj.setDistributor_Mode_Of_Transportation(transportation);
                obj.setDistributor_Price(price);
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
     * Validate Distributor Function
     */
   public Distributor validateDistributor(String Email_Id, String Password) {
        String query = "SELECT * FROM DISTRIBUTOR WHERE Email_Id=" +"\""+Email_Id+"\""+" AND Password="+"\""+Password+"\""+";";  //get username
        Distributor obj = null;
        try {
            Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);
             Statement stmt = conn.prepareStatement(query);
             ResultSet resultSet = stmt.executeQuery(query) ;
             
             while(resultSet.next()) {
                 obj = new Distributor();
                 
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String location = resultSet.getString(3);
                Date doe = resultSet.getDate(4);
                String transportation = resultSet.getString(5);
                int price = resultSet.getInt(6);
                String emailID = resultSet.getString(7);
                String phoneNo = resultSet.getString(8);
                String password = resultSet.getString(9);

                obj.setDistributor_Id(id);
                obj.setDistributor_Name(name);
                obj.setDistributor_Location(location);
                obj.setDistributor_Date_Of_Establishment(doe);
                obj.setDistributor_Mode_Of_Transportation(transportation);
                obj.setDistributor_Price(price);
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
     * @return int Update Distributor Function
     */
    public int updateDistributor(Distributor distributor) {
        int result = 0;
        String SQL_UPDATE_DISTRIBUTOR = "UPDATE DISTRIBUTOR SET Distributor_Name = ? ,Distributor_Location = ? ,Distributor_Date_Of_Establishment = ? ,Distributor_Mode_Of_Transportation = ?, Distributor_Price = ?, Email_Id = ?,Phone_No = ?,Password = ? WHERE Distributor_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_DISTRIBUTOR)) {

            preparedStatement.setString(1, distributor.getDistributor_Name());
            preparedStatement.setString(2, distributor.getDistributor_Location());
            preparedStatement.setDate(3, distributor.getDistributor_Date_Of_Establishment());
            preparedStatement.setString(4, distributor.getDistributor_Mode_Of_Transportation());
            preparedStatement.setInt(5, distributor.getDistributor_Price());
            preparedStatement.setString(6, distributor.getEmail_Id());
            preparedStatement.setString(7, distributor.getPhone_No());
            preparedStatement.setString(8, distributor.getPassword());
            preparedStatement.setInt(9, distributor.getDistributor_Id());

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
     * @return int Delete Distributor Function
     */
    public int deleteDistributor(Distributor distributor) {
        int result = 0;
        String SQL_DELETE_DISTRIBUTOR = "DELETE FROM Distributor WHERE Distributor_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE_DISTRIBUTOR)) {

            preparedStatement.setInt(1,distributor.getDistributor_Id());

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
