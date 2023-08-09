package VtigerelementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactClick {
	public ContactClick(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText="Contacts")
	private WebElement contacts;

public WebElement getcontacts() {
	return contacts;
}
public void clickcontact() {
	getcontacts().click();
}}

