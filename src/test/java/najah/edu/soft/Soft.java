package najah.edu.soft;
import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features/check.feature",
   // glue = "com.example.stepdefinitions",
   // plugin = {"pretty", "html:target/cucumber-reports"}
    
    glue = "najah.edu.soft", // Update the package name to match your step definitions package
    	    plugin = {"pretty", "html:target/cucumber-reports"},
    	    snippets = SnippetType.CAMELCASE // Optional: Specify the snippet type
    
    
    
)



public class Soft {

	

}
