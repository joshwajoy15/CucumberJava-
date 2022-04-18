package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePage_PF;
import PageFactory.LoginPage_PF;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps_PF {
	
	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;
	
	@Given("Demo_PF: browser is open")
	public void demo_browser_is_open() {
		System.out.println(" === I am inside LoginDemoSteps_PF class === ");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@And("Demo_PF: user is on login page")
	public void demo_user_is_on_login_page() {
	    driver.get("https://example.testproject.io/web/");
	}

	@When("^Demo_PF: user enters (.*) and (.*)$")
	public void demo_user_enters_username_and_password(String username, String password) {
		login = new LoginPage_PF(driver);
		
	    login.enterUsername(username);
	    login.enterPassword(password);
		
//		driver.findElement(By.id("name")).sendKeys(username);
//	    driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("Demo_PF: user clicks on login")
	public void user_clicks_on_login() {
		login.clickOnLogin();
		
//	    driver.findElement(By.id("login")).click();
	}

	@Then("Demo_PF: user is navigated to the home page")
	public void demo_user_is_navigated_to_the_home_page() {
		home = new HomePage_PF(driver);
		
		home.checkLogoutIsDisplayed();
		
//	    driver.findElement(By.id("logout")).isDisplayed();
	    driver.quit();
	}


}
