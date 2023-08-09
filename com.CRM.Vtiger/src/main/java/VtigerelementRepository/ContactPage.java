package VtigerelementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="img[alt='Create Contact...']")
	private WebElement contact;

public WebElement getcontacts() {
	return contact;
}
public void contact() {
	getcontacts().click();
}}
//img[alt='Create Contact...']