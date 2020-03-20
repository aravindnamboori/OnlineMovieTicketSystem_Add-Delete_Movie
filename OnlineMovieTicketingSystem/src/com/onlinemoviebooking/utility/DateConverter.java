package com.onlinemoviebooking.utility;
import java.sql.Date;
public class DateConverter 
{
    public static Date convertDate(String d)
    {
    	String[] s = d.split("-");
    	String temp="";
    	temp=temp+s[2]+"-"+s[1]+"-"+s[0];
    	
    	System.out.println(temp);
    	return Date.valueOf(temp);
    }
}
