package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_practice {
	@DataProvider
	public Object[][] data(){
		Object[][]data=new Object[3][2];
		data[0][0]="samsung";
		data[0][1]=10000;
		data[1][0]="nokia";
		data[1][1]=20000;
		data[2][0]="redmi";
		data[2][1]=2000;
		return data;
		
	}
	
	@Test(dataProvider="data")
	public void getdata(String phone,int price)
	{System.out.println(phone+" "+price);

}
}