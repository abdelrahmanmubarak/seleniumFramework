package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserResistrationPage;

public class UserRegistrationTest extends TestBase {
	
	HomePage homeObject;
	UserResistrationPage registerObject;
	@Test
	public void UserCanRegisterSuccessfully() {
		
		homeObject = new HomePage(driver);
		homeObject.openRegistrationPage();
		registerObject = new UserResistrationPage(driver);
		registerObject.userRegistration("Abdoul", "Mubarak", "lithklcvko345678@bolabs.com",
				"12345678");
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
	}

}
