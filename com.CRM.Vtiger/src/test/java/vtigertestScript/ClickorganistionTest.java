package vtigertestScript;

import org.testng.annotations.Test;

import com.CRM.Vtiger.genericUtility.Baseclass;

import VtigerelementRepository.HomePage;


public class ClickorganistionTest extends Baseclass{
	@Test
	public void click() {
	HomePage t=new HomePage(driver);
	t.clickorg();

}}
