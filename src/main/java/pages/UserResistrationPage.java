package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserResistrationPage extends PageBase {

	public UserResistrationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "gender-male")
	WebElement genderRdoBtn;
	@FindBy(id = "FirstName")
	WebElement fnTxtBox;
	@FindBy(id = "LastName")
	WebElement lnTxtBox;
	@FindBy(id = "Email")
	WebElement emailTxtBox;
	@FindBy(id = "Password")
	WebElement passwordTxtBox;
	@FindBy(id = "ConfirmPassword")
	WebElement confirmpasswordtxtBox;
	@FindBy(id = "register-button")
	WebElement registerBtn;
	@FindBy(css = "div.result")
	public WebElement successMessage;
	
	public void userRegistration(String firstName , String lastName , String email , String password) 
	{
		clickButton(genderRdoBtn);
		setTextElementText(fnTxtBox,firstName);
		setTextElementText(lnTxtBox,lastName);
		setTextElementText(emailTxtBox,email);
		setTextElementText(passwordTxtBox,password);
		setTextElementText(confirmpasswordtxtBox,password);
		clickButton(registerBtn);
		
	}



}
