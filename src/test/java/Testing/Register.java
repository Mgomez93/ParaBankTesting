package Testing;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Util.PageInitializer;
import Util.BaseClass;


public class Register extends PageInitializer{
	
	
	 @BeforeMethod
	 public void beforeMethod () {
	 	   BaseClass.getDriver();
	 	 
	    }
	 
	 @Test
	 public void RegisterButton () {

		 hp.registerButton.click();
		 rp.FirstNameInput.sendKeys(BaseClass.getConfigProperty("FirstName"));
		 rp.LastNameInput.sendKeys(BaseClass.getConfigProperty("LastName"));
		 rp.CustomerAddressStreet.sendKeys(BaseClass.getConfigProperty("Address"));
		 rp.CustomerAddessCity.sendKeys(BaseClass.getConfigProperty("City"));
		 rp.CustomerAddressState.sendKeys(BaseClass.getConfigProperty("State"));
		 rp.CustomerAddressZipCode.sendKeys(BaseClass.getConfigProperty("Zip"));
		 rp.CustomerPhoneNumber.sendKeys(BaseClass.getConfigProperty("Phone"));
		 rp.CustomerSSN.sendKeys(BaseClass.getConfigProperty("SSN"));
		 rp.CustomerUsername.sendKeys(BaseClass.getConfigProperty("Username"));
		 rp.CustomerPassword.sendKeys(BaseClass.getConfigProperty("Password"));
		 rp.CustomerConfirmPassword.sendKeys(BaseClass.getConfigProperty("ConfirmPassword"));
		 rp.RegisterButton.click();
		 
	 }

}
