package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 	

@RunWith(Cucumber.class)
@CucumberOptions 
				(
				features="//SIB_Phase1//Features//login.feature", 
				glue = "stepDefinition", 
				dryRun=false,
				monochrome=true,
				plugin= {"pretty", "html:test-output"})

public class Testrun {

}