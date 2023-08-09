package VtigerelementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText="Organizations")
		private WebElement createorg;
	

    public WebElement getcreateorg() {
    	return createorg;

}
    public void clickorg() {
    	getcreateorg().click();
    }}
