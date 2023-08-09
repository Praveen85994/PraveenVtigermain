package vtigertestScript;

import org.testng.annotations.Test;

import com.CRM.Vtiger.genericUtility.Baseclass;
import com.CRM.Vtiger.genericUtility.ExcelUtility;
import com.CRM.Vtiger.genericUtility.JavaUtility;

import VtigerelementRepository.CreateNewOrgpage;
import VtigerelementRepository.LoginPage;
import VtigerelementRepository.CreateorganPage;
import VtigerelementRepository.HomePage;

public class OrganisationpageTest extends Baseclass{
	@Test
	
	public void addEnter() throws Throwable {
		ExcelUtility eu=new ExcelUtility();
		JavaUtility ju=new JavaUtility();
		LoginPage lp=new LoginPage(driver);
		HomePage vt=new HomePage(driver);
		CreateNewOrgpage ck=new CreateNewOrgpage(driver);
		CreateorganPage o=new CreateorganPage(driver);
		vt.clickorg();
		ck.plusicon();
		String Actualorgname=eu.getTheDataIntoExcel("Sheet1", 0, 0)+ju.getRandom();
		
		
		
		
		
	}

}
