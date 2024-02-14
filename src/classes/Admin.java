/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author rachanakeshav
 */
public class Admin {
    
    private String Admin_Role;
    private int Admin_Id;
    private String Admin_Password;

    public String getAdmin_Role() {
        return Admin_Role;
    }

    public void setAdmin_Role(String Admin_Role) {
        this.Admin_Role = Admin_Role;
    }

    public int getAdmin_Id() {
        return Admin_Id;
    }

    public void setAdmin_Id(int Admin_Id) {
        this.Admin_Id = Admin_Id;
    }

    public String getAdmin_Password() {
        return Admin_Password;
    }

    public void setAdmin_Password(String Admin_Password) {
        this.Admin_Password = Admin_Password;
    }

    @Override
    public String toString() {
        return "Admin{" + "Admin_Role=" + Admin_Role + ", Admin_Id=" + Admin_Id + ", Admin_Password=" + Admin_Password + '}';
    }

    public Admin(String Admin_Role, int Admin_Id, String Admin_Password) {
        this.Admin_Role = Admin_Role;
        this.Admin_Id = Admin_Id;
        this.Admin_Password = Admin_Password;
    }
    
    public Admin() {
    }
    
}
