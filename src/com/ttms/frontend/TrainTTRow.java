/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttms.frontend;

/**
 *
 * @author Esha
 */
public class TrainTTRow extends javax.swing.JPanel {

    /**
     * Creates new form TrainTT
     */
    public TrainTTRow() {
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

        train_name = new javax.swing.JLabel();
        source_station = new javax.swing.JLabel();
        destination_station = new javax.swing.JLabel();
        arrival_time = new javax.swing.JLabel();
        departure_time = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        train_name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 21)); // NOI18N
        train_name.setForeground(new java.awt.Color(27, 120, 138));
        train_name.setText("TrainName");
        add(train_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, 346, -1));

        source_station.setFont(new java.awt.Font("Segoe UI Semibold", 0, 21)); // NOI18N
        source_station.setForeground(new java.awt.Color(27, 120, 138));
        source_station.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        source_station.setText("SourceStation");
        add(source_station, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 23, -1, -1));

        destination_station.setFont(new java.awt.Font("Segoe UI Semibold", 0, 21)); // NOI18N
        destination_station.setForeground(new java.awt.Color(27, 120, 138));
        destination_station.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        destination_station.setText("DestinationStation");
        add(destination_station, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 23, -1, -1));

        arrival_time.setFont(new java.awt.Font("Segoe UI Semibold", 0, 21)); // NOI18N
        arrival_time.setForeground(new java.awt.Color(27, 120, 138));
        arrival_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrival_time.setText("ArrivalTime");
        add(arrival_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 23, -1, -1));

        departure_time.setFont(new java.awt.Font("Segoe UI Semibold", 0, 21)); // NOI18N
        departure_time.setForeground(new java.awt.Color(27, 120, 138));
        departure_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departure_time.setText("DepartureTime");
        add(departure_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 23, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 67, 966, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void setTrainName(String name){
        this.train_name.setText(name);
    }
    public void setSourceStation(String name){
        this.source_station.setText(name);
    }
    public void setDestinationStation(String name){
        this.destination_station.setText(name);
    }
    public void setArrivalTime(String name){
        this.arrival_time.setText(name);
    }
    public void setDepartureTime(String name){
        this.departure_time.setText(name);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrival_time;
    private javax.swing.JLabel departure_time;
    private javax.swing.JLabel destination_station;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel source_station;
    private javax.swing.JLabel train_name;
    // End of variables declaration//GEN-END:variables
}
