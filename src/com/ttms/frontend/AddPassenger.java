/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttms.frontend;

import com.ttms.backend.DatabaseConnection;
import com.ttms.backend.TicketInsert;
import com.ttms.backend.Validation;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author "Rushikesh Borakhede Class:-SEINFTA Batch:- 01 Roll No:- 01"
 */
public class AddPassenger extends javax.swing.JFrame {

    /**
     * Creates new form AddPassenger
     */
    public AddPassenger() {
        initComponents();
        pd = new PassengerDetails();
        pd.setBounds(0, y_axis, 860, 78);
        add_passenser_container.add(pd);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        login_label = new javax.swing.JLabel();
        train_num = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        add_passenger_btn = new javax.swing.JButton();
        book_ticket_btn = new javax.swing.JButton();
        confirm_psg_btn = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        add_passenser_container = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(7, 13, 45));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_add_48px.png"))); // NOI18N
        jLabel1.setText("Add Passenger");

        login_label.setBackground(new java.awt.Color(255, 255, 255));
        login_label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        login_label.setForeground(new java.awt.Color(255, 255, 255));
        login_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_user_32px_1.png"))); // NOI18N
        login_label.setText(" Login");

        train_num.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        train_num.setForeground(new java.awt.Color(255, 255, 255));
        train_num.setText("TrainNo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_label, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addGap(93, 93, 93)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171)
                .addComponent(train_num, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(login_label, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(train_num, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel5.setText("Aadhar No");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel6.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel7.setText("Mobile No");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(72, 72, 72)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21))
        );

        add_passenger_btn.setBackground(new java.awt.Color(254, 84, 48));
        add_passenger_btn.setText("Add Passenger");
        add_passenger_btn.setBorder(null);
        add_passenger_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_passenger_btnMouseClicked(evt);
            }
        });

        book_ticket_btn.setBackground(new java.awt.Color(254, 84, 48));
        book_ticket_btn.setText("Book Ticket");
        book_ticket_btn.setBorder(null);
        book_ticket_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book_ticket_btnMouseClicked(evt);
            }
        });

        confirm_psg_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        confirm_psg_btn.setForeground(new java.awt.Color(10, 128, 49));
        confirm_psg_btn.setText("I confirmed above information is correct");

        add_passenser_container.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout add_passenser_containerLayout = new javax.swing.GroupLayout(add_passenser_container);
        add_passenser_container.setLayout(add_passenser_containerLayout);
        add_passenser_containerLayout.setHorizontalGroup(
            add_passenser_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );
        add_passenser_containerLayout.setVerticalGroup(
            add_passenser_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(add_passenser_container);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(confirm_psg_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add_passenger_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(book_ticket_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_passenger_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book_ticket_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirm_psg_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_passenger_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_passenger_btnMouseClicked
        // TODO add your handling code here:
//        coding....
        DatabaseConnection db=new DatabaseConnection();
        String passeneger_query = "Insert Into passenger values(?,?,?,?,?,?,?)";
        String ticket_query = "Insert Into passenger values(?,?,?,?,?,?,?)";
        Validation validator = new Validation(); 
        if(validator.ageChecker(pd.getAge())){
            try {
                PreparedStatement passengerstmt = db.con.prepareStatement(passeneger_query);
                passengerstmt.setString(1,pd.getfirst_name());
                passengerstmt.setString(2,pd.getlast_name());
                passengerstmt.setString(3,pd.getAge());
                passengerstmt.setString(4,null);
                passengerstmt.setString(5,pd.getaadhar_number());
                passengerstmt.setString(6,pd.getGender());
                passengerstmt.setString(7,pd.getmobile_number());
                passengerstmt.executeUpdate();

                PreparedStatement ticketstmt = db.con.prepareStatement(ticket_query);

                db.con.close();
                TicketInsert ti = new TicketInsert(this.train_num.getText(),this.source_staion,this.destination_station,pd.getfirst_name()+pd.getlast_name(),this.user_id,this.quota);
                Passeneger_Flag = true;
            } catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(this, ex);
            }
            if(Passeneger_Flag){
                y_axis = y_axis+78;
                pd = new PassengerDetails();
                pd.setBounds(0, y_axis, 860, 78);
                if(y_axis>439)
                    add_passenser_container.setPreferredSize(new Dimension(890,y_axis));
                add_passenser_container.add(pd);
            }else{
                javax.swing.JOptionPane.showMessageDialog(this, "Passenger is not added");
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Age is not valid");
        }
             
    }//GEN-LAST:event_add_passenger_btnMouseClicked

    private void book_ticket_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_ticket_btnMouseClicked
        // TODO add your handling code here:
        ConfirmationPage cp = new ConfirmationPage();
        cp.setUser_id(this.user_id);
        cp.setVisible(true);
    }//GEN-LAST:event_book_ticket_btnMouseClicked
    
    public void setTrainNumber(String train_no){
        this.train_num.setText(train_no);
    }
    public void setUserId(String usr_id){
        this.user_id = usr_id;
    }
    public void setLogin(String user_id){
        this.login_label.setText(user_id);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPassenger().setVisible(true);
            }
        });
    }
    PassengerDetails pd;
    int y_axis=0;
    boolean Passeneger_Flag = false;
    private String source_staion,destination_station,quota,user_id;

    public void setSource_staion(String source_staion) {
        this.source_staion = source_staion;
    }

    public void setDestination_station(String destination_station) {
        this.destination_station = destination_station;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_passenger_btn;
    private javax.swing.JPanel add_passenser_container;
    private javax.swing.JButton book_ticket_btn;
    private javax.swing.JCheckBox confirm_psg_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel login_label;
    private javax.swing.JLabel train_num;
    // End of variables declaration//GEN-END:variables
}
