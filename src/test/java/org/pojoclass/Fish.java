package org.pojoclass;

import org.helper.classes.BaseClass;
import org.openqa.selenium.WebElement;

public class Fish  extends BaseClass{
	public static void main(String[] args) {
		
		BrowserLaunch();
		MaximizeWindow();
		Url("https://www.facebook.com/");
		
		LoginPojo l=new LoginPojo();
		sendText("veka@12", l.getEmailTxt());
		sendText("veka", l.getPasswdTxt());
		WebElement btn = l.getBtn();
		btn.click();
	}

}
