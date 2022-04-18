package StepDefinitions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSeachSteps {
	
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("Inside Step - browser is open");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("user is on google search")
	public void user_is_on_google_search() {
	    System.out.println("Inside Step - user is on google search page");
	    driver.get("https://www.google.com/");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
	    System.out.println("Inside Step - user enters a text in seach box");
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Cucumber Test");
	}

	@And("hits enter")
	public void hits_enter() {
	    System.out.println("Inside Step - Hits enter");
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);	    
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException {
	    System.out.println("Inside Step - user is navigated to search results");
	    driver.getPageSource().contains("10 Minute Tutorial");
	    Thread.sleep(2000);
	    
	    driver.quit();
	}
	

}
