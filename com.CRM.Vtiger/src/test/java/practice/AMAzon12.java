package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AMAzon12 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER); 
		WebElement list=driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB) - White']/ancestor::div[@class='a-section']/descendant::div[span[text()='41,990']"));
		////span[text()='Apple iPhone 11 (64GB) - White']/ancestor::div[@class='sg-col-inner']/descendant::span[text()='41,990']

		System.out.println(list.getText());
}}
