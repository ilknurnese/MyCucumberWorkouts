package Runners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest or @RegressionTest",
        features = {"src/test/java/FeaturesFiles/"},
        glue = {"StepDefinitions"},
        plugin={"html:target/site/cucumber-pretty.html"}
)


public class _06_TestRunnerSmokeWithPlugin extends AbstractTestNGCucumberTests{
}
