package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon1 {
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop",Keys.ENTER); //shirt //laptops
		//List<WebElement> list=driver.findElements(By.xpath("//span[@aria-label=\"5.0 out of 5 stars\"]/ancestor::div[@class=\"a-section a-spacing-none a-spacing-top-micro\"]/preceding-sibling::div[@class=\"a-section a-spacing-none puis-padding-right-small s-title-instructions-style\"]"));
		List<WebElement> list=driver.findElements(By.xpath("//span[contains(@aria-label,\"5 stars\")]/ancestor::div[contains(@class,\"a-sect\")]/preceding-sibling::div[contains(@class,\"a-sect\")]"));
		for(WebElement w:list)
		{
			System.out.println("*****"+w.getText());
		}
	
	}

}


