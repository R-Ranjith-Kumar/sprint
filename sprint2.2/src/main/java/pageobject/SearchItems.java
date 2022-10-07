package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchItems {
	WebDriver driver;
	WebElement searchElement,clickSearch;
	
	public SearchItems(WebDriver driver) {
		this.driver = driver;
	}
	
	public void getSite() {
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}
	
	public void enterSearchItem(String element){
		searchElement=driver.findElement(By.xpath("//*[@id=\"SearchContent\"]/form/input[1]"));
		searchElement.sendKeys(element);
	}
	
	public void clickLogin() {
		clickSearch = driver.findElement(By.name("searchProducts"));
		clickSearch.click();
		
	}

}
