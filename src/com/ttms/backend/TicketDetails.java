
package com.ttms.backend;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author "Rushikesh Borakhede Class:-SEINFTA Batch:- 01 Roll No:- 01"
 */
public class TicketDetails {
    private int ticket_num,train_num,seat_no,price;
    private String train_name,source_station,destination_station,passenger_name;
    private String userid,status;
    
    public TicketDetails(String train_num,String source_station,String destination_station,String passenger_name,String user_id){
        this.train_num = new Integer(train_num);
        this.source_station = source_station;
        this.destination_station = destination_station;
        this.passenger_name = passenger_name;
        this.userid = user_id;
        
        DatabaseConnection dc = new DatabaseConnection();
        try{
            PreparedStatement prestmt = dc.con.prepareStatement("select * from traindata where TrainNo = ? and StationName = ? and DestinationStation = ?;");
            prestmt.setString(1, train_num);
            prestmt.setString(2, source_station);
            prestmt.setString(3, destination_station);
            ResultSet rs = prestmt.executeQuery();
            if(rs.next()){
                this.train_name = rs.getString("TrainName");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
