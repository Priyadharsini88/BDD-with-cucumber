package Stepdefinition;

import io.cucumber.java.en.Given;

public class Expressions {
	

	@Given("I have {int} laptop")
	public void i_have_laptop(Integer int1) {
	  System.out.println("Laptop count "+int1);  
	}
	@Given("I have {double} CGPA")
	public void i_have_cgpa(Double double1) {
		System.out.println("My cgpa is "+double1);  
	}
	@Given("{string} is elder to {string}")
	public void is_elder_to(String string, String string2) {
		System.out.println("My daughter : "+string+  " My son:" +string2);  
	}




}
