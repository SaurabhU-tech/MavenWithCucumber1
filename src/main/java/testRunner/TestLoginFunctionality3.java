package testRunner;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginFunctionality3 {
	WebDriver driver;
	@Given("Open the Chrome and launch the application")
	public void open_the_chrome_and_launch_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@When("^Enter the \"(.*)\" and \"(.*)\"$")
	public void enter_the_username_and_password(String uname,String pwd) throws Throwable {
		driver.findElement(By.id("login1")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.name("proceed")).click();
	}

	@Then("User should be able to login")
	public void user_should_be_able_to_login() {
		String expectedTitle = "Rediffmail";
		String actualtitle = driver.getTitle();
		Assert.assertTrue(actualtitle.contains(expectedTitle));
	}
}
