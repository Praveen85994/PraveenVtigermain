package VtigerelementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactpage {
	public CreateContactpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="lastname")
	private WebElement lastname;
	
	public WebElement getlastname() {
		return lastname;
	}
	@FindBy(css="[title='Save [Alt+S]']")
	private WebElement savebtn;
	
	public WebElement getsavebtn() {
		return savebtn;
	}
	public void enterlastname(String name) {
		getlastname().sendKeys(name);
		getsavebtn().click();
	}

}
