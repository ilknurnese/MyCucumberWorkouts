package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest or @RegressionTest",
        features = {"src/test/java/FeaturesFiles/"},
        glue = {"StepDefinitions"}
)

public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
