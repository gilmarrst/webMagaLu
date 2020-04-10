package br.com.webMagaLu.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},glue = "", features = "src/test/resources/features")
public class RunnerTest {
}
