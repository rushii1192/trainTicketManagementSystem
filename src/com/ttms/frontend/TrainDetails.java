/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttms.frontend;

/**
 *
 * @author CORE COMP
 */
public class TrainDetails extends javax.swing.JPanel {

    /**
     * Creates new form TrainDetails
     */
    public TrainDetails() {
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

        train_details = new javax.swing.JLabel();
        arrival_time = new javax.swing.JTextField();
        departure_time = new javax.swing.JTextField();
        booknow = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        duration = new javax.swing.JTextField();
        sourceStation = new javax.swing.JTextField();
        arrival_date = new javax.swing.JTextField();
        destinationStation = new javax.swing.JTextField();
        departure_date = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        train_details.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        train_details.setText("Train Name (Train No)");

        arrival_time.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        arrival_time.setText("Arrival Time");
        arrival_time.setBorder(null);

        departure_time.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        departure_time.setText("Departure");
        departure_time.setBorder(null);

        booknow.setBackground(new java.awt.Color(254, 84, 48));
        booknow.setText("Book Now");
        booknow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booknowMouseClicked(evt);
            }
        });

        duration.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        duration.setText("Duration");
        duration.setBorder(null);

        sourceStation.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        sourceStation.setForeground(new java.awt.Color(102, 102, 102));
        sourceStation.setText("From");
        sourceStation.setBorder(null);

        arrival_date.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        arrival_date.setForeground(new java.awt.Color(102, 102, 102));
        arrival_date.setText("Date");
        arrival_date.setBorder(null);

        destinationStation.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        destinationStation.setForeground(new java.awt.Color(102, 102, 102));
        destinationStation.setText("To");
        destinationStation.setBorder(null);

        departure_date.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        departure_date.setForeground(new java.awt.Color(102, 102, 102));
        departure_date.setText("Date");
        departure_date.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(sourceStation, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(arrival_date, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(arrival_time, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(destinationStation, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departure_time, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(departure_date, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(booknow, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(train_details, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(train_details)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(departure_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(departure_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(booknow, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(destinationStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(arrival_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(arrival_time, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addComponent(sourceStation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void booknowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booknowMouseClicked
        // TODO add your handling code here:
        System.out.println("Train details:-"+this.train_details.getText());
    }//GEN-LAST:event_booknowMouseClicked

    public void setSourceStation(String sourceStation){this.sourceStation.setText(sourceStation);}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrival_date;
    private javax.swing.JTextField arrival_time;
    private javax.swing.JButton booknow;
    private javax.swing.JTextField departure_date;
    private javax.swing.JTextField departure_time;
    private javax.swing.JTextField destinationStation;
    private javax.swing.JTextField duration;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField sourceStation;
    private javax.swing.JLabel train_details;
    // End of variables declaration//GEN-END:variables
}
