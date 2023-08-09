package VtigerelementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actualorgname {
	public Actualorgname(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="dvHeaderText")
	private WebElement actualname;
	
	public WebElement getactualname() {
		return actualname;
	}
	public String actualorgname() {
		return getactualname().getText();
		
		
		
		
		
	}

}
//span[class=dvHeaderText]