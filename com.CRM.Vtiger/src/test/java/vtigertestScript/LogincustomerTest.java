package vtigertestScript;

import org.testng.annotations.Test;

import com.CRM.Vtiger.genericUtility.Baseclass;
import com.CRM.Vtiger.genericUtility.FileUtility;

import VtigerelementRepository.LoginPage;

public class LogincustomerTest extends Baseclass  {
	@Test
	public void vtiger() throws Throwable {
	
		LoginPage lp=new LoginPage(driver);
		FileUtility fuil=new FileUtility();
		lp.login(fuil.getDataFromProperty("UN"), fuil.getDataFromProperty("PWD"));
		
		
	}
	

}
