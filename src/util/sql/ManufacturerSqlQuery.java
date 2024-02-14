/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.Manufacturer;
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
public class ManufacturerSqlQuery {

    /**
     * DataBase Connection Details
     */
    private final String URL = DB_URL;
    private final String USER = "root";
    private final String PASSWORD = DB_PASSWORD;

    /**
     * Manufacturer Queries
     */
    private static final String SQL_INSERT_MANUFACTURER = "INSERT INTO MANUFACTURER (Manufacturer_Name, Manufacturer_Location, Type_Of_Material, Manufacturer_Date_Of_Establishment,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?,?)";
    private static final String SQL_READ_MANUFACTURER = "SELECT * FROM MANUFACTURER";

    /**
     *
     * @return int Create Manufacturer Function
     */
    public int createManufacturer(Manufacturer manufacturer) {

        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_MANUFACTURER)) {

            preparedStatement.setString(1, manufacturer.getManufacturer_Name());
            preparedStatement.setString(2, manufacturer.getManufacturer_Location());
            preparedStatement.setString(3, manufacturer.getType_Of_Material());
            preparedStatement.setDate(4, manufacturer.getManufacturer_Date_Of_Establishment());
            preparedStatement.setString(5, manufacturer.getEmail_Id());
            preparedStatement.setString(6, manufacturer.getPhone_No());
            preparedStatement.setString(7, manufacturer.getPassword());

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
     * Select all manufacturer function
     */
    public ArrayList<Manufacturer> readAllManufacturer() {

        ArrayList<Manufacturer> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_MANUFACTURER)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String material_type = resultSet.getString(3);
                String location = resultSet.getString(4);
                Date doe = resultSet.getDate(5);
                String emailID = resultSet.getString(6);
                String phoneNo = resultSet.getString(7);
                String password = resultSet.getString(8);

                Manufacturer obj = new Manufacturer();
                obj.setManufacturer_Id(id);
                obj.setManufacturer_Name(name);
                obj.setManufacturer_Location(location);
                obj.setType_Of_Material(material_type);
                obj.setManufacturer_Date_Of_Establishment(doe);
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
     * @return boolean Validate Manufacturer Function
     */
    public Manufacturer validateManufacturer(String Email_Id, String Password) {
        String query = "SELECT * FROM MANUFACTURER WHERE Email_Id=" + "\"" + Email_Id +"\""+" AND Password="+"\""+Password+"\""+";";  //get username
        Manufacturer obj = null;
        try {
            Connection conn = DriverManager.getConnection(
                    URL, USER, PASSWORD);
            Statement stmt = conn.prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery(query);

            while (resultSet.next()) {
                obj = new Manufacturer();
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String material_type = resultSet.getString(3);
                String location = resultSet.getString(4);
                Date doe = resultSet.getDate(5);
                String emailID = resultSet.getString(6);
                String phoneNo = resultSet.getString(7);
                String password = resultSet.getString(8);

                obj.setManufacturer_Id(id);
                obj.setManufacturer_Name(name);
                obj.setManufacturer_Location(location);
                obj.setType_Of_Material(material_type);
                obj.setManufacturer_Date_Of_Establishment(doe);
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
     * @return int Update Manufacturer Function
     */
    public int updateManufacturer(Manufacturer manufacturer) {
        int result = 0;
        String SQL_UPDATE_MANUFACTURER = "UPDATE MANUFACTURER SET Manufacturer_Name = ? ,Manufacturer_Location = ?, Type_Of_Material = ? ,Manufacturer_Date_Of_Establishment = ?,Email_Id = ?,Phone_No = ?,Password = ? WHERE Manufacturer_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_MANUFACTURER)) {

            preparedStatement.setString(1, manufacturer.getManufacturer_Name());
            preparedStatement.setString(2, manufacturer.getManufacturer_Location());
            preparedStatement.setString(3, manufacturer.getType_Of_Material());
            preparedStatement.setDate(4, manufacturer.getManufacturer_Date_Of_Establishment());
            preparedStatement.setString(5, manufacturer.getEmail_Id());
            preparedStatement.setString(6, manufacturer.getPhone_No());
            preparedStatement.setString(7, manufacturer.getPassword());
             preparedStatement.setInt(8, manufacturer.getManufacturer_Id());

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
     * @return int Validate Manufacturer Function
     */
    public int serchByName(String manufacturerName) {
        String query = "SELECT Manufacturer_Id FROM MANUFACTURER WHERE Manufacturer_Name=" + "\"" + manufacturerName + "\"" + ";";  //get username
        int id = 0;
        try {
            Connection conn = DriverManager.getConnection(
                    URL, USER, PASSWORD);
            Statement stmt = conn.prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()) {
                id = resultSet.getInt(1);
            }
            return id;
        } catch (SQLException e) {
            e.printStackTrace();
            return id;
        }
    }
    
    /**
     *
     * @return int Delete MaterialDepot Function
     */
    public int deleteMaterialDepot(Manufacturer manufacturer) {
        int result = 0;
        String SQL_DELETE_MATERIAL_DEPOT = "DELETE FROM MANUFACTURER WHERE Manufacturer_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE_MATERIAL_DEPOT)) {

            preparedStatement.setInt(1, manufacturer.getManufacturer_Id());
        
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
