package Runners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/FeaturesFiles/"},
        glue = {"StepDefinitions"}
)

public class _04_TestRunnerSmoker extends AbstractTestNGCucumberTests{
}
