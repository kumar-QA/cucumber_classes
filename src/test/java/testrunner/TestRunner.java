package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/ParaBank_Dashboard_TransferFund.feature",
		glue="stepdefination",
		plugin={"pretty"}
		
		)
public class TestRunner {

}
