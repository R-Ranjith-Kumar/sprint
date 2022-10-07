package steps;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Homepage;
import utility.Initialize;
import utility.Screenshots;

public class tc7_steps extends Initialize {
	public static Homepage home;

	@Given("the user is in homepage2")
	public void the_user_is_in_homepage2() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		home = new Homepage(driver);
		screenReport = new Screenshots();
		screenReport.startTest();
		home.getSite();
		screenReport.takeScreenshot(driver);
	}

	@When("user clicks the cat link")
	public void user_clicks_the_cat_link() throws IOException {
		home.clickCat();
		screenReport.takeScreenshot(driver);

	}

	@Then("user is redirected to cat page")
	public void user_is_redirected_to_cat_page() throws IOException {
		screenReport.takeScreenshot(driver);
		screenReport.endTest();
		driver.quit();
	}

}
