package stepDefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.testing.Base.Base;
import org.testing.pages.Login;


@RunWith(Cucumber.class)
public class StepDefinitionYTTrending extends Base{

	@Given("^Intialize the browser with chrome and navigate to \"([^\"]*)\" site$")
	public void intialize_the_browser_with_chrome_and_navigate_to_something_site(String strArg1) throws Throwable {
		browserInitiate(strArg1);
	}

	@When("^User enter \"([^\"]*)\" and \"([^\"]*)\" and click on login$")
	public void user_enter_something_and_something_and_click_on_login(String strArg1, String strArg2) throws Throwable {
		Login login=new Login(driver, prop);
		login.signin(strArg1, strArg2);
	}

	@Then("^Verify that user is successfully logged in by clicking Trending option$")
	public void verify_that_user_is_successfully_logged_in_by_clicking_trending_option() throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("Trending"))).click();
	}

	@And("^Click on signin button to navigate to secure login page$")
	public void click_on_signin_button_to_navigate_to_secure_login_page() throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("ClickSignin"))).click(); 
	}

}