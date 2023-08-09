package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CRM.Vtiger.genericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility web=new WebDriverUtility();
		web.implicitwait(driver);
		web.maximize(driver);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[text()='YouTube']")).click();
		driver.findElement(By.xpath("(//yt-formatted-string[@id='video-title'])[2]")).click();
	}

}////span[text()='YouTube']
