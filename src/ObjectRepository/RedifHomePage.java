package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RedifHomePage {
	WebDriver driver;
	public RedifHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By searchbx = By.xpath("//input[@id='srchword']");
	By searchbtn = By.xpath("//form[@id='queryTop']/child::input");

	public WebElement searchBox()
	{
		return driver.findElement(searchbx);
	}
	public WebElement searchButton()
	{
		return driver.findElement(searchbtn);
	}
}
