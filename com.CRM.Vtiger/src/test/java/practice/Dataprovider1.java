package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {
	@DataProvider
	public Object[][]data(){
		Object[][]data=new Object[3][3];
		data[0][0]="chocolate";
		data[0][1]="dairymilk";
		data[0][2]=1500;
		data[1][0]="vegetables";
		data[1][1]="broccali";
		data[1][2]=13;
		data[2][0]="fruits";
		data[2][1]="apple";
		data[2][2]=90;
		return data;
	}
	@Test(dataProvider="data")
	public void getdata(String choice,String name,int price ) {
		System.out.println(choice+" "+name+" "+price);
	}
	

}
