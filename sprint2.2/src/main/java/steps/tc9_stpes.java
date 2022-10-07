package steps;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.AngelFish;
import utility.Initialize;
import utility.Screenshots;

public class tc9_stpes extends Initialize {

	public static AngelFish AFish;

	@Given("the user in the Fish page")
	public void the_user_in_the_product_page() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		AFish = new AngelFish(driver);
		screenReport = new Screenshots();
		screenReport.startTest();
		AFish.getSite();
		screenReport.takeScreenshot(driver);
	}

	@When("the user adds Large Fish to the cart")
	public void the_user_ads_the_product_to_the_cart() throws IOException {
		AFish.clickAddToCartLargeFish();
	}

	@Then("Large Fish is added to the cart")
	public void the_product_is_added_to_the_cart() throws IOException {
		screenReport.takeScreenshot(driver);
		screenReport.endTest();
		driver.quit();
	}

}
