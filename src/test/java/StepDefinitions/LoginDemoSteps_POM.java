package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps_POM {
	
	WebDriver driver = null;
	LoginPage login;
	
	@Given("Demo_POM: browser is open")
	public void demo_browser_is_open() {
		System.out.println(" === I am inside LoginDemoSteps_POM");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@And("Demo_POM: user is on login page")
	public void demo_user_is_on_login_page() {
		
		
		
	    driver.get("https://example.testproject.io/web/");
	}

	@When("^Demo_POM: user enters (.*) and (.*)$")
	public void demo_user_enters_username_and_password(String username, String password) {
	    
		login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
//		driver.findElement(By.id("name")).sendKeys(username);
//	    driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("Demo_POM: user clicks on login")
	public void user_clicks_on_login() {
		login.clickLogin();
		
//	    driver.findElement(By.id("login")).click();
	}

	@Then("Demo_POM: user is navigated to the home page")
	public void demo_user_is_navigated_to_the_home_page() {
		login.checkLogOutIsDisplayed();
//	    driver.findElement(By.id("logout")).isDisplayed();
	    driver.quit();
	}


}
