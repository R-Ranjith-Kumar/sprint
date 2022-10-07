package steps;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.AngelFish;
import utility.Initialize;
import utility.Screenshots;

public class tc10_steps extends Initialize {

	public static AngelFish AFish;

	@Given("the user in the fish page")
	public void the_user_in_the_fish_page() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		AFish = new AngelFish(driver);
		screenReport = new Screenshots();
		screenReport.startTest();
		AFish.getSite();
		screenReport.takeScreenshot(driver);
	}

	@When("the user adds small to the cart")
	public void the_user_adds_small_to_the_cart() {
		AFish.clickAddToCartSmallFish();
	}

	@Then("Small Fish is added to the cart")
	public void small_fish_is_added_to_the_cart() throws IOException {
		screenReport.takeScreenshot(driver);
		screenReport.endTest();
		screenReport.endReport();
		driver.quit();
	}

}
