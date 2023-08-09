package VtigerelementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateorganPage {
	public CreateorganPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@class='detailedViewTextBox'])[1]")
	private WebElement createorgname;
	
	public WebElement getcreateorgname() {
		return createorgname;
	}
	@FindBy(css="input[title='Save [Alt+S]']")
	private WebElement save;
	
	public WebElement getsave() {
		return save;
	}
	
	
	public void enterorgname(String name) {
		getcreateorgname().sendKeys(name);
	}
		 
	
	public void clicksave() {
		getsave().click();
	}

}
