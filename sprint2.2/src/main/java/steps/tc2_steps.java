package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Login;
import utility.Initialize;
import utility.Screenshots;

public class tc2_steps extends Initialize {

	public static Login login;

	
	@Given("^The user is in the login page$")
	public void the_user_wants_to_buy_a_product() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		login = new Login(driver);
		screenReport = new Screenshots();
		screenReport.startTest();
		login.getSite();
		login.clicksignin();
		screenReport.takeScreenshot(driver);
	}

	@When("^He enters the invalid username and password$")
	public void the_user_enters_the_username_password() throws Throwable {
		login.enterUsername("rab12");
		login.enterPassword("pass12");
		screenReport.takeScreenshot(driver);
		login.clickLogin();
	}

	@Then("^User gets a error message$")
	public void he_reaches_the_home_page() throws Throwable {
		screenReport.takeScreenshot(driver);
		screenReport.endTest();
		driver.quit();
	}

}
