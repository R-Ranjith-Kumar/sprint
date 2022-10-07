package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	WebDriver driver;
	WebElement f,d,c,b;

	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickFish() {		
		f=driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img"));
		f.click();
		
	}
	public void clickDog() {
		d = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img"));
		d.click();
		
	}
	public void getSite() {
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}
	

	public void clickCat() {
		c = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[4]/img"));
		c.click();
	}

	public void clickBird() {
		b = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[5]/img"));
		b.click();
	}
	
	
}
