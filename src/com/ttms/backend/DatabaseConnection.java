/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttms.backend;

import java.sql.*;

/**
 *
 * @author CORE COMP
 */
public class DatabaseConnection {
    public Connection con;
    public Statement stmt;
    public DatabaseConnection(){
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con = DriverManager.getConnection("jdbc:mysql:///ttms","username","password");    
            stmt =con.createStatement(); 
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }
    }
    
}
