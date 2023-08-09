package vtigertestScript;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.Vtiger.genericUtility.Baseclass;
import VtigerelementRepository.Actualorgname;
import VtigerelementRepository.CreateNewOrgpage;
import VtigerelementRepository.LoginPage;
import VtigerelementRepository.CreateorganPage;
import VtigerelementRepository.HomePage;
@Listeners(com.CRM.Vtiger.genericUtility.ListnerImplementation.class)
public class VerifyuserOrgTest extends Baseclass{
	@Test(groups="smoke",retryAnalyzer=com.CRM.Vtiger.genericUtility.RetryAnalyzer.class)
	
	public void createorgname() throws Throwable {
		//ExcelUtility eu=new ExcelUtility();
		//JavaUtility ju=new JavaUtility();
		LoginPage lp=new LoginPage(driver);
		HomePage vt=new HomePage(driver);
		CreateNewOrgpage ck=new CreateNewOrgpage(driver);
		CreateorganPage o=new CreateorganPage(driver);
		vt.clickorg();
		ck.plusicon();
		
		String actualname=eutil.getTheDataIntoExcel("Sheet1", 0, 0)+jutil.getRandom();
		o.enterorgname(actualname);
		o.clicksave();
		Actualorgname ac=new Actualorgname(driver);
		String Exporgname=ac.actualorgname();
	    Assert.assertTrue(Exporgname.contains(actualname));
		System.out.println("pass");
	}
	/*@Test(groups= {"smoke","regression"})
	public void regional() {
		System.out.println("regional");
	}*/

}
