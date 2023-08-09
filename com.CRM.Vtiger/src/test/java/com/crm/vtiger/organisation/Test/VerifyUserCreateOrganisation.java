package com.crm.vtiger.organisation.Test;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.CRM.Vtiger.genericUtility.ExcelUtility;
import com.CRM.Vtiger.genericUtility.FileUtility;

public class VerifyUserCreateOrganisation {
	public static void main(String[] args) throws Throwable {
		Random r=new Random();
		int random=r.nextInt(1000);
		///for getting data from excel file
		ExcelUtility euti=new ExcelUtility();
		String orgname=euti.getTheDataIntoExcel("Sheet1", 0, 0);
		String ActualOrgName=orgname+random;
		
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//for getting data from properties file
		
		FileUtility futil=new FileUtility();
		String URL=futil.getDataFromProperty("url");
		String Browser=futil.getDataFromProperty("browser");
		String UN=futil.getDataFromProperty("username");
		String PWD=futil.getDataFromProperty("password");
		
		driver.get(URL);
		driver.findElement(By.cssSelector("[type='text']")).sendKeys(UN);
		driver.findElement(By.cssSelector("[type='password']")).sendKeys(PWD);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[contains(@title,'Cr')]")).click();
		driver.findElement(By.name("accountname")).sendKeys(ActualOrgName);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		String ExpectedOrgName=driver.findElement(By.className("dvHeaderText")).getText();
		//for validate assert 
		Assert.assertTrue(ExpectedOrgName.contains(ActualOrgName));
		System.out.println("pass");
		
		WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act=new Actions(driver);//for mouse action
		act.moveToElement(ele).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		String Expectcontact=driver.findElement(By.className("dvHeaderText")).getText();
		
		////img[@src='themes/softed/images/user.PNG']
		
	}

}
