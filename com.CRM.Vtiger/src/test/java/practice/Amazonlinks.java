package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CRM.Vtiger.genericUtility.ExcelUtility;
import com.CRM.Vtiger.genericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonlinks {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility web=new WebDriverUtility();
		web.implicitwait(driver);
		web.maximize(driver);
		driver.get("https://www.amazon.in");
		//all the anchor tags
		List<WebElement> list=driver.findElements(By.xpath("//a"));
		
		List<String> all=new ArrayList<String>();
		for(int i=0;i<list.size();i++) {
			String links = list.get(i).getAttribute("href");
			
		
		ExcelUtility ex=new ExcelUtility();
		ex.updateExcelData("Sheet1", i, i, links);
		ex.getTheDataIntoExcel(links, i, i);
	}

}}
