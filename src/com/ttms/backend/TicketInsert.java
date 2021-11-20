
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
    
    public TicketInsert(String train_num,String source_station,String destination_station,String passenger_name,String user_id){
        this.train_num = new Integer(train_num);
        this.source_station = source_station;
        this.destination_station = destination_station;
        this.passenger_name = passenger_name;
        this.userid = user_id;
        
        try{
            dc = new DatabaseConnection();
            PreparedStatement prestmt = dc.con.prepareStatement("select * from traindata where TrainNo = ? and StationName = ? and DestinationStation = ?;");
            prestmt.setString(1, train_num);
            prestmt.setString(2, source_station);
            prestmt.setString(3, destination_station);
            ResultSet rs = prestmt.executeQuery();
            if(rs.next()){
                this.train_name = rs.getString("TrainName");
                this.distance = new Integer(rs.getString("DistanceFromSourceStation"));
                this.price = new Integer(rs.getString("Price"));
            }
            PreparedStatement ticketprestmt = dc.con.prepareStatement("select * from ticketdata");
        }catch(Exception e){
            System.out.println(e);
        }
        setIntoTicketData();
    }
    private void setIntoTicketData(){
        dc = new DatabaseConnection();
        try {
            PreparedStatement prestmt = dc.con.prepareStatement("INSERT INTO ticketdata VALUES (?,?,?,?,?,?,?,?,?,?);");
            
            prestmt.setString(1, String.valueOf(this.ticket_num));
            prestmt.setString(2, String.valueOf(this.train_num));
            prestmt.setString(3, this.train_name);
            prestmt.setString(4, this.source_station);
            prestmt.setString(5, this.destination_station);
            prestmt.setString(6, this.passenger_name);
            prestmt.setString(7, String.valueOf(this.seat_no));
            prestmt.setString(8, String.valueOf(this.price));
            prestmt.setString(9, this.userid);
            prestmt.setString(10, "WAIT");
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
