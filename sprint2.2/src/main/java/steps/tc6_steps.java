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


public class tc6_steps extends Initialize {
	
	public static SearchItems searchitems;
	
	@Given("^the user is accessing the search bar$")
	public void the_user_is_accessing_the_search_bar() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		searchitems = new SearchItems(driver);
		screenReport = new Screenshots();
		screenReport.startTest();
		searchitems.getSite();
		
	}
	@When("^he enters the invalid item name$")
	public void he_enters_the_invalid_item_name() throws IOException {
		searchitems.enterSearchItem("aaa");
		screenReport.takeScreenshot(driver);
		searchitems.clickLogin();
	}
	@Then("^user should get error message$")
	public void user_should_get_error_message() throws IOException {
		screenReport.takeScreenshot(driver);
		screenReport.endTest();
		driver.quit();
	}
}
