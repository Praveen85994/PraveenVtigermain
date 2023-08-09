package practice;

import org.testng.annotations.Test;

public class Fetchdata_dp1 {
	@Test(dataProviderClass=DataPro1.class,dataProvider="data")
		public void getnames(String phone,int price,String rating) {
			System.out.println(phone+" "+price+""+rating);
		}
		
	}

//we use extends also Fetchdata_dp1 extends DataPro1
