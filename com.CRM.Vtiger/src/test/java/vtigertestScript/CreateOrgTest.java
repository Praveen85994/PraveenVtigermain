package vtigertestScript;

import org.testng.annotations.Test;

import com.CRM.Vtiger.genericUtility.Baseclass;

import VtigerelementRepository.CreateNewOrgpage;
import VtigerelementRepository.LoginPage;
import VtigerelementRepository.HomePage;


public class CreateOrgTest extends Baseclass{
	@Test

	public void clickplus() {
	LoginPage lp=new LoginPage(driver);
	CreateNewOrgpage cr=new CreateNewOrgpage(driver);
	HomePage vt=new HomePage(driver);
	
	vt.getcreateorg();
	vt.clickorg();
	cr.getclickcr();
	cr.plusicon();
	
	

}}
