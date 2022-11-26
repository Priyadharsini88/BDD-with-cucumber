package fromloa;

import org.junit.runner.RunWith;

//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(features= "Feature/TaggedHooks.feature", 
glue={"Stepdefinition","Hooks"},
plugin = { "pretty","html:Reports/CucumberReports.html","json:report/jsonreport.json" },
monochrome = true,
tags= "@TaggedHooks"
)


public class RunnerClass {

	
//It should combine feature file and step defn
	

}
