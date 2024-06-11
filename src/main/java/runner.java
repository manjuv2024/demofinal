import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.Cucumber; 
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/java/sampl.feature",
			plugin= {"pretty","html:target/html/native-cucumber-reporting.html"},tags= "@sample2"
			)

	public class runner {  }