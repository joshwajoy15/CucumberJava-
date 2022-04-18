package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps {
	
	WebDriver driver = null;
	
	@Given("Demo: browser is open")
	public void demo_browser_is_open() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@And("Demo: user is on login page")
	public void demo_user_is_on_login_page() {
	    driver.get("https://example.testproject.io/web/");
	}

	@When("^Demo: user enters (.*) and (.*)$")
	public void demo_user_enters_username_and_password(String username, String password) {
	    driver.findElement(By.id("name")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("Demo: user clicks on login")
	public void user_clicks_on_login() {
	    driver.findElement(By.id("login")).click();
	}

	@Then("Demo: user is navigated to the home page")
	public void demo_user_is_navigated_to_the_home_page() {
	    driver.findElement(By.id("logout")).isDisplayed();
	    driver.quit();
	}


}
