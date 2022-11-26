package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginOrangeHRM {
	
	WebDriver driver;

	@Given("user is on login screen")
	public void user_is_on_login_screen() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    Thread.sleep(3000);
	   
	}
	@When("the user enters the valid username and password")
	public void the_user_enters_the_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
	    
	}
	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	    
	}
	@Then("the user hsould be navigated to home page .")
	public void the_user_hsould_be_navigated_to_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Timesheets")).click();
	    System.out.println("Done");
		
	}




}
