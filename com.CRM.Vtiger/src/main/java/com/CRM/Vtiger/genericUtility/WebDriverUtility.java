package com.CRM.Vtiger.genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtility {
	/**
	 *This method will maximize the window
	 * @param driver
	 */
 public void maximize(WebDriver driver)
 {
	 driver.manage().window().maximize();
 }
 /**
  * 
  * @param driver
  */
 public void minimize(WebDriver driver)
 {
	 driver.manage().window().minimize();
 }
 public void implicitwait(WebDriver driver)
 {
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 }
 
 public void elementTobBeClickable(WebDriver driver,WebElement element)
 {
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Ipathconstant.ExplicitwaitDuration));
	 wait.until(ExpectedConditions.elementToBeClickable(element)); 
 }
 public void alertPresent(WebDriver driver)
 {
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Ipathconstant.ExplicitwaitDuration));
	 wait.until(ExpectedConditions.alertIsPresent());
 }
 
 public void titleContains(WebDriver driver,String title)
 {
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Ipathconstant.ExplicitwaitDuration));
	 wait.until(ExpectedConditions.titleContains(title));
 }
 public void selectDropdown(WebElement element,int index)
 {
	 Select s=new Select(element);
	 s.selectByIndex(index);
 }
 public void selectDropdown(WebElement element,String value)
 {
	 Select s=new Select(element);
	 s.selectByValue(value);
 }
 public void selectDrropdown(String text,WebElement element)
 {
	 Select s=new Select(element);
	 s.selectByVisibleText(text);
 }
 public void mouseHover(WebDriver driver,WebElement element)
 {
	 Actions act=new Actions(driver);
	 act.moveToElement(element).perform();
 }
 public void rightclick(WebDriver driver,WebElement element)
 {
	 Actions act=new Actions(driver);
	 act.contextClick(element).perform();
 }
 public void doubleclick(WebDriver driver,WebElement element)
 {
	 Actions act=new Actions(driver);
	 act.doubleClick(element).perform();
 }
 public void scrollThePageToElement(WebDriver driver,WebElement element)
 {
	 JavascriptExecutor jse=(JavascriptExecutor)driver;
	 element=driver.findElement(null);
	 int y=element.getLocation().getY();
	 jse.executeScript("window.scrollBy(0,"+y+")");

}
 /**
  * this method will help to get the frame
  * @param driver
  * @param index
  */
 public void frame(WebDriver driver,int index) {
	 driver.switchTo().frame(index);
 }
	public void frame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}

	public void frame(WebDriver driver,String nameorid) {
		driver.switchTo().frame(nameorid);
	}
	public void parentframe(WebDriver driver) {
		driver.switchTo().defaultContent();
		
	}
	/**
	 * by using this method we can handle alert popup
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public String getTextfromAlert(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}
	public String screenShot(WebDriver driver,String screenshotname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		LocalDateTime local=LocalDateTime.now();
		String dt=local.toString().replace("-", "_").replace(":","_");
		File dest=new File("./Screenshot/"+screenshotname+dt+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath();//Extent report
	}
}
