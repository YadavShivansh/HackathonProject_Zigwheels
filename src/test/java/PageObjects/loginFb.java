package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginFb extends BasePage {

	public loginFb(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//div[@onclick='fb_login();']")
	public WebElement Fb;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement FbEmail;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement FbPass;

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement logIn;

	@FindBy(xpath = "//div[@class='fsl fwb fcb']")
	public WebElement FbError;

	public void selectfb() {
		Fb.click();
	}

	public WebElement enterCred() {
		return FbEmail;
	}

	public WebElement enterfbPass() {
		return FbPass;
	}

	public void fbLogIn() {
		logIn.click();
	}

	public void Fberror() {
		System.out.println(FbError.getText());
	}
}
