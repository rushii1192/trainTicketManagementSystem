/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttms.frontend;

import com.ttms.backend.DatabaseConnection;
import java.awt.event.MouseEvent;
import java.sql.*;
/**
 *
 * @author Esha
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form JFrame2
     */
    public Register() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        terms_condition = new java.awt.Checkbox();
        registerButton = new javax.swing.JButton();
        malegenderradiobtn = new javax.swing.JRadioButton();
        femalegenderradiobtn = new javax.swing.JRadioButton();
        othergenderradiobtn = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        first_name = new javax.swing.JTextField();
        last_name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        confirm_password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        aadhar_num = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(7, 13, 45));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(7, 13, 45));

        jLabel1.setBackground(new java.awt.Color(7, 13, 45));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREATE AN ACCOUNT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 456, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 78, 408, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please fill in this form to create an account!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 101, 293, 29));

        terms_condition.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        terms_condition.setForeground(new java.awt.Color(255, 255, 255));
        terms_condition.setLabel("   I accept the Terms of Use & Privacy Policy.");
        jPanel1.add(terms_condition, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 654, -1, 34));

        registerButton.setBackground(new java.awt.Color(6, 193, 255));
        registerButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        registerButton.setText("Register");
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
        });
        jPanel1.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 714, 172, 46));

        malegenderradiobtn.setBackground(new java.awt.Color(7, 13, 45));
        buttonGroup1.add(malegenderradiobtn);
        malegenderradiobtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        malegenderradiobtn.setForeground(new java.awt.Color(255, 255, 255));
        malegenderradiobtn.setText("Male");
        jPanel1.add(malegenderradiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 478, -1, -1));

        femalegenderradiobtn.setBackground(new java.awt.Color(7, 13, 45));
        buttonGroup1.add(femalegenderradiobtn);
        femalegenderradiobtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        femalegenderradiobtn.setForeground(new java.awt.Color(255, 255, 255));
        femalegenderradiobtn.setText("Female");
        femalegenderradiobtn.setActionCommand("");
        jPanel1.add(femalegenderradiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 478, -1, -1));

        othergenderradiobtn.setBackground(new java.awt.Color(7, 13, 45));
        buttonGroup1.add(othergenderradiobtn);
        othergenderradiobtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        othergenderradiobtn.setForeground(new java.awt.Color(255, 255, 255));
        othergenderradiobtn.setText("Others");
        jPanel1.add(othergenderradiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 478, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date of Birth:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 528, -1, -1));

        first_name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        first_name.setToolTipText("First name");
        jPanel1.add(first_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 162, 130, 45));

        last_name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        last_name.setToolTipText("Last name");
        last_name.setPreferredSize(new java.awt.Dimension(71, 26));
        jPanel1.add(last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 162, 139, 45));

        email.setToolTipText("Enter your email");
        email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 222, 290, 45));

        password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        password.setToolTipText("Enter your password");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 293, 290, 45));

        confirm_password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        confirm_password.setToolTipText("Confirm your password");
        jPanel1.add(confirm_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 356, 290, 45));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Personal Information");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 429, 257, 31));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 485, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Adhar Card No :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 571, -1, -1));

        aadhar_num.setToolTipText("Enter your Adhar Card No");
        jPanel1.add(aadhar_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 565, 177, -1));

        mobile.setToolTipText("Enter your number");
        jPanel1.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 614, 177, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mobile No :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 620, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_password_32px.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 356, -1, 45));

        jLabel10.setBackground(new java.awt.Color(254, 84, 48));
        jLabel10.setForeground(new java.awt.Color(254, 84, 48));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_mail_32px.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 222, -1, 53));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_password_32px.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 293, -1, 45));

        jLabel12.setBackground(new java.awt.Color(254, 84, 48));
        jLabel12.setForeground(new java.awt.Color(254, 84, 48));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ttms/frontend/Icons/icons8_user_24px_1.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 162, 32, 53));

        dob.setDateFormatString("yyyy-dd-MM");
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed
    
    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {  
        try{
            DatabaseConnection dc = new DatabaseConnection();
            String registerquery = "Insert Into userdata values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement registerprestmt = dc.con.prepareStatement(registerquery);
            
            registerprestmt.setString(1, first_name.getText()+mobile.getText().substring(0, 5));
            registerprestmt.setString(2, first_name.getText());
            registerprestmt.setString(3, last_name.getText());
            registerprestmt.setString(4, null);
            registerprestmt.setString(5, email.getText());
            registerprestmt.setString(6, new String(password.getPassword()));
            registerprestmt.setString(7, "User");
            registerprestmt.setString(8, null);
            if(malegenderradiobtn.isSelected())
                registerprestmt.setString(9, "Male");
            else if(femalegenderradiobtn.isSelected())
                registerprestmt.setString(9, "Female");
            else
                registerprestmt.setString(9, "Other");
            registerprestmt.setString(10, this.dob.getDate().toString());
            registerprestmt.setString(11, aadhar_num.getText());
            registerprestmt.setString(12, mobile.getText());
            
            registerprestmt.executeUpdate();
            
            String loginquery = "Insert Into userlogin values(?,?)";
            PreparedStatement loginprestmt = dc.con.prepareStatement(loginquery);
            loginprestmt.setString(1, first_name.getText()+mobile.getText().substring(0, 5));
            loginprestmt.setString(2, new String(password.getPassword()));
            loginprestmt.executeUpdate();
            dc.con.close();
            if(terms_condition.getState()){
                javax.swing.JOptionPane.showMessageDialog(this, "You have successfully registered.\nYour userid is "+first_name.getText()+mobile.getText().substring(0, 5)+"\nContinue to login.");
                new Login().setVisible(true);
                this.setVisible(false);
            }
            else {
                javax.swing.JOptionPane.showMessageDialog(this, "You have not clicked the accept terms and condition.");
            }
        } catch(Exception e){
            System.out.println(e);
        }
//        System.out.println(new Integer(mobile.getText()));
        System.out.println("Register button is clicked");
        
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhar_num;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField confirm_password;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton femalegenderradiobtn;
    private javax.swing.JTextField first_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField last_name;
    private javax.swing.JRadioButton malegenderradiobtn;
    private javax.swing.JTextField mobile;
    private javax.swing.JRadioButton othergenderradiobtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton registerButton;
    private java.awt.Checkbox terms_condition;
    // End of variables declaration//GEN-END:variables
}
