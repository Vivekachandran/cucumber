package org.pojoclass;

import org.helper.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement emailTxt;

	@FindBy(name="pass")
	private WebElement passwdTxt;
	
	@FindBy(name="login")
	private WebElement btn;
	

	

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getPasswdTxt() {
		return passwdTxt;
	}	
	

	
	
	
	
	
}
