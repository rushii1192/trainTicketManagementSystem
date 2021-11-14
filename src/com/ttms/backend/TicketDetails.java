
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
    
    public TicketDetails(){
        DatabaseConnection dc = new DatabaseConnection();
        String train_data_query = "select * from traindata where Train no = "+this.train_num;
        try {
            PreparedStatement train_data = dc.con.prepareStatement(train_data_query);
            ResultSet rs = train_data.executeQuery();
            if(rs.next()){
                this.train_name = rs.getString("TrainName");
                
            }
        } catch (Exception e) {
        }
    }
    
    public int getTicket_num() {
        return ticket_num;
    }

    public void setTicket_num(int ticket_num) {
        this.ticket_num = ticket_num;
    }

    public int getTrain_num() {
        return train_num;
    }

    public void setTrain_num(int train_num) {
        this.train_num = train_num;
    }

    public int getSeat_no() {
        return seat_no;
    }

    public void setSeat_no(int seat_no) {
        this.seat_no = seat_no;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String train_name) {
        this.train_name = train_name;
    }

    public String getSource_station() {
        return source_station;
    }

    public void setSource_station(String source_station) {
        this.source_station = source_station;
    }

    public String getDestination_station() {
        return destination_station;
    }

    public void setDestination_station(String destination_station) {
        this.destination_station = destination_station;
    }

    public String getPassenger_name() {
        return passenger_name;
    }

    public void setPassenger_name(String passenger_name) {
        this.passenger_name = passenger_name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
