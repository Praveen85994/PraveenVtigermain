package practice;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CRM.Vtiger.genericUtility.ExcelUtility;
import com.CRM.Vtiger.genericUtility.Ipathconstant;
import com.CRM.Vtiger.genericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon3 {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		WebDriverUtility web=new WebDriverUtility();
		web.implicitwait(driver);
		web.maximize(driver);
		ExcelUtility ex=new ExcelUtility();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.xpath("//div[@aria-label='iphone 14']")).click();
		String name=driver.findElement(By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//span[text()='Apple iPhone 14 (128 GB) - Blue']")).getText();
		
		ex.updateExcelData("Sheet1", 1, 0,name);
		String value=ex.getTheDataIntoExcel("Sheet1", 1, 0);
		System.out.println(value);
		
		
		
		
		
		
		
		
	}

}
