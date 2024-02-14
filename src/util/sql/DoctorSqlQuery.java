/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.Doctor;
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
public class DoctorSqlQuery {
    
    /**
     * DataBase Connection Details
     */
    private final String URL = DB_URL;
    private final String USER = "root";
    private final String PASSWORD = DB_PASSWORD;
    
    /**
     * Doctor Queries
     */
    private static final String SQL_INSERT_DOCTOR = "INSERT INTO DOCTOR (Doctor_Name, Doctor_Age, Doctor_Race,Doctor_Gender,Doctor_Location,Type,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?,?,?,?)";
    private static final String SQL_READ_DOCTOR = "SELECT * FROM DOCTOR";
    
    /**
     *
     * @return int Create Doctor Function
     */
    public int createDoctor(Doctor doctor) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_DOCTOR)) {

            preparedStatement.setString(1,doctor.getDoctor_Name() );
            preparedStatement.setInt(2, doctor.getDoctor_Age());
            preparedStatement.setString(3, doctor.getDoctor_Race());
            preparedStatement.setString(4, doctor.getDoctor_Gender());
            preparedStatement.setString(5, doctor.getDoctor_Location());
            preparedStatement.setString(6, doctor.getType());
            preparedStatement.setString(7, doctor.getEmail_Id());
            preparedStatement.setString(8, doctor.getPhone_No());
            preparedStatement.setString(9, doctor.getPassword());

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
     * Select all doctor function
     */
    public ArrayList<Doctor> readAllDoctor() {
        
        ArrayList<Doctor> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_DOCTOR)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                String name = resultSet.getString(1);
                int age = resultSet.getInt(2);
                String race = resultSet.getString(3);
                String gender = resultSet.getString(4);
                String location = resultSet.getString(5);
                String type = resultSet.getString(6);
                String emailID = resultSet.getString(7);
                String phoneNo = resultSet.getString(8);
                String password = resultSet.getString(9);

                Doctor obj = new Doctor();
                obj.setDoctor_Name(name);
                obj.setDoctor_Age(age);
                obj.setDoctor_Race(race);
                obj.setDoctor_Gender(gender);
                obj.setDoctor_Location(location);
                obj.setType(type);
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
     * Validate Doctor Function
     */
   public Doctor validateDoctor(String Email_Id) {
        String query = "SELECT Password FROM DOCTOR WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
        Doctor obj = null;
        
        try {
            Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);
             Statement stmt = conn.prepareStatement(query);
             ResultSet resultSet = stmt.executeQuery(query) ;
             
             
             while(resultSet.next()){
                 obj = new Doctor();
                 
                int id = resultSet.getInt(1); 
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                String race = resultSet.getString(4);
                String gender = resultSet.getString(5);
                String location = resultSet.getString(6);
                String type = resultSet.getString(7);
                String emailID = resultSet.getString(8);
                String phoneNo = resultSet.getString(9);
                String password = resultSet.getString(10);

                
                obj.setDoctor_Id(id);
                obj.setDoctor_Name(name);
                obj.setDoctor_Age(age);
                obj.setDoctor_Race(race);
                obj.setDoctor_Gender(gender);
                obj.setDoctor_Location(location);
                obj.setType(type);
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
     * @return int Update Doctor Function
     */
    public int updateDoctor(Doctor doctor) {
        int result = 0;
        String SQL_UPDATE_DOCTOR = "UPDATE DOCTOR SET Doctor_Name = ? ,Doctor_Age = ? ,Doctor_Race = ?,Doctor_Gender = ?,Doctor_Location = ?,Type = ?,Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_DOCTOR)) {

            preparedStatement.setString(1,doctor.getDoctor_Name() );
            preparedStatement.setInt(2, doctor.getDoctor_Age());
            preparedStatement.setString(3, doctor.getDoctor_Race());
            preparedStatement.setString(4, doctor.getDoctor_Gender());
            preparedStatement.setString(5, doctor.getDoctor_Location());
            preparedStatement.setString(6, doctor.getType());
            preparedStatement.setString(7, doctor.getEmail_Id());
            preparedStatement.setString(8, doctor.getPhone_No());
            preparedStatement.setString(9, doctor.getPassword());

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
     * @return int Delete Doctor Function
     */
    public int deleteDoctor(Doctor doctor) {
        int result = 0;
        String SQL_DELETE_DOCTOR = "DELETE FROM Doctor WHERE Email_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE_DOCTOR)) {

            preparedStatement.setString(1,doctor.getDoctor_Name() );
            preparedStatement.setInt(2, doctor.getDoctor_Age());
            preparedStatement.setString(3, doctor.getDoctor_Race());
            preparedStatement.setString(4, doctor.getDoctor_Gender());
            preparedStatement.setString(5, doctor.getDoctor_Location());
            preparedStatement.setString(6, doctor.getType());
            preparedStatement.setString(7, doctor.getEmail_Id());
            preparedStatement.setString(8, doctor.getPhone_No());
            preparedStatement.setString(9, doctor.getPassword());

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
