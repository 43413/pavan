package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
		features = "Homepage.features",
		glue= {"com.Testcases"},
		tags= {"@test1"}
			
			)
	
	public class testrunner {
		
	}
