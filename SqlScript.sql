DROP DATABASE IF EXISTS MNR;
CREATE DATABASE if not exists MNR;
USE MNR;

DROP TABLE IF EXISTS PATIENT;
CREATE TABLE IF NOT EXISTS PATIENT 
         ( 
         Patient_Id INTEGER PRIMARY KEY auto_increment, 
         Patient_Name TEXT   NOT NULL, 
         Patient_Age INTEGER NOT NULL, 
         Patient_Race TEXT   NOT NULL, 
         Patient_Gender TEXT NOT NULL, 
         Patient_Location TEXT  NOT NULL, 
         Ailments TEXT  NOT NULL, 
         Email_Id TEXT  NOT NULL, 
         Phone_No TEXT  NOT NULL,
		 Password TEXT  NOT NULL
         ); 
         
DROP TABLE IF EXISTS DOCTOR;
CREATE TABLE IF NOT EXISTS DOCTOR 
         ( 
         Doctor_Id INTEGER PRIMARY KEY auto_increment, 
         Doctor_Name     TEXT   NOT NULL, 
         Doctor_Age INTEGER NOT NULL, 
         Doctor_Race TEXT   NOT NULL, 
         Doctor_Gender TEXT NOT NULL, 
         Doctor_Location TEXT  NOT NULL, 
         Speciality TEXT  NOT NULL, 
         Phone_No TEXT  NOT NULL ,
         Email_Id TEXT  NOT NULL, 
         Password TEXT  NOT NULL
         ); 
         
DROP TABLE IF EXISTS INGREDIENT_SUPPLIER;
CREATE TABLE IF NOT EXISTS INGREDIENT_SUPPLIER 
         ( 
         Supplier_Id INTEGER PRIMARY KEY auto_increment, 
         Supplier_Name     TEXT   NOT NULL, 
         Supplier_Category TEXT NOT NULL, 
         Supplier_Location TEXT  NOT NULL, 
         Supplier_Date_Of_Establishment TEXT  NOT NULL,
         Email_Id TEXT  NOT NULL, 
         Phone_No TEXT  NOT NULL,
         Password TEXT  NOT NULL
         ); 
         
DROP TABLE IF EXISTS MANUFACTURER;
CREATE TABLE IF NOT EXISTS MANUFACTURER 
         ( 
         Manufacturer_Id INTEGER PRIMARY KEY auto_increment, 
         Manufacturer_Name TEXT NOT NULL, 
         Type_Of_Material TEXT NOT NULL, 
         Manufacturer_Location TEXT  NOT NULL, 
         Manufacturer_Date_Of_Establishment TEXT  NOT NULL,
         Email_Id TEXT  NOT NULL, 
		Phone_No TEXT  NOT NULL,
         Password TEXT  NOT NULL
         ); 
         
         
DROP TABLE IF EXISTS ANSI;
CREATE TABLE IF NOT EXISTS ANSI 
         ( 
         ANSI_Id INTEGER PRIMARY KEY auto_increment, 
         ANSI_Board_Name TEXT NOT NULL, 
         ANSI_City TEXT NOT NULL, 
         ANSI_Country TEXT  NOT NULL,
         Email_Id TEXT  NOT NULL, 
         Phone_no TEXT NOT NULL,
         Password TEXT  NOT NULL
         ); 


DROP TABLE IF EXISTS DISTRIBUTOR;
CREATE TABLE IF NOT EXISTS DISTRIBUTOR 
         ( 
         Distributor_Id INTEGER PRIMARY KEY auto_increment, 
         Distributor_Name TEXT NOT NULL, 
         Distributor_Location TEXT NOT NULL, 
         Distributor_Date_Of_Establishment DATE NOT NULL,
         Distributor_Mode_Of_Transportation TEXT NOT NULL,
         Distributor_Price INTEGER NOT NULL,
         Email_Id TEXT  NOT NULL, 
         Phone_no TEXT NOT NULL,
         Password TEXT  NOT NULL
         );       
 
DROP TABLE IF EXISTS MATERIAL_DEPOT;
CREATE TABLE IF NOT EXISTS MATERIAL_DEPOT 
         ( 
         MaterialDepot_Id INTEGER PRIMARY KEY auto_increment, 
         MaterialDepot_Name TEXT NOT NULL, 
         MaterialDepot_Location TEXT NOT NULL, 
		 MaterialDepot_Inventory_Size INTEGER NOT NULL,
         Email_Id TEXT  NOT NULL, 
         Phone_no TEXT NOT NULL,
         Password TEXT  NOT NULL
         );       
      
DROP TABLE IF EXISTS CONTRACTOR;
CREATE TABLE IF NOT EXISTS CONTRACTOR 
         ( 
         Contractor_Id INTEGER PRIMARY KEY auto_increment, 
         Contractor_Name TEXT NOT NULL, 
         Contractor_Location TEXT NOT NULL, 
		 Contractor_Type TEXT NOT NULL,
         Email_Id TEXT  NOT NULL, 
         Phone_no TEXT NOT NULL,
         Password TEXT  NOT NULL
         );       
 
DROP TABLE IF EXISTS MATERIAL;
CREATE TABLE IF NOT EXISTS MATERIAL 
         ( 
         Material_Id INTEGER PRIMARY KEY auto_increment, 
         Material_Name TEXT NOT NULL, 
         Material_Status TEXT NOT NULL, 
		 Material_Category TEXT NOT NULL,
         Date_Of_Manufacture DATE NOT NULL,	
         Material_Shell_Life INTEGER NOT NULL,
         Manufacturer_Name TEXT NOT NULL,
         Ingredients TEXT NOT NULL
         );    


DROP TABLE IF EXISTS MATERIAL_DEPOT_ORDER_BOOK;
CREATE TABLE IF NOT EXISTS MATERIAL_DEPOT_ORDER_BOOK 
         ( 
         MaterialDepot_Order_Book_Id INTEGER PRIMARY KEY auto_increment,
		 Material_Id INTEGER NOT NULL,
         MaterialDepot_Id INTEGER NOT NULL,
         Status TEXT NOT NULL,
         FOREIGN KEY(Material_Id) REFERENCES MATERIAL(Material_Id),
         
         FOREIGN KEY(MaterialDepot_Id) REFERENCES MATERIAL_DEPOT(MaterialDepot_Id)
         );

DROP TABLE IF EXISTS CONTRACTOR_ORDER_BOOK;
CREATE TABLE IF NOT EXISTS CONTRACTOR_ORDER_BOOK 
         ( 
         Contractor_Order_Book_Id INTEGER PRIMARY KEY auto_increment,
		 Material_Id INTEGER NOT NULL,
         Contractor_Id INTEGER NOT NULL,
         Status TEXT NOT NULL,
         FOREIGN KEY(Material_Id) REFERENCES MATERIAL(Material_Id),
         
         FOREIGN KEY(Contractor_Id) REFERENCES CONTRACTOR(Contractor_Id)
         );
         
DROP TABLE IF EXISTS ADMIN;
CREATE TABLE IF NOT EXISTS ADMIN 
         ( 
         Admin_Role INTEGER PRIMARY KEY auto_increment, 
         Admin_Id INTEGER NOT NULL,
         Admin_Password INTEGER NOT NULL
         );       
         
use  MNR;
select * from patient;
select * from manufacturer;
select * from INGREDIENT_SUPPLIER;
select * from material;
select * from Material_Depot;

