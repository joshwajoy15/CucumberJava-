package StepsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksDemoSteps {
	
	WebDriver driver = null;
	
	@BeforeStep
	public static void beforeSteps() {
		System.out.println("   I am inside beforeSteps ----");
	}
	
	@Before(order=1)
	public void browserSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Before(order=2)
	public void setUp2() {
		System.out.println("  I am inside setUp2 \n");
	}
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
	}
	
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		
	}
	
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	@AfterStep
	public void afterSteps() {
		System.out.println("   I am inside afterSteps ----");
	}
	
}
