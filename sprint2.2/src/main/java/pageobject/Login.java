package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver driver;
	WebElement sign, username,password,login;

	
	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void clicksignin() {
		sign = driver.findElement(By.linkText("Sign In"));
		sign.click();
		
	}
	
	public void getSite() {
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}

	public void enterUsername(String uname) {
		username = driver.findElement(By.name("username"));
		username.sendKeys(uname);
	}

	public void enterPassword(String pass) {
		password = driver.findElement(By.name("password"));
		password.sendKeys(Keys.CONTROL,"a");
		password.sendKeys(Keys.CONTROL,"x");
		password.sendKeys(pass);
	}
	
	public void clickLogin() {
		login = driver.findElement(By.name("signon"));
		login.click();
		
	}

	
	
}
