package testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginFunctionality {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@When("user enter valid credentials")
	public void user_enter_valid_credentials() {
		driver.findElement(By.id("login1")).sendKeys("Satish");
		driver.findElement(By.id("password")).sendKeys("Satish");
		driver.findElement(By.name("proceed")).click();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
		String expectedTitle = "Rediffmail1";
		String actualtitle = driver.getTitle();
		Assert.assertTrue(actualtitle.contains(expectedTitle));
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}
}
