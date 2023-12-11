package pages;

import org.openqa.selenium.By;

import Base.browser;

public class Allparts_Login extends browser{

	public By my_accountdrop = By.xpath("//select[@class='my_account']");
	public By mail = By.xpath("//input[@id='email']");
	public By password = By.xpath("//input[@id='pass']");
	public By signin_btn = By.xpath("//button[@class='action login primary']");
	
	
	public void myaccountdrop() {
		dropDownSelectText(my_accountdrop, "Log In");
	}

	public void usernameenter(String name) {
		enterText(mail,name );
	}
	
	public void pass_wordenter(String passwor) {
		enterText(password, passwor);
	}
	
	public void signin() {
		Scroll_dwn(10);
		clickElement(signin_btn);
	}
}
