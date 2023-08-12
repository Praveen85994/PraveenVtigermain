package com.CRM.Vtiger.genericUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import VtigerelementRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public ExcelUtility eutil=new ExcelUtility();
	public FileUtility futil=new FileUtility();
	public JavaUtility jutil=new JavaUtility();
	public WebDriverUtility wutil=new WebDriverUtility();
	public WebDriver driver;//both driver same
	public static WebDriver sdriver;//both driver are same we give for listener particularly
	
	@BeforeSuite(groups= {"smoke","regression"})
	public void bsconfig() {
		System.out.println("data base connection");
	}
	@BeforeClass(groups= {"smoke","regression"})///open browser
	public void bcConfig() throws Throwable{
		String BROWSER=futil.getDataFromProperty("browser");
	//for run in cmd	//String BROWSER=System.getProperty("browser");//for run in runtime cmd
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			// String URL=futil.getDataFromProperty("url");
				driver.get(URL);
			System.out.println(BROWSER+"launched");}
	
		else if(BROWSER.equalsIgnoreCase("Edgebrowser")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			System.out.println(BROWSER+"launched");
		}
		else
		{
			System.out.println("invalid browser");
		}
			sdriver=driver;//listener driver
			wutil.maximize(driver);
		
		
	
		
	}@BeforeMethod(groups= {"smoke","regression"})
	public void login() throws Throwable {
		String UN=futil.getDataFromProperty("username");
		String PWD=futil.getDataFromProperty("password");
		LoginPage lp=new LoginPage(driver);
		lp.login(UN, PWD);
		System.out.println("login to the app");
	}
	@AfterMethod(groups= {"smoke","regression"})
	public void logout() {
		WebElement img=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wutil.mouseHover(driver, img);
		driver.findElement(By.linkText("Sign Out")).click();
	}
	//@AfterClass(groups= {"smoke","regression"})
	public void closebrowser() {
		driver.quit();
	}
	@AfterSuite(groups= {"smoke","regression"})
	public void bsconfig1() {
		System.out.println("database disconnected");
	}}
	


