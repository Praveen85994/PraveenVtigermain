package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CRM.Vtiger.genericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon4 {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility web=new WebDriverUtility();
		web.implicitwait(driver);
		web.maximize(driver);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung s20");
		
		List<WebElement> listphns=driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		Thread.sleep(2000);
		for(WebElement phone:listphns) {
			String model=phone.getText();
			
			
			if(model.equals("samsung s20")) {
				Thread.sleep(2000);
				phone.click();
				break;
				
				
			}
		}}}/*
//Thread.sleep(1000);
//*List<WebElement> phone=driver.findElements(By.xpath("//div[@class='two-pane-results-container']"));
List<WebElement> phone=driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));

for(WebElement ph:phone)
{
	String model=ph.getText();
	//System.out.println(model);
	if(model.equals("samsung s20"))
			{
		ph.click();
		
		break;
		
			}
}

}Thread.sleep(1000);
//List<WebElement> phone=driver.findElements(By.xpath("//div[@class='two-pane-results-container']"));
List<WebElement> phone=driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));

for(WebElement ph:phone)
{
	String model=ph.getText();
	//System.out.println(model);
	if(model.equals("samsung s20"))
			{
		ph.click();
		
		break;
		
			}
}

}*/
		
		
	   // driver.findElement(By.xpath("//div[@aria-label='samsung s20']")).click();
	


////div[@aria-label='samsung s20']