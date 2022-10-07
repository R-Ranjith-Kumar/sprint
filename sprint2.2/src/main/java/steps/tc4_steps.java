package steps;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Homepage;
import utility.Initialize;
import utility.Screenshots;

public class tc4_steps  extends Initialize  {
	public static Homepage home;
	@Given("the user is in homepage")
	public void the_user_in_homepage() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		home = new Homepage(driver);
		screenReport = new Screenshots();
		screenReport.startTest();
		home.getSite();
		screenReport.takeScreenshot(driver);
	}
	@When("user clicks the dog link")
	public void user_clicks_the_dog_link() throws IOException {
		home.clickDog();
		screenReport.takeScreenshot(driver);
	}
	
	@Then("user is redirected to dog page")
	public void user_is_redirected_to_dog_page() throws IOException {
		screenReport.takeScreenshot(driver);
		screenReport.endTest();
		driver.quit();
	}




}
