package com.CRM.Vtiger.genericUtility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/*this method will help create random number*/
	
	public int getRandom(){
		Random r=new Random();
		int random=r.nextInt(1000);
		return random;
	}
	
	public String Currentdate() {
		Date d=new Date();
		String dat=d.toString();
		System.out.println(dat);
		return dat;
	}
	public String systemDate() {
		Date d=new Date();
		String[] dt=d.toString().split(" ");
		
		String month=dt[1];
		String day=dt[0];
		String date=dt[2];
		String year=dt[5];
		String currentdt=day+" " +month+" " + date+" "+year;
		System.out.println(currentdt);
		return currentdt;
		
	}

}
