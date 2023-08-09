package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

import com.CRM.Vtiger.genericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility web=new WebDriverUtility();
		web.implicitwait(driver);
		web.maximize(driver);
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		driver.findElement(By.cssSelector("[aria-label='Open Menu']")).click();
		WebElement scroll=driver.findElement(By.className(".hmenu.hmenu-visible"));
		ScrollOrigin sc=ScrollOrigin.fromElement(scroll);
		act.scrollFromOrigin(sc, 0, 400).perform();
		
		
		
	}

}
