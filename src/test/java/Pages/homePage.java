package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.BaseClass;

public class homePage {
	
	public homePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
		
	}
	
	@FindBy(xpath = "//*[@id='loginPanel']/p[2]/a")
	public WebElement registerButton;
	

}
