/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;


import classes.ContractorOrderBook;
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
public class Contractor_OrderBook_SqlQuery {
    /**
     * DataBase Connection Details
     */
    private final String URL = DB_URL;
    private final String USER = "root";
    private final String PASSWORD = DB_PASSWORD;

    /**
     * Contractor_Order_Book Queries
     */
    private static final String SQL_INSERT_CONTRACTOR_ORDER_BOOK = "INSERT INTO CONTRACTOR_ORDER_BOOK ( Material_Id, Contractor_Id, Status) VALUES (?,?,?)";
    private static final String SQL_READ_CONTRACTOR_ORDER_BOOK = "SELECT * FROM CONTRACTOR_ORDER_BOOK";
    
    /**
     *
     * @return int Create Contractor_Order_Book Function
     */
    public int createContractorOrderBook(ContractorOrderBook contractorOrderBook) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_CONTRACTOR_ORDER_BOOK)) {

            
            preparedStatement.setInt(1, contractorOrderBook.getMaterial_Id());
            preparedStatement.setInt(2, contractorOrderBook.getContractor_Id());
            preparedStatement.setString(3, contractorOrderBook.getStatus());

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
    public ArrayList<ContractorOrderBook> readAllContractorOrderBook() {
        
        ArrayList<ContractorOrderBook> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_CONTRACTOR_ORDER_BOOK)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int contractor_ob_id = resultSet.getInt(1);
                int material_id = resultSet.getInt(2);
                int contractor_id = resultSet.getInt(3);
                String status = resultSet.getString(4);
               

                ContractorOrderBook obj = new ContractorOrderBook();
                obj.setContractor_Order_Book_Id(contractor_ob_id);
                obj.setMaterial_Id(material_id);
                obj.setContractor_Id(contractor_id);
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
    public int updateContractorOrderBook(ContractorOrderBook contractorOrderBook) {
        int result = 0;
        String SQL_UPDATE_CONTRACTOR_ORDER_BOOK = "UPDATE CONTRACTOR_ORDER_BOOK SET Material_Id = ?, Contractor_Id = ?, Status = ? WHERE Contractor_Order_Book_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_CONTRACTOR_ORDER_BOOK)) {

            
            preparedStatement.setInt(1, contractorOrderBook.getMaterial_Id());
            preparedStatement.setInt(2, contractorOrderBook.getContractor_Id());
            preparedStatement.setString(3, contractorOrderBook.getStatus());
            preparedStatement.setInt(4, contractorOrderBook.getContractor_Order_Book_Id());


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
     * @return int Update Ingredient_Supplier Function
     */
    public int deleteContractorOrderBook(ContractorOrderBook contractorOrderBook) {
        int result = 0;
        String SQL_UPDATE_CONTRACTOR_ORDER_BOOK = "DELETE CONTRACTOR WHERE Contractor_Order_Book_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_CONTRACTOR_ORDER_BOOK)) {

            preparedStatement.setInt(1, contractorOrderBook.getContractor_Order_Book_Id());
            preparedStatement.setInt(2, contractorOrderBook.getMaterial_Id());
            preparedStatement.setInt(3, contractorOrderBook.getContractor_Id());
            preparedStatement.setString(4, contractorOrderBook.getStatus());


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

