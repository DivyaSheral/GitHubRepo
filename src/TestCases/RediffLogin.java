package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RedifHomePage;
import ObjectRepository.RediffLoginPage;

public class RediffLogin {
	WebDriver driver;
	RediffLoginPage rdf;
	RedifHomePage home;

	public RediffLogin() {
		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_83\\chromedriver.exe");
		driver = new ChromeDriver();
		rdf = new RediffLoginPage(driver);
		home = new RedifHomePage(driver);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@Test
	public void login() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		rdf.username().sendKeys("divya");
		rdf.password().sendKeys("dasari");
		rdf.loginButton().click();
		rdf.homeLink().click();
		//home.searchBox().click();
		home.searchBox().sendKeys("earphones");
		home.searchButton().click();
	}

}
