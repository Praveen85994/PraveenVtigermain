package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("password",Keys.ENTER);
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.cssSelector("[title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("yyuuuei");
	}

}
