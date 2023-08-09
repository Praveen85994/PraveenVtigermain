package com.crm.vtiger.contact.Test;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.Vtiger.genericUtility.Baseclass;
import com.CRM.Vtiger.genericUtility.FileUtility;

import VtigerelementRepository.ContactClick;
import VtigerelementRepository.ContactPage;
import VtigerelementRepository.ContactsPageInfo;
import VtigerelementRepository.CreateContactpage;
import VtigerelementRepository.HomePage;
import VtigerelementRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.CRM.Vtiger.genericUtility.ListnerImplementation.class)
public class VerifyusercreatecontactsTest extends Baseclass {

		/*Random r=new Random();
		int random=r.nextInt(1000);
		FileUtility utile=new FileUtility();
		String Url=utile.getDataFromProperty("url");
		//String 
		String ActualconName="tyssss"+random;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/");
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[contains(@alt,'Create ')]")).click();
		driver.findElement(By.name("lastname")).sendKeys(ActualconName);
		driver.findElement(By.cssSelector("[title='Save [Alt+S]']")).click();
		String Expectcontactname=driver.findElement(By.className("dvHeaderText")).getText();
		Assert.assertTrue(Expectcontactname.contains(ActualconName));
		System.out.println("pass");
		
		WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		
	}*/
	
		@Test
		public void createcontact() throws Throwable {
	//LoginPage lp=new LoginPage(driver);
    ContactClick ck=new ContactClick(driver);
    ck.clickcontact();
    ContactPage cp=new ContactPage(driver);
    cp.contact();
    CreateContactpage cc=new CreateContactpage(driver);
    String actualname=eutil.getTheDataIntoExcel("Sheet1", 0, 0)+jutil.getRandom();
    cc.enterlastname(actualname);
    ContactsPageInfo co=new ContactsPageInfo(driver);
    String Expname=co.createdname();
    Assert.assertTrue(Expname.contains(actualname));
    System.out.println("pass");
    

}}
