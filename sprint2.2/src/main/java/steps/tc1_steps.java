package steps;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.dynamic.NexusAccessor.InitializationAppender;
import pageobject.Login;
import utility.Initialize;
import utility.Screenshots;

public class tc1_steps extends Initialize {

	public static Login login;

	@Given("^the user in log in page$")
	public void the_user_wants_to_buy_a_product() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		login = new Login(driver);
		screenReport = new Screenshots();
		screenReport.startReport();
		screenReport.startTest();
		login.getSite();
		login.clicksignin();
		screenReport.takeScreenshot(driver);
	}

	@When("^he enters a username and password$")
	public void the_user_enters_the_username_password() throws Throwable {
		login.enterUsername("rab");
		login.enterPassword("pass");
		screenReport.takeScreenshot(driver);
		login.clickLogin();
	}

	@Then("^user redirected to home page$")
	public void he_reaches_the_home_page() throws Throwable {
		screenReport.takeScreenshot(driver);
		screenReport.endTest();
		driver.quit();
	}

}
