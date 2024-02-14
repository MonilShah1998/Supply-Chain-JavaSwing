/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.Patient;
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
public class PatientSqlQuery {
    
     /**
     * DataBase Connection Details
     */
    private final String URL = DB_URL;
    private final String USER = "root";
    private final String PASSWORD = DB_PASSWORD;
    
    /**
     * Patient Queries
     */
    private static final String SQL_INSERT_PATIENT = "INSERT INTO PATIENT (Patient_Name, Patient_Age, Patient_Race,Patient_Gender,Patient_Location,Ailments,Email_Id,Phone_No,Password) VALUES (?,?,?,?,?,?,?,?,?)";
    private static final String SQL_READ_PATIENT = "SELECT * FROM PATIENT";
                                                                                
    /**
     *
     * @return int Create Patient Function
     */
    public int createPatient(Patient patient) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_PATIENT)) {

            preparedStatement.setString(1, patient.getPatient_Name());
            preparedStatement.setInt(2, patient.getPatient_Age());
            preparedStatement.setString(3, patient.getPatient_Race());
            preparedStatement.setString(4, patient.getPatient_Gender());
            preparedStatement.setString(5, patient.getPatient_Location());
            preparedStatement.setString(6, patient.getAilments());
            preparedStatement.setString(7, patient.getEmail_Id());
            preparedStatement.setString(8, patient.getPhone_No());
            preparedStatement.setString(9, patient.getPassword());

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
     * Select all patient function
     */
    public ArrayList<Patient> readAllPatient() {
        
        ArrayList<Patient> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_PATIENT)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                String name = resultSet.getString(1);
                int age = resultSet.getInt(2);
                String race = resultSet.getString(3);
                String gender = resultSet.getString(4);
                String location = resultSet.getString(5);
                String ailments = resultSet.getString(6);
                String emailID = resultSet.getString(7);
                String phoneNo = resultSet.getString(8);
                String password = resultSet.getString(9);

                Patient obj = new Patient();
                obj.setPatient_Name(name);
                obj.setPatient_Age(age);
                obj.setPatient_Race(race);
                obj.setPatient_Gender(gender);
                obj.setPatient_Location(location);
                obj.setAilments(ailments);
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
     * Validate Patient Function
     */
   public Patient validatePatient(String Email_Id) {
        String query = "SELECT Password FROM PATIENT WHERE Email_Id=" +"\""+Email_Id+"\""+";";  //get username
        Patient obj = null;
        
        try {
            Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);
             Statement stmt = conn.prepareStatement(query);
             ResultSet resultSet = stmt.executeQuery(query) ;
             
             while(resultSet.next()){
                 
                 obj = new Patient();
                 
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                String race = resultSet.getString(4);
                String gender = resultSet.getString(5);
                String location = resultSet.getString(6);
                String ailments = resultSet.getString(7);
                String emailID = resultSet.getString(8);
                String phoneNo = resultSet.getString(9);
                String password = resultSet.getString(10);

                obj.setPatient_Id(id);
                obj.setPatient_Name(name);
                obj.setPatient_Age(age);
                obj.setPatient_Race(race);
                obj.setPatient_Gender(gender);
                obj.setPatient_Location(location);
                obj.setAilments(ailments);
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
     * @return int Update Patient Function
     */
   public int updatePatient(Patient patient) {
   int result = 0;
        String SQL_UPDATE_PATIENT = "UPDATE PATIENT SET Patient_Name = ? ,Patient_Age = ? ,Patient_Race = ?,Patient_Gender = ?,Patient_Location = ?,Ailments = ?,Email_Id = ?,Phone_No = ?,Password = ? WHERE Email_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_PATIENT)) {

            preparedStatement.setString(1, patient.getPatient_Name());
            preparedStatement.setInt(2, patient.getPatient_Age());
            preparedStatement.setString(3, patient.getPatient_Race());
            preparedStatement.setString(4, patient.getPatient_Gender());
            preparedStatement.setString(5, patient.getPatient_Location());
            preparedStatement.setString(6, patient.getAilments());
            preparedStatement.setString(7, patient.getEmail_Id());
            preparedStatement.setString(8, patient.getPhone_No());
            preparedStatement.setString(9, patient.getPassword());

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
     * @return int Delete Patient Function
     */
   public int deletePatient(Patient patient) {
   int result = 0;
        String SQL_DELETE_PATIENT = "DELETE FROM Patient WHERE Email_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE_PATIENT)) {

            preparedStatement.setString(1, patient.getPatient_Name());
            preparedStatement.setInt(2, patient.getPatient_Age());
            preparedStatement.setString(3, patient.getPatient_Race());
            preparedStatement.setString(4, patient.getPatient_Gender());
            preparedStatement.setString(5, patient.getPatient_Location());
            preparedStatement.setString(6, patient.getAilments());
            preparedStatement.setString(7, patient.getEmail_Id());
            preparedStatement.setString(8, patient.getPhone_No());
            preparedStatement.setString(9, patient.getPassword());

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
