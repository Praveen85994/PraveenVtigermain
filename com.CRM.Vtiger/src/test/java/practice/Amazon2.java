package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CRM.Vtiger.genericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility w=new WebDriverUtility();
		w.implicitwait(driver);
		w.maximize(driver);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop",Keys.ENTER);
		List<WebElement>allList=driver.findElements(By.xpath("//span[@aria-label='5.0 out of 5 stars']/ancestor::div[@class='a-section a-spacing-none a-spacing-top-micro']/preceding-sibling::div[contains(@class,'a-section a-spacing-none a-spacing-top-small s-title-instructions-style')]"));
	    for(WebElement List:allList) {
	    	System.out.println(List.getText());
	    }
	}

}
