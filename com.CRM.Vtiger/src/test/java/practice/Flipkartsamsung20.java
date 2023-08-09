package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CRM.Vtiger.genericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkartsamsung20 {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility web=new WebDriverUtility();
		web.implicitwait(driver);
		web.maximize(driver);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("samsungs20");
		List<WebElement >options=driver.findElements(By.xpath("//ul[contains(@class,'UFBk')]/li"));
		for(WebElement op:options) {
			String model=op.getText();
		if(model.equals("samsungs20")) {
			System.out.println(model);
			Thread.sleep(2000);
			op.click();
			break;
		}
	}

}}
