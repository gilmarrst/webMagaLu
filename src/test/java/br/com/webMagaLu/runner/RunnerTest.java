package br.com.webMagaLu.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.com.webMagaLu.util.DriverContext;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","de.monochromata.cucumber.report.PrettyReports:target/cucumber"}
					,monochrome = true
					,strict = true
					,glue = ""
					, features = "src/test/resources/features"
					,tags = {"@zupChallenge"})
public class RunnerTest {
	
	@BeforeClass
	public static void beforeClass()
	{
		//chrome ou firefox
		System.setProperty("navegador", "chrome");
		System.setProperty("cucumber.reporting.config.file", "src/test/resources/cucumber-reporting.properties");
	}

	@AfterClass
	public static void afterClass() {
		DriverContext.getDriver().quit();
	}
	
}
