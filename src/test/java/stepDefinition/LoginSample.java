package stepDefinition;

import common_Functionalities.copy.Base_Class1;
import common_Functionalities.copy.LoginPage;
import io.cucumber.java.en.*;

public class LoginSample extends Base_Class1 {
	public LoginPage la;
	@Given("User Launch Browser {string}")
	public void user_launch_browser(String string) {
	   browserLaunch(string);
	}
	@Given("User Navigate to SIB Url {string}")
	public void user_navigate_to_SIB_url(String string) {
	   getUrl(string); 
	   
	}
	@Then("User enter a Username as {string} and Password as {string}")
	public void user_enters_username_and_password(String username, String password) {
	  la.setUserName(username);
	  la.setPassword(password);
}
@And("User log out the application")
public void User_log_out_the_application(){
	la.clickLogout();
}
}