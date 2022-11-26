package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogle {
	WebDriver driver;

	@Given("user is entering google.co.in")
	public void user_is_entering_google_co_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.navigate().to("https:google.co.in");
	   
	}
	@When("user clicks the search box")
	public void user_clicks_the_search_box() throws Throwable  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("Madurai");
	   
	}
	@When("types the search term as {string}")
	public void types_the_search_term_as(String string)throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	@Then("the user should see the search results for Madurai")
	public void the_user_should_see_the_search_results_for_madurai()  throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Result displayed");
	}

}
