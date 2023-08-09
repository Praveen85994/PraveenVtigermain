package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CRM.Vtiger.genericUtility.ExcelUtility;
import com.CRM.Vtiger.genericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazoniphone {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility du=new WebDriverUtility();
		du.maximize(driver);
		du.implicitwait(driver);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		List<WebElement> suggest=driver.findElements(By.xpath("//div[@class='two-pane-results-container']"));
		for(WebElement s:suggest) {
			String value=s.getText();
			if(value.equals("iphone 14"));{
				driver.findElement(By.xpath("//div[@aria-label='iphone 14']")).click();
				
			}
			String name=driver.findElement(By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//span[text()='Apple iPhone 14 (128 GB) - Blue']")).getText();
			ExcelUtility ex=new ExcelUtility();
			ex.updateExcelData("Sheet1", 3, 0, name);
			String iphonename=ex.getTheDataIntoExcel("Sheet1", 3, 0);
			System.out.println(iphonename);
			
		}
	}

}
