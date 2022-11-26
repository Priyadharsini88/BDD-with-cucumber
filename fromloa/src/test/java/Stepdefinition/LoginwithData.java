package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginwithData {

	WebDriver driver;

	@Given("user navigates to  login screen")
	public void user_navigates_to_login_screen() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    Thread.sleep(3000);
	}
	@When("the user enters the valid  credentials {string}  and {string}")
	public void the_user_enters_the_valid_credentials_and(String username, String password) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	@When("clicks the login button")
	public void clicks_the_login_button() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}
	@Then("the user should see the home page .")
	public void the_user_should_see_the_home_page() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Timesheets")).click();
	    System.out.println("Done");
	}



}
