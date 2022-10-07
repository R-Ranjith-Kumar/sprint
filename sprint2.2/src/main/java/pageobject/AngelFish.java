package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AngelFish {
	WebDriver driver;
	WebElement addToCart;
	public AngelFish(WebDriver driver) {
		this.driver=driver;
	}
	public void getSite(){
		driver.get("https://petstore.octoperf.com/actions/Catalog.action?viewProduct=&productId=FI-SW-01");
	}
	public void clickAddToCartLargeFish() {
		addToCart= driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[2]/td[5]/a"));
		addToCart.click();
		}
	public void clickAddToCartSmallFish() {
		addToCart= driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[3]/td[5]/a"));
		addToCart.click();
		}
}
