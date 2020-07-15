package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage {

	WebDriver driver;

	public RediffLoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//page object can be done in two ways
	//1-normal page object
	/* *************** Object Repository ******************
	By un = By.cssSelector("input#login1");
	By pwd = By.cssSelector("input#password");
	By loginbtn = By.xpath("//input[@name='proceed']");
	By home = By.linkText("rediff.com");

	/*************************************************** */

	//2-pageFactory - using @FindByAnnotation
	@FindBy(css="input#login1") WebElement un;
	@FindBy(css="input#password") WebElement pwd;
	@FindBy(xpath="//input[@name='proceed']") WebElement loginbtn;
	@FindBy(linkText="rediff.com") WebElement home;
	
	public WebElement username() {
		return un;
	}

	public WebElement password() {
		return pwd;
	}

	public WebElement loginButton() {
		return loginbtn;
	}

	public WebElement homeLink() {
		return home;
	}
}
