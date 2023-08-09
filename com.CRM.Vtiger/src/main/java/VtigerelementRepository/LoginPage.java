package VtigerelementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@type='text']")
	private WebElement username;

    public WebElement getusername() {
	return username;
}
    @FindBy(css="[type='password']")
    private WebElement pwd;
    
    public WebElement getpwd() {
    	return pwd;
    }
    @FindBy(css="input[id='submitButton']")
    private WebElement loginbtn;
    
    public WebElement getloginbtn() {
    	return loginbtn;
    }
    public void login(String username,String password) {
    	getusername().sendKeys(username);
    	getpwd().sendKeys(password);
    	getloginbtn().click();
    }}
