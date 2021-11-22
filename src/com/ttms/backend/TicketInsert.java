
package com.ttms.backend;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

/**
 *
 * @author "Rushikesh Borakhede Class:-SEINFTA Batch:- 01 Roll No:- 01"
 */
public class TicketInsert {
    private int ticket_num,train_num,seat_no,price,distance;
    private String train_name,source_station,destination_station,passenger_name;
    private String userid,status;
    DatabaseConnection dc;
    
    public TicketInsert(String train_num,String source_station,String destination_station,String passenger_name,String user_id,String quota){
        this.train_num = new Integer(train_num);
        this.source_station = source_station;
        this.destination_station = destination_station;
        this.passenger_name = passenger_name;
        this.userid = user_id;
        
        try{
            dc = new DatabaseConnection();
            PreparedStatement prestmt = dc.con.prepareStatement("select * from traindata where TrainNo = ? and SourceStation = ? and DestinationStation = ? and VacancyQuota = ?;");
            prestmt.setString(1, train_num);
            prestmt.setString(2, source_station);
            prestmt.setString(3, destination_station);
            prestmt.setString(4, quota);
            ResultSet rs = prestmt.executeQuery();
            if(rs.next()){
                this.train_name = rs.getString("TrainName");
                this.distance = new Integer(rs.getString("DistanceFromSourceStation"));
                this.price = new Integer(rs.getString("Price"));
            }
            dc = new DatabaseConnection();
            PreparedStatement ticketprestmt = dc.con.prepareStatement("SELECT MAX(TicketNo) FROM ticketdata;");
            ResultSet rs1 = ticketprestmt.executeQuery();
            if(rs1.next()){
                System.out.println(rs1.getString(1));
                this.ticket_num = new Integer(rs1.getString(1));
                javax.swing.JOptionPane.showMessageDialog(null, this.ticket_num);
            }
                
            dc.con.close();
        }catch(Exception e){
            System.out.println(e);
        }
        setIntoTicketData();
    }
    void setIntoTicketData(){
        dc = new DatabaseConnection();
        try {
            PreparedStatement prestmt = dc.con.prepareStatement("INSERT INTO ticketdata VALUES (?,?,?,?,?,?,?,?,?,?);");
            
            prestmt.setString(1, String.valueOf(this.ticket_num+1));
            prestmt.setString(2, String.valueOf(this.train_num));
            prestmt.setString(3, this.train_name);
            prestmt.setString(4, this.source_station);
            prestmt.setString(5, this.destination_station);
            prestmt.setString(6, this.passenger_name);
            prestmt.setString(7, String.valueOf(this.seat_no));
            prestmt.setString(8, String.valueOf(this.price));
            prestmt.setString(9, this.userid);
            prestmt.setString(10, "WAIT");
            prestmt.executeUpdate();
            dc.con.close();
            javax.swing.JOptionPane.showMessageDialog(null, "ticket is created");
            javax.swing.JOptionPane.showMessageDialog(null, this.train_name);
            
            
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
