package practice;

import org.testng.annotations.DataProvider;

public class DataPro1 {
	@DataProvider
	public Object[][]data(){
		Object[][]data=new Object[3][3];
		data[0][0]="samsung";
		data[0][1]=12000;
		data[0][2]="5star";
		data[1][0]="nokia";
		data[1][1]=15000;
		data[1][2]="4star";
		data[2][0]="iphone";
		data[2][1]=13000;
		data[2][2]="5star";
		return data;
		
	}

}
