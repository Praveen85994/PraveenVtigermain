package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CRM.Vtiger.genericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonOlympics {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility web=new WebDriverUtility();
		web.implicitwait(driver);
		web.maximize(driver);
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		List<WebElement> el=driver.findElements(By.xpath("(//span[@class='styles__CountryName-sc-fehzzg-6 jYXabZ'])[position()<4]"));
		List<WebElement> gold=driver.findElements(By.xpath("(//div[@title='Gold'])[position()<4]"));
		List<WebElement> silver=driver.findElements(By.xpath("(//div[@title='Silver'])[position()<4]"));
		List<WebElement>bronze=driver.findElements(By.xpath("(//div[@title='Bronze'])[position()<4]"));
		for(int i=0;i<el.size();i++) {
			String name=el.get(i).getText();
			
			System.out.println(name);
			String golds=gold.get(i).getText();
			System.out.println("Golds"+golds);
			String s=silver.get(i).getText();
			System.out.println("silver"+s);
			String b=bronze.get(i).getText();
			System.out.println("bronze"+b);
			
			
			
		}
		
		
	}

}
