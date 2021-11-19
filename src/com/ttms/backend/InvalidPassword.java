/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttms.backend;

/**
 *
 * @author "Rushikesh Borakhede Class:-SEINFTA Batch:- 01 Roll No:- 01"
 */
public class InvalidPassword extends Exception{
    int n;
    InvalidPassword(int n){
        this.n=n;
    }
    public String alert(){
        switch(n){
            case 1:javax.swing.JOptionPane.showMessageDialog(null,"Password length should be atleast 8"); break;
            case 2:javax.swing.JOptionPane.showMessageDialog(null,"Password should contain atleast one digit"); break;
            case 3:javax.swing.JOptionPane.showMessageDialog(null,"Password should contain one special symbol"); break;
        }
        return("");
    }
}
