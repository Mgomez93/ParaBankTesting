package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.BaseClass;

public class registration extends BaseClass{
	
	public registration() {
		PageFactory.initElements(BaseClass.getDriver(), this);
		
	}
	
	
	@FindBy(id = "customer.firstName")
	public WebElement FirstNameInput;
	
	@FindBy(id = "customer.lastName")
	public WebElement LastNameInput;
	
	@FindBy(id = "customer.address.street")
	public WebElement CustomerAddressStreet;
	
	@FindBy(id = "customer.address.city")
	public WebElement CustomerAddessCity;
	
	@FindBy(id = "customer.address.state")
	public WebElement CustomerAddressState;
	
	@FindBy(id = "customer.address.zipCode")
	public WebElement CustomerAddressZipCode;
	
	@FindBy(id = "customer.phoneNumber")
	public WebElement CustomerPhoneNumber;
	
	@FindBy(id = "customer.ssn")
	public WebElement CustomerSSN;
	
	@FindBy(id = "customer.username")
	public WebElement CustomerUsername;
	
	@FindBy(id = "customer.password")
	public WebElement CustomerPassword;
	
	@FindBy(id = "repeatedPassword")
	public WebElement CustomerConfirmPassword;
	
	@FindBy(className = "button")
	public WebElement RegisterButton;
	


}
