package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/FeaturesFiles/_01_Login.feature"},
        glue = {"StepDefinitions"}

)

public class _01_TestRunners extends AbstractTestNGCucumberTests {

    //Bu class tiplerine runner classlar denir
}
// features pathlerinin alınması: ilgili feature dosyasının üzerinde
//sağ tuş - copy path reference
//content root