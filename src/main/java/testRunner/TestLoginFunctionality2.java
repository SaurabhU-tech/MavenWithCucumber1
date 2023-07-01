package testRunner;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginFunctionality2 {
	WebDriver driver;
	@Given("user is on login page2")
	public void user_is_on_login_page2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@When("user enter valid username {string}")
	public void user_enter_valid_username(String username) {
		driver.findElement(By.id("login1")).sendKeys(username);
	}

	@When("user enter valid password {string}")
	public void user_enter_valid_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("proceed")).click();
	}

	@Then("user should be able to login2")
	public void user_should_be_able_to_login2() {
		String expectedTitle = "Rediffmail1";
		String actualtitle = driver.getTitle();
		Assert.assertTrue(actualtitle.contains(expectedTitle));
	}

	@Then("close the browser2")
	public void close_the_browser2() {
		driver.close();
	}

	@When("user enter valid username1 {string}")
	public void user_enter_valid_username1(String username2) {
		driver.findElement(By.id("login1")).sendKeys(username2);
	}
}
