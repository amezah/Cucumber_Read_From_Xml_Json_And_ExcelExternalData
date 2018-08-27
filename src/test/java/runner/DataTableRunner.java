package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "test.features/searchfromjson.feature",
		glue = {"step_definitions"}
)

public class DataTableRunner {
	
}

