/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttms.frontend;

import com.ttms.backend.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Esha
 */
public class AdminTrainDetails extends javax.swing.JPanel {

    /**
     * Creates new form TrainDet1
     */
    public AdminTrainDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        train_no = new javax.swing.JTextField();
        train_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        source_station_name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        arrival_time = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        departure_time = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        distance_travelled = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        search_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        remove_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        train_date = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        station_name = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(854, 600));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(84, 110, 229));
        jLabel1.setText("Train Details");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel2.setText("Train Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel4.setText("Train No");

        train_no.setFont(new java.awt.Font("Segoe UI Semibold", 0, 23)); // NOI18N
        train_no.setForeground(new java.awt.Color(254, 84, 48));
        train_no.setToolTipText("Enter train no");

        train_name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 23)); // NOI18N
        train_name.setForeground(new java.awt.Color(254, 84, 48));
        train_name.setToolTipText("Enter train name");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 23)); // NOI18N
        jLabel3.setText("Other Details");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_calendar_plus_24px.png"))); // NOI18N
        jLabel6.setText("Date");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_next_location_24px.png"))); // NOI18N
        jLabel8.setText("Station Name");

        source_station_name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        source_station_name.setToolTipText("Source Station");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_time_24px.png"))); // NOI18N
        jLabel10.setText("Arrival Time");

        arrival_time.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        arrival_time.setToolTipText("Enter arrival time");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_time_24px.png"))); // NOI18N
        jLabel12.setText("Departure Time");

        departure_time.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        departure_time.setToolTipText("Enter departure time");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_map_pinpoint_24px.png"))); // NOI18N
        jLabel5.setText("Distance From Source Station");

        distance_travelled.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        distance_travelled.setToolTipText("Enter departure time");

        search_btn.setBackground(new java.awt.Color(254, 84, 48));
        search_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_search_24px.png"))); // NOI18N
        search_btn.setText("Search");
        search_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        search_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_btnMouseClicked(evt);
            }
        });

        add_btn.setBackground(new java.awt.Color(254, 84, 48));
        add_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_add_24px.png"))); // NOI18N
        add_btn.setText("Add");
        add_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_btnMouseClicked(evt);
            }
        });

        remove_btn.setBackground(new java.awt.Color(254, 84, 48));
        remove_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        remove_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_minus_24px.png"))); // NOI18N
        remove_btn.setText("Remove");
        remove_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remove_btnMouseClicked(evt);
            }
        });

        update_btn.setBackground(new java.awt.Color(254, 84, 48));
        update_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        update_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_update_24px.png"))); // NOI18N
        update_btn.setText(" Update");

        train_date.setDateFormatString("dd-MM-yyyy");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_next_location_24px.png"))); // NOI18N
        jLabel9.setText("Source Station Name");

        station_name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        station_name.setToolTipText("Enter Station Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departure_time, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(train_date, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20))
                                    .addComponent(arrival_time, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(station_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addComponent(remove_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(distance_travelled, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(source_station_name, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(train_name, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(train_no, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(train_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(train_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12))
                    .addComponent(train_date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(source_station_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(station_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(arrival_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(departure_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(distance_travelled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_btn)
                            .addComponent(add_btn)
                            .addComponent(remove_btn)
                            .addComponent(update_btn)))
                    .addComponent(jLabel10))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void add_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseClicked
        // TODO add your handling code here:
        dc = new DatabaseConnection();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String registerquery = "Insert Into traindata values(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement addprestmt = dc.con.prepareStatement(registerquery);
            addprestmt.setString(1, train_no.getText());
            addprestmt.setString(2, train_name.getText());
            addprestmt.setString(3, station_name.getText());
            addprestmt.setString(4, distance_travelled.getText());
            addprestmt.setString(5, null);
            addprestmt.setString(6, arrival_time.getText());
            addprestmt.setString(7, departure_time.getText());
            addprestmt.setString(8, df.format(train_date.getDate()));
            addprestmt.setString(9, source_station_name.getText());
            
            addprestmt.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Train is successfull added");
            dc.con.close();
        }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(this, e);}
            
    }//GEN-LAST:event_add_btnMouseClicked

    private void remove_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove_btnMouseClicked
        // TODO add your handling code here:
        dc = new DatabaseConnection();
        String delete_query = "delete from traindata where TrainNo = '"+train_no.getText()+"'";
        try{
            dc.stmt.execute(delete_query);
            dc.con.close();
            javax.swing.JOptionPane.showMessageDialog(this, "Train is successfully deleted.");
        }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(this, e);}
    }//GEN-LAST:event_remove_btnMouseClicked

    private void search_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseClicked
        // TODO add your handling code here:
        dc = new DatabaseConnection();
        String search_query = "select * from traindata where TrainNo =?";
        try{
            PreparedStatement prestmt = dc.con.prepareStatement(search_query);
            prestmt.setString(1, train_no.getText());
            ResultSet rs = prestmt.executeQuery();
            if(rs.next()){
                train_name.setText(rs.getString("TrainName"));
                arrival_time.setText(rs.getString("ArrivalTime"));
                departure_time.setText(rs.getString("DepartureTime"));
                distance_travelled.setText(rs.getString("DistanceFromSourceStation"));
                java.util.Date date = new SimpleDateFormat("dd-MM-yyyy").parse(rs.getString("Date"));
                station_name.setText(rs.getString("StationName"));
                source_station_name.setText(rs.getString("SourceStationName"));
                train_date.setDate(date);
            }else{
                javax.swing.JOptionPane.showMessageDialog(this, "Train is not found");
            }
            dc.con.close();
        }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(this, e);}
    }//GEN-LAST:event_search_btnMouseClicked

    DatabaseConnection dc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField arrival_time;
    private javax.swing.JTextField departure_time;
    private javax.swing.JTextField distance_travelled;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton remove_btn;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField source_station_name;
    private javax.swing.JTextField station_name;
    private com.toedter.calendar.JDateChooser train_date;
    private javax.swing.JTextField train_name;
    private javax.swing.JTextField train_no;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
