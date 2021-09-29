
package com.ttms.backend;

import java.sql.*;  

public class Connection{
    Connection c;
    Statement s;
    public Connection(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c = DriverManager.getConnection("jdbc:mysql:///ttms","username","password");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}