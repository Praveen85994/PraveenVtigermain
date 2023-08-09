package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.CRM.Vtiger.genericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) {
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		WebDriverUtility u=new WebDriverUtility();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile",Keys.ENTER);
		List<WebElement> star=driver.findElements(By.xpath("//span[@aria-label='5.0 out of 5 stars']/ancestor::div[@class='a-section a-spacing-none a-spacing-top-micro']/preceding-sibling::div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']"));
		for(WebElement allList:star) {
			System.out.println(allList.getText());
		}
	}

}
//span[@aria-label='5.0 out of 5 stars']/ancestor::div[@class='a-section a-spacing-none a-spacing-top-micro']/preceding-sibling::div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']