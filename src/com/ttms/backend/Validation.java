
package com.ttms.backend;

import java.util.regex.Pattern;

/**
 *
 * @author "Rushikesh Borakhede Class:-SEINFTA Batch:- 01 Roll No:- 01"
 */

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
    public boolean ageChecker(String str){
        int n = new Integer(str);
        if((n<=0) || (n>=100))
            return false;
        return true;
    }
}
