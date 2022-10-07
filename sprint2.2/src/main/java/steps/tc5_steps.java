package steps;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Login;
import pageobject.SearchItems;
import utility.Initialize;
import utility.Screenshots;



public class tc5_steps extends Initialize {
	
	public static SearchItems searchitems;
	

	@Given("^the user is in search bar$")
	public void the_user_is_in_search_bar() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		searchitems = new SearchItems(driver);
		screenReport = new Screenshots();
		screenReport.startTest();
		searchitems.getSite();
		screenReport.takeScreenshot(driver);
	}
	
	@When("^he enters the item name$")
	public void he_enters_the_item_name() throws IOException {
		searchitems.enterSearchItem("fish");
		screenReport.takeScreenshot(driver);
		searchitems.clickLogin();
	}
	
	@Then("^user should be able to see the details of the item entered$")
	public void user_should_be_able_to_see_the_details_of_the_item_entered() throws IOException {
		screenReport.takeScreenshot(driver);
		screenReport.endTest();
		driver.quit();
	}
}
