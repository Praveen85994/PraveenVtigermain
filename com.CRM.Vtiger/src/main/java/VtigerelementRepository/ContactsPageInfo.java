package VtigerelementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPageInfo { 
	public ContactsPageInfo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="dvHeaderText")
	private WebElement createdname;
	
	public WebElement getcreatedname() {
		return createdname;
	}
	public String createdname() {
		return getcreatedname().getText();
	}

}