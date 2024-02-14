/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.ANSI;
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
public class ANSISqlQuery {
    
    /**
     * DataBase Connection Details
     */
    private final String URL = DB_URL;
    private final String USER = "root";
    private final String PASSWORD = DB_PASSWORD;
    
    /**
     * ANSI Queries
     */
    private static final String SQL_INSERT_ANSI = "INSERT INTO ANSI (ANSI_Board_Name, ANSI_City, ANSI_Country,Email_Id,Phone_no,Password) VALUES (?,?,?,?,?,?)";
    private static final String SQL_READ_ANSI= "SELECT * FROM ANSI";
    
    /**
     *
     * @return int Create ANSI Function
     */
    public int createANSI(ANSI ANSI) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_ANSI)) {

            preparedStatement.setString(1, ANSI.getANSI_Board_Name());
            preparedStatement.setString(2, ANSI.getANSI_City());
            preparedStatement.setString(3, ANSI.getANSI_Country());
            preparedStatement.setString(4, ANSI.getEmail_Id());
            preparedStatement.setString(5, ANSI.getPhone_No());
            preparedStatement.setString(6, ANSI.getPassword());
            

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
     * Select all ANSI function
     */
    public ArrayList<ANSI> readAllANSI() {
        
        ArrayList<ANSI> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_ANSI)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id  = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String city = resultSet.getString(3);
                String country = resultSet.getString(4);
                String emailID = resultSet.getString(5);
                String phoneNo = resultSet.getString(6);
                String password = resultSet.getString(7);

                ANSI obj = new ANSI();
                obj.setANSI_Id(id);
                obj.setANSI_Board_Name(name);
                obj.setANSI_City(city);
                obj.setANSI_Country(country);
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
     * Validate ANSI Function
     */
   public ANSI validateANSI(String Email_Id, String Password) {
        String query = "SELECT * FROM ANSI WHERE Email_Id=" +"\""+Email_Id+"\""+" AND Password="+"\""+Password+"\""+";";  //get username
        ANSI obj = null;
        try {
            Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);
             Statement stmt = conn.prepareStatement(query);
             ResultSet resultSet = stmt.executeQuery(query) ;
             
             while(resultSet.next()){
                 
                 obj = new ANSI();
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String city = resultSet.getString(3);
                String country = resultSet.getString(4);
                String emailID = resultSet.getString(5);
                String phoneNo = resultSet.getString(6);
                String password = resultSet.getString(7);

                obj.setANSI_Id(id);
                obj.setANSI_Board_Name(name);
                obj.setANSI_City(city);
                obj.setANSI_Country(country);
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
     * @return int Update ANSI Function
     */
    public int updateANSI(ANSI ANSI) {
        int result = 0;
        String SQL_UPDATE_ANSI = "UPDATE ANSI SET ANSI_Board_Name = ? ,ANSI_City = ? ,ANSI_Country = ? ,Email_Id = ?,Phone_No = ?,Password = ? WHERE ANSI_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_ANSI)) {

            preparedStatement.setString(1, ANSI.getANSI_Board_Name());
            preparedStatement.setString(2, ANSI.getANSI_City());
            preparedStatement.setString(3, ANSI.getANSI_Country());
            preparedStatement.setString(4, ANSI.getEmail_Id());
            preparedStatement.setString(5, ANSI.getPhone_No());
            preparedStatement.setString(6, ANSI.getPassword());
            preparedStatement.setInt(7, ANSI.getANSI_Id());

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
     * @return int Delete ANSI Function
     */
    public int deleteANSI(ANSI ANSI) {
        int result = 0;
        String SQL_DELETE_ANSI = "DELETE FROM ANSI WHERE ANSI_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE_ANSI)) {

               preparedStatement.setInt(1, ANSI.getANSI_Id());
        

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
