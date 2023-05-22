package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/Login.feature",
		glue="stepdefination",
		plugin={"json:target/MyReports/report.json",
				"html:target/MyReports/report.html",
				"junit:target/MyReports/report.xml"
				},
		tags="@ALL"
//		monochrome=false
//		dryRun=fals,
//		strict=true
		
		)
public class TestRunner {

}
