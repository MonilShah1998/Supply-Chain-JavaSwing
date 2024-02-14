/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.Material;
import java.sql.Connection;
import java.sql.Date;
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
public class MaterialSqlQuery {

    /**
     * DataBase Connection Details
     */
    private final String URL = DB_URL;
    private final String USER = "root";
    private final String PASSWORD = DB_PASSWORD;

    /**
     * Material Queries
     */
    private static final String SQL_INSERT_MATERIAL = "INSERT INTO MATERIAL (Material_Name, Material_Status, Material_Category, Date_Of_Manufacture, Material_Shell_Life, Manufacturer_Name,Ingredients) VALUES (?,?,?,?,?,?,?)";
    private static final String SQL_READ_MATERIAL = "SELECT * FROM MATERIAL";

    /**
     *
     * @return int Create Material Function
     */
    public int createMaterial(Material material) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_MATERIAL)) {

            preparedStatement.setString(1, material.getMaterial_Name());
            preparedStatement.setString(2, material.getMaterial_Status());
            preparedStatement.setString(3, material.getMaterial_Category());
            preparedStatement.setDate(4, material.getDate_Of_Manufacture());
            preparedStatement.setInt(5, material.getShell_Life());
            preparedStatement.setString(6, material.getManufacturer_Name());
            preparedStatement.setString(7, material.getIngredients());

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
     * Select all material function
     */
    public ArrayList<Material> readAllMaterial() {

        ArrayList<Material> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_MATERIAL)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String status = resultSet.getString(3);
                String category = resultSet.getString(4);
                Date dom = resultSet.getDate(5);
                int shell_life = resultSet.getInt(6);
                String manufacturer_name = resultSet.getString(7);
                String Ingredients = resultSet.getString(8);

                Material obj = new Material();
                obj.setId(id);
                obj.setIngredients(Ingredients);
                obj.setMaterial_Name(name);
                obj.setMaterial_Status(status);
                obj.setMaterial_Category(category);
                obj.setDate_Of_Manufacture(dom);
                obj.setShell_Life(shell_life);
                obj.setManufacturer_Name(manufacturer_name);

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
     * @return int Update Material Function
     */
    public int updateMaterial(Material material) {
        int result = 0;
        String SQL_UPDATE_MATERIAL = "UPDATE MATERIAL SET Material_Name = ? ,Material_Status = ? ,Material_Category = ? , Date_Of_Manufacture = ?,Material_Shell_Life = ?, Manufacturer_Name = ?,Ingredients=? WHERE Material_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_MATERIAL)) {

            preparedStatement.setString(1, material.getMaterial_Name());
            preparedStatement.setString(2, material.getMaterial_Status());
            preparedStatement.setString(3, material.getMaterial_Category());
            preparedStatement.setDate(4, material.getDate_Of_Manufacture());
            preparedStatement.setInt(5, material.getShell_Life());
            preparedStatement.setString(6, material.getManufacturer_Name());
            preparedStatement.setString(7, material.getIngredients());
            preparedStatement.setInt(8, material.getId());

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
     * @return int Delete Material Function
     */
    public int deleteMaterial(Material material) {
        int result = 0;
        String SQL_DELETE_MATERIAL = "DELETE FROM Material WHERE Material_Name = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE_MATERIAL)) {

            preparedStatement.setString(1, material.getMaterial_Name());
            preparedStatement.setString(2, material.getMaterial_Status());
            preparedStatement.setString(3, material.getMaterial_Category());
            preparedStatement.setDate(4, material.getDate_Of_Manufacture());
            preparedStatement.setInt(5, material.getShell_Life());
            preparedStatement.setString(6, material.getManufacturer_Name());

            System.out.println("Prepared Statement ->" + preparedStatement);

            int row = preparedStatement.executeUpdate();
            result = row;

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
        }
        return result;
    }
    
    public ArrayList<Material> readAllMaterialbyMName(String mName) {
        String SQL_READ_MATERIAL_BY_NAME = "SELECT * FROM MATERIAL WHERE Manufacturer_Name = ? ; ";
        
        ArrayList<Material> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_MATERIAL_BY_NAME)) {

            preparedStatement.setString(1, mName);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String status = resultSet.getString(3);
                String category = resultSet.getString(4);
                Date dom = resultSet.getDate(5);
                int shell_life = resultSet.getInt(6);
                String manufacturer_name = resultSet.getString(7);
                String Ingredients = resultSet.getString(8);

                Material obj = new Material();
                obj.setId(id);
                obj.setIngredients(Ingredients);
                obj.setMaterial_Name(name);
                obj.setMaterial_Status(status);
                obj.setMaterial_Category(category);
                obj.setDate_Of_Manufacture(dom);
                obj.setShell_Life(shell_life);
                obj.setManufacturer_Name(manufacturer_name);

                record.add(obj);
                System.out.println(obj);
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {

        }
        return record;

    }
    

}
