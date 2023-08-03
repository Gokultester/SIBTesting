package common_Functionalities.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
public static WebDriver driver;
		
		public LoginPage(WebDriver rdriver)
		{
			driver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="//input[@placeholder='User Name']")
		WebElement txtUsername;
		
		@FindBy(xpath="//input[@placeholder='Password']")
		WebElement txtPassword;
		
		@FindBy(xpath="//input[@value='Login']")
		WebElement btnLogin;
		
		@FindBy(xpath="//i[normalize-space()='logout']")
		WebElement btnLogout;
		
		public void setUserName(String uname)
		{
			txtUsername.clear();
			txtUsername.sendKeys(uname);
		}
		
		public void setPassword(String pwd)
		{
			txtPassword.clear();
			txtPassword.sendKeys(pwd);
		}
		
		public void clickLogin()
		{
			btnLogin.click();
		}
		
		public void clickLogout()
		{
			btnLogout.click();
		}	
	}


