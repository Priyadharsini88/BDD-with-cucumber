package Stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatatablewithoutHeader {
	
WebDriver driver;
	@Given("your on the  login screen")
	public void your_on_the_login_screen() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    Thread.sleep(3000);
	}
	@When("You enter the below crdentials")
	public void you_enter_the_below_crdentials(io.cucumber.datatable.DataTable dataTable) {
		List<String> credentials=dataTable.transpose().asList(String.class);
		String username =credentials.get(0);
		String password =credentials.get(1);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	   
	}
	@When("clicks  the login button")
	public void clicks_the_login_button() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}
	@Then("the user should see the  home page .")
	public void the_user_should_see_the_home_page() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Timesheets")).click();
	    System.out.println("Done");
	    
	}




}
