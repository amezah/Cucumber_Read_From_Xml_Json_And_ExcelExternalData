package runner;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import util.excel.FeatureOverright;


@CucumberOptions(
		features = "test.features/searchprofileexcel.feature",
		glue = {"step_definitions"}
)
@RunWith(CustomCucumberRunner.class)
public class DataTableRunner {
	
	 @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        
		 FeatureOverright.overrideFeatureFiles("./test.features");
    }
	
}

