
package com.ttms.backend;

import java.util.regex.Pattern;

/**
 *
 * @author "Rushikesh Borakhede Class:-SEINFTA Batch:- 01 Roll No:- 01"
 */
class InvalidPassword extends Exception{
    int n;
    InvalidPassword(int n){
        this.n=n;
    }
    String alert(){
        switch(n){
            case 1:javax.swing.JOptionPane.showMessageDialog(null,"Password length should be atleast 8"); break;
            case 2:javax.swing.JOptionPane.showMessageDialog(null,"Password should contain atleast one digit"); break;
            case 3:javax.swing.JOptionPane.showMessageDialog(null,"Password should contain one special symbol"); break;
        }
        return("");
    }
}

public class Validation {
    public void validity(String p) throws InvalidPassword{
		if (p.length()<8) {
		throw new InvalidPassword(1);
		}
		if(true) {
			int flag=0;
			for (int i=0;i<=9;i++) {
                            String d=Integer.toString(i);
				if(p.contains(d)) {
                                    flag=1;
				}
			}
			if(flag==0) {
				throw new InvalidPassword(2);
			}
		}
		Pattern check=Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE);
		
		if(!check.matcher(p).find()) {
			throw new InvalidPassword(3);
		}
    }
    public boolean passwordChecker(String one,String two){
        if(one.equals(two))
            return true;
        return false;
    }
    public boolean nullChecker(String str){
        if(str.equals(""))
            return true;
        return false;
    }
}
