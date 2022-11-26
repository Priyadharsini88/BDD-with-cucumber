package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ThnanosHooksConcepts {
	
	@Given("THanos has infinity stones")
	public void t_hanos_has_infinity_stones() {
	   System.out.println("should be line 2 ");
	}
	@When("THanos snaps his fingers")
	public void t_hanos_snaps_his_fingers() {
		System.out.println("should be line 3 ");
	}
	@Then("half of the living thing died")
	public void half_of_the_living_thing_died() {
		System.out.println("should be line 4 ");
	}




}
