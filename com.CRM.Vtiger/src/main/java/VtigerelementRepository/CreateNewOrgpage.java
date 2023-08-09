package VtigerelementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgpage {
	public CreateNewOrgpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="img[title='Create Organization...']")
	private WebElement clickcr;
	
	public WebElement getclickcr() {
		return clickcr;
	}
	public void plusicon() {
		getclickcr().click();
	}

}
